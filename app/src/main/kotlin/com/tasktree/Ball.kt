package com.tasktree

import com.google.common.base.Objects

internal class Ball(val number: Int, val position: Position) {

    override fun equals(obj: Any?): Boolean {
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false

        val other = obj as Ball?

        return Objects.equal(this.number, other!!.number) && Objects.equal(this.position, other.position)
    }
}
