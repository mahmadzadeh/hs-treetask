package com.tasktree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Peg {

    List<Ball> balls;

    public Peg( List<Ball> balls ) {
        this.balls = new ArrayList<>( balls );
    }

    public Position getOpenPositions( ) {
        return NullPosition.INSTANCE;
    }

    public abstract Ball getBallAtPosition( Position position );

    public List<Ball> getAllBalls( ) {
        return Collections.unmodifiableList( balls );
    }
}
