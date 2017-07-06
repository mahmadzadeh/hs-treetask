package com.tasktree;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class TreeTaskTest {


    @Test
    public void canCreateAnInstance( ) {
        TreeTask treeTask = new TreeTask();
    }

    @Test
    public void canCreateInstanceWithInitialState( ) {

        TreeTask treeTask = TreeTask.initialState();

        assertNotNull( treeTask );

        assertTrue( treeTask.isInitialState() );
    }

    @Test
    public void getAllPegs() {


    }




}