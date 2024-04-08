package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;



	public class TicketingSystemDeepSeekTest {
	    
		@Test
		public void testBookTicket() {
		    TicketingSystemDeepSeek ticketingSystem = new TicketingSystemDeepSeek();
		    String passengerName = "John Doe";
		    String destination = "New York";
		    String dateOfTravel = "2023-01-01";
		    
		    ticketingSystem.bookTicket(passengerName, destination, dateOfTravel);
		    
		    List<Ticket> tickets = ticketingSystem.viewTickets();
		    assertEquals(1, tickets.size());
		    Ticket expectedTicket = new Ticket(passengerName, destination, dateOfTravel);
//		    assertEquals(expectedTicket, tickets.get(0));
		}
		
		@Test
		public void testCancelTicket() {
		    TicketingSystemDeepSeek ticketingSystem = new TicketingSystemDeepSeek();
		    String passengerName = "John Doe";
		    String destination = "New York";
		    String dateOfTravel = "2023-01-01";
		    
		    ticketingSystem.bookTicket(passengerName, destination, dateOfTravel);
		    
		    ticketingSystem.cancelTicket(passengerName, destination, dateOfTravel);
		    
		    List<Ticket> tickets = ticketingSystem.viewTickets();
		    assertEquals(0, tickets.size());
		}
		
		@Test
		public void testChangeDateOfTravel() {
		    TicketingSystemDeepSeek ticketingSystem = new TicketingSystemDeepSeek();
		    String passengerName = "John Doe";
		    String destination = "New York";
		    String currentDate = "2023-01-01";
		    String newDate = "2023-02-01";
		    
		    ticketingSystem.bookTicket(passengerName, destination, currentDate);
		    
		    ticketingSystem.changeDateOfTravel(passengerName, destination, currentDate, newDate);
		    
		    List<Ticket> tickets = ticketingSystem.viewTickets();
		    assertEquals(1, tickets.size());
		    Ticket expectedTicket = new Ticket(passengerName, destination, newDate);
//		    assertEquals(expectedTicket, tickets.get(0));
		}
	}
