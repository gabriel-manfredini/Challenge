package com.reclameaqui.api.services;

import java.util.List;

import com.reclameaqui.api.documents.Complain;

public interface ComplainService {

	List<Complain> listAll();
	
	Complain listById(String id);
	
	List<Complain> listByLocaleAndCompany(String locale, String company);
	
	List<Complain> listByLocale(String locale);
	
	List<Complain> listByCompany(String company);
	
	Complain ingest(Complain complain);
	
	Complain update(Complain complain);
	
	void delete(String id);
	
	
	
}
