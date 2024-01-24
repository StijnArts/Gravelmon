package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Narpoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Narpoon() {
        super("Narpoon",
                Type.ICE,Type.WATER,
                new Stats(60,
                        60,
                        30,
                        60,
                        30,
                        30),
                List.of(Ability.THICK_FAT,Ability.LIGHTNING_ROD,Ability.REFRIGERATE), Ability.REFRIGERATE,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("The large horn on its head is used to drill through layers of ice in order to surface. They like digging underwater making large submerged caves."),
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
           setLangFileName("Narpoon");

    }


}
