package drai.dev.gravelmon.pokemon.norheim.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanMasquerain extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanMasquerain(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Masquerain",
                Type.BUG, Type.WATER,
                stats,
                List.of(Ability.SWARM), Ability.DRIZZLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,9),
                        new MoveLearnSetEntry(Move.WATER_SPORT,14),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,17),
                        new MoveLearnSetEntry(Move.AGILITY,22),
                        new MoveLearnSetEntry(Move.HAZE,25),
                        new MoveLearnSetEntry(Move.MIST,25),
                        new MoveLearnSetEntry(Move.AQUA_JET,30),
                        new MoveLearnSetEntry(Move.BATON_PASS,35),
                        new MoveLearnSetEntry(Move.STICKY_WEB,38)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 22, 45, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Masquerain");
        addAdditionalEvolution("surskit", new EvolutionEntry("masquerain norheiman", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_TAIGA.getId() + ":" + Biome.IS_TAIGA.getName() +"\""))));

    }


}
