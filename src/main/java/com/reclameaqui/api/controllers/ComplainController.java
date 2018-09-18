package com.reclameaqui.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reclameaqui.api.documents.Complain;
import com.reclameaqui.api.services.ComplainService;

@RestController
@RequestMapping(path="/api/complain")
public class ComplainController {

	@Autowired
	private ComplainService complainService;
	
	@GetMapping
	public ResponseEntity<List<Complain>> listAll(){
		return ResponseEntity.ok(this.complainService.listAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Complain> listById(@PathVariable(name = "id") String id){
		return ResponseEntity.ok(this.complainService.listById(id));
	}
	
	@GetMapping(path = "/{locale}/{company}")
	public ResponseEntity<List<Complain>> listByLocaleAndCompany(@PathVariable(name = "locale") String locale, @PathVariable(name = "company") String company){
		return ResponseEntity.ok(this.complainService.listByLocaleAndCompany(locale, company));
	}
	
	@GetMapping(path = "/{locale}")
	public ResponseEntity<List<Complain>> listByLocale(@PathVariable(name = "locale") String locale){
		return ResponseEntity.ok(this.complainService.listByLocale(locale));
	}
	
	@GetMapping(path = "/{company}")
	public ResponseEntity<List<Complain>> listByCompany(@PathVariable(name = "company") String company){
		return ResponseEntity.ok(this.complainService.listByCompany(company));
	}
	
	@PostMapping
	public ResponseEntity<Complain> ingest(@RequestBody Complain complain){
		return ResponseEntity.ok(this.complainService.ingest(complain));
		
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Complain> update(@PathVariable(name = "id") String id, @RequestBody Complain complain){
		complain.setId(id);
		return ResponseEntity.ok(this.complainService.update(complain));
	}
	
	@DeleteMapping(path ="/{id}")
	public void delete(@PathVariable(name = "id") String id){
		this.complainService.delete(id);
	}
	
	
	}
