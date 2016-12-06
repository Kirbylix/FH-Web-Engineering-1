<aside>
<script src="http://code.jquery.com/jquery-1.4.2.min.js"; ></script>
<script src="shoutbox.js"></script>
    <h2>Shoutbbox</h2>
        <div class="eintraege">
            <ul class="sbUl">
            </ul>
        </div>
        <div class="field">
            <label for="name">Name:</label>
                <input type="text" name="name" id="name" autofocus>
            </div>
            <div class="field">
                <label for="eintrag">Eintrag:</label>
                <textarea id="eintrag" name="eintrag" rows="3" cols="" onKeyDown="textCounter(this,'zeichen');" onKeyUp="textCounter(this,'zeichen')"></textarea>
            </div>
            <div class="field">
                <label for="zeichen">Zeichen:</label>
                <input readonly="readonly" type="text" id='zeichen' name="zeichen" size="3" maxlength="3" value="0"/>
            </div>
            <div class="field">
                <button onclick="sbSenden()">Senden</button>
            </div>
</aside>