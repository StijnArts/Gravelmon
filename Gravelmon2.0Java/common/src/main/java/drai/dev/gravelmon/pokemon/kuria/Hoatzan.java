package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hoatzan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoatzan() {
        super("Hoatzan",
                Type.POISON, Type.FLYING,
                new Stats(65,
                        65,
                        65,
                        65,
                        65,
                        65),
                List.of(Ability.POISON_POINT,Ability.STENCH), Ability.CLOUD_NINE,
                5, 166,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,22),
                        new MoveLearnSetEntry(Move.FLING,26),
                        new MoveLearnSetEntry(Move.ROOST,32),
                        new MoveLearnSetEntry(Move.FLY,36),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,42),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,46),
                        new MoveLearnSetEntry(Move.BELCH,52)          ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 58, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoatzan");

    }


}
