package model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Experirnce_pro")
public class Experience_pro {
	private String date_entre;
	private String date_sortie;
	private String entreprise;
	public Experience_pro(){
		super();
	}
	public Experience_pro(String date_entre,String date_sortie, String entreprise){
		this.date_entre=date_entre;
		this.date_sortie=date_sortie;
		this.entreprise=entreprise;
	}
	public String getDate_entre() {
		return date_entre;
	}
	@XmlElement
	public void setDate_entre(String date_entre) {
		this.date_entre = date_entre;
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
