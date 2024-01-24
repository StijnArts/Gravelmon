package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nutsy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nutsy() {
        super("Nutsy",
                Type.GRASS,
                new Stats(67,
                        74,
                        133,
                        61,
                        67,
                        73),
                List.of(Ability.ROCK_HEAD,Ability.KLUTZ,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                166, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It leads a relaxed lifestyle, aimlessly letting currents carry it away without a sole concern. Its not unusual for a Nutsy to have travelled through hundreds of kilometres in a lifetime."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BARRAGE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nutsy");

    }


}
