package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
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
                15, 165,
                new Stats(0,0,2,0,0,0), 110,
                0.5,
                166, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It leads a relaxed lifestyle, aimlessly letting currents carry it away without a sole concern. Its not unusual for a Nutsy to have travelled through hundreds of kilometres in a lifetime."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MILK_DRINK,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.BARRAGE,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 11, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
