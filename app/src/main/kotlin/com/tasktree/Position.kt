package com.tasktree


import com.google.common.base.Objects

internal open class Position(val index: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false

        val other = obj as Position?
        return Objects.equal(this.index, other!!.index)
    }

    override fun toString(): String {
        return "Position @index " + index
    }
}
