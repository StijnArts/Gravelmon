package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cryoptera extends drai.dev.data.pokemon.Pokemon {
    public Cryoptera(Stats stats) {
        super("Cryoptera",
                Type.ELECTRIC, Type.ICE,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                13, 670,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.SKY_DROP,1),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,1),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,1),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,1),
                        new MoveLearnSetEntry(Move.LIGHTUP,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ELECTROWEB,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Cryoptera");

    }


}
