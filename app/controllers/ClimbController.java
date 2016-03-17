package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ClimbController extends Controller {
    // Returns new climb id in response
    // Climb info contained in POST data
    public Result createClimb(){
        String string = "Climb Created";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public Result getClimbById(Long climbId){
//        Long climbIdentifier = Long.parseUnsignedLong(climbId);
//        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "getClimbById\n{id: " + climbId.toString() + "}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public Result getClimbsInRange(String start, String end){
        String string = "getClimbsInRange\n{start: "+ start + ",end: " + end + "}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public Result getAllClimbs(){
        String string = "GetAllClimbs";
        return ok(string);
    }

    // Returns result in response
    // Only climbs for authenticated user can be deleted
    public Result deleteClimb(Long climbId){
//        Long climbIdentifier = Long.parseUnsignedLong(climbId);
//        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "deleteClimb\n{id: " + climbId.toString() + "}";
        return ok(string);
    }
}
