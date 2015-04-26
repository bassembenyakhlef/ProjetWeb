package univ.rouen.benyakhlef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import univ.rouen.benyakhlef.model.Cv;
import univ.rouen.benyakhlef.model.CvList;
import univ.rouen.benyakhlef.model.Experience_pro;
import univ.rouen.benyakhlef.model.Formation;
import univ.rouen.benyakhlef.model.Langue;

import java.util.ArrayList;


@Controller
@RequestMapping("/cv")
public class XMLController {
	private CvList cvs;
	//Cv cv;
	XMLController(){
	
	    ArrayList<Formation> formations = new ArrayList<Formation>();
	    ArrayList<Langue> langues = new ArrayList<Langue>();
	    ArrayList<Experience_pro> experiences = new ArrayList<Experience_pro>();

	   
	    formations.add(new Formation("date1", "forma1"));
	    formations.add(new Formation("date2", "forma2"));
	    langues.add(new Langue("francais", 10));
	    langues.add(new Langue("anglais", 10));
	    experiences.add(new Experience_pro("date1Exp", "exp1","qsd"));
	    experiences.add(new Experience_pro("date2Exp", "exp2","sqd"));

	    Cv cv = new Cv("hj", "hjghj", "hjgj", 24, 54, 1, experiences, langues, formations);
	    Cv cv2 = new Cv("sqd", "sqqs", "qsd", 555, 54547, 2, experiences, langues, formations);

        cvs = new CvList();
	    cvs.addCv(cv);
	    cvs.addCv(cv2);
	}
	 
	
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Cv getCvsInXML(@PathVariable String id) {
		int idInt = Integer.valueOf(id);
		return cvs.findCv(idInt);
		//return cv;
	}
	
	
	@RequestMapping( method = RequestMethod.GET)
	public @ResponseBody CvList getCvInXML() {
		return cvs;
		//return cv;
		
	}

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void putCvsInXML(@RequestBody Cv cv) {
        cvs.addCv(cv);
    }

	
}
