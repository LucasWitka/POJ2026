package alarms;

import logger.EventSource;
import logger.Logger;
import logger.Severity;
import safe.PinEvent;

public class SoundAlarm extends BazowyAlarm {

    public SoundAlarm(Logger logger){
        super(logger);
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        logger.log(
                Severity.DANGER,
                EventSource.ALARM,
                "Sound alarm wlaczony."
        );
        System.out.println("(1)");
    }
    @Override
    public void alarmTurnOff(PinEvent event) {
        logger.log(
                Severity.INFO,
                EventSource.ALARM,
                "Sound alarm wylaczony."
        );
        System.out.println("(0)");
    }



}
