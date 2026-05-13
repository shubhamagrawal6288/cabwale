package com.example.cabwale.Entity;

import com.example.cabwale.Entity.Enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Gender gender;

}
