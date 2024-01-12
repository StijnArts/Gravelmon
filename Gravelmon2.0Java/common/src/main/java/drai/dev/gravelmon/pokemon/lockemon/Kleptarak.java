package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kleptarak extends Pokemon {
    public Kleptarak() {
        super("Kleptarak",
                Type.BUG, Type.DARK,
                new Stats(60,
                        110,
                        50,
                        40,
                        105,
                        90),
                List.of(Ability.NASTY_WEBBING, Ability.MALICE), Ability.PICKPOCKET,
                9, 131,
                new Stats(0,1,0,1,0,0), 150,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("These menacing Pokémon use their long legs and hand-like tail to rapidly climb in ways that defy gravity. Kleptarak are notorious for stalking their prey at night and snatching them into the shadows."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,4),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.ASSURANCE,9),
                        new MoveLearnSetEntry(Move.THIEF,11),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.ENDURE,18),
                        new MoveLearnSetEntry(Move.BUG_BITE,22),
                        new MoveLearnSetEntry(Move.FEINT,28),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,32),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,36),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,44),
                        new MoveLearnSetEntry(Move.BOUNCE,48),
                        new MoveLearnSetEntry(Move.AXE_KICK,53),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 47, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
