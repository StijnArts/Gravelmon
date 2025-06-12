package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Folida extends drai.dev.data.pokemon.Pokemon {
    public Folida() {
        super("Folida",
                Type.GRASS, Type.NORMAL,
                new Stats(58,
                        75,
                        50,
                        26,
                        50,
                        55),
                List.of(Ability.UNNERVE,Ability.PICKUP), Ability.VERMILINGUA,
                6, 69,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                77, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Folida often plays with its food as if it were a toy. Even when hunting for food, it always finds a way to make it fun for itself."),
                List.of(new EvolutionEntry("savark", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.BULLET_SEED,9),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,16),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,29),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,35),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,39),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,44),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,52)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Folida");

    }


}
