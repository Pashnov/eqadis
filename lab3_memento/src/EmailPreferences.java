public class EmailPreferences {

    private boolean whatNew;
    private boolean everyday;
    private boolean weekly;
    private boolean newInWorld;

    public EmailPreferences(boolean whatNew, boolean everyday, boolean weekly, boolean newInWorld) {
        this.whatNew = whatNew;
        this.everyday = everyday;
        this.weekly = weekly;
        this.newInWorld = newInWorld;
    }

    public void setWhatNew(boolean whatNew) {
        this.whatNew = whatNew;
    }

    public void setEveryday(boolean everyday) {
        this.everyday = everyday;
    }

    public void setWeekly(boolean weekly) {
        this.weekly = weekly;
    }

    public void setNewInWorld(boolean newInWorld) {
        this.newInWorld = newInWorld;
    }

    @Override
    public String toString() {
        return "MyAccountPage{" +
                "whatNew=" + whatNew +
                ", everyday=" + everyday +
                ", weekly=" + weekly +
                ", newInWorld=" + newInWorld +
                '}';
    }

    public Mememto makeSnapshot() {
        return new EmailPreferencesMememto(new boolean[]{whatNew, everyday, weekly, newInWorld});
    }

    public void restore(Mememto snapshot) {
        if (snapshot instanceof EmailPreferencesMememto) {
            boolean[] states = ((EmailPreferencesMememto) snapshot).getStates();
            whatNew = states[0];
            everyday = states[1];
            weekly = states[2];
            newInWorld = states[3];
        }
    }


}
