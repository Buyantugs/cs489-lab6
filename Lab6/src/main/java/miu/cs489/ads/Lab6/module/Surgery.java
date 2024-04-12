package miu.cs489.ads.Lab6.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Surgery {
    @Id
    @GeneratedValue
    private Integer id;
    private String surgeryNo;
    private String surgeryType;

    @OneToOne
    @JoinColumn(name="address_id",referencedColumnName = "id")
    private Address address;

    public Surgery(String surgeryNo, String surgeryType, Address address) {
        this.surgeryNo = surgeryNo;
        this.surgeryType = surgeryType;
        this.address = address;
    }
}
