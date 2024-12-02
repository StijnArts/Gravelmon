package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianHonchkrow extends drai.dev.data.pokemon.Pokemon {
    public HizianHonchkrow(String name, Aspect aspect) {
        super(name, aspect, "Honchkrow",
                Type.FLYING, Type.GRASS,
                new Stats(90,
                        125,
                        52,
                        105,
                        52,
                        81),
                List.of(Ability.QUICK_DRAW), Ability.QUICK_DRAW,
                9, 165,
                new Stats(0,2,0,0,0,0), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When it challenges other Honchkrow to a duel, the winner earns the respect of all the Murkrow, while the loser has to leave the region forever."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,3),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.PECK,9),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.SYNTHESIS,18),
                        new MoveLearnSetEntry(Move.PLUCK,21),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,27),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,30),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,33),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,36)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 41, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honchkrow");
setCanFly(true);
    }


}
