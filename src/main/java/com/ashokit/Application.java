package com.ashokit;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Student;
import com.ashokit.repositories.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		StudentRepository bean = ctxt.getBean(StudentRepository.class);

		Student s = new Student();
		s.setStudentName("raghu");
		s.setStudentEmail("raghu@gmail.com");
		s.setStudentAge(24); 

		Student savedEntity = bean.save(s);
		System.out.println(savedEntity);
	}

}
