package be.enyed

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.beans.factory.annotation.Autowired

@RestController class PersonController(val personRepo:PeopleRepository){
	
	@GetMapping("/people") fun allpeople() = ResponseEntity.ok(personRepo.findAll())
	
}