package n.s.main.services;

import n.s.main.entities.Formfive;
import n.s.main.entities.Formfour;
import n.s.main.entities.Formone;
import n.s.main.entities.Formthree;
import n.s.main.entities.Formtwo;
import n.s.main.entities.User;

public interface UserService {
	
	public boolean registerUser(User user);
	
	public boolean registerForm(Formone form);
	
	public boolean registerForm2(Formtwo form2);
	
	public boolean registerForm3(Formthree form3);
	
	public boolean registerForm4(Formfour form4);
	
	public boolean registerForm5(Formfive form5);
	
	
	
	public User loginUser(String email, String password);

}
