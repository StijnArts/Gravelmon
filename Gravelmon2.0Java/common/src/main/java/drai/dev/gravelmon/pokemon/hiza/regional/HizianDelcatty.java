package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianDelcatty extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianDelcatty() {
        super("Delcatty",
                Type.FAIRY,
                new Stats(70,
                        65,
                        65,
                        55,
                        55,
                        90),
                List.of(Ability.FLUFFY), Ability.FLUFFY,
                8, 165,
                new Stats(0,0,0,0,0,2), 60,
                0.25,
                140, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("It will actively groom itself whenever it thinks its dirty. If another Pokémon touches their fur, they will spend most of the day cleaning themselves."),
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
           setLangFileName("Delcatty");

    }


}
