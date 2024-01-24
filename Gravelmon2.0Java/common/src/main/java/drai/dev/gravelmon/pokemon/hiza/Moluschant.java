package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Moluschant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moluschant() {
        super("Moluschant",
                Type.DARK,Type.PSYCHIC,
                new Stats(74,
                        59,
                        100,
                        106,
                        80,
                        30),
                List.of(Ability.MAGICIAN), Ability.PROTEAN,
                8, 165,
                new Stats(0,0,1,1,0,0), 90,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its shell gives it power to use several elemental moves. If the shell is cracked those moves may backfire or come out as the wrong element."),
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
           setLangFileName("Moluschant");

    }


}
