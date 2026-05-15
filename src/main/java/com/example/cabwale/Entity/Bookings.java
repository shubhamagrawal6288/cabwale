package com.example.cabwale.Entity;

import com.example.cabwale.Enums.BookingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


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
    private double timeTaking;
    private String source;
    private String destination;
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @CreationTimestamp
    Date bookedAt;
    @UpdateTimestamp
    Date lastUpdatedAt;

}
