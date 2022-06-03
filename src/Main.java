import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pokemon playedCharacter = new Pokemon();
        Pokemon challengedCharacter = new Pokemon();
        Battle battle = new Battle();

        Pokemon golduck = new WaterPokemon("Golduck", 12, 80, "pure", "Mega Launcher", "water pulse");
        Pokemon vulcanion = new FirePokemon("Vulcanion", 18, 62, " Primary Fire-type", "water-type", "magic", "Blue Flare");
        Pokemon bulbasaur = new GrassPokemon("Bulbasur", 9, 42, "Grass Knot", "poison powder", "Magical Leaf");
        Pokemon manectric = new ElectricPokemon("Manectric", 8, 32, "Spark", "Zing Zap");

        // een te spelen karakter kiezen:
        System.out.print("Welk character wil je spelen? \n1. Vulcanion\n2. Golduck\n3. Bulbasaur\n4. Manectric\n" +
                "jou keuze is: ");
        int characterChoice = input.nextInt();
        System.out.println();

        switch (characterChoice) {
            case 1:
                System.out.println(vulcanion.toString());
                playedCharacter = vulcanion;
                break;
            case 2:
                System.out.println(golduck.toString());
                playedCharacter = golduck;
                break;
            case 3:
                System.out.println(bulbasaur.toString());
                playedCharacter = bulbasaur;
                break;
            case 4:
                System.out.println(manectric.toString());
                playedCharacter = manectric;
                break;
            default:
                // vraag: met welke commando zou ik het programma helemaal kunnen stoppen?
                System.out.println("ongeldige keuze");
                break;
        }

        // vraag: of speler HP punten wil weten van gekozen karakter.
        System.out.println();
        System.out.print("Wil je mijn HP punten weten ? (j/n) ");
        String hpRequest = input.next();
        if (hpRequest.equalsIgnoreCase("j")) {
            System.out.println();
            System.out.println("Ik heb " + playedCharacter.getHp() + " HP punten");
        } else {
            System.out.print("");
            // het lukte mij niet om de code te laten werken zonder deze lege 'else' statement te plaatsen. Kan een 'if' nooit zonder 'else'?
        }

        // vraag aan speler: Welke Pokemon moet  uitgedaagd worden? Het zou netter en  minder type fout gevoelig zijn geweest om met een keuze menu te werken, zoals hierboven, maar ik wilde ook eens deze manier proberen
            System.out.println();
            System.out.print("Welke Pokemon wil je uitdagen? (type hele naam): ");
            String challengedPokemon = input.next();

            if (challengedPokemon.equalsIgnoreCase("Golduck")) {
                challengedCharacter = golduck;
                System.out.print(challengedPokemon + " heeft " + golduck.getHp() + " HP punten. ");

            } else if (challengedPokemon.equalsIgnoreCase("Vulcanion")) {
                challengedCharacter = vulcanion;
                System.out.print(challengedPokemon + " heeft " + vulcanion.getHp() + " HP punten. ");

            } else if (challengedPokemon.equalsIgnoreCase("Bulbasaur")) {
                challengedCharacter = bulbasaur;
                System.out.print(challengedPokemon + " heeft " + bulbasaur.getHp() + " HP punten. ");
            } else if (challengedPokemon.equalsIgnoreCase("manectric")) {
                challengedCharacter = manectric;
                System.out.print(challengedPokemon + " heeft " + manectric.getHp() + " HP punten. ");
            } else {
                System.out.println("speler bestaat niet");
            }

            // battle options
            System.out.println();
            System.out.print("Wil je 1.stoppen  2.battle met special move  3.batlle zonder special move?\n(let op: Met een gevecht kun je 20HP winnen of verliezen!) : ");
            int battleOption = input.nextInt();
            if (battleOption == 1) {
                System.out.println("Spel wordt gestopt");
            } else if (battleOption == 2) {
                playedCharacter.useSpecialMove();
                System.out.println("Mijn nieuwe HP punten zijn: " + playedCharacter.getHp());
                battle.pokemonBattle(playedCharacter, challengedCharacter);
            } else {
                battle.pokemonBattle(playedCharacter, challengedCharacter);
            }
        }
    }


