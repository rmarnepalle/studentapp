package com.rcode.demos.bootstrap;

import com.rcode.demos.model.Teacher;
import com.rcode.demos.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TeacherBootStrap implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
    private void initData(){
        Teacher teacher = new Teacher(  "John" , "Mathemetics");
        Teacher teacher1 = new Teacher(  "Ramu" , "Computers");
        teacherRepository.save(teacher);
        teacherRepository.save(teacher1);
    }
}
