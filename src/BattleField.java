public class BattleField
{
    public void StartBattle(Spaceship first, Spaceship second)
    {
        for (int i = 0; i < 100; i++)
        {
            first.Tick();
            second.Tick();

            var fDamage = first.GetDamage();
            var sDamage = second.GetDamage();

            var shipsAreAlive = second.TakeDamage(fDamage) && first.TakeDamage(sDamage);
            if (!shipsAreAlive)
            {
                break;
            }
        }

        System.out.printf("Battle completed! %s with %shp and %s with %shp%n", first.GetName(), first.GetHp(), second.GetName(), second.GetHp());
    }
}
