package model;

// Generated 28 avr. 2015 00:46:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.hibernate.annotations.Proxy;

/**
 * Pays generated by hbm2java
 */
@Entity
@Table(name = "pays", catalog = "ibm_pfe")
@XmlRootElement


public class Pays implements java.io.Serializable {

	private int idPays;
	private String name;
	private Set<Ville> villes = new HashSet<Ville>(0);

	public Pays() {
	}

	public Pays(int idPays) {
		this.idPays = idPays;
	}

	public Pays(int idPays, String name, Set<Ville> villes) {
		this.idPays = idPays;
		this.name = name;
		this.villes = villes;
	}

	@Id
	@Column(name = "id_pays", unique = true, nullable = false)
	public int getIdPays() {
		return this.idPays;
	}

	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pays")
	public Set<Ville> getVilles() {
		return this.villes;
	}

	public void setVilles(Set<Ville> villes) {
		this.villes = villes;
	}

}