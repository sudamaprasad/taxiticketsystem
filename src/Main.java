import model.Route;
import model.Ticket;
import service.RouteService;
import service.TicketService;

public class Main {
    public static void main(String[] args) {

        Route objRoute = new Route("MUMBAI","PUNE",120);

        RouteService objRouteService = new RouteService();
        boolean isAdded = objRouteService.addRoute(objRoute);
        System.out.println(isAdded);

        String from="PUNE", to="MUMBAI";
        int noOfTravellers=2;

        Route route = new Route(from,to,50);
        Route opRoute = objRouteService.getRoute(route);

        if (null!=opRoute){
            TicketService objTicketService = new TicketService();
            Ticket ticket = objTicketService.generateTicket(opRoute, noOfTravellers);
            objTicketService.printTicket(ticket);
        }else{
            System.out.println("No route available");
        }
    }
}