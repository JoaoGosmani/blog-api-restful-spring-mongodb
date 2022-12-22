package br.com.joaogosmani.blogapirestful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.joaogosmani.blogapirestful.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
