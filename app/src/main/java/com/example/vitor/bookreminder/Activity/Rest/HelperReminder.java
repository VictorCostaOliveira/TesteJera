package com.example.vitor.bookreminder.Activity.Rest;

import android.widget.EditText;

import com.example.vitor.bookreminder.Activity.Activity.ReminderActivity;
import com.example.vitor.bookreminder.Activity.Model.Reminder;
import com.example.vitor.bookreminder.R;

import java.util.List;

/**
 * Created by vitor on 22/05/2017.
 */

public class HelperReminder {

    ReminderActivity reminderActivity;

    private Reminder reminder;
    private EditText editTextDateReminder;
    private EditText editTextTimeReminder;

    public HelperReminder(ReminderActivity reminderActivity) {
        this.reminderActivity = reminderActivity;
        reminder = new Reminder();
        loadingComponents();
    }

    private void loadingComponents() {
        editTextDateReminder = (EditText) reminderActivity.findViewById(R.id.editTextDateReminder);
        editTextTimeReminder = (EditText) reminderActivity.findViewById(R.id.editTextReminderTime);
    }

    public Reminder getReminders(){
        reminder.setDateReminder(editTextDateReminder.getText().toString());
        reminder.setDateReminder(editTextTimeReminder.getText().toString());

        return reminder;
    }
}
