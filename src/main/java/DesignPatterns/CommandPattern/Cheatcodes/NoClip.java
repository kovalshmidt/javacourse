package DesignPatterns.CommandPattern.Cheatcodes;

public class NoClip implements Command{
    private SkyrimCode skyrimCode;

    public NoClip(SkyrimCode skyrimCode) {
        this.skyrimCode = skyrimCode;
    }

    @Override
    public void execute() {
        this.skyrimCode.toggleNoClip();
    }
}
