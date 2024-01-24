package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Molcarona extends drai.dev.gravelmon.pokemon.Pokemon {
    public Molcarona() {
        super("Molcarona",
                Type.PSYCHIC,Type.WATER,
                new Stats(85,
                        60,
                        65,
                        135,
                        105,
                        100),
                List.of(Ability.SHELL_ARMOR,Ability.HYDRATION,Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its shape and illuminative abilities are oddly similar to Volcarona. It appears as a hypnotically beautiful nebula in the ocean abyss as it surrounds the onlooker with its tentacles to attack"),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Molcarona");

    }


}
