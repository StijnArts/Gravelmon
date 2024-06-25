package drai.dev.gravelmon.pokemon.attributes;

import java.util.*;

public class EvolutionEntry {
    String result;
    EvolutionType kind;
    boolean consumesHeldItem = false;
    private List<MoveLearnSetEntry> moves;
    private List<EvolutionRequirementEntry> requirements;
    private List<Aspect> aspects = new ArrayList<>();
    private String requiredContext;

    public EvolutionEntry(String result, EvolutionType kind, boolean consumesHeldItem, List<MoveLearnSetEntry> moves,
                          List<EvolutionRequirementEntry> requirements, List<Aspect> aspects, String requiredContext) {
        this.result = result;
        this.kind = kind;
        this.consumesHeldItem = consumesHeldItem;
        this.moves = moves;
        this.requirements = requirements;
        this.aspects = aspects;
        this.requiredContext = requiredContext;
    }

    public EvolutionEntry(String result, EvolutionType kind, boolean consumesHeldItem, List<MoveLearnSetEntry> moves,
                          List<EvolutionRequirementEntry> requirements, List<Aspect> aspects) {
        this.result = result;
        this.kind = kind;
        this.consumesHeldItem = consumesHeldItem;
        this.moves = moves;
        this.requirements = requirements;
        this.aspects = aspects;
    }

    public EvolutionEntry(String result, EvolutionType kind, List<MoveLearnSetEntry> moves,
                          List<EvolutionRequirementEntry> requirements, List<Aspect> aspects) {
        this.result = result;
        this.kind = kind;
        this.moves = moves;
        this.requirements = requirements;
        this.aspects = aspects;
    }

    public EvolutionEntry(String result, EvolutionType kind, List<MoveLearnSetEntry> moves,
                          List<EvolutionRequirementEntry> requirements) {
        this.result = result;
        this.kind = kind;
        this.moves = moves;
        this.requirements = requirements;
    }

    public EvolutionEntry(String result, EvolutionType kind, boolean consumesHeldItem, List<MoveLearnSetEntry> moves,
                          List<EvolutionRequirementEntry> requirements) {
        this.result = result;
        this.kind = kind;
        this.consumesHeldItem = consumesHeldItem;
        this.moves = moves;
        this.requirements = requirements;
    }

    public String getResult() {
        return result;
    }

    public EvolutionType getKind() {
        return kind;
    }

    public Boolean consumesHeldItem() {
        return consumesHeldItem;
    }

    public boolean hasMoves() {
        return !moves.isEmpty();
    }

    public List<MoveLearnSetEntry> getMoves() {
        return moves;
    }

    public List<EvolutionRequirementEntry> getRequirements() {
        return requirements;
    }

    public List<Aspect> getAspects() {
        return aspects;
    }

    public String getRequiredContext() {
        return requiredContext;
    }

    public void setResult(String s) {
        this.result = s;
    }
}
