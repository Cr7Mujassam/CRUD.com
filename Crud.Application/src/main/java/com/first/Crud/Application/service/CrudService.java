package com.first.Crud.Application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.Crud.Application.DAO.CreateOrWatchDataDao;
import com.first.Crud.Application.Entiry.Student;

@Service
public class CrudService {
	
	//Student st;
	
	@Autowired
	CreateOrWatchDataDao createOrWatch;
	
	//see details
	public List<Student> seeDatbaseDeatils(){
		return createOrWatch.seeDatbaseDeatils();
	}
	//update details
	public Student updateDetails(Student st) {
		return createOrWatch.updateDetails(st);
	}
	
	//insert detail
	public Student insertDetails(Student st) {
		return createOrWatch.insertDetails(st);
	}
	
	
	//delete details
	
}
