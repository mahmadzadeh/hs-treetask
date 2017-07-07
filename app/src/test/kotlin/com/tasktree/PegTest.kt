package com.tasktree


import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class PegTest {

    internal var peg: Peg = FirstPeg()

    @Test
    fun givenFirstPegInInitialStateThenGetOpenPositionsReturnsNoPosition() {
        assertEquals(NullPosition.INSTANCE, peg.openPositions)
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

        Assert.assertEquals(2, peg.getBallAtPosition(Position(1))!!.number)
    }


}
