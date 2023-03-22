public class Main {

    public static void main(String[] args) {
        System.out.println("Hello There!");
        EmailPreferences emailPreferences = new EmailPreferences(true, true, true, true);
        MyAccountPage page = new MyAccountPage(emailPreferences);
        page.save();
        System.out.println("current preferences: " + emailPreferences);
        emailPreferences.setEveryday(false);
        emailPreferences.setWhatNew(false);
        emailPreferences.setWeekly(false);
        System.out.println("updated preferences: " + emailPreferences);
        page.cancelUpdate();
        System.out.println("restored preferences: " + emailPreferences);
    }
}