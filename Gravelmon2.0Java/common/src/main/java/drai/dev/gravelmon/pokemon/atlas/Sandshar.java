package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sandshar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sandshar() {
        super("Sandshar",
                Type.WATER,Type.GROUND,
                new Stats(40,
                        50,
                        70,
                        40,
                        100,
                        35),
                List.of(Ability.ROUGH_SKIN), Ability.WEAK_ARMOR,
                5, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
                List.of("Sandshar are highly drowsy Pokemon, which reside docile in a blanket of sand upon the sea bed. They will briefly leave it in order to escape a predator, but otherwise will remain still and unresponsive."),
                List.of(new EvolutionEntry("sharkastle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.SAND_TOMB,13),
                        new MoveLearnSetEntry(Move.YAWN,17),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.SHEDFANGS,25),
                        new MoveLearnSetEntry(Move.BRINE,29),
                        new MoveLearnSetEntry(Move.ROAR,33),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.SANDSHOT,42),
                        new MoveLearnSetEntry(Move.REST,46),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.SHORE_UP,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
