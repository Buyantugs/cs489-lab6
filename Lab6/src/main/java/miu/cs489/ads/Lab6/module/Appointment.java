package miu.cs489.ads.Lab6.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Appointment {
    @Id
    @GeneratedValue
    private  Integer id;
    private LocalDateTime appointmentDate;
    private String status;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="surgery_id", referencedColumnName = "id")
    private Surgery surgery;

    @ManyToOne
    @JoinColumn(name="dentist_id", referencedColumnName = "id")
    private Dentist dentist;

    public Appointment(LocalDateTime appointmentDate, String status, Patient patient, Surgery surgery, Dentist dentist) {
        this.appointmentDate = appointmentDate;
        this.status=status;
        this.patient = patient;
        this.surgery = surgery;
        this.dentist = dentist;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentDate=" + appointmentDate +
                " status="+status+
                ", patient=" + patient.getFirstName() +
                ", surgery=" + surgery.getSurgeryNo() +
                ", dentist=" + dentist.getFirstName() +
                '}';
    }
}
