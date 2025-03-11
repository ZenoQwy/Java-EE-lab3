public class SpeedHero extends SuperHero {
    private static final int DAMAGE = 5;

    public SpeedHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        System.out.println(name + " attaque rapidement " + adversary.getName());
        for (int i = 0; i < 2; i++) {
            adversary.takeDamage(DAMAGE);
            System.out.println(adversary.getName() + " subit " + DAMAGE + " dégâts. Points de vie restants : " + adversary.getHealth());
        }
    }
}

