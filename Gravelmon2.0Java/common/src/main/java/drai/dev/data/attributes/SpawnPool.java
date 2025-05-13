package drai.dev.data.attributes;

public enum SpawnPool {
    COMMON("common"),
    UNCOMMON("uncommon"),
    RARE("rare"),
    ULTRA_RARE("ultra-rare");
    SpawnPool(String name){
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public SpawnPool getLower() {
        if(this == ULTRA_RARE) return ULTRA_RARE;
        return SpawnPool.values()[this.ordinal()+1];
    }
}
