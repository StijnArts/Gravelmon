package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Aqualisk extends drai.dev.data.pokemon.Pokemon {
    public Aqualisk() {
        super("Aqualisk",
                Type.WATER,
                new Stats(55,
                        60,
                        45,
                        60,
                        55,
                        55),
                List.of(Ability.TORRENT), Ability.MAGIC_BOUNCE,
                4, 165,
                new Stats(0,0,0,1,0,0), 80,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its paws are adhesive, which allow Aqualisk to climb both on walls and on the surface of water. It dives down when it is over a fish Pokemon to catch it."),
                List.of(new EvolutionEntry("pearlizz", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,8),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,21),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.CALM_MIND,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,46),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,50),
                        new MoveLearnSetEntry(Move.STORED_POWER,64),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,90)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
