package Weapon;

import Runtime.IEnergyConsumer;

public interface IWeapon extends IEnergyConsumer
{
    int GetDamage();
    void Tick();
}

