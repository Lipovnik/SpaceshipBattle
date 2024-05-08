package Shield;

public class HalvingShield implements IShield
{
    @Override
    public int GetAbsorbedDamage(int damage)
    {
        return damage / 2 + damage % 2;
    }

    @Override
    public int GetEnergyByUse() {
        return 30;
    }
}
