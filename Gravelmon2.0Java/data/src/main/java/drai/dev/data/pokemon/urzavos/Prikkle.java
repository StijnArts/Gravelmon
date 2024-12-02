package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Prikkle extends drai.dev.data.pokemon.Pokemon {
    public Prikkle() {
        super("Prikkle",
                Type.GRASS, Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GRASSY_SURGE,Ability.ELECTRIC_SURGE), Ability.COMPETITIVE,
                4, 50,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Quick to anger, these 'Mons will barrage their foes with sharp quills charged with electricity."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Prikkle");

    }


}
