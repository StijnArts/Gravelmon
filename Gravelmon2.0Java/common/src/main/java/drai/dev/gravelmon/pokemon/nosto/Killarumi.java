package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Killarumi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Killarumi() {
        super("Killarumi",
                Type.ROCK,Type.PSYCHIC,
                new Stats(49,
                        40,
                        109,
                        97,
                        123,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                160, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Tackle Normal - Harden Normal - Confuse Ray Ghost - PsywaveSTAB Psychic - Rock ThrowSTAB Rock - Signal Beam Bug - Hypnosis Psychic 8 ConfusionSTAB Psychic 14 Rock Polish Rock 17 Moonlight Fairy 21 Swift Normal 24 Cosmic Power Psychic 28 Lucky Chant Normal 33 Ancient PowerSTAB Rock 34 Crop Circle Psychic 37 PsychicSTAB Psychic 42 Earth Power Ground 45 Power GemSTAB Rock 49 StarstreamSTAB Psychic 54 Gem CrashSTAB Rock 57 Stone EdgeSTAB Rock 61 Meteor ShowerSTAB Rock 65 Lunar Dance Psychic 70 Meteor BeamSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,14),
                        new MoveLearnSetEntry(Move.MOONLIGHT,17),
                        new MoveLearnSetEntry(Move.SWIFT,21),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,24),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.CROPCIRCLE,34),
                        new MoveLearnSetEntry(Move.PSYCHIC,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,42),
                        new MoveLearnSetEntry(Move.POWER_GEM,45),
                        new MoveLearnSetEntry(Move.STARSTREAM,49),
                        new MoveLearnSetEntry(Move.GEMCRASH,54),
                        new MoveLearnSetEntry(Move.STONE_EDGE,57),
                        new MoveLearnSetEntry(Move.METEORSHOWER,61),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE,65),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,70),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Killarumi");

    }


}
