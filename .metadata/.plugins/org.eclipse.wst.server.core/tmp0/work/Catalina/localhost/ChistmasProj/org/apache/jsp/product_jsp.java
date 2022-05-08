/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-12-06 01:31:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProductRepository;
import dto.Product;
import java.util.ArrayList;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/dbconn.jsp", Long.valueOf(1638728476000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dto.Product");
    _jspx_imports_classes.add("dao.ProductRepository");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      			"exceptionNoProductId.jsp", true, 8192, true);
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
      dao.ProductRepository productDAO = null;
      synchronized (session) {
        productDAO = (dao.ProductRepository) _jspx_page_context.getAttribute("productDAO", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (productDAO == null){
          productDAO = new dao.ProductRepository();
          _jspx_page_context.setAttribute("productDAO", productDAO, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/css/bootstrap.min.css\">\r\n");
      out.write("<title>상품 상세 정보</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction addToCart() {\r\n");
      out.write("\t\tif (confirm(\"상품을 장바구니에 추가하시겠습니까?\")) {\r\n");
      out.write("\t\t\tdocument.addForm.submit();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdocument.addForm.reset();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h1 class=\"display-3\">상품 정보</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

	Connection conn = null;
	try{
		String url = "jdbc:mysql://localhost:3306/magicshopdb_jsp?serverTimezone=Asia/Seoul&useSSL=false";
		String user = "root";
		String password = "mirim";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
	}catch(SQLException ex){
		out.println("ë°ì´í°ë² ì´ì¤ ì°ê²°ì´ ì¤í¨ íìµëë¤<br>");
		out.println("SQLException : "+ex.getMessage() );
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t\t\t");

				String id = request.getParameter("id");
				// db연결
				PreparedStatement pstmt = null; // 쿼리문 생성
				ResultSet rs = null; // 디비로부터 결과값 저장

				String sql = "SELECT * FROM product where p_id='" + id + "';";

				pstmt = conn.prepareStatement(sql); //디비로 전송
				rs = pstmt.executeQuery(); // 결과값 저장
				while (rs.next()) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"D:/JSP/ChistmasProject/image/");
      out.print(rs.getString("p_fileName"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<h3>");
      out.print(rs.getString("p_name"));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t<p>");
      out.print(rs.getString("p_description"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>상품 코드 : </b><span class=\"badge badge-danger\">");
      out.print(rs.getString("p_id"));
      out.write("</span>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>판매자</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_seller"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>재료</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_material"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>길이</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_length"));
      out.write("cm\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>연식</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_older"));
      out.write("년\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>분류</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_category"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<b>상태</b> :\r\n");
      out.write("\t\t\t\t\t");
      out.print(rs.getString("p_condition"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<h4>");
      out.print(rs.getString("p_price"));
      out.write("원\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t<form name=\"addForm\"\r\n");
      out.write("\t\t\t\t\taction=\"./addCart.jsp?id=");
      out.print(rs.getString("p_id"));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn btn-info\" onClick=\"addToCart()\">상품주문\r\n");
      out.write("\t\t\t\t\t\t&raquo;</a> <a href=\"./cart.jsp\" class=\"btn btn-warning\">장바구니\r\n");
      out.write("\t\t\t\t\t\t&raquo;</a> <a href=\"./products.jsp\" class=\"btn btn-secondary\">상품목록\r\n");
      out.write("\t\t\t\t\t\t&raquo;</a>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");

				}

				if (rs != null)
				rs.close();
				if (pstmt != null)
				pstmt.close();
				if (conn != null)
				conn.close();
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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