package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDateTime UserActiveTime;

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public LocalDateTime getUserActiveTime() {
        return UserActiveTime;
    }
}
