public abstract class SuperHero {
    protected String name;
    protected int health;
    protected int energy;

    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
        this.energy = 100;
    }

    public abstract void attack(SuperHero adversary);

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

