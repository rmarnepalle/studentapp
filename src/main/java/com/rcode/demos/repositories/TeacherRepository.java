package com.rcode.demos.repositories;

        import com.rcode.demos.model.Teacher;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;


public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}

