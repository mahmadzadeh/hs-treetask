package com.tasktree

import org.junit.Test

import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue


class TreeTaskTest {


    @Test
    fun canCreateAnInstance() {
        val treeTask = TreeTask()
    }

    @Test
    fun canCreateInstanceWithInitialState() {

        val treeTask = TreeTask.initialState()

        assertNotNull(treeTask)

        assertTrue(treeTask.isInitialState)
    }

    @Test
    fun getAllPegs() {


    }


}