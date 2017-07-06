package com.tasktree;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PegTest {

    Peg peg = new FirstPeg();

    @Test
    public void givenFirstPegInInitialStateThenGetOpenPositionsReturnsNoPosition( ) {
        assertEquals( NullPosition.INSTANCE, peg.getOpenPositions() );
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInvalidPositionThenGetBallAtPositionThrowsRuntime( ) {

        peg.getBallAtPosition( new Position( 11 ) );
    }

    @Test
    public void givenFirstPegInInitialStateThenItHasTwoBalls( ) {
        Peg peg = new FirstPeg();

        List<Ball> allBalls = peg.getAllBalls();

        assertEquals( 2, allBalls.size() );
    }

    @Ignore
    public void givenValidBallPositionThenGetBallAtPositionReturnsBall( ) {

        assertEquals( 2, peg.getBallAtPosition( new Position( 1 ) ).getNumber() );
    }


}
