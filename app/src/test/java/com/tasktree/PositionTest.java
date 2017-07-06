package com.tasktree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PositionTest {

    @Test
    public void givenTwoEqualPositionsThenEqualsReturnsTrue( ) {

        Position pos1 = new Position( 1 );
        Position pos2 = new Position( 1 );

        assertTrue( pos1.equals( pos1 ) );
        assertTrue( pos1.equals( pos2 ) );
        assertTrue( pos2.equals( pos1 ) );
    }

}