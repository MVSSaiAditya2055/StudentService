package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.model.Student;

public interface StudentsRepository extends JpaRepository<Student, Long> {

}