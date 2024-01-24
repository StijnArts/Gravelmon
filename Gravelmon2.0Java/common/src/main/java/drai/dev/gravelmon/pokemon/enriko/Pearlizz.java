package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pearlizz extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pearlizz() {
        super("Pearlizz",
                Type.WATER,Type.PSYCHIC,
                new Stats(75,
                        70,
                        60,
                        85,
                        80,
                        80),
                List.of(Ability.TORRENT), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,2,0), 70,
                0.5,
                140, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It is impossible to separate it from the pearl it holds fiercely. When it has to move, it simply rolls the pearl along with it."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pearlizz");

    }


}
