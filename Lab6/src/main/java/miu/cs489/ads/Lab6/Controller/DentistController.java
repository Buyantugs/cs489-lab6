package miu.cs489.ads.Lab6.Controller;

import miu.cs489.ads.Lab6.module.Dentist;
import miu.cs489.ads.Lab6.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1")
public class DentistController {
    @Autowired
    private DentistService dentistService;

    @GetMapping(value="/dentist/list")
    public List<Dentist> readDentists(){
        return dentistService.getAllDentists();
    }

    @PostMapping(value = "/dentist/add")
    public Dentist addNewDentist(@RequestBody Dentist dentist){
        return dentistService.save(dentist);
    }
}
