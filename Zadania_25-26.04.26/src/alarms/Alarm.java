package alarms;

import safe.PinEvent;

public interface Alarm {

    void alarmTurnOn(PinEvent event);

    void alarmTurnOff(PinEvent event);

}
