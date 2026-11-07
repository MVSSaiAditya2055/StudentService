package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.StudentsService;

@RestController
@RequestMapping("/")
public class StudentsController {

    StudentsService SS;

    public StudentsController(StudentsService SS) {
        this.SS = SS;
    }

    @GetMapping("students")
    public Object students() {
        return SS.getAllStudents();
    }
}