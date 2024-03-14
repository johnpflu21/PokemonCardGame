import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Stack;

public class PokemonStack {
    private Stack<PokemonCards> player1 = new Stack<>(); // stack of cards for player 1
    private Stack<PokemonCards> player2 = new Stack<>(); // stack of cards for player 2


    public void startGame() { // Method to start game
        String line = "-------------------------------------------------------";
        int play1 = 0;
        int play2 = 0;


        for(int x=0; x<15; x++) { // 15 rounds of Pokemon card battling
            System.out.println(line);
            System.out.println("Round" + (x + 1) + ", toss your cards: ");
            System.out.println(line);
            System.out.println("Player 1: " + player1.peek().name + " " + player1.peek().hp + " " + player1.peek().attack);
            System.out.println("Player 2: " + player2.peek().name + " " + player2.peek().hp + " " + player2.peek().attack);

            if (player1.peek().hp > player2.peek().hp) { // Print-outs to show who won the round or if it tied
                System.out.println("[Player 1 won this round!]");
                play1 += 1;
            }
            if (player2.peek().hp > player1.peek().hp) {
                System.out.println("[Player 2 won this round!]");
                play2 += 1;
            }
            if (player1.peek().hp == player2.peek().hp) {
                System.out.println("[It's a Tie!]");
                play1 += 1;
            }

            player1.pop();
            player2.pop();
        }
        System.out.println(line); // Shows the amount of pounts each player has
        System.out.println(line);
        System.out.println("Player 1 has " + play1 + " points");
        System.out.println("Player 2 has " + play2 + " points");
        System.out.println(" ");

        if (play1>play2) { // these conditional statements show who won the whole game
            System.out.println("Player 1 has won!");
        }
        if (play2>play1) {
            System.out.println("Player 2 has won!");
        }
        if (play1==play2) {
            System.out.println("Player 1 and Player 2 have tied!");
        }
    }

    public PokemonStack() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/pokemon.csv"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        String line;
        boolean isFirstLine = true;

        try {
            while ((line = reader.readLine()) != null) {

                if (isFirstLine) { // skipping the header
                    isFirstLine = false;
                    continue;
                }
                // Split the line by the CSV delimiter to get values
                String[] values = line.split(",");

                // setting the values of the csv file
                if (values.length >= 13) {
                    int index = Integer.parseInt(values[0]);
                    String name = values[1];
                    String typeone = values[2];
                    String typetwo = values[3];
                    int total = Integer.parseInt(values[4]);
                    int hp = Integer.parseInt(values[5]);
                    int attack = Integer.parseInt(values[6]);
                    int defense = Integer.parseInt(values[7]);
                    int specialatk = Integer.parseInt(values[8]);
                    int specialdef = Integer.parseInt(values[9]);
                    int speed = Integer.parseInt(values[10]);
                    int generation = Integer.parseInt(values[11]);
                    boolean legend = Boolean.parseBoolean(values[12]);


                    // Create a PokemonCards object with the extracted values
                    PokemonCards card = new PokemonCards(index, name, typeone, typetwo, total, hp, attack, defense, specialatk, specialdef, speed, generation, legend);

                    // Push the PokemonCards object onto the stack of each player
                    player1.push(card);
                    player2.push(card);

                    Collections.shuffle(player1); // shuffle both decks
                    Collections.shuffle(player2);
                } else {
                    System.out.println("Skipping incomplete data row: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                // Handle invalid integer parsing
                System.err.println("Error parsing an integer: " + e.getMessage());
            }
        }






    }
    }


