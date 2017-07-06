package com.tasktree;


import com.google.common.base.Objects;

class Position {
    private int index;

    public Position( int index ) {
        this.index = index;
    }

    public int getIndex( ) {
        return index;
    }

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Position other = (Position) obj;
        return Objects.equal(this.getIndex(), other.getIndex());
    }

    @Override
    public String toString( ) {
        return "Position @index " + index;
    }
}
