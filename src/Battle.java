public class Battle {
    final int battlePoints = 20;
    public void pokemonBattle(Pokemon challenger, Pokemon defender) {
        if (challenger.getHp() > defender.getHp()) {
            System.out.println("Je hebt de battle gewonnen!\nDe nieuwe punten zijn: ");
            challenger.setHp(challenger.getHp() + battlePoints);
            defender.setHp(defender.getHp() - battlePoints);
            System.out.println(challenger.getName() + ": " + challenger.getHp());
            System.out.println(defender.getName() + ": " + defender.getHp());
        } else {
            System.out.println("Je hebt verloren\nDe nieuwe punten zijn: ");
            challenger.setHp(challenger.getHp() - battlePoints);
            defender.setHp(defender.getHp() + battlePoints);
            System.out.println(challenger.getName() +  ": " + challenger.getHp());
            System.out.println(defender.getName() + ": " + defender.getHp());
        }
    }
}
