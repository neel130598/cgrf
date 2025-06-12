package n.s.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import n.s.main.entities.Formfive;
import n.s.main.entities.Formfour;
import n.s.main.entities.Formone;
import n.s.main.entities.Formthree;
import n.s.main.entities.Formtwo;
import n.s.main.entities.User;
import n.s.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) {
		
		try {
			userRepository.save(user);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User loginUser(String email, String password) {
		
	User validUser =	userRepository.findByEmail(email);
	
	if(validUser !=null && validUser.getPassword().equals(password)) {
	return validUser;	
	}
	
	return null;
	}

	@Override
	public boolean registerForm(Formone form) {
		 try {
			 userRepository.save(form);
			 return true;
		 }
			 catch(Exception e) {
				 e.printStackTrace();
					return false;
		 }

	}

	@Override
	public boolean registerForm2(Formtwo form2) {
		 try {
			 userRepository.save(form2);
			 return true;
		 }
		 catch(Exception e) {
			 e.printStackTrace();
				return false;
		 }

		
	}

	@Override
	public boolean registerForm3(Formthree form3) {
		try {
		userRepository.save(form3);
		return true;
	}
	catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	}

	@Override
	public boolean registerForm4(Formfour form4) {
	
		try {
			userRepository.save(form4);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean registerForm5(Formfive form5) {
		try {
			userRepository.save(form5);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
