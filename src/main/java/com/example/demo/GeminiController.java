package com.example.demo;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GeminiController {
    @CrossOrigin
    @GetMapping("/getallscienceplan")
    public ArrayList<SciencePlan> getAllSciencePlans() {
        OCS o = new OCS();
        System.out.println(o.getAllSciencePlans());
        return o.getAllSciencePlans();
    }

    @CrossOrigin
    @GetMapping("/getscienceplanbyid")
    public SciencePlan getSciencePlan(@RequestParam(name="id", required=false, defaultValue="1") int id) {
        OCS o = new OCS();
        return o.getSciencePlanByNo(Integer.valueOf(id));
    }

    @CrossOrigin
    @PostMapping("/createscienceplan")
    public String createSciencePlan(@RequestBody SciencePlan sciencePlan) {
        OCS o = new OCS();
        return o.createSciencePlan(sciencePlan);
    }

    @CrossOrigin
    @DeleteMapping("/deleteallscienceplan")
    public String deleteAllSciencePlans() {
        OCS o = new OCS();
        o.deleteAllSciencePlans();
        return "All science plans deleted successfully.";
    }

    @CrossOrigin
    @DeleteMapping("/deletescienceplanbyid")
    public String deleteSciencePlan(@RequestParam(name="planNo") int planNo) {
        OCS o = new OCS();
        boolean success = o.deleteSciencePlanByNo(planNo);
        if (success) {
            return "Science plan with planNo " + planNo + " deleted successfully.";
        } else {
            return "Failed to delete science plan with planNo " + planNo + ".";
        }
    }
}
