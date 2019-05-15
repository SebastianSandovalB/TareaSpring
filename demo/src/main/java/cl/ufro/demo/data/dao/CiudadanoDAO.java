package cl.ufro.demo.data.dao;

import cl.ufro.demo.modelo.Ciudadano;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ciudades", collectionResourceRel ="ciudades" )
public interface CiudadanoDAO  extends CrudRepository<Ciudadano, Long>{

@Override
public List<Ciudadano> findAll();



    
}
