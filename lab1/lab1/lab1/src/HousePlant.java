public abstract class HousePlant {
    private String name;
    private double height;
    private int lifespan;

    // Constructor for initializing the instance variables of the class
    public HousePlant(String name, double height, int lifespan) {
        this.name = name;
        this.height = height;
        this.lifespan = lifespan;
    }

    // Getter method for retrieving the name of the plant
    public String getName() {
        return name;
    }

    // Getter method for retrieving the height of the plant
    public double getHeight() {
        return height;
    }

    // Getter method for retrieving the lifespan of the plant
    public int getLifespan() {
        return lifespan;
    }
}
