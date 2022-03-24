package service;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Appointment Service
 * December 6th, 2021
 */

import java.util.HashMap;

import model.Appointment;

public class AppointmentService {

    //holds list of appointments
    private HashMap<String, Appointment> appts;

    public AppointmentService () {
        appts = new HashMap<String, Appointment>();
    }

    /*
     * Method to add Appointment
     */

    //iteration through list
    public boolean addAppointment (Appointment appointment ) {
        if(appts.containsKey(appointment.getApptID())) {
            return false;
        } else {
            appts.put(appointment.getApptID(), appointment);
            return true;
        }
    }
    /*
     * Method to Delete Appointment
     */
    public boolean deleteAppointment(Appointment a1) {
        if(appts.containsKey(a1.getApptID())) {
            appts.remove(a1.getApptID());
            return true;
        } else {
            return false;
        }
    }

}
