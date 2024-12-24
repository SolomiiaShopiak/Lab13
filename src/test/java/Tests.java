import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task1.FacebookUser;
import ua.edu.ucu.apps.task1.FacebookUserAdapter;
import ua.edu.ucu.apps.task1.MessageSender;
import ua.edu.ucu.apps.task1.TwitterUser;
import ua.edu.ucu.apps.task1.TwitterUserAdapter;
import ua.edu.ucu.apps.task1.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testFacebookUserAdapter() {
        LocalDateTime activeTime = LocalDateTime.now().minusMinutes(30);
        FacebookUser facebookUser = new FacebookUser("user@example.com", "Ukraine", activeTime);
        FacebookUserAdapter adapter = new FacebookUserAdapter(facebookUser);
        assertEquals("user@example.com", adapter.getEmail());
        assertEquals("Ukraine", adapter.getCountry());
        assertEquals(activeTime, adapter.getActiveTime());
    }

    @Test
    public void testTwitterUserAdapter() {
        LocalDateTime activeTime = LocalDateTime.now().minusMinutes(45);
        TwitterUser twitterUser = new TwitterUser("user@twitter.com", "USA", activeTime);
        TwitterUserAdapter adapter = new TwitterUserAdapter(twitterUser);
        assertEquals("user@twitter.com", adapter.getEmail());
        assertEquals("USA", adapter.getCountry());
        assertEquals(activeTime, adapter.getActiveTime());
    }

    @Test
    public void testIntegrationWithMessageSender() {
        LocalDateTime activeTime = LocalDateTime.now().minusMinutes(30);
        User facebookUser = new FacebookUserAdapter(new FacebookUser("fbuser@example.com", "Ukraine", activeTime));
        User twitterUser = new TwitterUserAdapter(new TwitterUser("twuser@twitter.com", "USA", activeTime));
        MessageSender sender = new MessageSender();
        assertDoesNotThrow(() -> sender.send(facebookUser, "Hello, Facebook!", "Ukraine"));
        assertDoesNotThrow(() -> sender.send(twitterUser, "Hello, Twitter!", "USA"));
    }

    @Test
    public void testInactiveUserMessageNotSent() {
        LocalDateTime inactiveTime = LocalDateTime.now().minusHours(2);
        User facebookUser = new FacebookUserAdapter(new FacebookUser("inactive@example.com", "Ukraine", inactiveTime));
        MessageSender sender = new MessageSender();
        sender.send(facebookUser, "This should not be sent", "Ukraine");
    }
}