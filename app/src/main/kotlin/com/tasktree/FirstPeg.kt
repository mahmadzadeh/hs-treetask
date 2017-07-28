package com.tasktree


import java.util.Arrays.asList

internal class FirstPeg : Peg(asList(Ball(1, Position(0)), Ball(2, Position(1)))) {

    override fun getBallAtPosition(position: Position): Ball? {

        if (position.index != 0 || position.index != 1)
            throw IllegalArgumentException("invalid position given " + position)

        return this.allBalls.find { it -> it!!.position == position }
    }

}
