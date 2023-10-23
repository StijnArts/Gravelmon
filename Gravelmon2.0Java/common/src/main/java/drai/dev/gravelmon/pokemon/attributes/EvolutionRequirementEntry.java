package drai.dev.gravelmon.pokemon.attributes;

public class EvolutionRequirementEntry {
    String condition;
    String requirementKind;
    String conditionParameter;

    public EvolutionRequirementEntry(EvolutionRequirementCondition condition, String conditionParameter) {
        this.condition = condition.getCondition();
        this.requirementKind = condition.getName();
        this.conditionParameter = conditionParameter;
    }

    public String getRequirementKind() {
        return requirementKind;
    }

    public String getCondition() {
        return condition;
    }

    public String getConditionParameter() {
        return conditionParameter;
    }
}
