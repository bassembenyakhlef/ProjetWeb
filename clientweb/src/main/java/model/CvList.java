package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cvs")
public class CvList {
	ArrayList<Cv> resumes;

	public CvList(ArrayList<Cv> resumes) {
		super();
		this.resumes = resumes;
	}

	public CvList() {
		this.resumes=new ArrayList<Cv>();
	}

	public ArrayList<Cv> getResumes() {
		return resumes;
	}
	
	@XmlElement
	public void setResumes(ArrayList<Cv> resumes) {
		this.resumes = resumes;
	}
	
	public void addCv(Cv cv){
		resumes.add(cv);
	}
	
	public Cv findCv(int i){
		
		if(i<= resumes.size())
			 return resumes.get(i-1);
		return null;
	}
	
	
}