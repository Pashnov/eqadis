public class MyAccountPage {

    private Mememto previousSettings;
    private EmailPreferences emailPreferences;

    public MyAccountPage(EmailPreferences emailPreferences) {
        this.emailPreferences = emailPreferences;
    }

    public void save() {
        previousSettings = emailPreferences.makeSnapshot();
    }

    public void cancelUpdate() {
        emailPreferences.restore(previousSettings);
    }
}
