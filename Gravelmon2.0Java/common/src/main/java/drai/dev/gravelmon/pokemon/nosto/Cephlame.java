package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cephlame extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cephlame() {
        super("Cephlame",
                Type.FIRE,Type.POISON,
                new Stats(87,
                        67,
                        82,
                        125,
                        102,
                        72),
                List.of(Ability.BLAZE), Ability.LIQUID_OOZE,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Evo Toxic FumesSTAB Poison - Sludge WaveSTAB Poison - Scald Water - Heat WaveSTAB Fire - Toxic Spikes Poison - Burn UpSTAB Fire - Tackle Normal - Leer Normal 7 EmberSTAB Fire 12 Clear SmogSTAB Poison 16 Flame BurstSTAB Fire 21 Acid SpraySTAB Poison 26 Toxic Poison 33 Corrosive Gas Poison 35 FlamethrowerSTAB Fire 39 Sludge BombSTAB Poison 42 Will-O-Wisp Fire 47 Dark Pulse Dark 50 Fire BlastSTAB Fire 54 Light Up Fire 60 Sludge WaveSTAB Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,12),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.TOXIC,26),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,33),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,39),
                        new MoveLearnSetEntry(Move.WILLOWISP,42),
                        new MoveLearnSetEntry(Move.DARK_PULSE,47),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,50),
                        new MoveLearnSetEntry(Move.LIGHTUP,54),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,60)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cephlame");

    }


}
