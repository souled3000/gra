package gra.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gra.busi.ISignoutService;

@Controller
public class SignoutController {
	
	@Autowired
	ISignoutService signoutService;
	
	@RequestMapping(value = "/signout",method = RequestMethod.GET)
	public String signout(Long id, Integer curPageNo){
		System.out.println("signout id:"+id+",current page:"+curPageNo);
		signoutService.signout(id);
		return "redirect:/current?curPageNo="+curPageNo;
	}
}
