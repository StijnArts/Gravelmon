package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Spectipilla extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spectipilla() {
        super("Spectipilla",
                Type.BUG,
                new Stats(34,
                        34,
                        29,
                        37,
                        30,
                        34),
                List.of(Ability.SWARM), Ability.SWARM,
                3, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                45, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Spectipilla are very curious and intelligent Pokemon with an insatiable appetite to learn new things, they are even able to learn to read several human languages. Spectipilla have very poor eyesight, but they are able to use their concave lens-like antenna to see the world around them."),
                List.of(new EvolutionEntry("chrystalis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.PSYWAVE,14),
                        new MoveLearnSetEntry(Move.ABSORB,18),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,23),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,26),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 22, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_BOOKSHELVES),
                0.28, 0.3,
                List.of());
           setLangFileName("Spectipilla");

    }


}
