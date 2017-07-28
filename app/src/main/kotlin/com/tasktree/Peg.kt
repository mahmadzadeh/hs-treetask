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

    abstract fun getBallAtPosition(position: Position): Ball?

    val allBalls: List<Ball>
        get() = Collections.unmodifiableList(balls)
}


