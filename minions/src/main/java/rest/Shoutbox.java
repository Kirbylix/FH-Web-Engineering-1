package rest;

import bean.ShoutboxEntry;

import javax.json.*;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.LinkedList;

@WebService
@Path("shoutbox")
public class Shoutbox {

    public static LinkedList<ShoutboxEntry> eintraegeListe = new LinkedList<ShoutboxEntry>();

    /**
     * Konstruktor
     */
    public Shoutbox(){}

    /*public Shoutbox() {
        ShoutboxEntry eintrag = new ShoutboxEntry();
        eintrag.setEintrag("Erste nachricht !");
        eintrag.setName("root");
        eintrag.setId();
        eintrag.setDatum("00.00.0000");
        eintraegeListe.add(eintrag);
    }*/

    /**
     * GET Methode
     * @return
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public String getEintraege() {
        JsonArrayBuilder jab = Json.createArrayBuilder();
        JsonObjectBuilder job = Json.createObjectBuilder();
        for(ShoutboxEntry eintrag: eintraegeListe){
            job.add("name", eintrag.getName());
            job.add("eintrag", eintrag.getEintrag());
            jab.add(job);
        }
        JsonArray jarray = jab.build();
        return jarray.toString();
    }

    /**
     * POST Methode
     * @param eintrag
     */
    @POST
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
    public void createEintry(ShoutboxEntry eintrag){
        eintrag.setDatum(new Date().toString());
        eintraegeListe.add(eintrag);
    }
}