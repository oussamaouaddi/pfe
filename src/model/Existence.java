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

import org.hibernate.annotations.Proxy;

/**
 * Existence generated by hbm2java
 */
@Entity
@Table(name = "existence", catalog = "ibm_pfe")
@XmlRootElement

public class Existence implements java.io.Serializable {

	private int idExistence;
	private String designation;
	private Set<CreditImmobilier> creditImmobiliers = new HashSet<CreditImmobilier>(
			0);

	public Existence() {
	}

	public Existence(int idExistence) {
		this.idExistence = idExistence;
	}

	public Existence(int idExistence, String designation,
			Set<CreditImmobilier> creditImmobiliers) {
		this.idExistence = idExistence;
		this.designation = designation;
		this.creditImmobiliers = creditImmobiliers;
	}

	@Id
	@Column(name = "id_existence", unique = true, nullable = false)
	public int getIdExistence() {
		return this.idExistence;
	}

	public void setIdExistence(int idExistence) {
		this.idExistence = idExistence;
	}

	@Column(name = "designation", length = 254)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "existence")
	public Set<CreditImmobilier> getCreditImmobiliers() {
		return this.creditImmobiliers;
	}

	public void setCreditImmobiliers(Set<CreditImmobilier> creditImmobiliers) {
		this.creditImmobiliers = creditImmobiliers;
	}

}
