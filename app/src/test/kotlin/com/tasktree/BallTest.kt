package com.tasktree

import org.junit.Assert.*
import org.junit.Test

class BallTest {

    @Test
    fun givenTwoBallsThatAreEqualThenEqualsReturnsTrue() {

        val ballOne = Ball(1, Position(1))
        val ballTwo = Ball(1, Position(1))

        assertTrue(ballOne == ballTwo)
        assertTrue(ballTwo == ballOne)
    }

    @Test
    fun givenTwoUnequalBallsThenEqualsReturnsFalse() {
        val ballOne = Ball(1, Position(0))
        val ballTwo = Ball(2, Position(0))

        assertFalse(ballOne == ballTwo)
        assertFalse(ballTwo == ballOne)
    }

    @Test
    fun givenNewBallPositionThenMoveWillMoveBallToNewPosition() {

        val ball = Ball(1, Position(9))
        val newPosition = Position(1)

        assertEquals( Ball(1, newPosition) , ball.moveTo(newPosition))
    }

}