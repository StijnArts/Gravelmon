package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Halux extends drai.dev.gravelmon.pokemon.Pokemon {
    public Halux() {
        super("Halux",
                Type.PSYCHIC,
                new Stats(36,
                        21,
                        45,
                        87,
                        53,
                        66),
                List.of(Ability.PRESSURE,Ability.FOREWARN,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                61, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- PsywaveSTAB Psychic - Miracle Eye Psychic 4 Fairy Wind Fairy 7 Echoed Voice Normal 9 Hypnosis Psychic 13 PsybeamSTAB Psychic 15 Purify Poison 18 Future SightSTAB Psychic 22 Draining Kiss Fairy 26 Role Play Psychic 30 Round Normal 34 PsyshockSTAB Psychic 39 Dazzling Gleam Fairy 41 Calm Mind Psychic 43 PsychicSTAB Psychic 50 Moonblast Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,4),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,7),
                        new MoveLearnSetEntry(Move.HYPNOSIS,9),
                        new MoveLearnSetEntry(Move.PSYBEAM,13),
                        new MoveLearnSetEntry(Move.PURIFY,15),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,18),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,26),
                        new MoveLearnSetEntry(Move.ROUND,30),
                        new MoveLearnSetEntry(Move.PSYSHOCK,34),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,39),
                        new MoveLearnSetEntry(Move.CALM_MIND,41),
                        new MoveLearnSetEntry(Move.PSYCHIC,43),
                        new MoveLearnSetEntry(Move.MOONBLAST,50)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Halux");

    }


}
