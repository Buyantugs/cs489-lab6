package miu.cs489.ads.Lab6.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
//@Table(name="Dentist")
public class Dentist {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String emailAddress;
    private String specialization;

    public Dentist(String firstName, String lastName, String contactNumber, String emailAddress, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.specialization = specialization;
    }



    @Override
    public String toString() {
        return "Dentist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
