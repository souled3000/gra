package gra.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignoutController {
	@RequestMapping(value = "/signout",method = RequestMethod.GET)
	public void signout(){
	}
}
