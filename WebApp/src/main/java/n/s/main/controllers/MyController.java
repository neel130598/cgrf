package n.s.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import n.s.main.entities.Formfive;
import n.s.main.entities.Formfour;
import n.s.main.entities.Formone;
import n.s.main.entities.Formthree;
import n.s.main.entities.Formtwo;
import n.s.main.entities.User;
import n.s.main.services.UserService;

@Controller
public class MyController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model) {
	 boolean status= userService.registerUser(user);
	
	 if(status) {
		model.addAttribute("successMsg", "User Registration Successfully"); 
	 }
	 else {
		 model.addAttribute("errorMsg", "User not register due to some error");
	 }
	 
	 return "register";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model) {
	User validUser = userService.loginUser(user.getEmail(), user.getPassword());
		
	if(validUser !=null) {
		model.addAttribute("modelName",validUser.getName());
		return "profile";
	}
		else {
			model.addAttribute("errorMsg", "Email id and Password didn't match");
			return "login";
		}
	}
		@GetMapping("/logout")
		public String logout(HttpServletRequest request) {
		
		HttpSession session=request.getSession(false);
		
		if(session !=null) {
			session.invalidate();
		}
		return "redirect:/loginPage";
		}
		
		@GetMapping("/submitform1")
		public String openForm1(Model model) {
			
			model.addAttribute("user", new Formone());
			return "form1";
		}
		
		@PostMapping("/form1")
		public String submitform1(@ModelAttribute("user") Formone formone, Model model) {
			boolean status=userService.registerForm(formone);
			
			if(status) {
				model.addAttribute("successform", "Form Submitted Successfully");
				return "successform";
			}
			else {
				model.addAttribute("errorform", "Form due not submitted due to some error");
			} 
				 return "form1";
				}
		
		@GetMapping("/contactPage")
		public String OpencontPage(HttpServletRequest request) {
		
		HttpSession session=request.getSession(false);
		
		if(session !=null) {
			session.invalidate();
		}
		return "contact";
		}
		
		@GetMapping("/submitform2")
		public String openForm2(Model model) {
			
			model.addAttribute("user", new Formtwo());
			return "form2";
		}
		
		@PostMapping("/form2")
		public String submitform2(@ModelAttribute("user") Formtwo formtwo, Model model) {
			boolean status=userService.registerForm2(formtwo);
			
			if(status) {
				model.addAttribute("successform2", "Form Submitted Successfully");
				return "successform";
			}
			else {
				model.addAttribute("errorform2", "Form due not submitted due to some error");
			} 
				 return "form2";
				}
		
		@GetMapping("/submitform3")
		public String openForm3(Model model) {
			model.addAttribute("user", new Formthree());
			return "form3";
		}
		
		@PostMapping("/form3")
		public String submitform3(@ModelAttribute("user") Formthree formthree, Model model) {
			boolean status=userService.registerForm3(formthree);
			
			if(status) {
				model.addAttribute("successform3", "Form Submitted Successfully");
				
				return "successform";
			}
			else {
				model.addAttribute("errorform3", "Form due not submitted due to some error");
			} 
				 return "form3";
				}
		
		@GetMapping("/submitform4")
		public String openForm4(Model model) {
			model.addAttribute("user", new Formfour());
			return "form4";
		}
		@PostMapping("/form4")
		public String submitform4(@ModelAttribute("user") Formfour formfour, Model model) {
			boolean status=userService.registerForm4(formfour);
			
			if(status) {
				model.addAttribute("successform4", "Form Submitted Successfully");
				return "successform";
			}
			else {
				model.addAttribute("errorform4", "Form due not submitted due to some error");
			} 
				 return "form4";
				}
		
		@GetMapping("/submitform5")
		public String openForm5(Model model) {
			model.addAttribute("user", new Formfive());
			return "form5";
		}
		
		@PostMapping("/form5")
		public String submitform5(@ModelAttribute("user") Formfive formfive, Model model) {
			boolean status=userService.registerForm5(formfive);
			
			if(status) {
				model.addAttribute("successform5", "Form Submitted Successfully");
				return "successform";
			}
			else {
				model.addAttribute("errorform5", "Form due not submitted due to some error");
			} 
				 return "form5";
		}
}