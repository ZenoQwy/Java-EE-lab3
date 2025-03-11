public class BattleArena {
    private static int battleCount = 0;

    public static void fight(SuperHero hero1, SuperHero hero2) {
        battleCount++;
        System.out.println("=== Combat n°" + battleCount + " : " + hero1.getName() + " VS " + hero2.getName() + " ===");

        int round = 1;
        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println("--- Round " + round + " ---");
            hero1.attack(hero2);
            if (hero2.isAlive()) {
                hero2.attack(hero1);
            }
            round++;
        }

        if (hero1.isAlive()) {
            System.out.println(hero1.getName() + " est vainqueur !");
        } else {
            System.out.println(hero2.getName() + " est vainqueur !");
        }

        System.out.println("Fin du combat n°" + battleCount);
        System.out.println("Préparation pour un nouveau combat...\n");
    }

    public static int getBattleCount() {
        return battleCount;
    }
}
