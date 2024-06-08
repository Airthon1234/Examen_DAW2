package pe.edu.cibertec.DAWII_T1_Airthon_Randal_Cochachin_Ortiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_T1_Airthon_Randal_Cochachin_Ortiz.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nomrol);
}
