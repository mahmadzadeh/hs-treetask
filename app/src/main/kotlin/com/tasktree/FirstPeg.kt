package com.tasktree


import java.util.Arrays.asList

internal class FirstPeg(list: List<Ball> = asList(Ball(1, Position(0)), Ball(2, Position(1)))) : Peg(list) {

    override val size: Int get() = 2

    override fun getBallAtPosition(position: Position): Ball? {

        if (position.index != 0 && position.index != 1) {
            throw IllegalArgumentException("invalid position given " + position)
        }

        return this.allBalls.find { it -> it!!.position == position }
    }

    override fun openPositions(): List<Position> {
        return this.allBalls.filter { it is NoBall }.map { it.position }
    }

    override fun hasOpenSlotAt(position: Position): Boolean {
        val emptySlot = this.allBalls.filter { it is NoBall && it.position == position }

        return emptySlot.isNotEmpty() && emptySlot.size == 1
    }


    override fun moveBallToPosition(ball: Ball, newPosition: Position) {

        if (!withinRange(newPosition)) {
            throw IllegalArgumentException("invalid position given " + newPosition)
        }
        if (!hasFreeSlotToAccommodate(newPosition)) {
            throw IllegalStateException("can't move ball $ball to new position $newPosition")
        }


    }

    private fun hasFreeSlotToAccommodate(newPosition: Position) = openPositions().contains(newPosition)


}
