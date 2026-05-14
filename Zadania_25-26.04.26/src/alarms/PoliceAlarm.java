package alarms;

import logger.EventSource;
import logger.Logger;
import logger.Severity;
import safe.PinEvent;

public class PoliceAlarm extends BazowyAlarm {

    public PoliceAlarm(Logger logger) {
        super(logger);
    }

    @Override
    public void alarmTurnOn(PinEvent event){
        logger.log(
                Severity.DANGER,
                EventSource.ALARM,
                "Policja wezwana."
        );
        //redundant, ale pomaga w ogarnieciu podczas sprawdzania dzialania.
        //mozna tu np. zautomatyzowac wyslanie wiadomosci na komende policji
        System.out.println("(1)");
    }

    @Override
    public void alarmTurnOff(PinEvent event){
        logger.log(
                Severity.INFO,
                EventSource.ALARM,
                "Alarm Policyjny wyłączony."
        );
        System.out.println("(0)");
    }

}
