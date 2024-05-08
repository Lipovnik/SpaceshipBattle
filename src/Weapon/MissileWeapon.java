package Weapon;

public class MissileWeapon implements IWeapon
{
    private static final int MaxRechargeTime = 4;

    private int rechargeTime = 0;

    @Override
    public int GetDamage() {
        if (rechargeTime < MaxRechargeTime) {
            return 0;
        }

        rechargeTime = 0;
        return 12;
    }

    @Override
    public void Tick() {
        rechargeTime++;
    }

    @Override
    public int GetEnergyByUse() {
        return 40;
    }
}

