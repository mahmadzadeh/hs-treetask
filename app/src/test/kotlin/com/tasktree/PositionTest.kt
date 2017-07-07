package com.tasktree

import org.junit.Test

import org.junit.Assert.assertTrue

class PositionTest {

    @Test
    fun givenTwoEqualPositionsThenEqualsReturnsTrue() {

        val pos1 = Position(1)
        val pos2 = Position(1)

        assertTrue(pos1 == pos1)
        assertTrue(pos1 == pos2)
        assertTrue(pos2 == pos1)
    }

}