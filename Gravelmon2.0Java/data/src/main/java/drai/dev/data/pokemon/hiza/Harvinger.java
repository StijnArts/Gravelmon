package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Harvinger extends drai.dev.data.pokemon.Pokemon {
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
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Harvinger");

    }


}
