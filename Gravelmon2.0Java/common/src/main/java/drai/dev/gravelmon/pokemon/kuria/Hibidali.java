package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hibidali extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hibidali() {
        super("Hibidali",
                Type.GRASS, Type.LIGHT,
                new Stats(90,
                        95,
                        60,
                        60,
                        80,
                        95),
                List.of(Ability.HARVEST,Ability.LEAF_GUARD), Ability.FERTILEGIFTS,
                11, 130,
                new Stats(0,1,0,0,0,1), 45,
                0.0,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("Hibidali go from forest to forest to find Pokémon in need and give them one of their berries, as they remember how berries made them grow into what they are now."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,3),
                        new MoveLearnSetEntry(Move.LEAFAGE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,48)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hibidali");

    }


}
