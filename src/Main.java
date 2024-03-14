/*
John Pflugrad
Programming III
9/28/23
BagADT Assignment
 */

public class Main {
    public static void main(String[] args) {

        cards();
    }

    public static void cards() { // starting the game
        PokemonStack pokemon = new PokemonStack();
        pokemon.startGame();
    }
}