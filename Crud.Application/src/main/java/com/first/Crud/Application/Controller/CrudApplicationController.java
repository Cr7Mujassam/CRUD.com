package com.first.Crud.Application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.Crud.Application.Entiry.Student;
import com.first.Crud.Application.service.CrudService;

@RestController // combination of two annotations(Controller + responseBody
public class CrudApplicationController {

	@Autowired
	CrudService crudService;

	// watch the data of from database
	@PostMapping(value = "/see/data")
	public List<Student> seeDetail() {
		return crudService.seeDatbaseDeatils();
	}

	// update the details using id
	@PostMapping(value = "/update/data")
	public Student updateDetail(@RequestBody Student st) {
		return crudService.updateDetails(st);
	}

	// insert the data
	@PostMapping(value = "/insert/data")
	public Student insertDetail(@RequestBody Student st) {
		return crudService.insertDetails(st);
	}

	// delete the data
	@PostMapping(value = "/delete/data")
	public String deleteDetail(@RequestBody Student st) {
		return crudService.deleteDetails(st);
	}

}
