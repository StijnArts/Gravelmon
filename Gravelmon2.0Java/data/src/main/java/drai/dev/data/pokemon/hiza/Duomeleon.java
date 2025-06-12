package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Duomeleon extends drai.dev.data.pokemon.Pokemon {
    public Duomeleon() {
        super("Duomeleon",
                Type.FIRE, Type.ICE,
                new Stats(72,
                        42,
                        42,
                        72,
                        62,
                        62),
                List.of(Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                7, 165,
                new Stats(0,0,0,1,0,0), 60,
                0.5,
                72, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("It is said that in the past it was only able to control one of the two elements, but after several climate changes its body became unstable."),
                List.of(new EvolutionEntry("twydra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))
                ),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING, Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Duomeleon");

    }


}
