package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Snaptrap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snaptrap() {
        super("Snaptrap",
                Type.STEEL,
                new Stats(40,
                        80,
                        130,
                        30,
                        55,
                        10),
                List.of(Ability.HYPER_CUTTER), Ability.STURDY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Snaptrap are masters of stealth; they will bury their bodies flat out under the sand, completely still. With their pink fleshy middle exposed, they snap shut on curious intruders."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snaptrap");

    }


}
