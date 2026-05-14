package safe;

import alarms.Alarm;

import java.util.ArrayList;
import java.util.List;

public class Safe {

    private List<Alarm> alarms;
    private String pin;

    //konstruktor sejfu, posiada pin i liste powiazanych alarmow
    public Safe(String pin) {
        this.pin = pin;
        this.alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String enteredPin){

        if (pin.equals(enteredPin)) {
            //event dobry pin
            correctPin();
        } else {
            //event zly pin
            wrongPin();
        }
    }

    private void correctPin() {

        PinEvent event = new PinEvent(this);

        for (Alarm alarm : alarms) {
            alarm.alarmTurnOff(event);
        }
    }

    private void wrongPin() {

        PinEvent event = new PinEvent(this);

        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(event);
        }
    }








}
