package com.ram.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ram.student.dal.entities.Student;
//need two generic types the class that the repo is being made for and the type of primary key in the class
public interface StudentRepository extends CrudRepository<Student, Long> {

}
