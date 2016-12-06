package servlet;

import bean.Nachricht;
import bean.NachrichtenListe;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "vereinsnachrichten")
public class NachrichtenController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");

        Nachricht nachricht = new Nachricht();
        if(request.getParameter("case")!=null && request.getParameter("case").equals("input")){
            nachricht.setDatum(request.getParameter("datum"));
            nachricht.setVorname(request.getParameter("vorname"));
            nachricht.setNachname(request.getParameter("nachname"));
            nachricht.setEmail(request.getParameter("email"));
            nachricht.setKategorie(request.getParameter("kategorie"));
            nachricht.setBetreff(request.getParameter("betreff"));
            nachricht.setNachricht(request.getParameter("nachricht"));
            nachricht.setId(NachrichtenListe.getSize());

            //nachricht der Liste hinzufügen
            NachrichtenListe.addNachricht(nachricht);

            //Konsolen ausgabe
            System.out.println("Enthaltenene Nachrichten:");
            for(Nachricht m: NachrichtenListe.getNachrichtenListe()) {
                System.out.println(m.toString());
            }
        }else{
            int id = Integer.parseInt(request.getParameter("nachrichtenID"));
            nachricht = NachrichtenListe.getNachrichtAnStelle(id);
        }

        //Datentransfer
        request.setAttribute("nachricht", nachricht);

        //Weiterleiten von Anfragen
        RequestDispatcher dispatcher = request.getRequestDispatcher("detailMessage.jsp");
        dispatcher.forward(request, response);
    }
}
