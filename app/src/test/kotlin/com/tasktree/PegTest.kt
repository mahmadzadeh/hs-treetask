package com.tasktree


import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

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

        peg = FirstPeg(Arrays.asList(NoBall(10, Position(0)), expectedNoBall))

        assertEquals(expectedNoBall, peg.getBallAtPosition(Position(1)))
    }

    @Test
    fun givenFirstPegWithNoBallsThenOpenPositionsReturnsListOfTwoOpenPositions() {

        peg = FirstPeg(Arrays.asList(NoBall(10, Position(0)), NoBall(11, Position(1))))

        val positions = peg.openPositions()

        assertEquals(2, positions.size)
    }


}
