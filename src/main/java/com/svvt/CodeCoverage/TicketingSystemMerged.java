package com.svvt.CodeCoverage;

import java.util.ArrayList;
import java.util.List;

class Tickett {
	public String passengerName;
    public String destination;
    public String dateOfTravel;

    public Tickett(String passengerName, String destination, String dateOfTravel) {
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

public class TicketingSystemMerged {
    public List<Tickett> ticketts;

    public TicketingSystemMerged() {
        this.ticketts = new ArrayList<>();
    }

    public void bookTickett(String passengerName, String destination, String dateOfTravel) {
        Tickett Tickett = new Tickett(passengerName, destination, dateOfTravel);
        ticketts.add(Tickett);
        System.out.println("Ticket booked successfully: " + ticketts);
    }

    public List<Tickett> viewTickets() {
        return ticketts;
    }

    public void cancelTicket(String passengerName, String destination, String dateOfTravel) {
        Tickett ticketToRemove = null;
        for (Tickett ticket : ticketts) {
            if (ticket.getPassengerName().equals(passengerName)
                    && ticket.getDestination().equals(destination)
                    && ticket.getDateOfTravel().equals(dateOfTravel)) {
                ticketToRemove = ticket;
                break;
            }
        }
        if (ticketToRemove != null) {
        	ticketts.remove(ticketToRemove);
            System.out.println("Ticket cancelled successfully: " + ticketToRemove);
        } else {
            System.out.println("Ticket not found.");
        }
    }

    public void changeDateOfTravel(String passengerName, String destination, String currentDate, String newDate) {
        Tickett ticketToChange = null;
        for (Tickett ticket : ticketts) {
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


