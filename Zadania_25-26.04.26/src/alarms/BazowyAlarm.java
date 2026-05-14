package alarms;

import logger.Logger;

public abstract class BazowyAlarm implements Alarm {
    //Bazowy alarm aby nie zmuszac alarmu do definiowania loggera oraz zeby interface tego nie robił.
    //abstract aby nie moc stworzyc samego BazowegoAlarmu, to tylko ma łączyc alarm i logger.

    protected Logger logger;

    public BazowyAlarm(Logger logger) {
        this.logger = logger;
    }
}
