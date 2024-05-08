import EnergyEngine.CashbackEngine;
import Shield.MegaShield;
import Weapon.LaserWeapon;
import Weapon.MissileWeapon;

public class Main {
    public static void main(String[] args)
    {
        var field = new BattleField();
        var builder = new SpaceshipBuilder();

        var boryaShip = builder
                .SetWeapon(new MissileWeapon())
                .SetShield(new MegaShield())
                .SetEngine(new CashbackEngine())
                .Submit("Borya");

        var kabanShip = builder
                .SetWeapon(new LaserWeapon())
                .Submit("Kaban");

        field.StartBattle(boryaShip, kabanShip);
    }
}