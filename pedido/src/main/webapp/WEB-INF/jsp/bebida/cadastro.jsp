<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
	  <form action="/bebida/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome da bebida" name="nome">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor da bebida" name="valor">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Código:</label>
	      <input type="text" class="form-control" placeholder="Entre com o código da bebida" name="codigo">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Tamanho:</label>
	      <input type="text" class="form-control" placeholder="Entre com o tamanho da bebida" name="tamanho">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com o marca da bebida" name="marca">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Características:</label>
			<div class="checkbox">
      			<label><input type="checkbox" value="true" name="gelada"> Gelada</label>
    		</div>
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>