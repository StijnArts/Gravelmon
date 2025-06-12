package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phisnooz extends Pokemon {
    public Phisnooz() {
        super("Phisnooz",
                Type.ICE, Type.PSYCHIC,
                new Stats(40,
                        60,
                        50,
                        50,
                        20,
                        40),
                List.of(Ability.SMOKE_AND_MIRRORS, Ability.SYNCHRONIZE), Ability.INSOMNIA,
                10, 324,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("By waving their trunk, Phisnooz emit psychic waves that can put people to sleep in mere seconds. In a previous time they were the prey of Vaicear."),
                List.of(new EvolutionEntry("telemac", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_BALL,13),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.PSYCHIC,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.BLIZZARD,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,50),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .setAntiBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
