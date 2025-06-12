package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Birdler extends drai.dev.data.pokemon.Pokemon {
    public Birdler() {
        super("Birdler",
                Type.FLYING,
                new Stats(45,
                        50,
                        55,
                        60,
                        57,
                        68),
                List.of(Ability.UNBURDEN,Ability.PICKPOCKET,Ability.INFILTRATOR), Ability.INFILTRATOR,
                6, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When Tweetler wags its tail feathers, it gives off a signal that the coast is clear. This Pokemon is obsessed with shiny objects; it will go far in order to retrieve what it is looking for."),
                List.of(new EvolutionEntry("magpyja", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(      new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,6),
                        new MoveLearnSetEntry(Move.SCREECH,12),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,23),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,28),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,31),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.SNATCH,39),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.DRILL_PECK,54),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,60)                  ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .setAntiBiomes(Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
