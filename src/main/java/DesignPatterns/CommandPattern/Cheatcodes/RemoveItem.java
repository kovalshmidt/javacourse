package DesignPatterns.CommandPattern.Cheatcodes;

public class RemoveItem implements Command {
    private SkyrimCode skyrimCode;
    private String item;
    private int amount;

    public RemoveItem(SkyrimCode skyrimCode) {
        this.skyrimCode = skyrimCode;
        this.item = "";
        this.amount = 0;
    }

    public void values(String item, int amount){
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.skyrimCode.removeItem(item, amount);
    }
}
