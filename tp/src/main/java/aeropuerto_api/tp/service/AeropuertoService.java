package aeropuerto_api.tp.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import aeropuerto_api.tp.entity.Aeropuerto;
import aeropuerto_api.tp.repository.AeropuertoRepository;


@Service
public class AeropuertoService {
	
	@Autowired
    private AeropuertoRepository aeropuertoRepository;

    public List<Aeropuerto> findAll() {
		System.out.println("Accediendo al servicio.");
		return this.aeropuertoRepository.findAll(); 
	}
	
	@Cacheable(cacheNames={"aeropuertosStore"}, key="#id")
	public Aeropuerto findById(UUID id) {
		System.out.println("Accediendo al servicio EhCache.");
		return this.aeropuertoRepository.findById(id).get(); 
	}

    @CachePut(value="aeropuertosStore", key="#result.id")
    public Aeropuerto updateAeropuerto(Aeropuerto nuevoAeropuerto) {
        Aeropuerto viejoAeropuerto = this.aeropuertoRepository.findById(nuevoAeropuerto.getId())
                .orElseThrow(() -> new IllegalArgumentException("Este id no existe: " + nuevoAeropuerto.getId()));
        viejoAeropuerto.setNombre(nuevoAeropuerto.getNombre());
        viejoAeropuerto.setCiudad(nuevoAeropuerto.getCiudad());
        viejoAeropuerto.setPais(nuevoAeropuerto.getPais());
        Aeropuerto updatedAeropuerto = aeropuertoRepository.save(viejoAeropuerto);
        return updatedAeropuerto;
    }
    
    public Aeropuerto crear(Aeropuerto aeropuerto) {
    	return this.aeropuertoRepository.save(aeropuerto);
    }
    
}
