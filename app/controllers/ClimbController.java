package controllers;

import play.mvc.Controller;
import play.mvc.Result;

// TODO These are just stubs
public class ClimbController extends Controller {
    // Returns new climb id in response
    // Climb info contained in POST data
    public static Result createClimb(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public static Result getClimbById(String climbId){
        Long climbIdentifier = Long.parseUnsignedLong(climbId);
//        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "{id: " + climbId + "}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public static Result getClimbsInRange(String start, String end){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public static Result getAllClimbs(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns result in response
    // Only climbs for authenticated user can be deleted
    public static Result deleteClimb(String climbId){
        Long climbIdentifier = Long.parseUnsignedLong(climbId);
//        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "{id: " + climbId + "}";
        return ok(string);
    }
}
