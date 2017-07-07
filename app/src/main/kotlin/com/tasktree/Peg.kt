package com.tasktree

import java.util.ArrayList
import java.util.Collections

internal abstract class Peg(balls: List<Ball>) {

    var balls: List<Ball>

    init {
        this.balls = ArrayList(balls)
    }

    val openPositions: Position
        get() = NullPosition.INSTANCE

    abstract fun getBallAtPosition(position: Position): Ball?

    val allBalls: List<Ball>
        get() = Collections.unmodifiableList(balls)
}
