package bean;

import java.util.ArrayList;

public class NachrichtenListe {

    private static ArrayList<Nachricht> nList = new ArrayList<Nachricht>();

    /**
     * Konstruktor
     */
    public NachrichtenListe(){}

    /**
     * Getter Methode der Nachrichtenliste
     * @return Nachrichtenliste
     */
    public static ArrayList<Nachricht> getNachrichtenListe(){
        return nList;
    }

    /**
     * Wieviel Einträge in der Nachrichtenliste sind
     * @return Anzahl der Nachrichten
     */
    public static int getSize(){
        return nList.size();
    }

    /**
     * Getter Nachricht für Nachrichtenliste
     * @param _i Position
     * @return Nachricht
     */
    public static Nachricht getNachrichtAnStelle(int _i){
        return nList.get(_i);
    }

    /**
     * Fügt eine Nachricht der Liste hinzu
     * @param _nachricht Nachricht
     */
    public static synchronized void addNachricht(Nachricht _nachricht){
        nList.add(_nachricht);
    }
}