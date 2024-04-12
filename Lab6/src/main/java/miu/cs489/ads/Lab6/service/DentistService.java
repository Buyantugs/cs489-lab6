package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Dentist;
import miu.cs489.ads.Lab6.repo.DentistRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService implements IDentistService{
    private DentistRepo dentistRepo;

    public DentistService(DentistRepo dentistRepo) {
        this.dentistRepo = dentistRepo;
    }

    @Override
    public Dentist save(Dentist dentist) {
        return dentistRepo.save(dentist);
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepo.findAll();
    }

    public void delete(Integer id){
        // Delete the patient with the given ID
        dentistRepo.deleteById(id);
    }
}
