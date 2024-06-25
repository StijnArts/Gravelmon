package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Savark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Savark() {
        super("Savark",
                Type.GRASS, Type.NORMAL,
                new Stats(88,
                        115,
                        80,
                        52,
                        70,
                        91),
                List.of(Ability.UNNERVE,Ability.PICKUP), Ability.VERMILINGUA,
                21, 946,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Savark live on a diet of solely Bug-type Pokémon. Once it sees one, it will not stop hunting it down until either the bug or itself goes down."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 43, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Savark");

    }


}
