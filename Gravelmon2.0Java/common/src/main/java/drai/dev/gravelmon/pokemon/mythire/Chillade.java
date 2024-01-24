package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chillade extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chillade() {
        super("Chillade",
                Type.ICE,Type.STEEL,
                new Stats(40,
                        55,
                        80,
                        40,
                        75,
                        30),
                List.of(Ability.BOMBARDIER,Ability.BATTLE_ARMOR,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Fling Dark - Bolt InSTAB Steel - Icy ChargeSTAB Ice - Powder SnowSTAB Ice - Ice ShardSTAB Ice - Play Nice Normal - Court Change Normal - Triple AxelSTAB Ice - Self-Destruct Normal - Explosion Normal 22 Magnet BombSTAB Steel 28 Snow GrenadeSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.SNOWGRENADE,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REBOUNDSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chillade");

    }


}
