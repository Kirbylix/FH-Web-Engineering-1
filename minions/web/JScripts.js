// setzt aktuelles Datum
function setDateNow() {
    var now = new Date();
    var day = ("0" + now.getDate()).slice(-2);
    var month = ("0" + (now.getMonth() + 1)).slice(-2);
    var year = now.getFullYear();
    var today = (year) + "-" + (month) + "-" + (day);
    document.getElementById("datum").value = today;
}