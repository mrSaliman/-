public class FloweringPlant extends HousePlant {
    private int floweringDuration;

    public FloweringPlant(String name, double height, int lifespan, int floweringDuration) {
        super(name, height, lifespan);
        this.floweringDuration = floweringDuration;
    }

    public int getFloweringDuration() {
        return floweringDuration;
    }
}