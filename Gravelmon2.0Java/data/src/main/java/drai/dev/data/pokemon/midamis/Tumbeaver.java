package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tumbeaver extends drai.dev.data.pokemon.Pokemon {
    public Tumbeaver() {
        super("Tumbeaver",
                Type.NORMAL,
                new Stats(80,
                        75,
                        70,
                        65,
                        65,
                        55),
                List.of(Ability.OBLIVIOUS), Ability.SIMPLE,
                7, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Tumbeaver roll around all day, it is in fact, one of the few things they do, if a Tumbeaver doesn't get stopped by an occasional tree or rock it can become a very devestating ball that wrecks everything in it's path."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,7),
                        new MoveLearnSetEntry(Move.HEADBUTT,11)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tumbeaver");

    }


}
