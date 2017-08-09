<%@page import="com.cibertec.edu.EmpleadoController"%>
<%@page import="entidades.entEmpleado"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %> 



     
<jsp:include page="/WEB-INF/views/includes/masterHeader.jsp"></jsp:include>
				<!-- /.TODO EL CONTENIDO DE LA PAGINA-->
<h1 class="page-header">Empleados</h1>
	<!-- ${pageContext.request.contextPath}/Oficina/Nuevo-->			   
<a href="${pageContext.request.contextPath}/Empleado/New" class="btn btn-primary btn-lg btn-block">Nuevo Empleado</a>
	<br/>
	<div style="color: white;" align="right">
	<%
	if(request.getParameter("msj")!=null){
		out.print("<h4><p>"+request.getParameter("msj")+"</p></h4>");
	}
	else{
		out.print("<p>"+""+"</p>");
	}
	%>
	</div>
	<br/>	
	
	
	<%String clase="",eliminar="";%>
	     
	<% %>
	<div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Usuario</th>
											<th>Password</th>
											<th>Nombres y Apellidos</th>
											<th>Cargo</th>
											<th>Sucursal</th>
											<th>Fecha de Ingreso</th>
											<th>Fecha de Termino</th>
											<th>Estado</th>
											<th></th>
											<th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${listita}" var="emp">
                                        	<%int valor=0;
										     valor++; 
										     if(valor%2==0){clase="gradeC";}
										     else{ clase="gradeX";}
										     %>
										<tr class="<%out.print(clase);%>">
											<td>${emp.usuario}</td>
											<td>${emp.password}</td>
											<td>${emp.idPersona.nombres} ${emp.idPersona.apellidos}</td>
											<td>${emp.idCargo.nombre}</td>
											<td>${emp.idSucursal.nombre}</td>
											<td>${emp.fechaIngreso}</td>
											<td>${emp.fechaTermino}</td>
											<td>${emp.estado}</td>
											<td>
											<a class="btn btn-info btn-circle" href="${pageContext.request.contextPath}/Empleado/Editar?id=${emp.idEmpleado}" title="Editar"><i class="fa fa-edit fa-fw"></i></a>
											</td>
											<td>
											<a class="btn btn-danger btn-circle"
											 href="${pageContext.request.contextPath}/Empleado/Eliminar?id=${emp.idEmpleado}" title="Eliminar"><i class="fa fa-times"></i></a>
											</td>
											
										</tr>
										
									</c:forEach>
                                    </tbody>
                                </table>
                            </div>

                         				 	
				                                        
				                                       			   
	
	
</div>				   
			   
				   
<jsp:include page="/WEB-INF/views/includes/masterFooter.jsp"></jsp:include>