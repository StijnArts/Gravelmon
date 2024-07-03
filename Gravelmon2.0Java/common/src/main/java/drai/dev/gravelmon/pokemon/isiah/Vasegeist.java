package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Vasegeist extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vasegeist() {
        super("Vasegeist",
                Type.GHOST,
                new Stats(65,
                        95,
                        87,
                        54,
                        111,
                        87),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,18),
                        new MoveLearnSetEntry(Move.POISON_FANG,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.HYPNOSIS,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.PUNISHMENT,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,53),
                        new MoveLearnSetEntry(Move.MEMENTO,57),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,62)                 ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 64, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Vasegeist");

    }


}
