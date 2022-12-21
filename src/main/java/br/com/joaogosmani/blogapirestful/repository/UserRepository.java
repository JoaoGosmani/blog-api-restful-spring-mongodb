package br.com.joaogosmani.blogapirestful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.joaogosmani.blogapirestful.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
