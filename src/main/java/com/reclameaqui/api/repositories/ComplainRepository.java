package com.reclameaqui.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reclameaqui.api.documents.Complain;

public interface ComplainRepository extends MongoRepository<Complain, String> {

	List<Complain> findByLocale(String locale);

	List<Complain> findByCompany(String company);

	List<Complain> findByLocaleAndCompany(String locale, String company);

}
