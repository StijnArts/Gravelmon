package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Gigantoid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gigantoid() {
        super("Gigantoid",
                Type.GROUND, Type.FLYING,
                new Stats(140,
                        55,
                        88,
                        55,
                        88,
                        33),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                56, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.GUST,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,13),
                        new MoveLearnSetEntry(Move.WHIRLWIND,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,19),
                        new MoveLearnSetEntry(Move.TAILWIND,22),
                        new MoveLearnSetEntry(Move.MUD_SHOT,25),
                        new MoveLearnSetEntry(Move.TEMPEST,29),
                        new MoveLearnSetEntry(Move.ROOST,33),
                        new MoveLearnSetEntry(Move.MUDSLIDE,37),
                        new MoveLearnSetEntry(Move.SANDSTORM,43),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,55),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,61),
                        new MoveLearnSetEntry(Move.HURRICANE,67)           ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Gigantoid");

    }


}
