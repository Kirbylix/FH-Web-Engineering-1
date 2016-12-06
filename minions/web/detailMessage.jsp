<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="./resources/css/style.css" type="text/css" media="screen" />
  <title>Minions e.V.</title>
</head>
<body>
<!-- Kopfbereich -->
<%@ include file="header.jsp" %>
<!-- Inhaltsbereich -->
<section>
  <h2>Details:</h2>
    <article class="teaser">
        <jsp:useBean id="nachricht" class="bean.Nachricht" scope="request"/>
        <h2 id="<jsp:getProperty name="nachricht" property="id"/>"> <jsp:getProperty name="nachricht" property="betreff"/> </h2>
        <small><jsp:getProperty name="nachricht" property="datum"/></small>
        <p><jsp:getProperty name="nachricht" property="nachricht"/></p>
        <div class="readMore">
            <a target="_blank" href="mailto:<jsp:getProperty name="nachricht" property="email"/>"><jsp:getProperty name="nachricht" property="vorname"/> <jsp:getProperty name="nachricht" property="nachname"/></a>
        </div>
    </article>
</section>
<!-- Fußbereich -->
<%@ include file="footer.jsp" %>
</body>
</html>