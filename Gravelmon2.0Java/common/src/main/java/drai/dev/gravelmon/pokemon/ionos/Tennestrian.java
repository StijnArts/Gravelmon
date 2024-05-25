package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tennestrian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tennestrian() {
        super("Tennestrian",
                Type.GHOST, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IRON_FIST), Ability.SAND_VEIL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ancient paintings has shown different Pokémon of matching size wearing this kind of armor, such as Machop. Many examples were made long ago, before the Ionian war. It used to be polished and clean but after thousands of years it has gotten rusty and covered in dust and sand. It is said that a restless spirit lives inside the armor itself, perhaps from a Pokémon that once wore the armor in battle."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tennestrian");

    }


}
