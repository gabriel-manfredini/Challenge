package com.reclameaqui.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reclameaqui.api.documents.Complain;
import com.reclameaqui.api.responses.Response;
import com.reclameaqui.api.services.ComplainService;

@RestController
@RequestMapping(path="/api/complain")
public class ComplainController {

	@Autowired
	private ComplainService complainService;
	
	@GetMapping
	public ResponseEntity<Response<List<Complain>>> listAll(){
		return ResponseEntity.ok(new Response<List<Complain>>(this.complainService.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Complain>> listById(@PathVariable(name = "id") String id){
		return ResponseEntity.ok(new Response<Complain>(this.complainService.listById(id)));
	}
	
	@GetMapping(path = "/{locale}/{company}")
	public ResponseEntity<Response<List<Complain>>> listByLocaleAndCompany(@PathVariable(name = "locale") String locale, @PathVariable(name = "company") String company){
		return ResponseEntity.ok(new Response<List<Complain>>(this.complainService.listByLocaleAndCompany(locale, company)));
	}
	
	@GetMapping(path = "/{locale}")
	public ResponseEntity<Response<List<Complain>>> listByLocale(@PathVariable(name = "locale") String locale){
		return ResponseEntity.ok(new Response<List<Complain>>(this.complainService.listByLocale(locale)));
	}
	
	@GetMapping(path = "/{company}")
	public ResponseEntity<Response<List<Complain>>> listByCompany(@PathVariable(name = "company") String company){
		return ResponseEntity.ok(new Response<List<Complain>>(this.complainService.listByCompany(company)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Complain>> ingest(@Valid @RequestBody Complain complain, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Complain>(errors));
		}
		return ResponseEntity.ok(new Response<Complain>(this.complainService.ingest(complain)));
		
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Complain>> update(@PathVariable(name = "id") String id, @Valid @RequestBody Complain complain, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Complain>(errors));
		}
		complain.setId(id);
		return ResponseEntity.ok(new Response<Complain>(this.complainService.update(complain)));
	}
	
	@DeleteMapping(path ="/{id}")
	public void delete(@PathVariable(name = "id") String id){
		this.complainService.delete(id);
	}
	
	
	}
