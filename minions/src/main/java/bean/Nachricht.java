package bean;

public class Nachricht {
    private String vorname = "";
    private String nachname = "";
    private String email = "";
    private String datum = "";
    private String kategorie = "";
    private String betreff = "";
    private String nachricht = "";
    private int id;

    /**
     * Konstruktor
     */
    public Nachricht(){
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;}

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", email='" + email + '\'' +
                ", datum='" + datum + '\'' +
                ", kategorie='" + kategorie + '\'' +
                ", betreff='" + betreff + '\'' +
                ", nachricht='" + nachricht + '\'' +
                ", id=" + id +
                '}';
    }
}