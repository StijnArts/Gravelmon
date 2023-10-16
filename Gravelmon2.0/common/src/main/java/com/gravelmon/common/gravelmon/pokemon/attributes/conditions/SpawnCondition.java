package com.gravelmon.common.gravelmon.pokemon.attributes.conditions;

public class SpawnCondition {
    private SpawnConditionType conditionType;
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
