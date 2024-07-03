package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Larvyn extends Pokemon {
    public Larvyn() {
        super("Larvyn",
                Type.BUG,
                new Stats(52, 62, 40, 40, 62, 44),
                List.of(Ability.UNNERVE), Ability.RUN_AWAY,
                4, 46,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                100, List.of(EggGroup.BUG, EggGroup.DRAGON),
                List.of("Larvyn's appetite is ravenous. It will eat almost anything, be it wood, rocks or even metal. It uses the nutrients to slowly develop a sturdy shell."),
                List.of(new EvolutionEntry("dracoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TWINEEDLE,10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,20),
                        new MoveLearnSetEntry(Move.BUG_BITE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:string",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 2, 11, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
