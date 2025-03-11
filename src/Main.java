public class Main {
    public static void main(String[] args) {
        SuperHero hero1 = new SpeedHero("Flash", 50);
        SuperHero hero2 = new StrongHero("Hercule", 50);

        SuperHero hero3 = new TelepathHero("MasterMind", 50);
        SuperHero hero4 = new SpeedHero("Fashette", 50);

        BattleArena.fight(hero1, hero2);

        BattleArena.fight(hero3, hero4);

        System.out.println("\nNombre total de combats réalisés : " + BattleArena.getBattleCount());
    }
}
