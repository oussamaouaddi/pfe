package model;

// Generated 28 avr. 2015 00:46:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Proxy;

/**
 * Clients generated by hbm2java
 */
@Entity
@Table(name = "clients", catalog = "ibm_pfe")
@XmlRootElement
public class Clients implements java.io.Serializable {

	private int idClient;
	private Ville ville;
	private Langue langue;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String numMobile;
	private String numFix;
	private String email;
	private int compteCourant;
	private int compteEpargne;
	private Float salaireMensuel;
	private Float dernierSalairee;
	private byte[] document;
	private byte[] photo;
	private Set<CreditImmobilier> creditImmobiliers = new HashSet<CreditImmobilier>(
			0);

	public Clients() {
	}

	public Clients(int idClient) {
		this.idClient = idClient;
	
	}

	public Clients(int idClient, Ville ville, Langue langue, String nom,
			String prenom, String dateNaissance, String numMobile,
			String numFix, String email, Integer compteCourant,
			Integer compteEpargne, Float salaireMensuel, Float dernierSalairee,
			byte[] document, byte[] photo,
			Set<CreditImmobilier> creditImmobiliers) {
		this.idClient = idClient;
		this.ville = ville;
		this.langue = langue;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numMobile = numMobile;
		this.numFix = numFix;
		this.email = email;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.salaireMensuel = salaireMensuel;
		this.dernierSalairee = dernierSalairee;
		this.document = document;
		this.photo = photo;
		this.creditImmobiliers = creditImmobiliers;
	}
	
	public Clients(int idClient,  String nom,
			String prenom, String dateNaissance, String numMobile,
			String numFix, String email, Integer compteCourant,
			Integer compteEpargne, Float salaireMensuel, Float dernierSalairee, byte[] photo ,byte[] document) {
		this.idClient = idClient;
		
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numMobile = numMobile;
		this.numFix = numFix;
		this.email = email;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.salaireMensuel = salaireMensuel;
		this.dernierSalairee = dernierSalairee;
		this.document = document;
		this.photo = photo;
		
	}

	@Id
	@Column(name = "id_client", unique = true, nullable = false)
	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ville")
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_langue")
	public Langue getLangue() {
		return this.langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 254)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "Date_naissance", length = 254)
	public String getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column(name = "Num_mobile", length = 254)
	public String getNumMobile() {
		return this.numMobile;
	}

	public void setNumMobile(String numMobile) {
		this.numMobile = numMobile;
	}

	@Column(name = "Num_fix", length = 254)
	public String getNumFix() {
		return this.numFix;
	}

	public void setNumFix(String numFix) {
		this.numFix = numFix;
	}

	@Column(name = "email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "compte_courant")
	public Integer getCompteCourant() {
		return this.compteCourant;
	}

	public void setCompteCourant(Integer compteCourant) {
		this.compteCourant = compteCourant;
	}

	@Column(name = "compte_epargne")
	public Integer getCompteEpargne() {
		return this.compteEpargne;
	}

	public void setCompteEpargne(Integer compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	@Column(name = "salaire_mensuel", precision = 12, scale = 0)
	public Float getSalaireMensuel() {
		return this.salaireMensuel;
	}

	public void setSalaireMensuel(Float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	@Column(name = "Dernier_salairee", precision = 12, scale = 0)
	public Float getDernierSalairee() {
		return this.dernierSalairee;
	}

	public void setDernierSalairee(Float dernierSalairee) {
		this.dernierSalairee = dernierSalairee;
	}

	@Column(name = "Document")
	public byte[] getDocument() {
		return this.document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	@Column(name = "photo")
	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clients")
	public Set<CreditImmobilier> getCreditImmobiliers() {
		return this.creditImmobiliers;
	}

	public void setCreditImmobiliers(Set<CreditImmobilier> creditImmobiliers) {
		this.creditImmobiliers = creditImmobiliers;
	}

}
