package ma.enset.mvcpatients.repositories;

import ma.enset.mvcpatients.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
Page<Patient> findByNomContains(String kw, Pageable pageable);
}
