package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>机房门禁系统</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./lib/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./lib/bootstrap.min.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"./lib/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"./lib/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"./lib/gra.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">var basePath='");
      out.print(basePath);
      out.write("';\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">机房门禁系统</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"./index.jsp\">退出</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-sidebar\" id=\"_menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\" ><a href=\"#\">机房当前情况</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">进入机房登记</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">离开机房登记</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">历史查询</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\" id=\"_content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h2 class=\"sub-header\">机房当前情况</h2>\r\n");
      out.write("\t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>厂家工作人员</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>厂家</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>相关科室</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>科室负责人</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>进入机房时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>预计离开时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,001</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Lorem</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ipsum</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>dolor</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sit</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sit</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,002</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>amet</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>consectetur</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>adipiscing</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>elit</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>elit</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,003</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Integer</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nec</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>odio</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Praesent</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Praesent</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,003</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>libero</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Sed</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>cursus</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ante</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ante</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,004</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>dapibus</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>diam</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Sed</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nisi</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nisi</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,005</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Nulla</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>quis</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sem</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sem</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>at</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,006</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nibh</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>elementum</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>imperdiet</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Duis</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Duis</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,007</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sagittis</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ipsum</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Praesent</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>mauris</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>mauris</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,008</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Fusce</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nec</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>tellus</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sed</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sed</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,009</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>augue</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>semper</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>porta</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>porta</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Mauris</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,010</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>massa</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Vestibulum</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Vestibulum</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>lacinia</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>arcu</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,011</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>eget</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nulla</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nulla</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Class</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>aptent</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,012</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>taciti</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sociosqu</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sociosqu</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ad</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>litora</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,013</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>torquent</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>torquent</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>per</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>conubia</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>nostra</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,014</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>per</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>inceptos</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>inceptos</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>himenaeos</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Curabitur</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1,015</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>sodales</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ligula</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>ligula</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>in</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>libero</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
