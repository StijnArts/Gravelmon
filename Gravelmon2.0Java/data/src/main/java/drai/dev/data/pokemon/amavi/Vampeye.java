package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vampeye extends drai.dev.data.pokemon.Pokemon {
    public Vampeye() {
        super("Vampeye",
                Type.GHOST, Type.DARK,
                new Stats(145,
                        80,
                        55,
                        95,
                        80,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,17),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,19),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,24),
                        new MoveLearnSetEntry(Move.COPYCAT,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.ENDEAVOR,34),
                        new MoveLearnSetEntry(Move.DOODLE,38),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.MIND_READER,45),
                        new MoveLearnSetEntry(Move.POLTERGEIST,49),
                        new MoveLearnSetEntry(Move.MEMENTO,55),
                        new MoveLearnSetEntry(Move.EPILOGUE,60)         ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 35, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
