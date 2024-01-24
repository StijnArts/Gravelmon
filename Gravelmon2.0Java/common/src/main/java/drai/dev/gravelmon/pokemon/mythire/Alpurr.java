package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Alpurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Alpurr() {
        super("Alpurr",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ANALYTIC,Ability.KEEN_EYE,Ability.MOUNTAINEER), Ability.MOUNTAINEER,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of("Alpurr lives high in the mountains, chasing prey into higher altitudes to overexert it. Its fur has sharp, bristly edges, so petting it isn't recommended without protective gloves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alpurr");

    }


}
