package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Astronite extends Pokemon {
    public Astronite() {
        super("Astronite",
                Type.ROCK, Type.PSYCHIC,
                new Stats(80,
                        85,
                        85,
                        115,
                        75,
                        105),
                List.of(Ability.TECHNICIAN, Ability.STURDY), Ability.TRACE,
                17, 2427,
                new Stats(0,0,0,2,0,1), 45,
                0.5,
                273, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It levitates in the air with powerful psychic energy. The crystals on its body flash many colors when it meets another of its kind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METEOR_MASH,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,17),
                        new MoveLearnSetEntry(Move.TELEPORT,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,23),
                        new MoveLearnSetEntry(Move.GRAVITY,28),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,28),
                        new MoveLearnSetEntry(Move.PSYSHOCK,33),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,43),
                        new MoveLearnSetEntry(Move.POWER_GEM,48),
                        new MoveLearnSetEntry(Move.RECOVER,53),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,58),
                        new MoveLearnSetEntry(Move.MOONBLAST,63),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,68)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 65, 3.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
