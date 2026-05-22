package com.example.cabwale.Dto.Request;

import com.example.cabwale.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserRequest {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer userId;
        private String name;
        private String email;
        private String phone;
        private Gender gender;
}
