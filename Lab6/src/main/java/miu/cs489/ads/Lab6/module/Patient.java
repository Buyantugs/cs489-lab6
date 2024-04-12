package miu.cs489.ads.Lab6.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Internal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;
    private String patientNo;
    private String firstName;
    private String lastName;
    private String contractNumber;
    private LocalDate dob;
    private Double totalBill;

    // 1:1 relation between Patient and Address tables

    @ManyToOne
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private Address address;

    public Patient(String patientNo, String firstName, String lastName, String contractNumber, LocalDate dob, Double totalBill, Address address) {
        this.patientNo = patientNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contractNumber = contractNumber;
        this.dob = dob;
        this.totalBill = totalBill;
        this.address = address;
    }
}
