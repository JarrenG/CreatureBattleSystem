public class IceCreature extends Creature{

    // Returns the damage done by the
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " used ice cubes and missed!";
            return 0;
        }

        // 10% chance of high Damage Attack
        else if (Rand.randomInt(0,10) = 5) {
            float power = Rand.randomFloat(10, 20);
            action = name + " attacked with their high damage flying icicles power " + power + "!";
            return power;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with ice cubes power " + power + "!";
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }

    public String readAction() {
        return action;
    }

    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", health: " + health + "}";
    }

}
