import EnergyEngine.ClassicEngine;
import EnergyEngine.IEnergyEngine;
import Shield.ClassicShield;
import Shield.IShield;
import Weapon.GunWeapon;
import Weapon.IWeapon;

public class SpaceshipBuilder
{
    private IWeapon weapon;
    private IShield shield;
    private IEnergyEngine engine;

    public SpaceshipBuilder()
    {
        DefaultSetup();
    }

    public SpaceshipBuilder SetWeapon(IWeapon weapon)
    {
        this.weapon = weapon;
        return this;
    }

    public SpaceshipBuilder SetShield(IShield shield)
    {
        this.shield = shield;
        return this;
    }

    public SpaceshipBuilder SetEngine(IEnergyEngine engine)
    {
        this.engine = engine;
        return this;
    }

    public Spaceship Submit(String name)
    {
        var ship = new Spaceship(name, weapon, shield, engine);
        DefaultSetup();
        return ship;
    }

    private void DefaultSetup()
    {
        weapon = new GunWeapon();
        shield = new ClassicShield();
        engine = new ClassicEngine();
    }
}
