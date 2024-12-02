package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Simburn extends drai.dev.data.pokemon.Pokemon {
    public Simburn() {
        super("Simburn",
                Type.FIRE,
                new Stats(50,
                        55,
                        35,
                        55,
                        30,
                        55),
                List.of(Ability.INTIMIDATE,Ability.RIVALRY), Ability.MOXIE,
                4, 90,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Simburn have a big appetite for fighting. Because of this they often attack pokemon that are bigger then themselves."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Simburn");

    }


}
