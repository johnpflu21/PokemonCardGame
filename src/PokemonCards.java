public class PokemonCards { //setting up the class for the Pokemon Cards
    public int index;
    public String name;
    public String typeone;
    public String typetwo;
    public int total;
    public int hp;
    public int attack;
    public int defense;
    public int specialatk;
    public int specialdef;
    public int speed;
    public int generation;
    public boolean legend;

    //constructor for the Pokemon cards
    PokemonCards(int index, String name, String typeone, String typetwo, int total, int hp, int attack, int defense, int specialatk, int specialdef, int speed, int generation, boolean legend) {
        this.index = index;
        this.name = name;
        this.typeone = typeone;
        this.typetwo = typetwo;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialatk = specialatk;
        this.specialdef = specialdef;
        this.speed = speed;
        this.generation = generation;
        this.legend = legend;
    }

    // Setters and Getters for class attributes

    //Index
    public int getIndex() {return index;}

    public void setIndex(int newIndex) {
        this.index = newIndex;
    }

    //Name
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    //Type one
    public String getTypeone() {
        return typeone;
    }

    public void setTypeone(String newTypeone) {
        this.typeone = newTypeone;
    }

    //Type two
    public String getTypetwo() {
        return typetwo;
    }

    public void setTypetwo(String newTypetwo) {
        this.typetwo = newTypetwo;
    }

    //Total
    public int getTotal() {
        return total;
    }

    public void setTotal(int newTotal) {
        this.total = newTotal;
    }

    //HP
    public int getHp() {
        return hp;
    }

    public void setHp(int newHp) {
        this.hp = newHp;
    }

    //Attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int newAttack) {this.attack = newAttack;}

    //Defense
    public int getDefense() {
        return defense;
    }

    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }

    //Special Attack
    public int getSpecialatk() {
        return specialatk;
    }

    public void setSpecialatk(int newSpecialatk) {
        this.specialatk = newSpecialatk;
    }

    //Special Defense
    public int getSpecialdef() {
        return specialdef;
    }

    public void setSpecialdef(int newSpecialdef) {
        this.specialdef = newSpecialdef;
    }

    //Speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    //Generation
    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int newGeneration) {
        this.generation = newGeneration;
    }

    //Legendary
    public boolean getLegend() {
        return legend;
    }

    public void setLegend(boolean newLegend) {
        this.legend = newLegend;
    }
}




