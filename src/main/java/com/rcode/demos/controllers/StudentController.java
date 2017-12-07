package com.rcode.demos.controllers;

import com.rcode.demos.model.Student;
import com.rcode.demos.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    private StudentService sServ;

    public StudentController(StudentService sServ) {
        this.sServ = sServ;
    }

    @RequestMapping("/students/{id}")
    public String getStudents(@PathVariable int id, Model model){
        Student s = sServ.getStudentById(new Long(id));
        model.addAttribute("students", s);
        return "student";
    }
    @RequestMapping("/students")
    public String getStudents( Model model){
        Iterable<Student>s = sServ.getStudents();
        model.addAttribute("students", s);
        return "student";
    }
}
