package br.com.joaogosmani.blogapirestful.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaogosmani.blogapirestful.domain.User;
import br.com.joaogosmani.blogapirestful.dto.UserDTO;
import br.com.joaogosmani.blogapirestful.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> users = service.findAll();
		List<UserDTO> usersDto = users.stream().map(user -> new UserDTO(user)).collect(Collectors.toList());;
		return ResponseEntity.ok().body(usersDto);
	}
	
}
