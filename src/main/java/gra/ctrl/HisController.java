package gra.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gra.busi.Page;
import gra.busi.PageService;
import gra.o.Item;

@Controller
public class HisController {
	@Autowired
	HttpServletRequest request;
	@Autowired
	PageService pageService;

	@RequestMapping(value = "/his", method = RequestMethod.GET)
	public void his(Integer pageNo) {
		Page page = null;
		if (pageNo == null) {
			page = (Page) request.getSession().getAttribute("his");
			if (page == null) {
				pageNo = Integer.valueOf(1);
			} else {
				pageNo = page.getCurPageNo();
			}
		}
		page = pageService.queryByPageForMySQL("select * from t_item where status=1 order by signintime desc", new Object[] {}, pageNo, 15, Item.class);
		request.getSession().setAttribute("his", page);

	}
//	@RequestMapping(value = "/his", method = RequestMethod.GET)
//	public void his(Integer pageNo, String staff) {
//		Page page = null;
//		if (pageNo == null) {
//			page = (Page) request.getSession().getAttribute("his");
//			if (page == null) {
//				page = new Page();
//				pageNo = Integer.valueOf(1);
//			} else {
//				staff = page.getStaff();
//				pageNo = page.getCurPageNo();
//			}
//		}
//		page.setCurPageNo(pageNo);
//		page.setStaff(staff);
//		
//		if (StringUtils.isNotBlank(page.getStaff())) {
//			page = pageService.queryByPageForMySQL("select * from t_item where status=1 and factorystaff=? order by signintime desc", new Object[] { staff }, pageNo, 15, Item.class);
//		} else {
//			page = pageService.queryByPageForMySQL("select * from t_item where status=1 order by signintime desc", new Object[] {}, pageNo, 15, Item.class);
//		}
//		request.getSession().setAttribute("his", page);
//		
//	}

}
