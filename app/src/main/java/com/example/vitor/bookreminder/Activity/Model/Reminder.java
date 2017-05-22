package com.example.vitor.bookreminder.Activity.Model;

/**
 * Created by vitor on 22/05/2017.
 */

public class Reminder {

    private String dateReminder;
    private String timeRiminder;

    public Reminder(){

    }

    public Reminder(String dateReminder, String timeRiminder) {
        this.dateReminder = dateReminder;
        this.timeRiminder = timeRiminder;
    }

    public String getDateReminder() {
        return dateReminder;
    }

    public void setDateReminder(String dateReminder) {
        this.dateReminder = dateReminder;
    }

    public String getTimeRiminder() {
        return timeRiminder;
    }

    public void setTimeRiminder(String timeRiminder) {
        this.timeRiminder = timeRiminder;
    }
}
