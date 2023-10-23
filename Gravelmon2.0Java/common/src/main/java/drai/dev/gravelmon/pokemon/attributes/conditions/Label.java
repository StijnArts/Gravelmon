package drai.dev.gravelmon.pokemon.attributes.conditions;

public enum Label {
    NOT_MODELED("not_modeled"),
    GEN1("gen1"),
    GEN2("gen2"),
    GEN3("gen3"),
    GEN4("gen4"),
    GEN5("gen5"),
    GEN6("gen6"),
    GEN7("gen7"),
    GEN8("gen8"),
    GEN9("gen9"),
    LEGENDARY("legenary"),
    SAGE("sage"),
    INFINITY("infinity"),
    ALOLA_REGIONAL("alola_regional"),
    KANTO_REGIONAL("kanto_regional"),
    GMAX("gmax"),
    INSURGENCE("insurgence"),
    XENOVERSE("xenoverse"),
    BLAZING_EMERALD("blazing_emerald"),
    VEGA("vega");
    private String name;
    Label(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
