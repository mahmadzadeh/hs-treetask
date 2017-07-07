package com.tasktree

import org.junit.Test

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue

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

}