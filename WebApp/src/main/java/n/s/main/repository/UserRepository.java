package n.s.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import n.s.main.entities.Formfive;
import n.s.main.entities.Formfour;
import n.s.main.entities.Formone;
import n.s.main.entities.Formthree;
import n.s.main.entities.Formtwo;
import n.s.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);

	Formone save(Formone form);
	
	Formtwo save(Formtwo form2);

	Formthree save(Formthree form3);
	
	Formfour save(Formfour form4);
	
	Formfive save(Formfive form5);
	
	
}
