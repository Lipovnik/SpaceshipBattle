package EnergyEngine;

public interface IEnergyEngine{
    int GetEnergy();
    void DecreaseEnergy(int value);
    void Tick();
}

