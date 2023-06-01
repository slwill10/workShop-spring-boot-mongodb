package com.nelioalves.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.repository.PostRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Optional<Post> findById(String id) {
	    Optional<Post> user = repo.findById(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return user;
	}	

}