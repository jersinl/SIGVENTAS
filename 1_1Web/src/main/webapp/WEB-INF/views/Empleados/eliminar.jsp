<%@page import="entidades.entEmpleado"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %> 
     
<jsp:include page="/WEB-INF/views/includes/masterHeader.jsp"></jsp:include>
				   
<h1 class="page-header">Empleados</h1>

	<div class="col-lg-4" align="center">
          <div class="panel panel-primary" align="center">
              <div class="panel-heading">
                 Eliminar
              </div>
              <div class="panel-body" align="center">
			           � Esta seguro de Eliminar al Usuario: <strong>${emple.usuario}</strong><br/><br/>
					   identificado como <strong>${emple.idPersona.nombres}</strong> <strong>${emple.idPersona.apellidos}</strong><br/><br/>
					   con el cargo de <strong>${emple.idCargo.nombre}</strong><br/><br/>
					   trabajando en <strong>${emple.idSucursal.nombre}</strong> ?
			  </div>
              <div class="panel-footer">
              	<a href="${pageContext.request.contextPath}/Empleado/GrabarEliminar?id=${emple.idEmpleado}">
                <button type="submit" class="btn btn-primary btn-circle btn-xl" title="Eliminar"><i class="fa fa-check"></i></button>
				</a>
				<a href="${pageContext.request.contextPath}/Empleados/Lista">
				<button class="btn btn-danger btn-circle btn-xl" title="Cancelar"><i class="fa fa-times"></i></button>
				</a>
              </div>
          </div>
      </div>
   				 				   
<jsp:include page="/WEB-INF/views/includes/masterFooter.jsp"></jsp:include>		   