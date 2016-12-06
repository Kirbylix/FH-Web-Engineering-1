<%@ page import="java.util.*" %>
<%@ page import="bean.*" %>
<html>
  <!--DummyNachrichten erstellen-->
  <%@page import="bean.DummyNachricht" %>
  <% if(NachrichtenListe.getSize()==0)
    DummyNachricht.createDummyNachrichten(); %>
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
    <h2>News</h2>
    <%for(int i = NachrichtenListe.getSize()-1; i >= 0; i--) {%>
    <article class="teaser">
      <h2><%= NachrichtenListe.getNachrichtAnStelle(i).getBetreff()%></h2>
      <small><%= NachrichtenListe.getNachrichtAnStelle(i).getDatum()%></small>
      <div class="readMore">
        <button onclick="window.location.href='NachrichtenController?nachrichtenID=<%= NachrichtenListe.getNachrichtAnStelle(i).getId()%>'">mehr...</button>
      </div>
    </article>
    <%}%>
  </section>
  <!-- Nebenbereich -->
  <%@ include file="shoutbox.jsp" %>

  <!-- Fußbereich -->
  <%@ include file="footer.jsp" %>

</body>
</html>