package service;

import model.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RouteService {

    List<Route> routesList = new ArrayList<>();

    public boolean addRoute(Route objRoute){
        Route opRoute = getRoute(objRoute);

        if(null == opRoute){
            routesList.add(objRoute);
            return true;
        }
        return false;
    }

    public Route getRoute(Route objRoute){
        List<Route> opRouteList = routesList.stream().filter(
                route -> (route.getFrom().equalsIgnoreCase(objRoute.getFrom()))
                && route.getTo().equalsIgnoreCase(objRoute.getTo())
                || (route.getFrom().equalsIgnoreCase(objRoute.getTo())
                        &&route.getTo().equalsIgnoreCase(objRoute.getFrom())))
                .collect(Collectors.toList());

        if (!opRouteList.isEmpty()){
            return opRouteList.get(0);
        }
        return null;
    }
}
