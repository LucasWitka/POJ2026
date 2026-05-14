import alarms.*;
import logger.*;
import safe.Safe;

void main() {

    Logger fileLogger = new FileLogger("logs.txt");

    Logger consoleLogger = new ConsoleLogger();

    Safe safe1 = new Safe("1234");

    BarsAlarm soundAlarm1 = new BarsAlarm(consoleLogger);

    safe1.addAlarm(
            new PoliceAlarm(fileLogger)
    );

    safe1.addAlarm(
            soundAlarm1
    );

    safe1.removeAlarm(
            soundAlarm1
    );
    safe1.addAlarm(
            new BarsAlarm(consoleLogger)
    );

    safe1.enterPin("1111");
    safe1.enterPin("1234");
    safe1.enterPin("2137");


}