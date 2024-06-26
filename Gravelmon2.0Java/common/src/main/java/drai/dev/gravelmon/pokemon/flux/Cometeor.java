package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Cometeor extends Pokemon {
    public Cometeor() {
        super("Cometeor",
                Type.ROCK, Type.PSYCHIC,
                new Stats(75,
                        45,
                        65,
                        95,
                        60,
                        75),
                List.of(Ability.TECHNICIAN, Ability.STURDY), Ability.TRACE,
                12, 2075,
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                146, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It levitates in the air with powerful psychic energy. The crystals on its body flash many colors when it meets another of its kind."),
                List.of(new EvolutionEntry("astronite", EvolutionType.TRADE, List.of(), List.of())),
                List.of(
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 25, 41, 0.4, List.of(
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
