package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cv")
public class Cv {

	private String name;
	private String prenom;


    private String adresse;
    private int age;
    private int telephone;
    private int id;
    ArrayList<Experience_pro> exp;
    ArrayList<Langue>langues;
   ArrayList<Formation>formations;
    
    public Cv(){
    	this.exp=new ArrayList<Experience_pro>();
    	this.langues= new ArrayList<Langue>();
    	this.formations= new ArrayList<Formation>();
    	
    }
    
	public Cv(String name, String prenom, String adresse, int age,
			int telephone, int id, ArrayList<Experience_pro> exp,
			ArrayList<Langue> langues,ArrayList<Formation>formations) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		this.telephone = telephone;
		this.id = id;
		this.exp = exp;
		this.langues = langues;
		this.formations=formations;
	}
    @Override
    public String toString() {
        return "Cv{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", age=" + age +
                ", telephone=" + telephone +
                ", id=" + id +
                ", exp=" + exp +
                ", langues=" + langues +
                ", formations=" + formations +
                '}';
    }

    public ArrayList<Formation> getFormations() {
		return formations;
	}

	@XmlElement
	public void setFormations(ArrayList<Formation> formations) {
		this.formations = formations;
	}

	public ArrayList<Experience_pro> getExp() {
		return exp;
	}

	@XmlElement
	public void setExp(ArrayList<Experience_pro> exp) {
		this.exp = exp;
	}

	public ArrayList<Langue> getLangues() {
		return langues;
	}

	@XmlElement
	public void setLangues(ArrayList<Langue> langues) {
		this.langues = langues;
	}

	


	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	
	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}
	@XmlElement
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	


	public String getAdresse() {
		return adresse;
	}
	
	@XmlElement
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}
	@XmlElement
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	/*public static List<Cv>getlistcv(int id,String name, String prenom, int age,String adresse,int telephone){
		return ;*/
		
	}
	
		
