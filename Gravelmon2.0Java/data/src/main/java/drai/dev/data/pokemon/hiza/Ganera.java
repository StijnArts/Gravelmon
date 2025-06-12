package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ganera extends drai.dev.data.pokemon.Pokemon {
    public Ganera() {
        super("Ganera",
                Type.PSYCHIC,
                new Stats(92,
                        80,
                        125,
                        95,
                        90,
                        48),
                List.of(Ability.TELEPATHY,Ability.SYNCHRONIZE,Ability.OVERCOAT), Ability.OVERCOAT,
                20, 165,
                new Stats(1,0,2,0,0,0), 50,
                0.5,
                210, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ganera can live up to 200 years. The elders never forget a face or event that happened in the past."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,1),
                        new MoveLearnSetEntry(Move.KINESIS,5),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,7),
                        new MoveLearnSetEntry(Move.PSYBEAM,12),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,18),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,25),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,30),
                        new MoveLearnSetEntry(Move.CALM_MIND,34),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.PSYCH_UP,47),
                        new MoveLearnSetEntry(Move.RECOVER,60)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ganera");

    }


}
