<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Escola - Acesso Restrito</title>
    
    <!-- Bootstrap core CSS -->
    <link href="./assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="./assets/css/login.css" rel="stylesheet">
    <link href="./assets/css/addcss.css" rel="stylesheet">
  </head>
<body background='./assets/img/escola.jpg' class="text-center">
    
    <main class="form-signin">
        <div id='nome'>Escola</div>
        <form action="login-exec" method="post">

            <h1 id='acesso' class="h3 mb-3 fw-normal">Acessso Restrito</h1>

            <div class="form-floating">
              <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="ema">
              <label for="floatingInput">Email</label>
            </div>

            <div class="form-floating">
              <input type="password" class="form-control" id="floatingPassword" placeholder="senhaacesso" name="sen">
              <label for="floatingPassword">Senha</label>
            </div>

            <button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>
            <br/><br/>
            <%
            if(request.getParameter("msg")!= null && request.getParameter("msg").equals("erro"))
            {
                out.print("Não foi possível validar o login");
            }
            %>
            <p class="mt-5 mb-3 text-muted">&copy; Escola</p>
        </form>
    </main>
</body>
</html>

