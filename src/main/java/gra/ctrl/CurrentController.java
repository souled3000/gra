package gra.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CurrentController {

	@Autowired
	HttpServletRequest request;

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public void current() {
	}

}
