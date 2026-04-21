public class AirCreature extends Creature {

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " used their cloud power and missed!";
            return 0;
        }

        // 20% chance of good attack
        else if (Rand.randomInt(0, 10) > 7) {
            float power = Rand.randomFloat(30, 35);
            action = name + " attacked with their high damage tornado power " + power + "!";
            return power;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with their cloud power " + power + "!";
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 20 % chance of reducing damage taken to half
        if (Rand.randomInt(0, 10) < 2) {
            incomingPower = incomingPower * 0.5f;
            action = name + " Used the wind and reduced damage taken to " + incomingPower;
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
