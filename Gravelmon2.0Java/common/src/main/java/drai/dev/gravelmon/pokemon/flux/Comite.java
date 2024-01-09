package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Comite extends Pokemon {
    public Comite() {
        super("Comite",
                Type.ROCK, Type.PSYCHIC,
                new Stats(50,
                        30,
                        55,
                        75,
                        40,
                        60),
                List.of(Ability.HUSTLE, Ability.STURDY), Ability.TRACE,
                6, 607,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                62, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It can retract its legs into its body and appear to be an ordinary rock. Stories say they arrived on an asteroid hundreds of years ago."),
                List.of(new EvolutionEntry("cometeor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.SWIFT,11),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,17),
                        new MoveLearnSetEntry(Move.TELEPORT,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,23),
                        new MoveLearnSetEntry(Move.GRAVITY,26),
                        new MoveLearnSetEntry(Move.PSYSHOCK,29),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,32),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,35),
                        new MoveLearnSetEntry(Move.POWER_GEM,38),
                        new MoveLearnSetEntry(Move.RECOVER,41),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,47),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,50)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
