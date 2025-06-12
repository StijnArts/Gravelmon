package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bearvoyance extends Pokemon {
    public Bearvoyance() {
        super("Bearvoyance",
                Type.GHOST, Type.PSYCHIC,
                new Stats(100,
                        50,
                        90,
                        90,
                        110,
                        50),
                List.of(Ability.SEANCE), Ability.SMOKE_AND_MIRRORS,
                17, 806,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                220, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Bearvoyance can use their psychic abilities to wisely predict their foe’s next move. Elder Bearvoyance love to work at daycares, giving words of wisdom to Pokemon while they’re still in eggs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.LICK,8),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,20),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,24),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,28),
                        new MoveLearnSetEntry(Move.PSYSHOCK,32),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,36),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,40),
                        new MoveLearnSetEntry(Move.PSYCHIC,46),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,54),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
