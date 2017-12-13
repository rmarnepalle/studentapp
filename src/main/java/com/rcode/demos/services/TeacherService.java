package com.rcode.demos.services;

import com.rcode.demos.model.Teacher;
import com.rcode.demos.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService {

    private TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public Teacher getStudentById(Long id) {
        Optional<Teacher> optStudent = teacherRepository.findById(id);
        Teacher st = optStudent.get();
        return st;
    }
    public Iterable<Teacher> getStudents( ) {
        Iterable<Teacher> allStudents = teacherRepository. findAll();
        return allStudents;
    }
    public Teacher addNewStudent(Teacher st){
        return (Teacher)teacherRepository.save(st);
    }
    public void deleteStudent(Long id){
        teacherRepository.delete(this.getStudentById(id));
    }
}
