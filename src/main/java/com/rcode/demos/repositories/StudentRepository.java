package com.rcode.demos.repositories;

import com.rcode.demos.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student, Long>{
}
