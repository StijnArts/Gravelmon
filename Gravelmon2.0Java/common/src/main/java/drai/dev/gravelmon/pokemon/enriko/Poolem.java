package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Poolem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Poolem() {
        super("Poolem",
                Type.GROUND, Type.ROCK,
                new Stats(80,
                        70,
                        70,
                        105,
                        55,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It drips soil infront of it which is flattened into neatly organized rows by it's rolling pin shaped arms. Anything that attacks it's farm is composted into the soil beneath it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,14),
                        new MoveLearnSetEntry(Move.MUD_SHOT,21),
                        new MoveLearnSetEntry(Move.SANDSTORM,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.MINIMIZE,33),
                        new MoveLearnSetEntry(Move.ROTOTILLER,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.SHORE_UP,49),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,54),
                        new MoveLearnSetEntry(Move.FISSURE,90)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 36, 54, .2, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Poolem");

    }


}
