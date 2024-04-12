package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Dentist;

import java.util.List;

public interface IDentistService {
    public Dentist save(Dentist dentist);
    public List<Dentist> getAllDentists();
    public void delete(Integer id);
}
