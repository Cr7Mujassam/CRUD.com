package com.first.Crud.Application.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.first.Crud.Application.Entiry.Student;
import com.first.Crud.Application.Repositries.StudentRepositries;

@Component
public class CreateOrWatchDataDao {

	@Autowired
	StudentRepositries sr;
	
	Student st;

	// see details && create details
	public List<Student> seeDatbaseDeatils() {
		List<Student> li = sr.findAll();
		return li;
	}
	
	//update the details
	public Student updateDetails(Student str) {
		//find the details by id
		st = sr.findById(str.getStudentId()).get();
		//updating the details using save() methods
		st.setStudentAddress(str.getStudentAddress());
		st.setStudentName(str.getStudentName());
		
		//saving the details
		Student st1 = sr.save(st);
		return st1;
	}

}
