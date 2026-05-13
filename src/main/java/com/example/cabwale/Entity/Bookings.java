package com.example.cabwale.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Bookings {
    @Id
    private int bookingId;
    private double price;
    private double distance;
    private String time_taking;
    private String source;
    private String destination;
    private String status;

}
