package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Surgery;
import miu.cs489.ads.Lab6.repo.SurgeryRepo;
import org.springframework.stereotype.Service;

@Service
public class SurgeryService implements ISurgeryService{
    private SurgeryRepo surgeryRepo;

    public SurgeryService(SurgeryRepo surgeryRepo) {
        this.surgeryRepo = surgeryRepo;
    }

    public Surgery save(Surgery surgery) { return surgeryRepo.save(surgery); }
}
