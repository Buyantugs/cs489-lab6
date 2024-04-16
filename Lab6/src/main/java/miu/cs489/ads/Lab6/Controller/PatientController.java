package miu.cs489.ads.Lab6.Controller;

import miu.cs489.ads.Lab6.module.Patient;
import miu.cs489.ads.Lab6.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1")
public class PatientController {
    @Autowired
    private PatientService patientService;


    @GetMapping(value="/patient/list")
    public List<Patient> readPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping(value = "/patient/get/{patientId}")
    public Patient getPatient(@PathVariable Integer patientId){
        return patientService.getPatient(patientId);
    }

    @PostMapping(value="/patient/register")
    public Patient addNewPatient(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @PutMapping(value = "/patient/update/{patientId}")
    public Patient updatePatient(@PathVariable Integer patientId, @RequestBody Patient patient){
        return patientService.update(patientId,patient);
    }


    @DeleteMapping(value = "/patient/delete/{patientId}")
    public void deletePatient(@PathVariable Integer patientId){
        patientService.delete(patientId);
    }

    @GetMapping(value = "/patient/search/{searchString}")
    public List<Patient> searchPatients(@PathVariable String searchString){
        return patientService.searchPatientsByFirstName(searchString);
    }
}
