public class FireCreature extends Creature{

    public FireCreature(String name, float health) {
        super(name, health);
    }

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            updatedAction(getName() + " used their fire breathing and missed!");
            return 0;
        }

        // 10% chance of getting high damage attack
        else if (Rand.randomInt(0, 10) == 9) {
            float power = Rand.randomFloat(25, 40);
            updatedAction(getName() + " attacked with their fire rain power " + power + "!");
            return power;
        }
        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        updatedAction(getName() + " attacked with their fire breathing power " + power + "!");
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 40 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 4) {
            incomingPower = incomingPower * 0.75f;
            updatedAction(getName() + " defended with a firewall and reduced damage taken to " + incomingPower);
        }
        else
        {
            updatedAction(getName() + " did not defend.");
        }

        takeDamage(incomingPower);
    }
}
