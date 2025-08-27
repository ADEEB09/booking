package com.wiom.booking.service;

import com.wiom.booking.entities.Booking;
import com.wiom.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // ✅ Fetch all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // ✅ Fetch booking by ID
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    // ✅ Create a new booking
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // ✅ Update an existing booking
    public Booking updateBooking(Long id, Booking bookingDetails) {
        return bookingRepository.findById(id).map(existingBooking -> {
            existingBooking.setName(bookingDetails.getName());
            existingBooking.setMobile(bookingDetails.getMobile());
            existingBooking.setStatus(bookingDetails.getStatus());
            existingBooking.setAddress(bookingDetails.getAddress());
            return bookingRepository.save(existingBooking);
        }).orElseThrow(() -> new RuntimeException("❌ Booking not found with id " + id));
    }

    // ✅ Delete a booking
    public void deleteBooking(Long id) {
        if (!bookingRepository.existsById(id)) {
            throw new RuntimeException("❌ Booking not found with id " + id);
        }
        bookingRepository.deleteById(id);
    }
}
