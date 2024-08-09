package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.medicine.Medicine;
import com.example.demo.medicine.MedicineData;
import com.example.demo.medicine.MedicineRepository;

@RestController
@RequestMapping("/medicines")
public class medicineController {
	
	@Autowired
	private MedicineRepository repository;
	
	@PostMapping
	public void register(@RequestBody MedicineData data) {
		repository.save(new Medicine(data));
	}
}
