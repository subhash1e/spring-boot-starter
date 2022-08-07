package com.subhash1e.mystudentdb.repository;


import com.subhash1e.mystudentdb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}