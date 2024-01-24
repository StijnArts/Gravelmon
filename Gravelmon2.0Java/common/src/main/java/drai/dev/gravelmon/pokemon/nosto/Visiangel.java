package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Visiangel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Visiangel() {
        super("Visiangel",
                Type.PSYCHIC,
                new Stats(78,
                        52,
                        74,
                        135,
                        74,
                        122),
                List.of(Ability.PRESSURE,Ability.FOREWARN,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,2,0,1), 0,
                0.5,
                187, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- Signal Beam Bug - Dream EaterSTAB Psychic - Life Dew Water - Tri Attack Normal - PsywaveSTAB Psychic - Miracle Eye Psychic 7 Fairy Wind Fairy 10 Hypnosis Psychic 13 PsybeamSTAB Psychic 15 Purify Poison 19 Future SightSTAB Psychic 23 Draining Kiss Fairy 27 Role Play Psychic 32 Hyper Voice Normal 36 PsyshockSTAB Psychic 40 Calm Mind Psychic 44 PsychicSTAB Psychic 50 Moonblast Fairy 53 Trick Room Psychic 57 Shadow Ball Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,7),
                        new MoveLearnSetEntry(Move.HYPNOSIS,10),
                        new MoveLearnSetEntry(Move.PSYBEAM,13),
                        new MoveLearnSetEntry(Move.PURIFY,15),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,19),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,23),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,27),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,40),
                        new MoveLearnSetEntry(Move.PSYCHIC,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,53),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,57)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Visiangel");

    }


}
