package com.tasktree;

import com.google.common.base.Objects;

class Ball {

    private int number;
    private Position position;

    public Ball( int number, Position position ) {
        this.number = number;
        this.position = position;
    }

    public int getNumber( ) {
        return number;
    }

    public Position getPosition( ) {
        return position;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( obj == null ) return false;
        if ( getClass() != obj.getClass() ) return false;

        final Ball other = ( Ball ) obj;

        return Objects.equal( this.getNumber(), other.getNumber() )
                && Objects.equal( this.getPosition(), other.getPosition() );
    }
}
