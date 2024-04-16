package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Patient;
import miu.cs489.ads.Lab6.repo.PatientRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PatientService implements IPatientService{
    private PatientRepo patientRepo;
    public PatientService(PatientRepo patientRepo){
        this.patientRepo=patientRepo;
    }

    public Patient save(Patient patient){
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatients(){
        return patientRepo.findAll();
    }

    public Patient getPatient(Integer id){
        return patientRepo.findById(id).orElse(null);
    }

    public Patient update(Integer id, Patient updatedPatient){
        // Retrieve the existing patient from the database
        Patient existingPatient = patientRepo.findById(id).orElse(null);

        // If the patient exists, update its attributes
        if(existingPatient != null){
            existingPatient.setPatientNo(updatedPatient.getPatientNo());
            existingPatient.setFirstName(updatedPatient.getFirstName());
            existingPatient.setLastName(updatedPatient.getLastName());
            existingPatient.setContractNumber(updatedPatient.getContractNumber());
            existingPatient.setDob(updatedPatient.getDob());
            existingPatient.setTotalBill(updatedPatient.getTotalBill());
            existingPatient.setAddress(updatedPatient.getAddress());

            // Save the updated patient
            return patientRepo.save(existingPatient);
        }

        // If the patient does not exist, return null
        return null;
    }

    public void delete(Integer id){
        // Delete the patient with the given ID
        patientRepo.deleteById(id);
    }

    public List<Patient> searchPatientsByFirstName(String firstName) {
        return patientRepo.findByFirstNameContainingIgnoreCase(firstName);
        //return null;
    }


}
