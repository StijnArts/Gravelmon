package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hematick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hematick() {
        super("Hematick",
                Type.BUG,Type.POISON,
                new Stats(50,
                        60,
                        45,
                        30,
                        70,
                        60),
                List.of(Ability.KEEN_EYE,Ability.RUN_AWAY,Ability.POWERLEECH), Ability.POWERLEECH,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It feeds on the blood of any big Pokémon it latches onto without them noticing. It will not let go until it's full."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,5),
                        new MoveLearnSetEntry(Move.ANTICOAGULANT,8),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.BUG_BITE,27),
                        new MoveLearnSetEntry(Move.SCREECH,31),
                        new MoveLearnSetEntry(Move.HEMODRAIN,35),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.ABSORB,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hematick");

    }


}
