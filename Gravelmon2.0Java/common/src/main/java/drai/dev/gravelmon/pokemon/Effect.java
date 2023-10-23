package drai.dev.gravelmon.pokemon;

public enum Effect {
    SLOW_FALL("slow_fall");
    private String name;
    Effect(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
