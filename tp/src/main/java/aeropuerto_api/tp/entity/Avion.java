package aeropuerto_api.tp.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_avion_id")
	private UUID tipo_avion_id;
	
	@JoinColumn(name = "total_de_asientos")
	private int total_de_asientos;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getTipo_avion_id() {
		return tipo_avion_id;
	}
	public void setTipo_avion_id(UUID tipo_avion_id) {
		this.tipo_avion_id = tipo_avion_id;
	}
	public int getTotal_de_asientos() {
		return total_de_asientos;
	}
	public void setTotal_de_asientos(int total_de_asientos) {
		this.total_de_asientos = total_de_asientos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
