package com.tasktree

import java.util.*

internal abstract class Peg(val balls: List<Ball>) {

    init {
        require(balls.size == size) {
            "Invalid list of balls given for this peg expected ${size} given ${balls.size}"
        }
    }

    abstract val size: Int;

    abstract fun openPositions(): List<Position>

    abstract fun hasOpenSlotAt(position: Position): Boolean

    abstract fun getBallAtPosition(position: Position): Ball?

    abstract fun moveBallToPosition(ball: Ball, newPosition: Position): Unit

    fun withinRange(newPosition: Position): Boolean {
        return (0..size-1).contains(newPosition.index)
    }

    val allBalls: List<Ball>
        get() = Collections.unmodifiableList(balls)
}


