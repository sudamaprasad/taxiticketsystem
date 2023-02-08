package service;

import model.Route;
import model.Ticket;

public class TicketService {

    public Ticket generateTicket(Route opRoute, int noOfTravellers){

        Ticket ticket = null;
        int fair = 0;

        if(opRoute.getDistance()<100){
            fair=750;
        }else {
            fair=750+((opRoute.getDistance()-100)*5);
        }

        int total=fair*noOfTravellers;
        ticket=new Ticket(opRoute.getFrom(), opRoute.getTo(), opRoute.getDistance(), noOfTravellers,total);

        return ticket;
    }

    public void printTicket(Ticket ticket){
        System.out.println("Taxi Ticket");
        System.out.println("-----------------------");
        System.out.print("Source : "+ticket.getFrom()+"\n Destination : "+ticket.getTo()
                +"\n Kms : "+ticket.getDistance()+"\n No of travellers : "+ticket.getNoOfTravellers()
                +"\n Total : "+ticket.getTotalFare());
    }
}
