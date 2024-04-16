package miu.cs489.ads.Lab6.service;
import miu.cs489.ads.Lab6.module.Patient;

import java.util.List;

public interface IPatientService {
    public Patient save(Patient patient);
    public Patient update(Integer id, Patient updatedPatient);
    public void delete(Integer id);
    public List<Patient> getAllPatients();
    public Patient getPatient(Integer id);

    public List<Patient> searchPatientsByFirstName(String searchString);
}
