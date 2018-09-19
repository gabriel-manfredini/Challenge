package com.reclameaqui.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.reclameaqui.api.documents.Complain;
import com.reclameaqui.api.repositories.ComplainRepository;
import com.reclameaqui.api.services.ComplainService;

@Service
public class ComplainServiceImpl implements ComplainService {

	@Autowired
	private ComplainRepository complainRepository;
	
	
	@Override
	public List<Complain> listAll() {
		return this.complainRepository.findAll();
	}

	@Override
	public Complain listById(String id) {
		return  this.complainRepository.findOne(id);
	}

	@Override
	public List<Complain> listByLocaleAndCompany(String locale, String company) {

		return complainRepository.findByLocaleAndCompany(locale,company);
	}

	@Override
	public List<Complain> listByLocale(String locale) {
		
		return complainRepository.findByLocale(locale);
	}

	@Override
	public List<Complain> listByCompany(String company) {
		
		return complainRepository.findByCompany(company);
	}

	@Override
	public Complain ingest(Complain complain) {
		
		return this.complainRepository.save(complain);
	}

	@Override
	public Complain update(Complain complain) {
		
		return this.complainRepository.save(complain);
	}

	@Override
	public void delete(String id) {
		this.complainRepository.delete(id);

	}

}
