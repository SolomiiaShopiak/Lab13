package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDateTime lastActiveTime;

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public LocalDateTime getLastActiveTime() {
        return lastActiveTime;
    }
    
}
