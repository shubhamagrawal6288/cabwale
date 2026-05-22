package com.example.cabwale.Dto.Response;

import com.example.cabwale.Enums.Gender;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserResponse {
        private String name;
        private String email;
        private String phone;

}
