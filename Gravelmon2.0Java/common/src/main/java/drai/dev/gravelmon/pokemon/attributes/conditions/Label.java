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
    LEGENDARY("legendary"),
    SAGE("sage"),
    INFINITY("infinity"),
    ALOLA_REGIONAL("alola_regional"),
    KANTO_REGIONAL("kanto_regional"),
    GMAX("gmax"),
    INSURGENCE("insurgence"),
    XENOVERSE("xenoverse"),
    BLAZING_EMERALD("blazing_emerald"),
    VEGA("vega"),
    FAKEMON("fakemon"),
    EEVEELUTION("eeveelution"),
    FAKEMON_EVOLUTION("fakemonevolution"),
    RADICAL_RED("radicalred"),
    MYTHICAL("mythical"),
    DAYBREAK("daybreak"),
    PHOENIX_RISING("phoenix_rising"),
    FLUX("flux"),
    MYTH("myth"),
    LOCKEMON("lockemon"),
    VANGUARD("vanguard"),
    URANIUM("uranium"),
    REALIDEA_SYSTEM("realidea_system"),
    AZURE("azure"),
    OPAL("opal"),
    ETERNAL_FOREST("eternal_forest"),
    UMBRA("umbra"),
    DENEB("deneb"),
    ATLAS("atlas"),
    AVORIS("avoris"),
    ENRIKO("enriko"),
    FERROA("ferroa"),
    INTERREGIONAL("interregional"),
    JUNNIN("junnin"),
    LONAVA("lonava"),
    MYTHIRE("mythire"),
    NOVRAI("novrai"), OKENO("okeno"), OROHNHAVAI("orohnhavai"), QAMOR("qamor"), VARITAS("varitas"), RICA("rica"), MIDAMIS("midamis"), NORHEIM("norheim"), ARISTOS("aristos"), HIZA("hiza"), NOSTO("nosto"), HUB("hub"), ISIAH("isiah"), OCEANE("oceane"), JOKE("joke"), MISSING("missing");
    private String name;
    Label(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
