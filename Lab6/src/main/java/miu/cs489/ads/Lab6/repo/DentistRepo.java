package miu.cs489.ads.Lab6.repo;


import miu.cs489.ads.Lab6.module.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepo extends JpaRepository<Dentist, Integer> {
}
