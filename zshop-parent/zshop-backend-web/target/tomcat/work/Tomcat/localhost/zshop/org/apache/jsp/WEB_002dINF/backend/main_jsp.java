/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-24 15:44:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>在线商城-后台管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/index.css\" />\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/userSetting.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){\r\n");
      out.write("            // 点击切换页面\r\n");
      out.write("            $(\"#product-type-set\").click(function() {\r\n");
      out.write("                $(\"#frame-id\").attr(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll\");\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#product-set\").click(function() {\r\n");
      out.write("                $(\"#frame-id\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/product/findAll\");\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#user-set\").click(function() {\r\n");
      out.write("                $(\"#frame-id\").attr(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/customer/findAll\");\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#manager-set\").click(function() {\r\n");
      out.write("                $(\"#frame-id\").attr(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/sysuser/findAll\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrapper-cc clearfix\">\r\n");
      out.write("    <div class=\"content-cc\">\r\n");
      out.write("        <!-- header start -->\r\n");
      out.write("        <div class=\"clear-bottom head\">\r\n");
      out.write("            <div class=\"container head-cc\">\r\n");
      out.write("                <p>在线商城<span>后台管理系统</span></p>\r\n");
      out.write("                <div class=\"welcome\">\r\n");
      out.write("                    <div class=\"left\">欢迎您：</div>\r\n");
      out.write("                    <div class=\"right\">xxx</div>\r\n");
      out.write("                    <div class=\"exit\">退出</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- header end -->\r\n");
      out.write("        <!-- content start -->\r\n");
      out.write("        <div class=\"container-flude flude-cc\" id=\"a\">\r\n");
      out.write("            <div class=\"row user-setting\">\r\n");
      out.write("                <div class=\"col-xs-2 user-wrap\">\r\n");
      out.write("                    <ul class=\"list-group\">\r\n");
      out.write("                        <li class=\"list-group-item active\" name=\"userSet\" id=\"product-type-set\" style=\"cursor: pointer\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-lock\"></i> &nbsp;商品类型管理\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-group-item\" name=\"userPic\" id=\"product-set\" style=\"cursor: pointer\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-facetime-video\"></i> &nbsp;商品管理\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-group-item\" name=\"userInfo\" id=\"user-set\" style=\"cursor: pointer\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-user\"></i> &nbsp;客户管理\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-group-item\" name=\"adminSet\" id=\"manager-set\" style=\"cursor: pointer\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-globe\"></i> &nbsp;系统用户管理\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-10\" id=\"userPanel\">\r\n");
      out.write("                    <iframe id=\"frame-id\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll\" width=\"100%\" height=\"100%\" frameborder=\"0\" scrolling=\"no\">\r\n");
      out.write("                    </iframe>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- content end-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- footers start -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    版权所有：中兴软件技术\r\n");
      out.write("</div>\r\n");
      out.write("<!-- footers end -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
