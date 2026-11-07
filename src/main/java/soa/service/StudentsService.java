package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import soa.model.Student;
import soa.repository.StudentsRepository;

@Service
public class StudentsService {

    StudentsRepository SR;

    public StudentsService(StudentsRepository SR) {
        this.SR = SR;
    }

    // Get all students
    public Object getAllStudents() {
        Map<String, Object> response = new HashMap<>();

        try {
            List<Student> students = SR.findAll(); // READ OPERATION
            response.put("students", students);
        } catch (Exception e) {
            response.put("message", e.getMessage());
        }

        return response;
    }
}