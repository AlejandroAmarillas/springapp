<!-- Codigo que redirecciona nuestro index.jsp al controlador creado anteriormente. -->
<%@ include file="WEB-INF/views/include.jsp"%>
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<c:redirect url="/hello.htm" />

<html>
  <head><title>MySpring Application</title></head>
  <body>
    <h1>Example - Spring Application</h1>
    <p>Esto es una aplicacion de prueba.</p>
  </body>
</html>



