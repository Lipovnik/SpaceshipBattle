package Shield;

public class ClassicShield implements IShield
{
    @Override
    public int GetAbsorbedDamage(int damage) {
        damage -= 2;
        if (damage < 0){
            damage = 0;
        }

        return damage;
    }

    @Override
    public int GetEnergyByUse() {
        return 20;
    }
}

