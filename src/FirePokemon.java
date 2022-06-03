import java.awt.*;

public class FirePokemon extends Pokemon{
    private String fireType;
    private String secundairytypeFire;
    private String exclusiveAbilities;
    private String fireMove;
private static String  DEFAULT_SECUNDAIRY_FireTYPE = "default naam";

    public FirePokemon(String name, int level, int hp, String fireType, String secundairytype, String exclusiveAbilites, String fireMove) {
        super(name, level, hp);
        this.fireType = fireType;
        this.secundairytypeFire = secundairytype;
        this.exclusiveAbilities = exclusiveAbilites;
        this.fireMove = fireMove;
    }

    public FirePokemon(String name, int level, int hp, String fireType, String exclusiveAbilities, String fireMove) {
        super(name, level, hp);
        this.fireType = fireType;
        this.exclusiveAbilities = exclusiveAbilities;
        this.fireMove = fireMove;
        this.secundairytypeFire = DEFAULT_SECUNDAIRY_FireTYPE;
    }

    public FirePokemon() {
    }

    public String getFireType() {
        return fireType;
    }

    public void setFireType(String fireType) {
        this.fireType = fireType;
    }

    public String getSecundairytypeFire() {
        return secundairytypeFire;
    }

    public void setSecundairytypeFire(String secundairytypeFire) {
        this.secundairytypeFire = secundairytypeFire;
    }

    public String getExclusiveAbilities() {
        return exclusiveAbilities;
    }

    public void setExclusiveAbilities(String exclusiveAbilities) {
        this.exclusiveAbilities = exclusiveAbilities;
    }

    public String getFireMove() {
        return fireMove;
    }

    public void setFireMove(String fireMove) {
        this.fireMove = fireMove;
    }

    @Override
    public String toString() {
        if (secundairytypeFire.equals("none")){
            return super.toString() + " Ik ben een " + fireType + " fire-type " +
                    "en ik heb geen secundairyType.\nMijn exclusiveAbilities zijn " + exclusiveAbilities
                    + " en mijn watertype move is: " + fireMove + " (+60 HP)";
        }
        else {
            return super.toString() + " Ik ben een " + fireType +
                    " en mijn secundairyType is " + secundairytypeFire + ".\nMijn exclusiveAbilities is " + exclusiveAbilities
                    + " en mijn firetype move is: " + fireMove + " (+60 HP)";}

    }
    public int useSpecialMove() {
        return hp = hp + 60;
    }
}
