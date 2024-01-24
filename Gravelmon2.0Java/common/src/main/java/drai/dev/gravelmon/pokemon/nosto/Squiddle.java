package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Squiddle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squiddle() {
        super("Squiddle",
                Type.FIRE,
                new Stats(52,
                        32,
                        53,
                        67,
                        54,
                        52),
                List.of(Ability.BLAZE), Ability.LIQUID_OOZE,
                8, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("- Tackle Normal 4 Leer Normal 7 EmberSTAB Fire 11 Smog Poison 13 Smokescreen Normal 16 Flame BurstSTAB Fire 21 Acid Spray Poison 26 Toxic Poison 32 Corrosive Gas Poison 35 FlamethrowerSTAB Fire 39 Sludge Bomb Poison 42 Will-O-Wisp Fire 47 Dark Pulse Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOG,11),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,13),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.TOXIC,26),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,39),
                        new MoveLearnSetEntry(Move.WILLOWISP,42),
                        new MoveLearnSetEntry(Move.DARK_PULSE,47)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squiddle");

    }


}
