package com.tasktree;


import java.util.Arrays;

class FirstPeg extends Peg {

    public FirstPeg( ) {
        super( Arrays.asList(
                new Ball( 1, new Position( 0 ) ),
                new Ball( 2, new Position( 1 )
                ) ) );
    }

    @Override
    public Ball getBallAtPosition( Position position ) {

        if ( position.getIndex() != 0 || position.getIndex() != 1 )
            throw new IllegalArgumentException( "invalid position given " + position );


        return null;
    }
}
