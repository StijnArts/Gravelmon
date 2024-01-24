package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fowlkly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fowlkly() {
        super("Fowlkly",
                Type.PSYCHIC,Type.FLYING,
                new Stats(43,
                        43,
                        53,
                        70,
                        53,
                        40),
                List.of(Ability.HUSTLE), Ability.IMMUNITY,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Its not very intelligent but has impressive psychic abilities. Its own psychic moves will often cause it to get confused."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fowlkly");

    }


}
