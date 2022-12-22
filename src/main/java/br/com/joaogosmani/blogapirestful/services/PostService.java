package br.com.joaogosmani.blogapirestful.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joaogosmani.blogapirestful.domain.Post;
import br.com.joaogosmani.blogapirestful.repository.PostRepository;
import br.com.joaogosmani.blogapirestful.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
