import EnergyEngine.IEnergyEngine;
import Shield.IShield;
import Weapon.IWeapon;

public class Spaceship {
    private final String name;
    private final IWeapon weapon;
    private final IShield shield;
    private final IEnergyEngine engine;
    private final EnergyCalculator calculator;

    private int hp;

    public Spaceship(String name, IWeapon weapon, IShield shield, IEnergyEngine engine) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.engine = engine;
        calculator = new EnergyCalculator();
        hp = 100;
    }

    public String GetName() {
        return name;
    }

    public int GetHp() {
        return hp;
    }

    public void Tick(){
        engine.Tick();
        weapon.Tick();
    }

    public int GetDamage(){
        var damage = weapon.GetDamage();
        if (damage > 0)
        {
            if (calculator.Calculate(engine, weapon)){
                return damage;
            }
        }

        return 0;
    }

    public boolean TakeDamage(int damage)
    {
        if (calculator.Calculate(engine, shield)){
            damage = shield.GetAbsorbedDamage(damage);
        }

        if (damage < 0)
        {
            damage = 0;
        }

        hp -= damage;
        return hp > 0;
    }
}

