package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kretozone extends drai.dev.data.pokemon.Pokemon {
    public Kretozone(Stats stats) {
        super("Kretozone",
                Type.FLYING,Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 920,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Arriving from distant space, it heralds the end of a dynasty. The flapping of its wings is said to rain down meteorites upon the land."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROUNDBREAK,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,1),
                        new MoveLearnSetEntry(Move.PUNISHMENT,1),
                        new MoveLearnSetEntry(Move.CLOUDCRASH,1),
                        new MoveLearnSetEntry(Move.STARSTREAM,1),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,1),
                        new MoveLearnSetEntry(Move.METEORSHOWER,1),
                        new MoveLearnSetEntry(Move.SINISTERTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOWFALL,"tm")                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Kretozone");

    }


}
