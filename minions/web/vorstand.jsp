<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<meta charset="UTF-8">
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
  <h2>CEO</h2>
  <article class="teaser">
    <h3>Kevin</h3>
    <p>
      <figure>
        <img class="vorstand" align="left" src="./resources/img/vorstand/kevin.jpg"/>
      </figure>
      <strong> Funktion:</strong> Vorstand <br>
      <strong> Telefon:</strong> 0125/111111<br>
      <strong> E-Mail:</strong> <a target="_blank" href="mailto:K.Kappis@gmail" >Kevin@minions.com</a>
    </p>
  </article>
  <h2>Vorstand</h2>
  <article class="teaser">
    <h3>Stuart</h3>
    <p>
      <figure>
        <img class="vorstand" align="left" src="./resources/img/vorstand/stuart.jpg"/>
      </figure>
      <strong> Funktion:</strong> Vorstand <br>
      <strong> Telefon:</strong> 0125/111112<br>
      <strong> E-Mail:</strong> <a target="_blank" href="mailto:K.Kappis@gmail" >Stuart@minions.com</a>
    </p>
  </article>
  <article class="teaser">
    <h3>Bob</h3>
    <p>
      <figure>
        <img class="vorstand" align="left" src="./resources/img/vorstand/bob.jpg"/>
      </figure>
      <strong> Funktion:</strong> Vorstand <br>
      <strong> Telefon:</strong> 0125/111113<br>
      <strong> E-Mail:</strong> <a target="_blank" href="mailto:K.Kappis@gmail" >Bob@minions.com</a>
    </p>
  </article>


</section>
<!-- Nebenbereich -->
<%@ include file="shoutbox.jsp" %>
<!-- Fußbereich -->
<%@ include file="footer.jsp" %>
</body>
</html>