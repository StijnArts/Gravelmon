package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Echomori extends drai.dev.gravelmon.pokemon.Pokemon {
    public Echomori() {
        super("Echomori",
                Type.ELECTRIC, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SUPERCHARGE), Ability.CACOPHONY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's been studied that the sounds produced from Echomori can reach 140 Decibels. A group of Echomori can sound like a thunderstorm. Their sounds can echo as far as hundreds of miles. They are fascinated by the sounds of music and will buzz along with the rhythm. They are often found gathered at music festivals or concerts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,15),
                        new MoveLearnSetEntry(Move.CHARGE,20),
                        new MoveLearnSetEntry(Move.ACROBATICS,25),
                        new MoveLearnSetEntry(Move.SPARK,30),
                        new MoveLearnSetEntry(Move.ENCORE,35),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,40),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,45),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.AGILITY,55)
                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Echomori");
        setCanFly(true);

    }


}
