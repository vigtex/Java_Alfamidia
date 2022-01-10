<%@include file="_conex.jsp"%>
<%@include file="_top.jsp"%>

            <div id="content">
                <h1> Formulário para Gravar Curso </h1>

                <form action="exec" method="post">
                    Nome do Curso: <br />
                    <input type="text" name="nom" />
                    <br /><br />

                    Descrição: <br />
                    <textarea name="des"></textarea>
                    <br /><br />

                    Valor do Curso: <br />
                    <input type="float" name="val" />
                    <br /><br />

                    <input type="submit" name="sub" value="Cadastrar" />
                </form>

            </div>

<%@include file="_bottom.jsp"%>           