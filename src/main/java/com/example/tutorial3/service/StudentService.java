package com.example.tutorial3.service;

import java.util.List;
import com.example.tutorial3.model.StudentModel;

public interface StudentService {

	
	List<StudentModel> selectAllStudents();
	
	void addStudent(StudentModel student);

	StudentModel selectStudent(String npm);

	void removeStudent(StudentModel student);
	
}
