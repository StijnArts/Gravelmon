package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Dracoknight extends drai.dev.data.pokemon.Pokemon {
    public Dracoknight() {
        super("Dracoknight",
                Type.DRAGON, Type.STEEL,
                new Stats(120,
                        80,
                        110,
                        100,
                        130,
                        60),
                List.of(Ability.BATTLE_ARMOR), Ability.MIRROR_ARMOR,
                26, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("The closest relative to Dragonite. Legends tell a story of dragons, forging their own armor with magical fire to protect themselves and its allies in great battles ahead."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,6),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,18),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,24),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,42),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,48),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,54),
                        new MoveLearnSetEntry(Move.METAL_BURST,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,66),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(55)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Dracoknight");

    }


}
