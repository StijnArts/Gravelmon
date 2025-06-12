package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hedgit extends drai.dev.data.pokemon.Pokemon {
    public Hedgit() {
        super("Hedgit",
                Type.GRASS, Type.STEEL,
                new Stats(30,
                        70,
                        80,
                        30,
                        45,
                        45),
                List.of(Ability.HYPER_CUTTER), Ability.CHLOROPHYLL,
                9, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("It loves trimming with its precise shear-like claw. This Pokemon is quite popular between gardeners and even hairdressers."),
                List.of(new EvolutionEntry("tropiary", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(             new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,20),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.CURSE,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,45),
                        new MoveLearnSetEntry(Move.EXPLOSION,50)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPRING)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE, SpawnPreset.FOLIAGE)
    .build(), List.of());
	
           setLangFileName("Hedgit");

    }


}
