package mavipsTraining.Training.controller;

import mavipsTraining.Training.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private Studentservice studentservice;


    @GetMapping("/index")
    private String getHome(){

        return "index";

    }
    @GetMapping("/")
    private String getEmpty(){

        return "home";

    }
}
