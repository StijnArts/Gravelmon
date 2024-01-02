package drai.dev.gravelmon.pokemon.attributes;

public enum Aspect {
    ALOLAN("alolan",false,false),
    GALARIAN("galarian",false,false),
    HISUIAN("hisuian",false,false),
    PALDEAN("paldean",false,false),
    VALENCIAN("valencian",false,false),
    BLUE("blue", true, false),
    EXOTHERMIC("exothermic", true, false),
    COSPLAY("cosplay", false, false),
    WORLD("world", false, false),
    GMAX("gmax", false, false),
    STARTER("starter", false, false),
    PARTNER("partner", false, false),
    ALOLA("alola", false,false),
    KALOS("kalos", false, false),
    UNOVA("unova", false, false),
    SINNOH("sinnoh", false, false),
    HOENN("hoenn", false, false),
    ORIGINAL("original", false, false),
    LIBRE("libre", false, false),
    PHD("phd", false, false),
    POP_STAR("pop-star", false, false),
    BELLE("belle", false, false),
    ROCK_STAR("rock-star", false, false),
    MEGA("mega", false, false),
    ACTIVE("active", true, false),
    BLAZE_BOOST("blaze-boost", true, false),
    ARMORED("armored", true, false),
    MAGICIAN("magician", true, false),
    STORM("storm", true, false), 
    FAIRY("fairy", true,false),
    DRAGON("dragon", true, false),
    PSYCHIC("psychic", true, false),
    SOUND("sound", true, false),
    WATER("water", true, false),
    STEEL("steel", true, false),
    GROUND("ground", true, false),
    POISON("poison", true, false),
    ROCK("rock", true, false),
    GRASS("grass", true, false),
    FLYING("flying", true, false),
    FIGHTING("fighting", true, false),
    ELECTRIC("electric", true, false),
    DARK("dark", true, false),
    ICE("ice", true, false),
    GHOST("ghost", true, false),
    FIRE("fire", true, false),
    RED("red", true, false),
    GREEN("green", true, false),
    YELLOW("yellow", true, false),
    MONSTER("monster", true, false),
    SUMMER("summer", true, false),
    SCHOOL("school", true, false);
    private String name;
    private boolean isNew;
    private boolean isDefault;
    public boolean isNew() {
        return isNew;
    }
    public boolean isDefault(){
        return isDefault;
    }

    public String getName() {
        return name;
    }

    Aspect(String name, boolean isNew, boolean isDefault) {
        this.name = name;
        this.isNew = isNew;
        this.isDefault = isDefault;
    }
}
