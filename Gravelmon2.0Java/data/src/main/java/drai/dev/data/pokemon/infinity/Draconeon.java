package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Draconeon extends Pokemon {
    public Draconeon() {
            super("Draconeon",
                    Type.DRAGON,
                    new Stats(80, 127, 80, 70, 50, 118),
                    List.of(Ability.TOUGH_CLAWS), Ability.MULTISCALE,
                    13, 250,
                    new Stats(0,2,0,0,0,1), 45,
                    0.5,
                    184, ExperienceGroup.MEDIUM_FAST,
                    70,
                    35, List.of(EggGroup.FIELD),
                    List.of("Draconeon are considered exotic and are rarely seen outside of Blackthorn City in Johto. Though smaller than most dragons, Draconeon are fierce and passionate."),
                    List.of(),
                    List.of(
                            new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                            new MoveLearnSetEntry(Move.HELPING_HAND,1),
                            new MoveLearnSetEntry(Move.TACKLE,1),
                            new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                            new MoveLearnSetEntry(Move.HOWL,5),
                            new MoveLearnSetEntry(Move.WRAP,6),
                            new MoveLearnSetEntry(Move.TWISTER,6),
                            new MoveLearnSetEntry(Move.HORN_ATTACK,13),
                            new MoveLearnSetEntry(Move.AQUA_RING,16),
                            new MoveLearnSetEntry(Move.DRAGON_BREATH,20),
                            new MoveLearnSetEntry(Move.NIGHT_SLASH,22),
                            new MoveLearnSetEntry(Move.SCARY_FACE,23),
                            new MoveLearnSetEntry(Move.CRUSH_CLAW,29),
                            new MoveLearnSetEntry(Move.DUAL_CHOP,31),
                            new MoveLearnSetEntry(Move.DRAGON_TAIL,36),
                            new MoveLearnSetEntry(Move.REFRESH,41),
                            new MoveLearnSetEntry(Move.FALSE_SWIPE,44),
                            new MoveLearnSetEntry(Move.ANCIENT_POWER,49),
                            new MoveLearnSetEntry(Move.DRAGON_DANCE,56),
                            new MoveLearnSetEntry(Move.OUTRAGE,64),
                            new MoveLearnSetEntry(Move.DRAGON_RUSH,76),
                            new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                            new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                            new MoveLearnSetEntry(Move.TOXIC,"tm"),
                            new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                            new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                            new MoveLearnSetEntry(Move.PROTECT,"tm"),
                            new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                            new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                            new MoveLearnSetEntry(Move.THUNDER,"tm"),
                            new MoveLearnSetEntry(Move.RETURN,"tm"),
                            new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                            new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                            new MoveLearnSetEntry(Move.FACADE,"tm"),
                            new MoveLearnSetEntry(Move.REST,"tm"),
                            new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                            new MoveLearnSetEntry(Move.ROUND,"tm"),
                            new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                            new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                            new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                            new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                            new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                            new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                            new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                            new MoveLearnSetEntry(Move.UTURN,"tm"),
                            new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                            new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                            new MoveLearnSetEntry(Move.CUT,"tm"),
                            new MoveLearnSetEntry(Move.SURF,"tm"),
                            new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                            new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                            new MoveLearnSetEntry(Move.DIVE,"tm"),
                            new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                            new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                            new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                            new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                            new MoveLearnSetEntry(Move.CHARM,"egg"),
                            new MoveLearnSetEntry(Move.COVET,"egg"),
                            new MoveLearnSetEntry(Move.CURSE,"egg"),
                            new MoveLearnSetEntry(Move.DETECT,"egg"),
                            new MoveLearnSetEntry(Move.ENDURE,"egg"),
                            new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                            new MoveLearnSetEntry(Move.FLAIL,"egg"),
                            new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                            new MoveLearnSetEntry(Move.STORED_POWER,"egg"),
                            new MoveLearnSetEntry(Move.SYNCHRONOISE,"egg"),
                            new MoveLearnSetEntry(Move.TICKLE,"egg"),
                            new MoveLearnSetEntry(Move.WISH,"egg"),
                            new MoveLearnSetEntry(Move.YAWN,"egg")
                    ),
                    List.of(Label.INFINITY),
                    0, List.of(
                    ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                            new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                            new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                            new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                    ), List.of(),
                    List.of(SpawnPreset.NATURAL),
                    0.24, 0.3,
                    List.of());

            this.setModeled(true);
            this.setBaseScale(0.8);
            this.setPreEvolution("eevee");
        addAdditionalEvolution("eevee", new EvolutionEntry("draconeon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.DRAGON_CLAW, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:dragon_scale"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night"))));
        }
}
