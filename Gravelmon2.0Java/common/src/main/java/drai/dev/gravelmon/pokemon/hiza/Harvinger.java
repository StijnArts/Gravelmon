package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Harvinger extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harvinger() {
        super("Harvinger",
                Type.GHOST,
                new Stats(140,
                        135,
                        95,
                        115,
                        115,
                        70),
                List.of(Ability.SOULABSORB), Ability.SOULABSORB,
                28, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A gloomy fog accompanies Harvinger wherever it wanders. It preys on other ghost type Pokemon and is said to be sighted during near-death experiences."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,6),
                        new MoveLearnSetEntry(Move.HEX,12),
                        new MoveLearnSetEntry(Move.STOMP,18),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,24),
                        new MoveLearnSetEntry(Move.HAZE,30),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,42),
                        new MoveLearnSetEntry(Move.AGILITY,48),
                        new MoveLearnSetEntry(Move.THRASH,54),
                        new MoveLearnSetEntry(Move.DISABLE,60),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,66),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,72)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0005, List.of(
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Harvinger");

    }


}
