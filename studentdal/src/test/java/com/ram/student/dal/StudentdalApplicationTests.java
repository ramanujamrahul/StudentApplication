package com.ram.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ram.student.dal.entities.Student;
import com.ram.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Batman");
		student.setCourse("Jui Jutsu");
		student.setFee(20d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {

		Student student = studentRepository.findById(2l).orElse(null);
		System.out.println(student);
	}

	@Test
	public void testUpdateStudentById() {

		Student student = studentRepository.findById(2l).orElse(null);
		student.setFee(60d);
		student.setCourse("Jui Jutsu");
		student.setName("Batman");
		studentRepository.save(student);
	}

	@Test
	public void testDeleteStudentById() {

		Student student = studentRepository.findById(2l).orElse(null);

		studentRepository.deleteById(3l);
	}
}
