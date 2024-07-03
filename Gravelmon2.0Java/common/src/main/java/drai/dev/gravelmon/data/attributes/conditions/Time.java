package drai.dev.gravelmon.data.attributes.conditions;

public enum Time {
    DAY("day"),
    NIGHT("night")
    ;
    Time(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
