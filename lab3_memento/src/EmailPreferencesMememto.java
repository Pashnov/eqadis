import java.time.LocalDateTime;

public class EmailPreferencesMememto implements Mememto {

    private boolean[] states;
    private LocalDateTime date;

    public EmailPreferencesMememto(boolean[] states) {
        this.states = states;
        this.date = LocalDateTime.now();
    }

    @Override
    public String getName() {
        return this.getClass().getName() + "-" + date;
    }

    @Override
    public LocalDateTime getSnapshotDate() {
        return date;
    }

    public boolean[] getStates() {
        return states;
    }
}
