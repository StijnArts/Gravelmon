package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianVenonat extends drai.dev.data.pokemon.Pokemon {
    public HizianVenonat(String name, Aspect aspect) {
        super(name, aspect,"Venonat",
                Type.BUG, Type.ELECTRIC,
                new Stats(60,
                        55,
                        50,
                        40,
                        55,
                        45),
                List.of(Ability.STATIC), Ability.STATIC,
                10, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It charges itself by touching other Venonat with its body. When low on energy, its eyes will flash bright red to attract others of its own."),
                List.of(new EvolutionEntry("HizianVenomoth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,11),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,23),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,25),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,29),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,35),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,37),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,41),
                        new MoveLearnSetEntry(Move.PSYCHIC,47)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 31, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Venonat");

    }


}
