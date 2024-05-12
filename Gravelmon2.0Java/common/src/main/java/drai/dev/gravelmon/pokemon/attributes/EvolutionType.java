package drai.dev.gravelmon.pokemon.attributes;

public enum EvolutionType {
    LEVEL_UP("level_up"),
    ITEM_INTERACT("item_interact"),
    TRADE("trade");
    private String name;
    EvolutionType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
