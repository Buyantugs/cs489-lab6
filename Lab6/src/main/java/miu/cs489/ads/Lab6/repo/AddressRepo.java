package miu.cs489.ads.Lab6.repo;

import miu.cs489.ads.Lab6.module.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
  // @Query("SELECT * FROM address")
    // public List<Address> findsSomthing();
}
