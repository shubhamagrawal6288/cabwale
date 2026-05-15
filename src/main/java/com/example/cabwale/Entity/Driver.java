package com.example.cabwale.Entity;


import com.example.cabwale.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Driver {
    @Id
    private int driverId;
    private String name;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    List<Bookings> booking = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)// one to one me jisme join likheinge usme hi foreign key banega
    @JoinColumn(name = "cab_id")
    Cab c1 = new Cab();


}
