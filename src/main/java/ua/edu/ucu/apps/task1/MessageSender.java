package ua.edu.ucu.apps.task1;

import java.time.Duration;
import java.time.LocalDateTime;

public class MessageSender {
    public void send(User user, String text, String country) {
        if (user.getCountry().equals(country) && Duration.between(user.getActiveTime(), LocalDateTime.now()).toHours() <= 1) {
            System.out.println("Sending message: " + text + " to " + user.getEmail());
        } else {
            System.out.println("User not active or not from the specified country.");
        }
    }
}

