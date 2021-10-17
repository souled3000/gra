package gra.ctrl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gra.busi.ISigninService;
import gra.o.Item;
import gra.o.User;

@Controller
public class SigninController {
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	ISigninService signinService;
	
	@RequestMapping(value = "/signin",method = RequestMethod.GET)
	public void get(Model model){
		
		Item item = new Item();
		User user = (User)request.getSession().getAttribute("CurAdmin");
		item.setAdm(user.getName());
		item.setRoom(user.getRoom());
		
		item.setStrsignintime(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm"));
		
		model.addAttribute("item",item);
	}
	@RequestMapping(value = "/signin",method = RequestMethod.POST)
	public String post(@ModelAttribute("item") @Valid Item item, BindingResult result) throws Exception{
		if (result.hasErrors()) {
			return "/signin";
		}
		User user = (User)request.getSession().getAttribute("CurAdmin");
		item.setAdm(user.getName());
		item.setRoom(user.getRoom());
		item.setSignintime(new Date());
		item.setPresignouttime(DateUtils.parseDate(item.getStrpresignouttime(),"yyyy-MM-dd HH:mm"));
		signinService.save(item);
		return "redirect:/current";
	}
}
