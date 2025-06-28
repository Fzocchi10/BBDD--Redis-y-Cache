package aeropuerto_api.tp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aeropuerto_api.tp.entity.Aeropuerto;

@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, UUID>{
	
}
