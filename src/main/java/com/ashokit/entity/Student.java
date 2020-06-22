package com.ashokit.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STUDENTS_DTLS")
@Data

public class Student {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private Integer studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;

	@Column(name = "STUDENT_AGE")
	private Integer studentAge;

}
