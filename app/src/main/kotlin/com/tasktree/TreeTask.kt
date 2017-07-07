package com.tasktree

internal class TreeTask {

    val isInitialState: Boolean
        get() = true

    companion object {

        fun initialState(): TreeTask {
            return TreeTask()
        }
    }
}
