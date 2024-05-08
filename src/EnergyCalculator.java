import EnergyEngine.IEnergyEngine;
import Runtime.IEnergyConsumer;

public class EnergyCalculator{
    public boolean Calculate(IEnergyEngine engine, IEnergyConsumer consumer){
        var needEnergy = consumer.GetEnergyByUse();
        if (needEnergy <= engine.GetEnergy()){
            engine.DecreaseEnergy(needEnergy);
            return true;
        }
        else
        {
            return false;
        }
    }
}
