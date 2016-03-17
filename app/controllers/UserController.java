package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller{
    // Sets user id in session
    // User info contained in POST data
    public Result createUser(){
        String string = "User Created";
        return ok(string);
    }

    // Sets user id in session
    // Authentication info contained in POST data
    public Result login(){
        String string = "Logged in";
        return ok(string);
    }

    // Returns JSON in response
    // User info contained in POST data
    public Result updateUser(Long userId){
        //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
        //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "Updated user \n{user_id: " + userId.toString() + "}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getProfile(Long userId){
        //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
        //        String l1Str = Long.toUnsignedString(climbIdentifier);

        String string = "getProfile called\n{user_id: " + userId.toString() + "}";
        return ok(string);
    }

    // Returns result in response
    public Result deleteUser(Long userId){
    //        Long climbIdentifier = Long.parseUnsignedLong(climbId);
    //        String l1Str = Long.toUnsignedString(climbIdentifier);

    String string = "deleteUser called\n{user_id: " + userId.toString() + "}";
    return ok(string);
}

}
