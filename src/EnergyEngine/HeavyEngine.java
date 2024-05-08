package EnergyEngine;

public class HeavyEngine implements IEnergyEngine
{
    private static final int MaxEnergy = 250;

    private int energy = MaxEnergy;

    @Override
    public int GetEnergy() {
        return energy;
    }

    @Override
    public void DecreaseEnergy(int value)
    {
        energy -= value;
    }

    @Override
    public void Tick() {
        energy += 15;
    }
}

