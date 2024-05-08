package Weapon;

public class GunWeapon implements IWeapon
{
    private static final int MaxRechargeTime = 2;

    private int rechargeTime = 0;

    @Override
    public int GetDamage()
    {
        if (rechargeTime < MaxRechargeTime) {
            return 0;
        }

        rechargeTime = 0;
        return 5;
    }

    @Override
    public void Tick()
    {
        rechargeTime++;
    }

    @Override
    public int GetEnergyByUse()
    {
        return 20;
    }
}
