package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import models.Climb;
import models.ClimbPoint;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

public class ClimbController extends Controller {
    // Returns new climb id in response
    // Climb info contained in POST data
    @Transactional
    public Result createClimb(){
        System.out.println("wat");

        List<ClimbPoint> climb_points = new ArrayList<ClimbPoint>();
        Long id = 0L;
        Double x = 0.0;
        Double y = 0.0;
        Double z = 0.0;
        Random r = new Random();
        Date time = new Date();

        for (int i = 0; i < 10; i++) {
            ClimbPoint newPoint = new ClimbPoint(id, x, y, z, time);
            climb_points.add(newPoint);

            id++;
            x += r.nextDouble()*0.2 - 0.1;
            y += r.nextDouble()*0.2 - 0.1;
            z += r.nextDouble()*0.2 - 0.1;
            time = new Date();
        }

        Long route_id = 0L;
        Long user_id = 0L;
        Date start_time = new Date();
        Date end_time = new Date();

        Climb newClimb = new Climb(route_id, user_id, start_time, end_time, climb_points);
        JPA.em().persist(newClimb);
        return ok("created climb");
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    @Transactional
    public Result getClimbById(Long climbId){
        // Long climbIdentifier = Long.parseUnsignedLong(climbId);
        // String l1Str = Long.toUnsignedString(climbIdentifier);

        CriteriaBuilder cb = JPA.em().getCriteriaBuilder();
        CriteriaQuery<Climb> cq = cb.createQuery(Climb.class);
        Root<Climb> climbRoot = cq.from(Climb.class);
        cq.where(cb.equal(climbRoot.get("id"), climbId));
        List<Climb> results = JPA.em().createQuery(cq).getResultList();

        JsonNode json = Json.toJson(results);
        return ok(json);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    public Result getClimbsInRange(String start, String end){
        String string = "getClimbsInRange\n{start: "+ start + ",end: " + end + "}";
        return ok(string);
    }

    // Returns JSON in response
    // Only climbs for authenticated user are returned
    @Transactional
    public Result getAllClimbs(){
        EntityManager em = JPA.em();
        Query query = em.createQuery("SELECT e FROM Climb e");
        List<Climb> results = query.getResultList();
        JsonNode json = Json.toJson(results);

        // String string = "GetAllClimbs";
        return ok(json);
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
