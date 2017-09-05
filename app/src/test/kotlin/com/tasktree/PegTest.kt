package com.tasktree


import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.util.Arrays.asList

class PegTest {

    internal var peg: Peg = FirstPeg()

    @Test
    fun givenFirstPegInInitialStateThenGetOpenPositionsReturnsNoPosition() {
        assertEquals(emptyList<Position>(), peg.openPositions())
    }

    @Test(expected = IllegalArgumentException::class)
    fun givenInvalidPositionThenGetBallAtPositionThrowsRuntime() {

        peg.getBallAtPosition(Position(11))
    }

    @Test
    fun givenFirstPegInInitialStateThenItHasTwoBalls() {
        val peg = FirstPeg()

        val allBalls = peg.allBalls

        Assert.assertEquals(2, allBalls.size)

        assertEquals(Ball(1, Position(0)), allBalls[0])
        assertEquals(Ball(2, Position(1)), allBalls[1])
    }

    @Test
    fun givenValidBallPositionThenGetBallAtPositionReturnsBall() {
        Assert.assertEquals(Ball(2, Position(1)), peg.getBallAtPosition(Position(1)))
    }

    @Test
    fun givenFirstPegWithNoBallsThenGetBallAtPositionReturnsNullBall() {
        val expectedNoBall = NoBall(11, Position(1))

        peg = FirstPeg(asList(NoBall(10, Position(0)), expectedNoBall))

        assertEquals(expectedNoBall, peg.getBallAtPosition(Position(1)))
    }

    @Test
    fun givenFirstPegWithNoBallsThenOpenPositionsReturnsListOfTwoOpenPositions() {

        peg = FirstPeg(asList(NoBall(10, Position(0)), NoBall(11, Position(1))))

        val positions = peg.openPositions()

        assertEquals(2, positions.size)
    }

    @Test(expected = IllegalArgumentException::class)
    fun givenBallInvalidPositionThenMoveBallToPositionThrowsRuntime() {
        val invalidPosition = Position(2) // invalid position 2 for first peg
        val ball = Ball(3, Position(8)) //move from position index 8 ( third peg ) to first peg

        peg.moveBallToPosition(ball, invalidPosition)
    }

    @Test(expected = IllegalStateException::class)
    fun givenNoFreeSlotExistInFirstPegThenMoveBallToPositionThrowsRuntime() {

        val validPosition = Position(0)
        val ball =  Ball(3, Position(8))

        peg.moveBallToPosition( ball, validPosition)
    }

    @Test
    fun givenFirstPegDoesNotHaveOpenSlotAtPositionThenHasOpenPositionAtReturnsFalse() {
        assertFalse( peg.hasOpenSlotAt(Position(0)))
    }

    @Test
    fun givenFirstPegWhenItHasFreeSlotInPositionOneThenHasOpenPositionAtReturnsTrue() {

        peg = FirstPeg(asList(Ball(1, Position(0)), NoBall(11,Position(1))))

        assertTrue( peg.hasOpenSlotAt(Position(1)))
    }

    @Test
    fun givenFirstPegWhenItHasTwoFreeSlotInPositionOneThenHasOpenPositionAtReturnsTrue() {

        peg = FirstPeg(asList(NoBall(12,Position(0)), NoBall(11,Position(1))))

        assertTrue( peg.hasOpenSlotAt(Position(1)))
    }

}
