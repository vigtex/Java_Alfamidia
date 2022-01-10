<!DOCTYPE html>
<html>
<head>
	<title>Livro de Visitas</title>
	<link rel="stylesheet" type="text/css" href="../css/default.css">
</head>
<body>
	<div id = "geral">
		
		<div id = "header">
			
		</div>

		<div id = "menu">
			<a href="livro-view.jsp" title="Ver Recados">Ver Recados</a>
			<a href="livro-form.jsp" title="Gravar Recado">Gravar Recado</a>

		</div>

		<div id = "content">
			<h1>Formulário para Gravar Recados</h1>
			<form action="../exec" method="post">
				
				Informe seu nome: <br/>
				<input type="text" name="nom">
				<br/><br/>

				Informe seu e mail: <br/>
				<input type="text" name="ema">
				<br/><br/>

				Deixe seu recado: <br/>
				<textarea rows="5" cols= "30" name="txt"></textarea>
				<br/><br/>
				
				<input type="submit" name="sub" value="Cadastrar"/>
			</form>

		</div>

		<div id = "footer">
			by Virgilio
		</div>
	</div>

</body>
</html>