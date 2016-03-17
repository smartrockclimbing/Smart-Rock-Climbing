package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class RouteController extends Controller {

    // Returns new route id in response
    // Route info contained in POST data
    // Only admins can create routes
    public Result createRoute(){
        String string = "Route Created";
        return ok(string);
    }

    // Returns JSON in response
    public Result getRouteById(Long routeId){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "Got route by id\n{route_id: " + routeId.toString() + "}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getRouteByGPS(String lat, String longitude){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "Got route by coordinates\nlatitude: " + lat  + ", longitude: " + longitude + " }";
        return ok(string);
    }

    // Returns JSON in response
    public Result getAllRoutes(){
        String string = "Got all routes!";
        return ok(string);
    }

    // Returns result in response
    // Onl y admins can delete routes
    public Result deleteRoute(Long routeId){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "Delete route\n{route_id: " + routeId.toString() + "}";
        return ok(string);
    }
}
