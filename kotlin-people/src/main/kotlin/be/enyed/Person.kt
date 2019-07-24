package be.enyed

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity data class Person(var name:String, @Id @GeneratedValue var id:Long? = null )

interface PeopleRepository : CrudRepository<Person,Long>{}

@Component class Initializer(@Autowired val peopleRepo:PeopleRepository) {
	
	@EventListener(ApplicationReadyEvent::class)
	fun init() {
		println("INIT")
		
		peopleRepo.save(Person("Dirk"))
		peopleRepo.save(Person("Damien"))
		
		println(peopleRepo.findAll())
	}
	
}