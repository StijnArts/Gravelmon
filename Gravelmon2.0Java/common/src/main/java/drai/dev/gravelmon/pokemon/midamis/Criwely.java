package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Criwely extends drai.dev.gravelmon.pokemon.Pokemon {
    public Criwely() {
        super("Criwely",
                Type.BUG,
                new Stats(45,
                        35,
                        60,
                        35,
                        35,
                        25),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                4, 165,
                new Stats(0,0,0,0,0,0), 240,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("crauwly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of( new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.SLASH,20),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,32),
                        new MoveLearnSetEntry(Move.XSCISSOR,36),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,44),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,48)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 27, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Criwely");

    }


}
