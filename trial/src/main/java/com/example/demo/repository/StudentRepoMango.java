package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentMango;
@Repository
public interface StudentRepoMango extends MongoRepository<StudentMango, Integer>{
}