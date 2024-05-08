package Shield;

import Runtime.IEnergyConsumer;

public interface IShield extends IEnergyConsumer
{
    int GetAbsorbedDamage(int damage);
}

