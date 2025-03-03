package com.appointmentservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;

public class AppointmentTest {

    @Test
    public void testValidAppointment() {
        Calendar futureDate = Calendar.getInstance();
        futureDate.add(Calendar.DATE, 1);
        Appointment appointment = new Appointment("1234567890", futureDate.getTime(), "Doctor Visit");
        assertEquals("1234567890", appointment.getAppointmentId());
        assertEquals("Doctor Visit", appointment.getDescription());
        assertNotNull(appointment.getAppointmentDate());
    }

    @Test
    public void testInvalidAppointmentId() {
        Calendar futureDate = Calendar.getInstance();
        futureDate.add(Calendar.DATE, 1);
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment(null, futureDate.getTime(), "Meeting"));
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment("12345678901", futureDate.getTime(), "Meeting"));
    }

    @Test
    public void testInvalidAppointmentDate() {
        Calendar pastDate = Calendar.getInstance();
        pastDate.add(Calendar.DATE, -1);
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment("12345", pastDate.getTime(), "Past Meeting"));
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment("12345", null, "No Date Meeting"));
    }

    @Test
    public void testInvalidDescription() {
        Calendar futureDate = Calendar.getInstance();
        futureDate.add(Calendar.DATE, 1);
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment("12345", futureDate.getTime(), null));
        assertThrows(IllegalArgumentException.class, () -> 
            new Appointment("12345", futureDate.getTime(), 
            new String(new char[51]).replace('\0', 'A'))); // Alternative to repeat
    }
}
