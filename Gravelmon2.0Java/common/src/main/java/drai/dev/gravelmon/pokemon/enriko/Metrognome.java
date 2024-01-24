package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Metrognome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Metrognome() {
        super("Metrognome",
                Type.NORMAL,Type.GHOST,
                new Stats(55,
                        55,
                        35,
                        65,
                        45,
                        60),
                List.of(Ability.SOUNDPROOF,Ability.SCRAPPY,Ability.CACOPHONY), Ability.CACOPHONY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Born from the insecurities and grudges of artists, Metrognome makes a clicking sound every second until it dies. Listening to it for long periods of time is maddening."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.UPROAR,4),
                        new MoveLearnSetEntry(Move.CONFIDE,7),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,11),
                        new MoveLearnSetEntry(Move.SUPERSONIC,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.CHATTER,21),
                        new MoveLearnSetEntry(Move.TAUNT,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,31),
                        new MoveLearnSetEntry(Move.METRONOME,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,39),
                        new MoveLearnSetEntry(Move.RELIC_SONG,43),
                        new MoveLearnSetEntry(Move.PERISH_SONG,47),
                        new MoveLearnSetEntry(Move.BATON_PASS,53),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.BOOMBURST,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Metrognome");

    }


}
