<%-- 
    Document   : index
    Created on : 11 de set. de 2023, 21:35:57
    Author     : Corturato_Not
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="cadastrarproduto" action="CadastrarProduto" method="post">
            
            <table>
                <tr>
                    <td><label>Id Produto:</label></td>
                    <td><input type="text" name="idproduto" disabled="" readonly=""/></td>
                </tr>
                <tr>
                    <td><label>Produto:</label></td>
                    <td><input type="text" name="nomeproduto"/></td>
                </tr>
                 <tr>
                    <td><label>Descrição:</label></td>
                    <td><input type="text" name="descricaoproduto"/></td>
                </tr>
                <td><input type="submit" value="Salvar" name="cadastrar"</td>
            </table>
        ${mensagem}
       </form> 
    </body>
</html>
