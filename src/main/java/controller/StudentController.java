package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.StudentService;

@Controller
public class StudentController {

                    //Implement List Student Features
    //Inject studentService dependency(a constructor based injection)
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
//
//        handler method to handle list students and return model and view
        @GetMapping("/students")
        public String listStudents(Model model) {
            model.addAttribute("students", studentService.getAllStudents());
            return "students";




        }

    }

