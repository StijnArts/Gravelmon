package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Spirix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spirix() {
        super("Spirix",
                Type.FAIRY, Type.GHOST,
                new Stats(103,
                        67,
                        71,
                        90,
                        103,
                        61),
                List.of(Ability.MAGICIAN), Ability.MAGIC_BOUNCE,
                13, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PHANTOMHAND,1),
                new MoveLearnSetEntry(Move.SING,1),
                new MoveLearnSetEntry(Move.CONFUSE_RAY,6),
                new MoveLearnSetEntry(Move.DISARMING_VOICE,9),
                new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                new MoveLearnSetEntry(Move.TEARFUL_LOOK,16),
                new MoveLearnSetEntry(Move.WRAP,19),
                new MoveLearnSetEntry(Move.MOONLIGHT,22),
                new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                new MoveLearnSetEntry(Move.SPORE,28),
                new MoveLearnSetEntry(Move.DESTINY_BOND,32),
                new MoveLearnSetEntry(Move.HARROWINGWAIL,36),
                new MoveLearnSetEntry(Move.PERISH_SONG,41),
                new MoveLearnSetEntry(Move.MOONBLAST,47),
                new MoveLearnSetEntry(Move.STRENGTH_SAP,54)
                ),
        List.of(Label.FLIGA),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 54, .3, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spirix");

    }


}
