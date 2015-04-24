package com.mkyong.common.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Experirnce_pro")
public class Experience_pro {
	private String date_entr�;
	private String date_sortie;
	private String entreprise;
	public Experience_pro(){
		super();
	}
	public Experience_pro(String date_entr�,String date_sortie, String entreprise){
		this.date_entr�=date_entr�;
		this.date_sortie=date_sortie;
		this.entreprise=entreprise;
	}
	public String getDate_entr�() {
		return date_entr�;
	}
	@XmlElement
	public void setDate_entr�(String date_entr�) {
		this.date_entr� = date_entr�;
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
