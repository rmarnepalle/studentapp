package com.rcode.demos.services;

import com.rcode.demos.model.Student;
import com.rcode.demos.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student getStudentById(Long id) {
        Optional<Student> optStudent = studentRepository.findById(id);
        Student st = optStudent.get();
        return st;
    }
    public Iterable<Student> getStudents( ) {
        Iterable<Student> allStudents = studentRepository. findAll();
        return allStudents;
    }
    public Student addNewStudent(Student st){
        return (Student)studentRepository.save(st);
    }
    public void deleteStudent(Long id){
        studentRepository.delete(this.getStudentById(id));
    }
}
