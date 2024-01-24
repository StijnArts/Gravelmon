package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hornaval extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hornaval() {
        super("Hornaval",
                Type.ICE,Type.WATER,
                new Stats(80,
                        100,
                        70,
                        110,
                        70,
                        95),
                List.of(Ability.THICK_FAT,Ability.LIGHTNING_ROD,Ability.REFRIGERATE), Ability.REFRIGERATE,
                8, 165,
                new Stats(0,1,0,1,0,0), 60,
                0.5,
                187, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("The sturdy ice coating on its horn is surprisingly sturdy, making it safer to use it in combat. Because of this, it is not afraid to get into fights."),
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
           setLangFileName("Hornaval");

    }


}
