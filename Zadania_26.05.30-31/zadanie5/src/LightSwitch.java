public class LightSwitch implements Turner {
    private boolean isLightOn = false;

    @Override
    public void turn() {
        if (isLightOn == false) {
            isLightOn = true;
            System.out.println("Lights on.");
        } else {
            isLightOn = false;
            System.out.println("Lights off.");
        }
    }

}
