package miu.cs489.ads.Lab6.service;
import miu.cs489.ads.Lab6.module.Patient;

public interface IPatientService {
    public Patient save(Patient patient);
    public Patient update(Integer id, Patient updatedPatient);
    public void delete(Integer id);
}
