public class Creature {
    private float health;
    private String name;
    private String action;

    public Creature(String name, float health) {
        this.name = name;
        this.health = health;
    }

    public void updatedAction(String newAction) {
        this.action = newAction;
    }

    public void takeDamage(float damage) {
        this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }



    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }

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
