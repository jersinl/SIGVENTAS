/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M20
 * Generated at: 2017-07-04 03:35:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Empleados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.entEmpleado;

public final class eliminar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Manuel%20Cabrera/Desktop/TiendaJonatan/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/1_1Web/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1329420532000L));
    _jspx_dependants.put("jar:file:/C:/Users/Manuel%20Cabrera/Desktop/TiendaJonatan/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/1_1Web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1495212065393L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar", Long.valueOf(1495212060838L));
    _jspx_dependants.put("jar:file:/C:/Users/Manuel%20Cabrera/Desktop/TiendaJonatan/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/1_1Web/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1329420532000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("entidades.entEmpleado");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("     \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/includes/masterHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("<h1 class=\"page-header\">Empleados</h1>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-4\" align=\"center\">\r\n");
      out.write("          <div class=\"panel panel-primary\" align=\"center\">\r\n");
      out.write("              <div class=\"panel-heading\">\r\n");
      out.write("                 Eliminar\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"panel-body\" align=\"center\">\r\n");
      out.write("\t\t\t           ¿ Esta seguro de Eliminar al Usuario: <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.usuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong><br/><br/>\r\n");
      out.write("\t\t\t\t\t   identificado como <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.idPersona.nombres}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong> <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.idPersona.apellidos}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong><br/><br/>\r\n");
      out.write("\t\t\t\t\t   con el cargo de <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.idCargo.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong><br/><br/>\r\n");
      out.write("\t\t\t\t\t   trabajando en <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.idSucursal.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong> ?\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("              <div class=\"panel-footer\">\r\n");
      out.write("              \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Empleado/GrabarEliminar?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emple.idEmpleado}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-circle btn-xl\" title=\"Eliminar\"><i class=\"fa fa-check\"></i></button>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Empleados/Lista\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-danger btn-circle btn-xl\" title=\"Cancelar\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   \t\t\t\t \t\t\t\t   \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/includes/masterFooter.jsp", out, false);
      out.write("\t\t   ");
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
