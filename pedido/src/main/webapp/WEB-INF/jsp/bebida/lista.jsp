<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppPedido</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h2>Cadastramento de Bebidas</h2>
	  <form action="/bebida" method="get">
	    <button type="submit" class="btn btn-primary">Nova bebida</button>
	  </form>
	  
	  <c:if test="${not empty listagem}">
	 	  <p>Listagem de bebidas (${listagem.size()}):</p>            
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome</th>
		        <th>Valor</th>
		        <th>Código</th>
		        <th>Gelada</th>
		        <th>Tamanho</th>
		        <th>Marca</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="o" items="${listagem}">	
			      <tr>
			      	<td>${o.id}</td>
			        <td>${o.nome}</td>
			        <td>${o.valor}</td>
			        <td>${o.codigo}</td>
			        <td>${o.gelada}</td>
			        <td>${o.tamanho}</td>
			        <td>${o.marca}</td>
			        <td><a href="/bebida/${o.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  	
 	  <c:if test="${empty listagem}">
 	  	<p>Não existem registros cadastrados!!!</p>
 	  </c:if> 	              
	</div>
</body>
</html>