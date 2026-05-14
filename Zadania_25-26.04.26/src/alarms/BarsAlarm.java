package alarms;

import logger.EventSource;
import logger.Logger;
import logger.Severity;
import safe.PinEvent;

public class BarsAlarm extends BazowyAlarm {

    public BarsAlarm(Logger logger){
        super(logger);
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        logger.log(
                Severity.DANGER,
                EventSource.ALARM,
                "Kraty zamkniete"
        );
        System.out.println("(1)");
    }
    @Override
    public void alarmTurnOff(PinEvent event) {
        logger.log(
                Severity.INFO,
                EventSource.ALARM,
                "kraty sa nie zamkniete"
        );
        System.out.println("(0)");
    }



}
