package miu.cs489.ads.Lab6.repo;

import miu.cs489.ads.Lab6.module.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
}
