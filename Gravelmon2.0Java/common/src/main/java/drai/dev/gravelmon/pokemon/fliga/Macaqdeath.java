package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Macaqdeath extends drai.dev.gravelmon.pokemon.Pokemon {
    public Macaqdeath() {
        super("Macaqdeath",
                Type.GHOST,Type.FAIRY,
                new Stats(80,
                        56,
                        81,
                        100,
                        113,
                        51),
                List.of(Ability.PRANKSTER,Ability.PLOTTWIST), Ability.ANALYTIC,
                12, 203,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                169, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Upon receiving a skull helmet of another Aipom, Fligian Aipom grow incredibly introspective and morose, evolving into Macaqdeath. Their creativity with music is translated into morbid theatrics with haunting soliloquies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LAST_RESPECTS,1),
                        new MoveLearnSetEntry(Move.ROYALDECREE,1),
                        new MoveLearnSetEntry(Move.EPILOGUE,1),
                        new MoveLearnSetEntry(Move.PHANTOMHAND,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,5),
                        new MoveLearnSetEntry(Move.ASTONISH,9),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,16),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,32),
                        new MoveLearnSetEntry(Move.DECORATE,36),
                        new MoveLearnSetEntry(Move.BITTER_MALICE,40),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,44),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,48),
                        new MoveLearnSetEntry(Move.MOONLIGHT,52),
                        new MoveLearnSetEntry(Move.ENCORE,56),
                        new MoveLearnSetEntry(Move.MOONBLAST,60),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.FLATTER,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Macaqdeath");

    }


}
