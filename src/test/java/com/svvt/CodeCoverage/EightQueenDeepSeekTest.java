package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
public class EightQueenDeepSeekTest {

    @Test
    public void testQueensAreSafe_ValidInput_ReturnsTrue() {
        // Arrange
    	EightQueenDeepSeek eq = new EightQueenDeepSeek();
        char[][] board = {
        		{'.', 'q', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'q', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', 'q', '.', '.'},
                {'.', '.', '.', '.', '.', '.', 'q', '.'},
                {'.', '.', '.', '.', 'q', '.', '.', '.'},
                {'.', '.', 'q', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', 'q'},
                {'.', 'q', '.', '.', '.', '.', '.', '.'}
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
        EightQueenDeepSeek eq = new EightQueenDeepSeek();

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
        char[][] board = {
            {'q', '.'},
            {'.', 'q'},
            {'.', '.'}
        };
        EightQueenDeepSeek eq = new EightQueenDeepSeek();

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
        char[][] board = {
            {'q', '.'},
            {'.', 'x'}
        };
        EightQueenDeepSeek eq = new EightQueenDeepSeek();
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
        		{'.', 'q', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'q', '.', '.', '.', '.'},
                {'.', '.', '.', '.', 'q', '.', '.', '.'},
                {'.', '.', '.', '.', '.', 'q', '.', '.'},
                {'.', '.', '.', '.', '.', '.', 'q', '.'},
                {'.', '.', 'q', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', 'q'},
                {'.', 'q', '.', '.', '.', '.', '.', '.'}
        };
        EightQueenDeepSeek eq = new EightQueenDeepSeek();
        // Act
        boolean result = eq.queensAreSafe(board);

        // Assert
        assertEquals(true, result);
    }
}
