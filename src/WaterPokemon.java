public class WaterPokemon extends Pokemon {
    //    zelf ook minimaal 4 private variabelen, 1 constructor, 2 methodes, 1 override methode, 2 getters en 2 setters bevatten.
    private static String DEFAULT_SECUNDAIRY_TYPE = "none";
    private static int GRENSWAARDE_HP = 40;
    private String waterType;
    private String secundairyType;
    private String exclusiveAbilities;
    private String waterTypeMove;


    public WaterPokemon(String name, int level, int hp, String waterType, String secundairyType, String exclusiveAbilities, String waterTypeMove) {
        super(name, level, hp);
        this.waterType = waterType;
        this.secundairyType = secundairyType;
        if (waterType.equalsIgnoreCase("pure")) {
            this.secundairyType = DEFAULT_SECUNDAIRY_TYPE;
        } else {
            this.secundairyType = secundairyType;
        }
        this.exclusiveAbilities = exclusiveAbilities;
        this.waterTypeMove = waterTypeMove;

    }

    public WaterPokemon(String name, int level, int hp, String waterType, String exclusiveAbilities, String waterTypeMove) {
        super(name, level, hp);
        this.waterType = waterType;
        this.exclusiveAbilities = exclusiveAbilities;
        this.waterTypeMove = waterTypeMove;
        this.secundairyType = DEFAULT_SECUNDAIRY_TYPE;
    }

    public WaterPokemon() {
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getSecundairyType() {
        return secundairyType;
    }

    public void setSecundairyType(String secundairyType) {
        this.secundairyType = secundairyType;
        if (waterType.equalsIgnoreCase("pure")) {
            this.secundairyType = DEFAULT_SECUNDAIRY_TYPE;
        } else {
            this.secundairyType = secundairyType;
        }
    }

    public String getExclusiveAbilities() {
        return exclusiveAbilities;
    }

    public void setExclusiveAbilities(String exclusiveAbilities) {
        this.exclusiveAbilities = exclusiveAbilities;
    }

    public String getWaterTypeMove() {
        return waterTypeMove;
    }

    public void setWaterTypeMove(String waterTypeMove) {
        this.waterTypeMove = waterTypeMove;
    }

    @Override
    public String toString() {
        if (secundairyType.equals("none")) {
            return super.toString() + " Ik ben een " + waterType + " watertype " +
                    "en ik heb geen secundairyType.\nMijn exclusiveAbilities zijn " + exclusiveAbilities
                    + " en mijn special watertype move is: " + waterTypeMove + " (+20 HP)";
        } else {
            return super.toString() + " Ik ben een " + waterType + " watertype " +
                    " en mijn secundairyType is " + secundairyType + ".\nMijn exclusiveAbilities zijn " + exclusiveAbilities
                    + " en mijn watertype move is: " + waterTypeMove + " (+20 HP)";
        }
    }

    public int useSpecialMove() {
        return hp = hp + 20;
    }
}


