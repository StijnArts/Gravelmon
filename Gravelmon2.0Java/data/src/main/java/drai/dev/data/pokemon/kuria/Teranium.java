package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Teranium extends drai.dev.data.pokemon.Pokemon {
    public Teranium() {
        super("Teranium",
                Type.WATER, Type.STEEL,
                new Stats(91,
                        119,
                        82,
                        88,
                        105,
                        70),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                55, 1421,
                new Stats(0,1,0,0,1,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,17),
                        new MoveLearnSetEntry(Move.MINIMIZE,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,24),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,28),
                        new MoveLearnSetEntry(Move.ENDURE,32),
                        new MoveLearnSetEntry(Move.METAL_BURST,37),
                        new MoveLearnSetEntry(Move.AQUA_RING,41),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,45),
                        new MoveLearnSetEntry(Move.SOAK,50),
                        new MoveLearnSetEntry(Move.ENDEAVOR,55)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Teranium");

    }


}
