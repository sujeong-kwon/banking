/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-07-19 05:28:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("     <meta charset=\"utf-8\">\r\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("     <title>Contact Form Template</title>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"/build/tailwind.css\" type=\"text/css\" media=\"screen\" title=\"no title\" charset=\"utf-8\" />\r\n");
      out.write(" </head>\r\n");
      out.write(" <body class>\r\n");
      out.write("     <div class=\"lg:flex\">\r\n");
      out.write("         <div class=\"lg:w-1/2 xl:max-w-screen-sm\">\r\n");
      out.write("             <div class=\"py-12 bg-indigo-100 lg:bg-white flex justify-center lg:justify-start lg:px-12\">\r\n");
      out.write("                 <div class=\"cursor-pointer flex items-center\">\r\n");
      out.write("                     <div>\r\n");
      out.write("                         <svg class=\"w-10 text-indigo-500\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\" id=\"Layer_1\" x=\"0px\" y=\"0px\" viewBox=\"0 0 225 225\" style=\"enable-background:new 0 0 225 225;\" xml:space=\"preserve\">\r\n");
      out.write("                             <style type=\"text/css\">\r\n");
      out.write("                                 .st0{fill:none;stroke:currentColor;stroke-width:20;stroke-linecap:round;stroke-miterlimit:3;}\r\n");
      out.write("                             </style>\r\n");
      out.write("                             <g transform=\"matrix( 1, 0, 0, 1, 0,0) \">\r\n");
      out.write("                             <g>\r\n");
      out.write("                             <path id=\"Layer0_0_1_STROKES\" class=\"st0\" d=\"M173.8,151.5l13.6-13.6 M35.4,89.9l29.1-29 M89.4,34.9v1 M137.4,187.9l-0.6-0.4     M36.6,138.7l0.2-0.2 M56.1,169.1l27.7-27.6 M63.8,111.5l74.3-74.4 M87.1,188.1L187.6,87.6 M110.8,114.5l57.8-57.8\"/>\r\n");
      out.write("                             </g>\r\n");
      out.write("                             </g>\r\n");
      out.write("                         </svg>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"text-2xl text-indigo-800 tracking-wide ml-2 font-semibold\">blockify</div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mt-10 px-12 sm:px-24 md:px-48 lg:px-12 lg:mt-16 xl:px-24 xl:max-w-2xl\">\r\n");
      out.write("                 <h2 class=\"text-center text-4xl text-indigo-900 font-display font-semibold lg:text-left xl:text-5xl\r\n");
      out.write("                 xl:text-bold\">Log in</h2>\r\n");
      out.write("                 <div class=\"mt-12\">\r\n");
      out.write("                     <form>\r\n");
      out.write("                         <div>\r\n");
      out.write("                             <div class=\"text-sm font-bold text-gray-700 tracking-wide\">Email Address</div>\r\n");
      out.write("                             <input class=\"w-full text-lg py-2 border-b border-gray-300 focus:outline-none focus:border-indigo-500\" type=\"\" placeholder=\"mike@gmail.com\">\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"mt-8\">\r\n");
      out.write("                             <div class=\"flex justify-between items-center\">\r\n");
      out.write("                                 <div class=\"text-sm font-bold text-gray-700 tracking-wide\">\r\n");
      out.write("                                     Password\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                 <div>\r\n");
      out.write("                                     <a class=\"text-xs font-display font-semibold text-indigo-600 hover:text-indigo-800\r\n");
      out.write("                                     cursor-pointer\">\r\n");
      out.write("                                         Forgot Password?\r\n");
      out.write("                                     </a>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             <input class=\"w-full text-lg py-2 border-b border-gray-300 focus:outline-none focus:border-indigo-500\" type=\"\" placeholder=\"Enter your password\">\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"mt-10\">\r\n");
      out.write("                             <button class=\"bg-indigo-500 text-gray-100 p-4 w-full rounded-full tracking-wide\r\n");
      out.write("                             font-semibold font-display focus:outline-none focus:shadow-outline hover:bg-indigo-600\r\n");
      out.write("                             shadow-lg\">\r\n");
      out.write("                                 Log In\r\n");
      out.write("                             </button>\r\n");
      out.write("                         </div>\r\n");
      out.write("                     </form>\r\n");
      out.write("                     <div class=\"mt-12 text-sm font-display font-semibold text-gray-700 text-center\">\r\n");
      out.write("                         Don't have an account ? <a class=\"cursor-pointer text-indigo-600 hover:text-indigo-800\">Sign up</a>\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
