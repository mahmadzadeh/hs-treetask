package com.tasktree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BallTest {

    @Test
    public void givenTwoBallsThatAreEqualThenEqualsReturnsTrue( ) {

        Ball ballOne = new Ball( 1, new Position( 1 ) );
        Ball ballTwo = new Ball( 1, new Position( 1 ) );

        assertTrue( ballOne.equals( ballTwo ) );
        assertTrue( ballTwo.equals( ballOne ) );
    }

    @Test
    public void givenTwoUnequalBallsThenEqualsReturnsFalse( ) {
        Ball ballOne = new Ball( 1, new Position( 0 ) );
        Ball ballTwo = new Ball( 2, new Position( 0 ) );

        assertFalse( ballOne.equals( ballTwo ) );
        assertFalse( ballTwo.equals( ballOne ) );
    }

}