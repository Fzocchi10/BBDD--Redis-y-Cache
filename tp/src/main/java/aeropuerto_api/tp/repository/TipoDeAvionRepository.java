package aeropuerto_api.tp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aeropuerto_api.tp.entity.TipoDeAvion;

@Repository
public interface TipoDeAvionRepository extends JpaRepository<TipoDeAvion, UUID> {

}

