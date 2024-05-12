package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Trickgrin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trickgrin() {
        super("Trickgrin",
                Type.DARK, Type.FAIRY,
                new Stats(40,
                        50,
                        40,
                        40,
                        40,
                        120),
                List.of(Ability.PICKPOCKET,Ability.PRANKSTER), Ability.MASTERTHIEF,
                5, 135,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Trickgrin act innocent during day and aren't found very often in daylight, but at night they appear everywhere, ready to take whatever catches their eyes. Trickgrin are natural rivals to Delibird."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.CHARM,4),
                        new MoveLearnSetEntry(Move.PURSUIT,7),
                        new MoveLearnSetEntry(Move.ATTRACT,10),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,13),
                        new MoveLearnSetEntry(Move.CONFIDE,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,25),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,28),
                        new MoveLearnSetEntry(Move.NEW_MOON,31),
                        new MoveLearnSetEntry(Move.FLATTER,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,37),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.MOONLIGHT,46),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON,50)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Trickgrin");

    }


}
