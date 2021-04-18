package DesignPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {


        ElectronicDevice tv = DeviceRemote.getTV();
        ElectronicDevice radio = DeviceRemote.getRadio();
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(tv);
        devices.add(radio);

        Command on = new TurnTVOn(tv);
        Command off = new TurnTVOff(tv);
        Command up = new TurnTVUp(tv);
        Command down = new TurnTVDown(tv);
        Command allOut = new TurnItAllOff(devices);

        DeviceButton onButton = new DeviceButton(on);
        DeviceButton redButton = new DeviceButton(off);
        DeviceButton upButton = new DeviceButton(up);
        DeviceButton downButton = new DeviceButton(down);
        DeviceButton generalOut = new DeviceButton(allOut);


        onButton.press();
        redButton.press();
        upButton.press();
        upButton.press();
        upButton.press();
        upButton.press();
        upButton.undo();
        downButton.press();
        generalOut.press();
    }
}
