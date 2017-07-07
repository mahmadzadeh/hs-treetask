package com.tasktree;

public class NullPosition extends Position {

    private static NullPosition instance = null;

    private NullPosition( ) {
        super( -1 );
    }

    public static NullPosition INSTANCE = instance == null ? new NullPosition() : instance;
}
