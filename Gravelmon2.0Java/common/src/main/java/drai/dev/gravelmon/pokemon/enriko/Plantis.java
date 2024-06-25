package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Plantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plantis() {
        super("Plantis",
                Type.GRASS, Type.BUG,
                new Stats(45,
                        65,
                        60,
                        80,
                        40,
                        60),
                List.of(Ability.OVERGROW,Ability.COMPOUND_EYES,Ability.DEFIANT), Ability.DEFIANT,
                4, 165,
                new Stats(0,0,0,1,0,0), 80,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of("Their parents lay their eggs in the canopy of jungles, where they blend in. They make a high-pitched chirping noise so their parents can find them afterwards."),
                List.of(new EvolutionEntry("ensencoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.GROWTH,5),
                        new MoveLearnSetEntry(Move.INGRAIN,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,20),
                        new MoveLearnSetEntry(Move.SLASH,25),
                        new MoveLearnSetEntry(Move.XSCISSOR,30),
                        new MoveLearnSetEntry(Move.SYNTHESIS,35),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,40),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,50)
                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plantis");

    }


}
