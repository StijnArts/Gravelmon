package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tarsiboo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tarsiboo() {
        super("Tarsiboo",
                Type.NORMAL,
                new Stats(30,
                        50,
                        30,
                        20,
                        65,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tarsiboo is always awake at night only to play Peekaboo."),
                List.of(new EvolutionEntry("peerhini", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(             new MoveLearnSetEntry(Move.LIFE_DEW,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.REST,12),
                        new MoveLearnSetEntry(Move.SNORE,12),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.YAWN,18),
                        new MoveLearnSetEntry(Move.HEART_STAMP,23),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,28),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,33),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,38),
                        new MoveLearnSetEntry(Move.SLACK_OFF,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,48),
                        new MoveLearnSetEntry(Move.WISH,53),
                        new MoveLearnSetEntry(Move.SUPER_FANG,58),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,63)           ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tarsiboo");

    }


}
