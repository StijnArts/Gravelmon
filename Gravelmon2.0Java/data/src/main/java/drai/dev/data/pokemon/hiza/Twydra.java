package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Twydra extends drai.dev.data.pokemon.Pokemon {
    public Twydra() {
        super("Twydra",
                Type.FIRE, Type.ICE,
                new Stats(102,
                        72,
                        72,
                        102,
                        92,
                        92),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 165,
                new Stats(0,0,0,2,0,0), 20,
                0.5,
                248, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Twydra's two heads are capable of perfectly synchronizing their moves, when their breath attacks cross together it results in a violent explosion."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_FANG,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"egg")                ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING, Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Twydra");

    }


}
