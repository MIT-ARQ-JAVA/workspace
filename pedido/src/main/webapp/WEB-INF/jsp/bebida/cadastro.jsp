<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppPedido</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastramento de Bebidas</h2>
	  <form action="/bebida/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome da bebida" name="nome" value="Suco de uva">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor da bebida" name="valor" value="10">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Código:</label>
	      <input type="text" class="form-control" placeholder="Entre com o código da bebida" name="codigo" value="987">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Tamanho:</label>
	      <input type="text" class="form-control" placeholder="Entre com o tamanho da bebida" name="tamanho" value="500">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com o marca da bebida" name="marca" value="Dafrutta">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Características:</label>
			<div class="checkbox">
      			<label><input type="checkbox" value="true" name="gelada" checked> Gelada</label>
    		</div>
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>