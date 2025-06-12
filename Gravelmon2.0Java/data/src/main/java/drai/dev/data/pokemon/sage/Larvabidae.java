package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Larvabidae extends Pokemon {
    public Larvabidae() {
        super("Larvabidae",
                Type.BUG,
                new Stats(45, 45, 45, 33, 33, 33),
                List.of(Ability.SWARM), Ability.RUN_AWAY,
                3, 34,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                47, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.BUG),
                List.of("Larvabidae follows orders given to it by fully evolved members of the swarm. Its evolution is determined by which role it is most successful in."),
                List.of(new EvolutionEntry("caranox", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO, "ATTACK_HIGHER"))),
                        new EvolutionEntry("carajoule", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO, "EQUAL"))),
                        new EvolutionEntry("caracrust", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO, "DEFENCE_HIGHER")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TACKLE,4),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.WEB_BALL,19),
                        new MoveLearnSetEntry(Move.WORK_UP,22),
                        new MoveLearnSetEntry(Move.FLAIL,25),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.TWINEEDLE,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:string",90, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
