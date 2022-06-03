public class ElectricPokemon extends Pokemon{
    private String electricMove;
    private String exclusiveAbilities;

    public ElectricPokemon(String name, int level, int hp, String electricMove, String exclusiveAbilities) {
        super(name, level, hp);
        this.electricMove = electricMove;
        this.exclusiveAbilities = exclusiveAbilities;
    }

    public String getElectricMove() {
        return electricMove;
    }

    public void setElectricMove(String electricMove) {
        this.electricMove = electricMove;
    }

    public String getExclusiveAbilities() {
        return exclusiveAbilities;
    }

    public void setExclusiveAbilities(String exclusiveAbilities) {
        this.exclusiveAbilities = exclusiveAbilities;
    }

    @Override
    public String toString() {
        return super.toString() + " Ik ben een electric type pokemon. Mijn exclusiveAbilities zijn " + exclusiveAbilities
                + " en mijn special electrice type move is: " + electricMove + " (+10 HP)";
    }
    public int useSpecialMove() {
        return hp = hp + 10;
    }
}
