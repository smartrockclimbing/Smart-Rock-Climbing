package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class RouteController extends Controller {

    // Returns new route id in response
    // Route info contained in POST data
    // Only admins can create routes
    public Result createRoute(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getRouteById(Long routeId){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "{route_id: " + routeId.toString() + "}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getRouteByGPS(Long location){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "{location: " + location.toString() + "}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getAllRoutes(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns result in response
    // Onl y admins can delete routes
    public Result deleteRoute(Long routeId){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "{route_id: " + routeId.toString() + "}";
        return ok(string);
    }
}
