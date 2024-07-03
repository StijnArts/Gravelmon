package drai.dev.gravelmon.data.attributes.conditions;

public class SpawnCondition {
    private drai.dev.gravelmon.data.attributes.conditions.SpawnConditionType conditionType;
    private String condition;

    public SpawnCondition(SpawnConditionType conditionType, String condition) {
        this.conditionType = conditionType;
        this.condition = condition;
    }

    public SpawnConditionType getConditionKind() {
        return conditionType;
    }

    public String getCondition() {
        return condition;
    }
}
