package alarms;

import logger.EventSource;
import logger.Logger;
import logger.Severity;
import safe.PinEvent;

public class DogsAlarm extends BazowyAlarm {

    public DogsAlarm(Logger logger) {
        super(logger);
    }

    @Override
    public void alarmTurnOn(PinEvent event){
        logger.log(
                Severity.DANGER,
                EventSource.ALARM,
                "Psy wypuszczone"
        );
        System.out.println("(1)");
    }

    @Override
    public void alarmTurnOff(PinEvent event){
        logger.log(
                Severity.INFO,
                EventSource.ALARM,
                "Pieski sobie chilluja"
        );
        System.out.println("(0)");
    }

}
