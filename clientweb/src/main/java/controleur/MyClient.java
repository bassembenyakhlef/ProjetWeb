package controleur;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import model.*;
import view.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class MyClient {


    public static CvList GetCv () throws IOException, JAXBException {


        URL url = new URL("http://projetw.herokuapp.com/rest/cv");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String apiOutput = br.readLine();
        //System.out.println(apiOutput);
        conn.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(CvList.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        CvList listeDeCV = (CvList) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));

        

         
        System.out.println("Done");

return listeDeCV;
    }
    public static void SendXmlToServerWithPost(Cv newCV)  throws IOException, JAXBException{

        URL url = new URL("http://projetw.herokuapp.com/rest/cv");

        JAXBContext jaxbContext = JAXBContext.newInstance(Cv.class,CvList.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(newCV, System.out);
        //*/


    }


    public static void main(String[] args) throws IOException, JAXBException {

        //Cv cv;


            ArrayList<Formation> formations = new ArrayList<Formation>();
            ArrayList<Langue> langues = new ArrayList<Langue>();
            ArrayList<Experience_pro> experiences = new ArrayList<Experience_pro>();


            formations.add(new Formation("date1", "forma1"));
            formations.add(new Formation("date2", "forma2"));
            langues.add(new Langue("francais", 10));
            langues.add(new Langue("anglais", 10));
            experiences.add(new Experience_pro("date1Exp", "exp1","qsd"));
            experiences.add(new Experience_pro("date2Exp", "exp2","sqd"));

            Cv cv = new Cv("soussa", "la7ir", "hjgj", 24, 54, 1, experiences, langues, formations);
        Client  client = Client.create();
        WebResource webResource = client.resource("http://projetw.herokuapp.com/rest/cv");
        ClientResponse clientResponse = webResource.accept("application/xml").post(ClientResponse.class , cv);



        // SendXmlToServerWithPost(cv);
        System.out.println("Done");




    }}
