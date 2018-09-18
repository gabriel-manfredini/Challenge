package com.reclameaqui.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reclameaqui.api.documents.Complain;

public interface ComplainRepository extends MongoRepository<Complain, String> {

}
