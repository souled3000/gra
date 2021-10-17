package gra.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gra.busi.ICurrentService;
import gra.busi.Page;
import gra.busi.PageService;
import gra.o.Item;

@Controller
public class CurrentController {

	@Autowired
	HttpServletRequest request;

	@Autowired
	ICurrentService currentService;

	@Autowired
	PageService pageService;

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public void current(Integer curPageNo) {
		Page page = null;
		if (curPageNo == null) {
			page = (Page) request.getSession().getAttribute("page");
			if (page == null) {
				curPageNo = Integer.valueOf(1);
			} else
				curPageNo = page.getCurPageNo();
		}
		page = pageService.queryByPageForMySQL("select * from t_item where status=0 order by signintime desc", new Object[] {}, curPageNo, 15, Item.class);
		request.getSession().setAttribute("page", page);

	}

}
