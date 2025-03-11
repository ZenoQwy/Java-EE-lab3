public class StrongHero extends SuperHero {
    private static final int DAMAGE = 15;

    public StrongHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        System.out.println(name + " frappe puissamment " + adversary.getName());
        adversary.takeDamage(DAMAGE);
        System.out.println(adversary.getName() + " subit " + DAMAGE + " dégâts. Points de vie restants : " + adversary.getHealth());
    }

}

