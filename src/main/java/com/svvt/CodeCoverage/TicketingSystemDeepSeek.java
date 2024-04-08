package com.svvt.CodeCoverage;

import java.util.ArrayList;
import java.util.List;

class Ticket {
	public String passengerName;
    public String destination;
    public String dateOfTravel;

    public Ticket(String passengerName, String destination, String dateOfTravel) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName + ", Destination: " + destination + ", Date of Travel: " + dateOfTravel;
    }
}

public class TicketingSystemDeepSeek {
    private List<Ticket> tickets;

    public TicketingSystemDeepSeek() {
        this.tickets = new ArrayList<>();
    }

    public void bookTicket(String passengerName, String destination, String dateOfTravel) {
        Ticket ticket = new Ticket(passengerName, destination, dateOfTravel);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully: " + ticket);
    }

    public List<Ticket> viewTickets() {
        return tickets;
    }

    public void cancelTicket(String passengerName, String destination, String dateOfTravel) {
        Ticket ticketToRemove = null;
        for (Ticket ticket : tickets) {
            if (ticket.getPassengerName().equals(passengerName)
                    && ticket.getDestination().equals(destination)
                    && ticket.getDateOfTravel().equals(dateOfTravel)) {
                ticketToRemove = ticket;
                break;
            }
        }
        if (ticketToRemove != null) {
            tickets.remove(ticketToRemove);
            System.out.println("Ticket cancelled successfully: " + ticketToRemove);
        } else {
            System.out.println("Ticket not found.");
        }
    }

    public void changeDateOfTravel(String passengerName, String destination, String currentDate, String newDate) {
        Ticket ticketToChange = null;
        for (Ticket ticket : tickets) {
            if (ticket.getPassengerName().equals(passengerName)
                    && ticket.getDestination().equals(destination)
                    && ticket.getDateOfTravel().equals(currentDate)) {
                ticketToChange = ticket;
                break;
            }
        }
        if (ticketToChange != null) {
            ticketToChange.dateOfTravel = newDate;
            System.out.println("Date of travel changed successfully for ticket: " + ticketToChange);
        } else {
            System.out.println("Ticket not found.");
        }
    }
}


