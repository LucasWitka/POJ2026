public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    // konstruktor domyślny 12:00:00
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // konstruktor z 3 parametrami
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // konstruktor z sekund (od północy)
    public Clock(int totalSeconds) {
        this.hours = (totalSeconds / 3600) % 24;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Niepoprawna godzina!");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Niepoprawne minuty!");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Niepoprawne sekundy!");
        }
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;

            if (minutes == 60) {
                minutes = 0;
                hours++;

                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    public void tickDown() {
        seconds--;

        if (seconds < 0) {
            seconds = 59;
            minutes--;

            if (minutes < 0) {
                minutes = 59;
                hours--;

                if (hours < 0) {
                    hours = 23;
                }
            }
        }
    }

    // [hh:mm:ss]
    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
