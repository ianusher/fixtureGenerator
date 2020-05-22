package com.fixtures.fixturegenerator.web;

import com.fixtures.fixturegenerator.service.FixturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FixturesController {

    private FixturesService fixtureService;


    @Autowired
    public void setFixturesService(FixturesService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @GetMapping("/fixtures")
    public String retrieveFixtures(Model model){
        model.addAttribute("fixtures", fixtureService.outputList());
        return "fixtures";
    }


/*    @GetMapping("/fixtures")
    public String fixtures(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "fixtures";
    }*/


}
