package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Patient;
import miu.cs489.ads.Lab6.repo.PatientRepo;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService{
    private PatientRepo patientRepo;
    public PatientService(PatientRepo patientRepo){
        this.patientRepo=patientRepo;
    }

    public Patient save(Patient patient){
        return patientRepo.save(patient);
    }
}
