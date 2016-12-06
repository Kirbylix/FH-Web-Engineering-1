package bean;

public class DummyNachricht {
    public static void createDummyNachrichten() {
        for(int i=0; i<4; i++) {
            Nachricht nachricht = new Nachricht();
            nachricht.setDatum("datum " + i);
            nachricht.setVorname("vorname " + i);
            nachricht.setNachname("nachname " + i);
            nachricht.setEmail("email " + i);
            nachricht.setKategorie("kategorie " + i);
            nachricht.setBetreff("betreff " + i);
            nachricht.setNachricht("nachricht " + i);
            nachricht.setId(NachrichtenListe.getSize());
            NachrichtenListe.addNachricht(nachricht);
        }
    }
}
