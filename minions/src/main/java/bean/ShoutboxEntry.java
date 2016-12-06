package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShoutboxEntry {
    private String datum;
    private String name;
    private String eintrag;

    /**
     * Konstruktor
     */
    public ShoutboxEntry(){}

    /**
     * Konstruktor
     * @param datum Datum
     * @param name Name
     * @param eintrag Eintrag
     */
    public ShoutboxEntry(String datum, String name, String eintrag) {
        this.datum = datum;
        this.name = name;
        this.eintrag = eintrag;
    }

    public String getEintrag() {
        return eintrag;
    }

    public void setEintrag(String eintrag) {
        this.eintrag = eintrag;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String _datum) {
        this.datum = _datum;
    }

    @Override
    public String toString() {
        return "ShortboxEntry{" +
                ", datum='" + datum + '\'' +
                ", name='" + name + '\'' +
                ", nachricht='" + eintrag + '\'' +
                '}';
    }
}
