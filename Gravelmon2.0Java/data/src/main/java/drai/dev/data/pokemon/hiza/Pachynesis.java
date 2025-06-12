package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pachynesis extends drai.dev.data.pokemon.Pokemon {
    public Pachynesis() {
        super("Pachynesis",
                Type.PSYCHIC,
                new Stats(50,
                        30,
                        70,
                        55,
                        55,
                        20),
                List.of(Ability.TELEPATHY,Ability.SYNCHRONIZE,Ability.OVERCOAT), Ability.OVERCOAT,
                10, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pachynesis are said to be able to float using their large ears as wings, but they actually float using their telekinetic powers."),
                List.of(new EvolutionEntry("sagephant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.KINESIS,5),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,7),
                        new MoveLearnSetEntry(Move.PSYBEAM,12),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,18),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,25),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.CALM_MIND,33),
                        new MoveLearnSetEntry(Move.PSYCHIC,37),
                        new MoveLearnSetEntry(Move.PSYCH_UP,41),
                        new MoveLearnSetEntry(Move.RECOVER,57)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pachynesis");

    }


}
