<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="./resources/css/style.css" type="text/css" media="screen"/>
    <title>Minions e.V.</title>
</head>
<script src="JScripts.js"></script>
<body>
    <!-- Kopfbereich -->
    <%@ include file="header.jsp" %>
    <!-- Inhaltsbereich -->
        <section>
            <h2>Vereinsnachrichten</h2>
            <div id="div-message">
                <form id="nachrichtForm" action="NachrichtenController" method="get">
                    <fieldset class="field">
                        <legend>Absender</legend>
                        <div class="field">
                            <label for="vorname">Name:</label>
                            <input type="text" id="vorname" name="vorname" autofocus/>
                        </div>
                        <div class="field">
                            <label for="nachname">Nachname:</label>
                            <input type="text" id="nachname" name="nachname"/>
                        </div>
                        <div class="field">
                            <label for="email">E-Mail*:</label>
                            <input type="email" id="email" name="email" required="required" />
                        </div>
                    </fieldset>
                    <fieldset>
                        <legend>Nachricht</legend>
                        <div class="field">
                            <label for="datum">Datum:</label>
                            <input type="date" id="datum" name="datum">
                            <script>setDateNow()</script>
                        </div>
                        <div class="field">
                            <label for="kategorie">Kategorie:</label>
                            <select id="kategorie" name="kategorie">
                                <option value="news">News</option>
                                <option value="vorstand">Vorstand</option>
                                <option value="manschaft">Manschaft</option>
                                <option value="beschwerde">Beschwerde</option>
                            </select>
                        </div>
                        <div class="field">
                            <label for="betreff">Betreff:</label>
                            <input type="text" id="betreff" name="betreff"/>
                        </div>
                        <div class="field">
                            <label for="nachricht">Nachricht:</label>
                            <textarea id="nachricht" name="nachricht" rows="5"></textarea>
                        </div>
                        <div class="field">*Mussfeld</div>
                    </fieldset>
                    <div>
                        <input type="hidden" name="case" value="input">
                        <button type="submit">Senden</button>
                        <button type="reset">Reset</button>
                    </div>
                </form>
            </div>
        </section>
    <!-- Nebenbereich -->
    <%@ include file="shoutbox.jsp" %>
    <!-- Fußbereich -->
    <%@ include file="footer.jsp" %>
</body>
</html>