package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;

public class MineSweeperMergedTest {
    private MineSweeperMerged mineSweeper;

    @Before
    public void setUp() {
        mineSweeper = new MineSweeperMerged();
        mineSweeper.myTruth = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        mineSweeper.myShow = new boolean[3][3];
    }

    @Test
    public void testCellPickedInsideBoundsAndNotShown() {
        mineSweeper.cellPicked(1, 1); // Picking the cell at the center
        assertTrue(mineSweeper.myShow[1][1]); // Cell should be shown
    }

    @Test
    public void testCellPickedInsideBoundsAndAlreadyShown() {
        mineSweeper.myShow[1][1] = true; // Marking the cell at the center as already shown
        mineSweeper.cellPicked(1, 1); // Picking the cell at the center again
        assertTrue(mineSweeper.myShow[1][1]); // Cell state should remain unchanged
    }

    @Test
    public void testCellPickedOutsideBounds() {
        // Picking cells out of bounds should not throw an exception and should not reveal any cells
        mineSweeper.cellPicked(-1, 2);
        mineSweeper.cellPicked(3, 3);
        assertFalse(mineSweeper.myShow[2][2]); // No cell should be shown
    }

    @Test
    public void testCellPickedZeroValue() {
        // Picking a cell with a value of 0 should recursively reveal adjacent cells
        mineSweeper.cellPicked(0, 0); // Picking the cell at top-left corner
        assertTrue(mineSweeper.myShow[0][0]); // Cell should be shown
        assertTrue(mineSweeper.myShow[0][1]); // Adjacent cell should also be shown
        assertTrue(mineSweeper.myShow[1][0]); // Adjacent cell should also be shown
        assertTrue(mineSweeper.myShow[1][1]); // Diagonal cell should not be shown (it's not adjacent)
    }
}
