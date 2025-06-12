package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Yeraze extends drai.dev.data.pokemon.Pokemon {
    public Yeraze() {
        super("Yeraze",
                Type.ICE, Type.FIRE,
                new Stats(60,
                        65,
                        60,
                        105,
                        85,
                        95),
                List.of(Ability.SOUNDPROOF,Ability.CONTRARY,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                17, 165,
                new Stats(0,0,0,2,0,1), 45,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("Yeraze are still deaf but they use their other senses to battle. Their sight is extremely impeccable, with sight that is better than humans. They can also sense vibrations occasionally digging their claws into the ground; this is also allows them to ground Electric attacks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,1),
                        new MoveLearnSetEntry(Move.HAZE,5),
                        new MoveLearnSetEntry(Move.FIRE_FANG,8),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,14),
                        new MoveLearnSetEntry(Move.FROST_BREATH,17),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,23),
                        new MoveLearnSetEntry(Move.BARRIER,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,51),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(26)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Yeraze");

    }


}
