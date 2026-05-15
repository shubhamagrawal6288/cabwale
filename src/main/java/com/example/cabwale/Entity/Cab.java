package com.example.cabwale.Entity;

import com.example.cabwale.Enums.CabType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Cab {
    @Id
    private int cabId;
    private double ratePerHour;
    @Enumerated(EnumType.STRING)// so that enums are not calculated according to the order but according to the string
    private CabType type;
    private String number;
    private boolean available;


}
