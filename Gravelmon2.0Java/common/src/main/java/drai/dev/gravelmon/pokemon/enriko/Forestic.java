package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Forestic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Forestic() {
        super("Forestic",
                Type.NORMAL,
                new Stats(75,
                        95,
                        135,
                        55,
                        120,
                        20),
                List.of(Ability.CLEAR_BODY,Ability.IMMUNITY,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                24, 165,
                new Stats(0,0,0,0,2,0), 85,
                0.5,
                140, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("It is comfortable in the sand or floating above the water. They are known to ferry people from island to island."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.FACADE,25),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,30),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,37),
                        new MoveLearnSetEntry(Move.GLARE,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.MIMIC,59),
                        new MoveLearnSetEntry(Move.POWER_WHIP,64)                  ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 39, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPARSE, Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Forestic");

    }


}
