/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.21
 * Generated at: 2022-11-10 03:42:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.net.InetAddress;
import com.example.*;

public final class _04ExpressionOREL_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1668045604202L));
    _jspx_dependants.put("/common.jsp", Long.valueOf(1668043186480L));
    _jspx_dependants.put("jar:file:/D:/kim6/javaworks2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/practice02/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/D:/kim6/javaworks2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/practice02/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.example");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.InetAddress");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');


      out.write('\r');
      out.write('\n');

	String name = "?????????";
	int num = 1004;
	int num1 = 80, num2 = 70, num3;
	Human h1 = new Human();
	h1.setCountry("KOREAN");
	h1.setName("?????????");
	h1.setAge(37);
	h1.setHobby("???????????? ????????? ??????");
	
	List<Human> hList = new ArrayList<Human>();
	
	Human h2 = new Human();
	h2.setCountry("AMERICAN");
	h2.setName("?????????");
	h2.setAge(17);
	h2.setHobby("????????????");
	
	hList.add(h1);
	hList.add(h2);
	
	//request.setAttribute("hList", hList);
	//??? ????????? Controller?????? forward ?????????

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>04Expression OR EL</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>ArrayList+pageContext+EL</h3>\r\n");
      out.write("<table border=\"1\" cellpadding=\"10\" cellspacing=\"0\">\r\n");

	if(hList != null) {
		for(Human human : hList){
			pageContext.setAttribute("human", human);

      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${human.country }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${human.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${human.age }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${human.hobby }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
		}
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("<h3>ArrayList+Expression</h3>\r\n");
      out.write("<table border=\"1\" cellpadding=\"10\" cellspacing=\"0\">\r\n");

		for(int i=0;i<hList.size();i++){
			Human human = hList.get(i);

      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(human.getCountry() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(human.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(human.getAge() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(human.getHobby() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<h2>Expression(?????????)</h2>\r\n");
      out.write("<p>1. ????????? ?????? : ");
      out.print("Hello Expression" );
      out.write("</p>\r\n");
      out.write("<p>2. ????????? ??????2 : ");
 out.println("Hello out println"); 
      out.write("</p>\r\n");
      out.write("<p>3. ?????? ?????? : ");
      out.print(1004 );
      out.write("</p>\r\n");
      out.write("<p>4. ????????? ????????? ?????? : ");
      out.print(name );
      out.write("</p>\r\n");
      out.write("<p>5. ?????? ????????? ?????? ");
      out.print(num );
      out.write("</p>\r\n");
      out.write("<p>6. ????????? ??????+?????? ?????? : ");
      out.print(name+num );
      out.write("</p>\r\n");
      out.write("<p>7. ?????? ????????? ???????????? : ");
      out.print(num1+num2 );
      out.write("</p>\r\n");
      out.write("<p>8. ?????? ????????? ?????? ?????? : ");
      out.print(num1>num2 );
      out.write("</p>\r\n");
      out.write("<p>9. ?????? ????????? ?????? ?????? : ");
      out.print(num1-num2 );
      out.write("</p>\r\n");
      out.write("<p>10. ?????? ????????? ????????? ?????? : ");
      out.print(num1*num2 );
      out.write("</p>\r\n");
      out.write("<p>11. ?????? ????????? ????????? ?????? : ");
      out.print(num1/num2 );
      out.write("</p>\r\n");
      out.write("<p>12. ?????? ????????? ????????? ?????? : ");
      out.print(num1%3 );
      out.write("</p>\r\n");
      out.write("<p>13. ?????? ????????? ?????? ?????? : ");
      out.print(num1>num2?num1:num2 );
      out.write("</p>\r\n");
      out.write("<p>14. ???????????? ???????????? : ");
      out.print(h1.getName() );
      out.write("</p>\r\n");
      out.write("<p>15. ???????????? ?????? : ");
      out.print(num3=num1+num2 );
      out.write("</p>\r\n");
      out.write("<hr>\r\n");
      out.write("<h2>Expression Language(????????????))</h2>\r\n");
      out.write("<p>1. ????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${\"Hello Expression Language\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>2. ????????? ??????2 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${out.println(\"Hello out println\") }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" - ??????????????? ?????? ????????????</p>\r\n");
      out.write("<p>3. ?????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1004 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>4. ????????? ????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>5. ?????? ????????? ?????? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>6. ????????? ??????+?????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name+num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p>\r\n");
      out.write("<p>7. ?????? ????????? ???????????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1+num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p>\r\n");
      out.write("<p>8. ?????? ????????? ?????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1>num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p>\r\n");
      out.write("<p>9. ?????? ????????? ?????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1-num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>10. ?????? ????????? ????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1*num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>11. ?????? ????????? ????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1/num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>12. ?????? ????????? ????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1%3 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>13. ?????? ????????? ?????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num1>num2?num1:num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>14. ???????????? ???????????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${h1.getName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>14-2. ???????????? ???????????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${h1.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<p>15. ???????????? ?????? : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num3=num1+num2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("<hr>\r\n");
      out.write("<h3>?????? ?????? ??????</h3>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
