package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pearlizz extends drai.dev.data.pokemon.Pokemon {
    public Pearlizz() {
        super("Pearlizz",
                Type.WATER, Type.PSYCHIC,
                new Stats(75,
                        70,
                        60,
                        85,
                        80,
                        80),
                List.of(Ability.TORRENT), Ability.MAGIC_BOUNCE,
                10, 165,
                new Stats(0,0,0,0,2,0), 70,
                0.5,
                140, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It is impossible to separate it from the pearl it holds fiercely. When it has to move, it simply rolls the pearl along with it."),
                List.of(new EvolutionEntry("reptide", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))
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
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
