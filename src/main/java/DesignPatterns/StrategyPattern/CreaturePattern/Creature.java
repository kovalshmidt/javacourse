package DesignPatterns.StrategyPattern.CreaturePattern;

public class Creature {
    private final DamageDealtModifier damageDealtModifier;
    private final DamageTakenModifiers damageTakenModifiers;
    private final Faction faction;
    private final LootTable lootTable;

    public Creature(DamageDealtModifier damageDealtModifier, DamageTakenModifiers damageTakenModifiers, Faction faction, LootTable lootTable) {
        this.damageDealtModifier = damageDealtModifier;
        this.damageTakenModifiers = damageTakenModifiers;
        this.faction = faction;
        this.lootTable = lootTable;
    }

    public void damageDealt(){this.damageDealtModifier.damageDealt();}

    public void damageTaken(){this.damageTakenModifiers.damageTaken();}

    public void memberOfFaction(){this.faction.memberOfFaction();}

    public void loot(){this.lootTable.loot();}
}
