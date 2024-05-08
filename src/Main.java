import EnergyEngine.CashbackEngine;
import EnergyEngine.ClassicEngine;
import EnergyEngine.HeavyEngine;
import Shield.ClassicShield;
import Shield.MegaShield;
import Weapon.GunWeapon;
import Weapon.LaserWeapon;
import Weapon.MissileWeapon;

public class Main {
    public static void main(String[] args)
    {
        var field = new BattleField();
        var boryaShip = new Spaceship("Borya", new MissileWeapon(), new MegaShield(), new CashbackEngine());
        var kabanShip = new Spaceship("Kaban", new LaserWeapon(), new ClassicShield(), new ClassicEngine());

        field.StartBattle(boryaShip, kabanShip);
    }
}