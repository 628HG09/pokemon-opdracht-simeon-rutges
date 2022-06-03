public class GrassPokemon extends Pokemon {
    private String exclusiveAbilities;
    private String item;
    private String grasMove;

    public GrassPokemon(String name, int level, int hp, String exclusiveAbilities, String item, String grasMove) {
        super(name, level, hp);
        this.exclusiveAbilities = exclusiveAbilities;
        this.item = item;
        this.grasMove = grasMove;
    }

    public String getExclusiveAbilities() {
        return exclusiveAbilities;
    }

    public void setExclusiveAbilities(String exclusiveAbilities) {
        this.exclusiveAbilities = exclusiveAbilities;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getGrasMove() {
        return grasMove;
    }

    public void setGrasMove(String grasMove) {
        this.grasMove = grasMove;
    }

    @Override
    public String toString() {
        return super.toString() + " Ik ben een Grass type Pokemon en Mijn 'Exclusive Abilitie' is: " + exclusiveAbilities +
                ". Ik heb het volgende item: " + item +
                ". Mijn special grass move is: " + grasMove + " (+40 HP)";
    }

    public int useSpecialMove() {
        return hp = hp + 40;
    }
}

