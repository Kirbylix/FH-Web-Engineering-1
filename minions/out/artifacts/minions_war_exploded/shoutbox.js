//Counter für das Textfeld
var maxlimit = 240;
function textCounter(field, cnt){
    var cntfield = document.getElementById(cnt);
    cntfield.value = field.value.length;
    if (field.value.length > maxlimit) {
        alert("es duerfen max." +  maxlimit + " Zeichen eingegeben werden");
    }
}

$(document).ready(function() {
    sbEmpfangen();
    $("#eintrag").keypress(function(){
        if($("#eintrag").val.length > maxlimit)
            $("textarea").css("background-color", "RED");
        else
            $("textarea").css("background-color", "WHITE");
    });
});

//Kommunikation
var url = "http://localhost:8080/minions_war_exploded/rest/shoutbox";
/**
 * Holt die Daten
 */
function sbEmpfangen(){
    console.log("GET: Eintraege hole");
    $.ajax({
        type: ("GET"),
        url: url,
        dataType: "json",
        success: eintraegeSetzten
    });
}

/**
 * sendet die Daten
 */
function sbSenden(){
    console.log("POST: Eintrag senden");
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: url,
        dataType: "json",
        data: formToJSON(),
        success: function(data, textStatus, jqXHR){
            console.log("Eintrag erfolgreich hinzugefügt");
            $("#name").val("");
            $("#eintrag").val("");
            $("#zeichen").val("0");
            sbEmpfangen();
        },
        error: error()
    });
}

/**
 * Hilfsfunktion:
 * wandelt die eingabe in JSON format um
 */
function formToJSON(){
    return JSON.stringify({
        "name": $("#name").val(),
        "eintrag": $("#eintrag").val()
    });
}

/**
 * setzt die Empfangen Einträge
 * @param data
 */
function eintraegeSetzten(data){
    console.log("Eintraege werden gesetzt");
    var list = data == null ? [] : (data instanceof Array ? data : [data]);
    $(".sbUl").empty();
    for(var i in list) {
        $(".sbUl").append("<li>"+list[i].name+": "+list[i].eintrag+"</li>");
    }
}

/**
 * Error ausgabe
 */
function error(jqXHR, textStatus, errorThrown){ console.log("ERROR " + textStatus); }

/**
 * Timerfunktion für Shoutbox Update
 */
$(document).ready(function() {
    window.setInterval(sbEmpfangen, 10000);
});


/*AJAX
    var xhr;

<!--Einträge holen -->
 function sb_get() {
     console.log("AJAX: GET");
     xhr = new XMLHttpRequest();
     xhr.open("GET", "ressources/shoutbox/", true);
     xhr.setRequestHeader("Content-Type", "application/json");
     xhr.onreadystatechange=updateSB;
     xhr.send(null);
 }


<!-- senden des eintrages-->
 function sb_put() {
     console.log("AJAX: PUT");
     xhr = new XMLHttpRequest();
    var name = document.getElementById("name").value;
     var text = document.getElementById("eintrag").value;
     xhr.open("PUT", "ressources/shoutbox/"+name+"/"+text+"/");
     xhr.send(null);
     if(xhr.readyState===1) {
        sb_get();
     }
 }


 <!-- Update der Shoutbox-->
 function updateSB() {
     console.log(xhr.responseText);
     if (xhr.readyState === 4) {
         var array = JSON.parse(xhr.responseText);
         var sbEintraege = document.getElementsByClassName("sbEintraege")[0];
         var child = document.getElementsByTagName("ul")[0];
         sbEintraege.removeChild(child);
         var ulist = document.createElement("ul");
         for(var i in array) {
             var li = document.createElement("li");
             var liText = document.createTextNode(array[i].nachricht);
             li.appendChild(liText);
             ulist.appendChild(li);
        }
        sbEintraege.appendChild(ulist);
     }
 }*/