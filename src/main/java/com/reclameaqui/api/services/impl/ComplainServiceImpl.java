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
//		Complain complain = new Complain();
//		complain.setLocale(locale);
//		complain.setCompany(company);
//		
//		this.complainRepository.
//		MongoTemplate mongoTemplate = new MongoTemplate();
//		
//		return List<User> users = MongoTemplate.find(query, Complain.class);
		return null;
	}

	@Override
	public List<Complain> listByLocale(String locale) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("locale").is(locale));	
//		return complainRepository.findAll(query,Complain.class);
		return null;
	}

	@Override
	public List<Complain> listByCompany(String company) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("company").is(company));	
//		return MongoTemplate.find(query,Complain.class);
		return null;
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
