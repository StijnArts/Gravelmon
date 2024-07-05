package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rivacal extends drai.dev.data.pokemon.Pokemon {
    public Rivacal() {
        super("Rivacal",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(126,
                        80,
                        50,
                        70,
                        99,
                        80),
                List.of(Ability.HEALER,Ability.NATURAL_CURE), Ability.PIXILATE,
                13, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Rivacal aids Pokémon in need. Whether they are hurt or have fainted, it will be there in an instant. Some people say that it arrived to the Pokémon World by during a night full of shooting stars."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.METRONOME,5),
                        new MoveLearnSetEntry(Move.SWEET_KISS,9),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,14),
                        new MoveLearnSetEntry(Move.ENCORE,17),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,21),
                        new MoveLearnSetEntry(Move.BESTOW,25),
                        new MoveLearnSetEntry(Move.WISH,29),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.SAFEGUARD,37),
                        new MoveLearnSetEntry(Move.BATON_PASS,41),
                        new MoveLearnSetEntry(Move.PSYCHIC,45),
                        new MoveLearnSetEntry(Move.LAST_RESORT,49),
                        new MoveLearnSetEntry(Move.AFTER_YOU,53),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,60)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 52, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rivacal");

    }


}
