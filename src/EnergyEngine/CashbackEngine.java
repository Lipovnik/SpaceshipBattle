package EnergyEngine;

public class CashbackEngine implements IEnergyEngine
{
    private static final int MaxEnergy = 75;

    private int energy = MaxEnergy;

    @Override
    public int GetEnergy() {
        return energy;
    }

    @Override
    public void DecreaseEnergy(int value)
    {
        energy -= value;
        energy += 10;
    }

    @Override
    public void Tick() {
        energy += 10;
    }
}
