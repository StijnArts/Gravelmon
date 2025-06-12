package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Crysteavenly extends drai.dev.data.pokemon.Pokemon {
    public Crysteavenly() {
        super("Crysteavenly",
                Type.BUG, Type.PSYCHIC,
                new Stats(70,
                        58,
                        50,
                        137,
                        94,
                        72),
                List.of(Ability.CURIOUS_MEDICINE), Ability.CURIOUS_MEDICINE,
                14, 165,
                new Stats(0,0,0,3,0,0), 50,
                0.5,
                220, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Crysteavenly use their shimmering wings to alter light in subtle ways that allow them to hypnotize their prey. Each Chrysteavenly has a one-of-a-kind pattern on its wings, it is said that the seemingly random sequence of colors is actually a code containing their unique personalities and emotions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.PSYWAVE,14),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,39),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,45),
                        new MoveLearnSetEntry(Move.PSYCHIC,49),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,52),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crysteavenly");

    }


}
