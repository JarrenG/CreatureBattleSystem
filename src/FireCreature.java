public class FireCreature extends Creature{

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " used their fire breathing and missed!";
            return 0;
        }

        // 10% chance of getting high damage attack
        else if (Rand.randomInt(0, 10) == 9) {
            float power = Rand.randomFloat(25, 40);
            action = name + " attacked with their fire rain power " + power + "!";
            return power;
        }
        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with their fire breathing power " + power + "!";
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 40 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 4) {
            incomingPower = incomingPower * 0.75f;
            action = name + " defended with a firewall and reduced damage taken to " + incomingPower;
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
