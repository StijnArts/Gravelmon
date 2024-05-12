package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Gingerbeard extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gingerbeard() {
        super("Gingerbeard",
                Type.FAIRY, Type.DARK,
                new Stats(70,
                        105,
                        75,
                        55,
                        110,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 50,
                new Stats(0,1,0,0,0,1), 60,
                0.0,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.TORMENT,7),
                        new MoveLearnSetEntry(Move.ASTONISH,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK,23),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,29),
                        new MoveLearnSetEntry(Move.QUASH,31),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,53),
                        new MoveLearnSetEntry(Move.MEMENTO,59),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,67),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,73)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
           setLangFileName("Gingerbeard");

    }


}
