package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Appointment;

import java.util.List;

public interface IAppointmentService {
    public Appointment save(Appointment appointment);
    public List<Appointment> getAllAppointment();
}
