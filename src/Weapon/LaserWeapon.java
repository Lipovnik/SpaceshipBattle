package Weapon;

public class LaserWeapon implements IWeapon
{
    private static final int MaxRechargeTime = 4;
    private static final int MaxCharges = 3;
    private static final int Damage = 3;

    private int rechargeTime = 0;
    private int charges = 0;

    @Override
    public int GetDamage()
    {
        if (charges > 0){
            charges--;
            return Damage;
        }

        if (rechargeTime < MaxRechargeTime) {
            return 0;
        }

        rechargeTime = 0;
        charges = MaxCharges - 1;
        return Damage;
    }

    @Override
    public void Tick()
    {
        if (charges > 0)
        {
            return;
        }

        rechargeTime++;
    }

    @Override
    public int GetEnergyByUse()
    {
        return 15;
    }
}

