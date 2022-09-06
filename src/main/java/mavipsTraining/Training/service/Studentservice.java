package mavipsTraining.Training.service;

import mavipsTraining.Training.model.Student;
import mavipsTraining.Training.repos.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {

    @Autowired
    private Studentrepo studentrepo;


    public List <Student> getAllStudent() {

        return studentrepo.findAll();
    }

}
