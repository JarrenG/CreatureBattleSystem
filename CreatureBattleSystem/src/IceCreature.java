public class IceCreature extends Creature{

    public IceCreature(String name, float health) {
        super(name, health);
    }

    // Returns the damage done by the
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            updatedAction(getName() + " used ice cubes and missed!");
            return 0;
        }

        // 10% chance of high Damage Attack
        else if (Rand.randomInt(0, 10) == 5) {
            float power = Rand.randomFloat(20, 50);
            updatedAction(getName() + " attacked with their high damage flying icicles power " + power + "!");
            return power;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        updatedAction(getName() + " attacked with ice cubes power " + power + "!");
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 20 % chance of reducing damage taken to half
        if (Rand.randomInt(0, 10) < 2) {
            incomingPower = incomingPower * 0.5f;
            updatedAction(getName() + " defended with a ice wall and reduced damage taken to " + incomingPower);
        }
        else
        {
            updatedAction(getName() + " did not defend.");
        }

        takeDamage(incomingPower);
    }
}
