package com.mutante.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutanteRepositoryImpl extends MongoRepository<Mutante, Id>{

}
