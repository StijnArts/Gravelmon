package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Vivantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vivantis() {
        super("Vivantis",
                Type.GRASS,Type.BUG,
                new Stats(85,
                        85,
                        105,
                        85,
                        75,
                        130),
                List.of(Ability.OVERGROW,Ability.COMPOUND_EYES,Ability.DEFIANT), Ability.DEFIANT,
                16, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                224, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of("Its two massive claws are completely hollow. The sound they make as air flows through them stimulates plant life around it."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL, Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vivantis");

    }


}
