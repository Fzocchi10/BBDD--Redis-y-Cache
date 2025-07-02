package aeropuerto_api.tp.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_de_avion")
public class TipoDeAvion {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cant_max_de_asientos")
    private int cantMaxDeAsientos;

    @Column(name = "empresa")
    private String empresa;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMaxDeAsientos() {
        return cantMaxDeAsientos;
    }

    public void setCantMaxDeAsientos(int cantMaxDeAsientos) {
        this.cantMaxDeAsientos = cantMaxDeAsientos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
