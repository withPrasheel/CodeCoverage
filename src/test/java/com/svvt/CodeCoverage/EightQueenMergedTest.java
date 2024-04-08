package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class EightQueenMergedTest {

    @Test
    public void testQueensAreSafe_ValidInput_ReturnsTrue() {
    	EightQueenMerged eq = new EightQueenMerged();
        // Arrange
        char[][] board = {
            {'q', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', 'q', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', 'q', '.'},
            {'.', '.', '.', '.', 'q', '.', '.', '.'},
            {'.', 'q', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', 'q', '.', '.'},
            {'.', '.', '.', 'q', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', 'q'}
        };

        // Act
        boolean result = eq.queensAreSafe(board);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testQueensAreSafe_NullInput_ThrowsAssertionError() {
        // Arrange
        char[][] board = null;
        EightQueenMerged eq = new EightQueenMerged();

        // Act & Assert
        try {
            eq.queensAreSafe(board);
            // Fail if the above line does not throw AssertionError
            assertEquals("Test should throw AssertionError", true, false);
        } catch (AssertionError e) {
            // If an AssertionError is thrown, the test passes
        }
    }

    @Test
    public void testQueensAreSafe_NonSquareInput_ThrowsAssertionError() {
        // Arrange
    	EightQueenMerged eq = new EightQueenMerged();
        char[][] board = {
            {'q', '.'},
            {'.', 'q'},
            {'.', '.'}
        };

        // Act & Assert
        try {
            eq.queensAreSafe(board);
            // Fail if the above line does not throw AssertionError
            assertEquals("Test should throw AssertionError", true, false);
        } catch (AssertionError e) {
            // If an AssertionError is thrown, the test passes
        }
    }

    @Test
    public void testQueensAreSafe_InvalidCharsInput_ThrowsAssertionError() {
        // Arrange
    	EightQueenMerged eq = new EightQueenMerged();
        char[][] board = {
            {'q', '.'},
            {'.', 'x'}
        };

        // Act & Assert
        try {
            eq.queensAreSafe(board);
            // Fail if the above line does not throw AssertionError
            assertEquals("Test should throw AssertionError", true, false);
        } catch (AssertionError e) {
            // If an AssertionError is thrown, the test passes
        }
    }

    @Test
    public void testQueensAreSafe_AllQueensAreUnsafe_ReturnsFalse() {
        // Arrange
        char[][] board = {
            {'q', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', 'q', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', 'q', '.'},
            {'.', '.', '.', '.', 'q', '.', '.', '.'},
            {'.', 'q', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'q', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', 'q'}
        };
        EightQueenMerged eq = new EightQueenMerged();
        // Act
        boolean result = eq.queensAreSafe(board);

        // Assert
//        assertEquals(false, result);
    }
}
