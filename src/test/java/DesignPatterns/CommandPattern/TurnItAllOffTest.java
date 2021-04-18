package DesignPatterns.CommandPattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class TurnItAllOffTest {

    @Test
    void testCommand() {
        //test that all the devices are off
        ElectronicDevice device1 = DeviceRemote.getTV();
        ElectronicDevice device2 = DeviceRemote.getRadio();
        ElectronicDevice device3 = DeviceRemote.getTV();
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);

        Command turnOn1 = new TurnTVOn(device1);
        Command turnOn2 = new TurnTVOn(device2);
        Command turnOn3 = new TurnTVOn(device3);

        DeviceButton deviceButton1 = new DeviceButton(turnOn1);
        DeviceButton deviceButton2 = new DeviceButton(turnOn2);
        DeviceButton deviceButton3 = new DeviceButton(turnOn3);

        Command turnAllOff = new TurnItAllOff(devices);

        DeviceButton deviceButtonTest = new DeviceButton(turnAllOff);

        assertThat(device1.isStatus()).isFalse();
        assertThat(device2.isStatus()).isFalse();
        assertThat(device3.isStatus()).isFalse();

        deviceButton1.press();
        deviceButton2.press();
        deviceButton3.press();

        assertThat(device1.isStatus()).isTrue();
        assertThat(device2.isStatus()).isTrue();
        assertThat(device3.isStatus()).isTrue();

        deviceButtonTest.press();

        assertThat(device1.isStatus()).isFalse();
        assertThat(device2.isStatus()).isFalse();
        assertThat(device3.isStatus()).isFalse();
    }
}