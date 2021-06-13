package DesignPatterns.CommandPattern.Cheatcodes;

public class GodMode implements Command{
    private SkyrimCode skyrimCode;

    public GodMode(SkyrimCode skyrimCode) {
        this.skyrimCode = skyrimCode;
    }

    @Override
    public void execute() {
        this.skyrimCode.toggleGodMode();
    }
}
