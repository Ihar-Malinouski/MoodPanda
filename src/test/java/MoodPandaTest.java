import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {


    @Test
    public void moodTest() {
        loginPage.openPage()
                .login("Ihar2@mailinator.com","Ghjcnbghjqnb126")
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .updateMood(3);
    }
}
