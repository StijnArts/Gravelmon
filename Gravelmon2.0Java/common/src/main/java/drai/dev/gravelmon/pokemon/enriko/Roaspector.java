package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Roaspector extends drai.dev.gravelmon.pokemon.Pokemon {
    public Roaspector() {
        super("Roaspector",
                Type.BUG, Type.FIRE,
                new Stats(78,
                        73,
                        50,
                        96,
                        67,
                        87),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 85,
                0.8,
                143, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("To carve tunnels for cockroast colonies, it produces pressurized egg-sacs and lights them aflame. The resulting explosion has been known to level buildings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.TWINEEDLE,12),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,20),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,24),
                        new MoveLearnSetEntry(Move.SILVER_WIND,28),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,38),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,44),
                        new MoveLearnSetEntry(Move.ERUPTION,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 52, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Roaspector");

    }


}
