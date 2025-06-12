package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSlurpuff extends drai.dev.data.pokemon.Pokemon {
    public VesitanSlurpuff(String name, Aspect aspect) {
        super(name, aspect, "VesitanSlurpuff",
                Type.FAIRY,Type.FIRE,
                new Stats(90,
                        90,
                        86,
                        77,
                        90,
                        75),
                List.of(Ability.SWEET_VEIL,Ability.UNBURDEN), null,
                8, 50,
                new Stats(0,0,2,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Die Flamme auf seinem Kopf kann bis zu 685°C heiß werden. Es hilft deshalb oft in Konditoreien aus."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,36),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,65),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,17),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROUND,13),
                        new MoveLearnSetEntry(Move.SAFEGUARD,60),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,55),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,45),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.PLAY_NICE,8),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slurpuff");

    }


}
