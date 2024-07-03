package drai.dev.gravelmon.pokemon.norheim;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Bloorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bloorn(Stats stats) {
        super("Bloorn",
                Type.NORMAL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.METRONOME,1),
                        new MoveLearnSetEntry(Move.CATALOG,1),
                        new MoveLearnSetEntry(Move.REFRESH,5),
                        new MoveLearnSetEntry(Move.FRUSTRATION,9),
                        new MoveLearnSetEntry(Move.TORMENT,13),
                        new MoveLearnSetEntry(Move.COVET,17),
                        new MoveLearnSetEntry(Move.HELPING_HAND,21),
                        new MoveLearnSetEntry(Move.SWAGGER,25),
                        new MoveLearnSetEntry(Move.UPROAR,29),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,33),
                        new MoveLearnSetEntry(Move.ATTRACT,37),
                        new MoveLearnSetEntry(Move.KARMA_BEAM,41),
                        new MoveLearnSetEntry(Move.BATON_PASS,45),
                        new MoveLearnSetEntry(Move.FACADE,49),
                        new MoveLearnSetEntry(Move.SLACK_OFF,53),
                        new MoveLearnSetEntry(Move.THRASH,57),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,61),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,65)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 43, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Bloorn");

    }


}
