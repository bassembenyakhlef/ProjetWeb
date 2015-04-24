package com.mkyong.common.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Experirnce_pro")
public class Experience_pro {
	private String date_entré;
	private String date_sortie;
	private String entreprise;
	public Experience_pro(){
		super();
	}
	public Experience_pro(String date_entré,String date_sortie, String entreprise){
		this.date_entré=date_entré;
		this.date_sortie=date_sortie;
		this.entreprise=entreprise;
	}
	public String getDate_entré() {
		return date_entré;
	}
	@XmlElement
	public void setDate_entré(String date_entré) {
		this.date_entré = date_entré;
	}
	public String getDate_sortie() {
		return date_sortie;
	}
	@XmlElement
	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}
	public String getEntreprise() {
		return entreprise;
	}
	@XmlElement
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
}
