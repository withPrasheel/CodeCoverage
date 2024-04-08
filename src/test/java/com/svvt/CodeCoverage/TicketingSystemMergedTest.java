package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TicketingSystemMergedTest {
	    private TicketingSystemMerged ticketingSystem;

	    @Before
	    public void setUp() {
	        ticketingSystem = new TicketingSystemMerged();
	    }

	    @Test
	    public void testBookTicket_Success() {
	        // Arrange
	        String passengerName = "Alice";
	        String destination = "New York";
	        String dateOfTravel = "2024-04-10";

	        // Act
	        ticketingSystem.bookTickett(passengerName, destination, dateOfTravel);

	        // Assert
	        // You can also test the output printed to console if needed
	        // For simplicity, let's just check that the list of tickets is not empty
	        assertEquals(false, ticketingSystem.viewTickets().isEmpty());
	    }

	    @Test
	    public void testCancelTicket_Success() {
	        // Arrange
	        String passengerName = "Alice";
	        String destination = "New York";
	        String dateOfTravel = "2024-04-10";
	        ticketingSystem.bookTickett(passengerName, destination, dateOfTravel);

	        // Act
	        ticketingSystem.cancelTicket(passengerName, destination, dateOfTravel);

	        // Assert
	        // You can also test the output printed to console if needed
	        // For simplicity, let's just check that the list of tickets is empty after cancellation
	        assertEquals(true, ticketingSystem.viewTickets().isEmpty());
	    }

	    @Test
	    public void testChangeDateOfTravel_Success() {
	        // Arrange
	        String passengerName = "Alice";
	        String destination = "New York";
	        String currentDate = "2024-04-10";
	        String newDate = "2024-04-15";
	        ticketingSystem.bookTickett(passengerName, destination, currentDate);

	        // Act
	        ticketingSystem.changeDateOfTravel(passengerName, destination, currentDate, newDate);

	        // Assert
	        // You can also test the output printed to console if needed
	        // For simplicity, let's just check that the date of travel is updated correctly
	        assertEquals(newDate, ticketingSystem.viewTickets().get(0).getDateOfTravel());
	    }
	}

