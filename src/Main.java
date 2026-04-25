public class Main {
    public static void main(String[] args) {

        // set up the creatures
        Creature a = new FireCreature("Fire",100);
        Creature b = new AirCreature("Air" , 100);


        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(a, b);
    }
}
