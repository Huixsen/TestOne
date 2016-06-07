package xhSpittrWeb;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xhMVC.Spitter;



@Controller
@RequestMapping("/register")
public class SpitterController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String showRegistrationForm()
	{
		return "registerForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String RegistrationForm(@Valid Spitter spitter, Errors errors, Model model)
	{
		if(errors.hasErrors())
		{
			return "registerForm";
		}
		model.addAttribute(spitter);
		return "registerForm";
	}

}
