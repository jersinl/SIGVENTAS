<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/assets/img/logo.png" var="imagenLogo" />       
<jsp:include page="/WEB-INF/views/includes/masterHeader.jsp"></jsp:include>
				<!-- /.TODO EL CONTENIDO DE LA PAGINA-->
				   <h1 class="page-header">Pagina Principal</h1>
				   <div align="center" style="padding-top: 100px">
				  	 <img src="${imagenLogo}" alt="" />				   
				   </div>
<jsp:include page="/WEB-INF/views/includes/masterFooter.jsp"></jsp:include>