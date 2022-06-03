public class Pokemon {
    private String name;
    private int level;
    protected int hp;

    public Pokemon() {
    }

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Ik heet " +
                name +
                " en mijn level is " + level + ".";
    }
    public int useSpecialMove(){
        return 0;
    }
    }



