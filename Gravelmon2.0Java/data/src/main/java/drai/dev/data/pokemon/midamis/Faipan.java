package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Faipan extends drai.dev.data.pokemon.Pokemon {
    public Faipan() {
        super("Faipan",
                Type.FIRE, Type.DARK,
                new Stats(90,
                        75,
                        90,
                        90,
                        90,
                        100),
                List.of(Ability.DARK_AURA), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.ENDURE,9),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,13),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.SMOG,19),
                        new MoveLearnSetEntry(Move.ROLLOUT,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,27),
                        new MoveLearnSetEntry(Move.ASSURANCE,31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,33),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,37),
                        new MoveLearnSetEntry(Move.ROAR,39),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,43)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Faipan");

    }


}
