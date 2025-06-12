package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Puffard extends drai.dev.data.pokemon.Pokemon {
    public Puffard() {
        super("Puffard",
                Type.WATER, Type.FLYING,
                new Stats(65,
                        65,
                        55,
                        85,
                        75,
                        60),
                List.of(Ability.TORRENT,Ability.BIG_PECKS,Ability.STORMSTREAM), Ability.STORMSTREAM,
                8, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Puffard, a brave storm chaser. Risking getting hit by lightning won't stop it from flying into the dark clouds of the ocean skies."),
                List.of(new EvolutionEntry("pelasquall", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(            new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,42)            ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
