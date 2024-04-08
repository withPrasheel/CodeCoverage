package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class StopWatchDeepSeekTest {

	@Test
	public void testStartAndStop() {
		StopWatchDeepSeek stopwatch = new StopWatchDeepSeek();
		stopwatch.start();
		// Introducing some delay to simulate elapsed time
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopwatch.stop();
		assertTrue(stopwatch.time() > 0); // Elapsed time should be greater than 0
	}

	@Test
	public void testElapsedTimeInSeconds() {
		StopWatchDeepSeek stopwatch = new StopWatchDeepSeek();
		stopwatch.start();
		// Introducing some delay to simulate elapsed time
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopwatch.stop();
		double elapsedTime = stopwatch.time();
		assertEquals(2.0, elapsedTime, 0.1); // Elapsed time should be approximately 2 seconds
	}

	@Test
	public void testElapsedTimeInNanoseconds() {
		StopWatchDeepSeek stopwatch = new StopWatchDeepSeek();
		stopwatch.start();
		// Introducing some delay to simulate elapsed time
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopwatch.stop();
		long elapsedTime = stopwatch.timeInNanoseconds();
		assertTrue(elapsedTime > 0); // Elapsed time in nanoseconds should be greater than 0
	}

	@Test
	public void testToString() {
		StopWatchDeepSeek stopwatch = new StopWatchDeepSeek();
		stopwatch.start();
		// Introducing some delay to simulate elapsed time
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopwatch.stop();
		String elapsedTimeString = stopwatch.toString();
		assertTrue(elapsedTimeString.contains("elapsed time:")); // Ensure the output contains "elapsed time:"
	}
}
