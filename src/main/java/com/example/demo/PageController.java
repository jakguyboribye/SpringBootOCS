package com.example.demo;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    private final OCS ocs = new OCS();

    @GetMapping("/AstronomerHome")
    public String AstronomerHome() {
        return "AstronomerHome";
    }

    @GetMapping("/CreateSP")
    public String CreateSP() {
        return "CreateSP";
    }

}
