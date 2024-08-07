package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.medicine.MedicineData;

@RestController
@RequestMapping("/medicines")
public class medicineController {
	
	@PostMapping
	public void register(@RequestBody MedicineData dados) {
		System.out.println(dados);
	}
}
