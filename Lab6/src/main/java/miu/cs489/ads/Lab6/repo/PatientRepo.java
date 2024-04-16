package miu.cs489.ads.Lab6.repo;

import miu.cs489.ads.Lab6.module.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

    @Query(value = "SELECT * FROM lab6.patient WHERE first_name =:firstName", nativeQuery = true)
    public List<Patient> findByFirstNameContainingIgnoreCase(String firstName);
}
