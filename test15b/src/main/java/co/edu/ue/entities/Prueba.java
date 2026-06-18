package co.edu.ue.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the prueba database table.
 * 
 */
@Entity
@NamedQuery(name="Prueba.findAll", query="SELECT p FROM Prueba p")
public class Prueba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pru_id")
	private int pruId;

	@Column(name="pru_desc")
	private String pruDesc;

	public Prueba() {
	}

	public int getPruId() {
		return this.pruId;
	}

	public void setPruId(int pruId) {
		this.pruId = pruId;
	}

	public String getPruDesc() {
		return this.pruDesc;
	}

	public void setPruDesc(String pruDesc) {
		this.pruDesc = pruDesc;
	}

}