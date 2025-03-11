import java.util.Random;

public class TelepathHero extends SuperHero {
    private static final int BASE_DAMAGE = 10;
    private static final int CRITICAL_DAMAGE = 20;

    public TelepathHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        Random rand = new Random();
        int damage = (rand.nextInt(2) == 0) ? BASE_DAMAGE : CRITICAL_DAMAGE;
        String attackType = (damage == BASE_DAMAGE) ? "Attaque normale" : "Coup critique";

        System.out.println(name + " utilise ses pouvoirs télépathiques contre " + adversary.getName());
        System.out.println(attackType + " !");
        System.out.println("Dégâts infligés : " + damage);
        adversary.takeDamage(damage);
        System.out.println(adversary.getName() + " subit " + damage + " dégâts. Points de vie restants : " + adversary.getHealth());
    }
}
