package drai.dev.gravelmon.pokemon.infinity;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kokiseed extends Pokemon {
    public Kokiseed() {
        super("Kokiseed",
                Type.GRASS,
                new Stats(45, 55, 55, 55, 60, 40),
                List.of(Ability.OWN_TEMPO, Ability.SCRAPPY), Ability.SOUNDPROOF,
                4, 60,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                52, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of("A small seed-like Pokémon that enjoys dancing at festivals. It scatters its leaves around for pizaz. It will sometimes try to imitate stronger Pokémon fighting."),
                List.of(new EvolutionEntry("kokipound", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.LEECH_SEED,6),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.COUNTER,19),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,29),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,42),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,44),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"egg"),
                        new MoveLearnSetEntry(Move.INGRAIN,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SLUDGE,"egg")
                        ),
                List.of(Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:seeds",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.18, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        this.setModeled(true);
        this.setBaseScale(0.7);
    }
}
