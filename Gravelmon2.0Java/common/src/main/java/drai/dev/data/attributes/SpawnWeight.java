package drai.dev.data.attributes;

public enum SpawnWeight {
    VERY_COMMON(12),
    COMMON(9),
    UNCOMMON(5),
    RARE(.9),
    ULTRA_RARE(.05);
    private final double weight;
    SpawnWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight(int stage) {
        var returnWeight = weight;
        if(stage > 1){
            for (int i = 0; i < stage - 1; i++) {
                returnWeight /= 10;
            }
        }
        return returnWeight;
    }
}
