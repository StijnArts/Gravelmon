package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bobin extends drai.dev.data.pokemon.Pokemon {
    public Bobin() {
        super("Bobin",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        58,
                        37,
                        30,
                        38,
                        62),
                List.of(Ability.KEEN_EYE,Ability.PICKUP), Ability.RIVALRY,
                3, 18,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Bobin live in large, urban settlements to forage and socialize with other Bobin. Its chest feathers are dense enough to store random trinkets that it finds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.PECK,7),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bobin");

    }


}