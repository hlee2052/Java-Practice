package enums;

/**
 * Key takeaway
 *  - enum values can be updated
 */
public enum Animal {

    PIG(500, 4),
    SNAKE(100, 0),
    SPIDER(40, 8),
    // Monster, which contains the enum values of previous ones
    MONSTER(PIG.getWeight()+SNAKE.getWeight()+SPIDER.getWeight(),
            PIG.getNumLegs()+SNAKE.getNumLegs()+SPIDER.getNumLegs());

    private double weight;
    private final int numLegs;
    private final double weightSupportPerLeg;

    Animal(double weight, int numLegs) {
        this.weight = weight;
        this.numLegs = numLegs;
        weightSupportPerLeg = (numLegs > 0) ? weight/numLegs: -1;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public double getWeightSupportPerLeg() {
        return weightSupportPerLeg;
    }


    public static void main (String [] args) {
        System.out.println(Animal.PIG); // prints PIG
        System.out.println(Animal.PIG.getNumLegs()); // 4
        System.out.println(Animal.PIG.getWeightSupportPerLeg()); // 1000/4

        Animal.PIG.setWeight(10000);
        System.out.println(PIG.getWeight()); // pig weight is set to 10000

        System.out.println(MONSTER.getWeight()); // 640


        // Note... ordinal is not a good practice - Instead, pass in field. Alternatively consider enumMap
        System.out.println(Animal.SNAKE.ordinal()); // ordinal gets the "INDEX" of enum listed


    }
}