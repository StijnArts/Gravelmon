package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Cachaleen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cachaleen() {
        super("Cachaleen",
                Type.WATER,
                new Stats(76,
                        71,
                        70,
                        54,
                        32,
                        30),
                List.of(Ability.WATER_VEIL), Ability.SIMPLE,
                21, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                67, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("Its head is cushioned by such a large layer of blubber that it cannot feel any impact. It crashes into icebergs and gobbles up the surprised creatures that were taking refuge below."),
                List.of(new EvolutionEntry("submalot", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(    new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,18),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.SLACK_OFF,27),
                        new MoveLearnSetEntry(Move.DIVE,30),
                        new MoveLearnSetEntry(Move.YAWN,33),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,36),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,49),
                        new MoveLearnSetEntry(Move.SKULL_BASH,54)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 11, 34, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
