package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tenchondri extends drai.dev.data.pokemon.Pokemon {
    public Tenchondri(Stats stats) {
        super("Tenchondri",
                Type.FAIRY,Type.GHOST,
                stats,
                List.of(Ability.DEFIANT,Ability.ROUGH_SKIN), Ability.MARVEL_SCALE,
                14, 810,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It feeds on lost souls, detected with its sensitive nose. If you find yourself besieged by one, throw a handful of pepper at it, and it will sneeze, sending it back where it came from."),
                List.of(),
                List.of(),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 35, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tenchondri");

    }


}
