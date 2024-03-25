package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Symphy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Symphy() {
        super("Symphy",
                Type.ELECTRIC,Type.SOUND,
                new Stats(60,
                        55,
                        55,
                        80,
                        60,
                        100),
                List.of(Ability.STATIC,Ability.SOUNDWAVES), Ability.REVERB,
                4, 47,
                new Stats(0,0,0,2,0,0), 190,
                0.5,
                124, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Symphy can feel thunderstorms coming from many miles away. When it feels a storm coming, it climbs up a tree and sings a soothing song for the entire forest to hear. This lets other forest Pokémon know about the coming storm and also makes sure they are not afraid of it."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Symphy");

    }


}
