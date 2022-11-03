package com.example.SchoolMangamentProject.repository;

import com.example.SchoolMangamentProject.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    // Review the following information:
    // https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/repositories.html

    //https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html





}
