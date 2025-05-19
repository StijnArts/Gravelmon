package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fridgeraider extends drai.dev.data.pokemon.Pokemon {
    public Fridgeraider() {
        super("Fridgeraider",
                Type.ICE, Type.STEEL,
                new Stats(60,
                        100,
                        120,
                        40,
                        80,
                        80),
                List.of(Ability.VOLT_ABSORB,Ability.ANGER_POINT,Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Packs of Fridgeraider live only in the most desolate of ice floes, defending their turf fiercely. They launch massive ice blocks from their torso."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,7),
                        new MoveLearnSetEntry(Move.ROAR,10),
                        new MoveLearnSetEntry(Move.BLOCK,13),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.METAL_CLAW,24),
                        new MoveLearnSetEntry(Move.ICE_SHARD,30),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,36),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,42),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.AVALANCHE,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fridgeraider");

    }


}
