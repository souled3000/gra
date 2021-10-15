package gra.ctrl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gra.busi.ILoginService;
import gra.o.User;

@Controller
public class LoginController {
	@Autowired
	HttpServletRequest request;

	public LoginController() {
	}

	@Autowired
	ILoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login(Model model) {
		List<Map<String, Object>> rooms = loginService.rooms();
		List<String> rs = new ArrayList<String>();
		for (Map<String, Object> i : rooms) {
			rs.add((String) i.get("name"));
		}
		model.addAttribute("rooms", rs);
		model.addAttribute("user", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String check(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/login";
		}
		if (!loginService.validate(user.getName(), user.getPwd())) {
			ObjectError o = new ObjectError("", new String[] { "wrong.name.or.pwd" }, null, "sth. is going wrong.");
			result.addError(o);
		}
		if (result.hasErrors()) {
			return "redirect:/login";
		}
		request.getSession().setAttribute("CurAdmin", user);
		return "redirect:/gra";
	}
}
