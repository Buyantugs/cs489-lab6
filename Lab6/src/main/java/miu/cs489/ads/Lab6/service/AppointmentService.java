package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Appointment;
import miu.cs489.ads.Lab6.repo.AppointmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements IAppointmentService{
    private AppointmentRepo appointmentRepo;

    public AppointmentService(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepo.findAll();
    }
}
