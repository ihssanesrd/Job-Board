package com.DataBase;

public class offer {
private Long id;
private String fonction;
private String ville;
private String experience;
private String niveau_etude;
private String type_contrat;
private String soft_skills;
private String type_job;
private String competances;
public offer() {
	super();
}

public offer(String fonction, String ville, String experience, String niveau_etude, String type_contrat,
		String soft_skills, String type_job, String competances) {
	super();
	this.fonction = fonction;
	this.ville = ville;
	this.experience = experience;
	this.niveau_etude = niveau_etude;
	this.type_contrat = type_contrat;
	this.soft_skills = soft_skills;
	this.type_job = type_job;
	this.competances = competances;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFonction() {
	return fonction;
}
public void setFonction(String fonction) {
	this.fonction = fonction;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public String getNiveau_etude() {
	return niveau_etude;
}
public void setNiveau_etude(String niveau_etude) {
	this.niveau_etude = niveau_etude;
}
public String getType_contrat() {
	return type_contrat;
}
public void setType_contrat(String type_contrat) {
	this.type_contrat = type_contrat;
}
public String getSoft_skills() {
	return soft_skills;
}
public void setSoft_skills(String soft_skills) {
	this.soft_skills = soft_skills;
}
public String getType_job() {
	return type_job;
}
public void setType_job(String type_job) {
	this.type_job = type_job;
}
public String getCompetances() {
	return competances;
}
public void setCompetances(String competances) {
	this.competances = competances;
}
@Override
public String toString() {
	return "job [id=" + id + ", fonction=" + fonction + ", experience=" + experience + ", niveau_etude=" + niveau_etude
			+ ", type_contrat=" + type_contrat + ", soft_skills=" + soft_skills + ", type_job=" + type_job
			+ ", competances=" + competances + "]";
}
public void Affiche() {
	System.out.println(toString());
}
}