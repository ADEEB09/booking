package com.wiom.booking.repository;

import com.wiom.booking.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // We can later add custom queries like findByMobile if needed
}
