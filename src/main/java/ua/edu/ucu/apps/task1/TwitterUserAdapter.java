package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

public class TwitterUserAdapter implements User{
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDateTime getActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public String toString() {
        // return "Email: " + getEmail() + ", " + "Country: " + getCountry();
        return twitterUser.toString();
    }
    
}
