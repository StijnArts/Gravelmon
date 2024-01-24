package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Argoceane extends drai.dev.gravelmon.pokemon.Pokemon {
    public Argoceane() {
        super("Argoceane",
                Type.FAIRY,Type.PSYCHIC,
                new Stats(105,
                        90,
                        100,
                        125,
                        160,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's been credited with the creation of all ocean life. Whenever there is a mass extinction, it pours out with recovery and diversification. Its large, cornucopian shell is always brimming with life energy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VITALTIDE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Argoceane");

    }


}
