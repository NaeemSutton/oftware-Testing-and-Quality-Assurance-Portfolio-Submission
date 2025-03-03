package com.appointmentservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;

public class AppointmentServiceTest {
    private AppointmentService service;
    private Date futureDate;

    @BeforeEach
    public void setUp() {
        service = new AppointmentService();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        futureDate = calendar.getTime();
    }

    @Test
    public void testAddAppointment() {
        Appointment appointment = new Appointment("12345", futureDate, "Meeting");
        service.addAppointment(appointment);
        assertEquals(appointment, service.getAppointment("12345"));
    }

    @Test
    public void testDeleteAppointment() {
        Appointment appointment = new Appointment("12345", futureDate, "Meeting");
        service.addAppointment(appointment);
        service.deleteAppointment("12345");
        assertNull(service.getAppointment("12345"));
    }

    @Test
    public void testDeleteNonExistentAppointment() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteAppointment("99999"));
    }
}
