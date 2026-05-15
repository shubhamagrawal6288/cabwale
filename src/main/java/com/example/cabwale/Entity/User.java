package com.example.cabwale.Entity;

import com.example.cabwale.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class User {
    @Id
    private int userId;
    private String name;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany
    @JoinColumn(name= "user_id")
    List<Bookings> booking = new ArrayList<>();

}
