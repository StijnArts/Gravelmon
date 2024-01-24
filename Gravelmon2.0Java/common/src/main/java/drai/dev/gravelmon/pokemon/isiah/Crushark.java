package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crushark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crushark() {
        super("Crushark",
                Type.WATER,Type.FIGHTING,
                new Stats(104,
                        102,
                        123,
                        87,
                        73,
                        46),
                List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(1,1,1,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Hydro CannonSTAB Water Water PledgeSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crushark");

    }


}
