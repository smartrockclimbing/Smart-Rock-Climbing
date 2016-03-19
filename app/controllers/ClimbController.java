package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import models.Climb;

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
    public Result createClimb(){
        String string = "Climb Created";
        return ok(string);
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
