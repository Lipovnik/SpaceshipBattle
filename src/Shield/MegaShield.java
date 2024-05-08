package Shield;

public class MegaShield implements IShield
{
    @Override
    public int GetAbsorbedDamage(int damage) {
        return 0;
    }

    @Override
    public int GetEnergyByUse() {
        return 60;
    }
}
