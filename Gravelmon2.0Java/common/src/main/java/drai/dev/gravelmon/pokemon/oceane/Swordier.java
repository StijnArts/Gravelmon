package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Swordier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swordier() {
        super("Swordier",
                Type.STEEL, Type.FIGHTING,
                new Stats(80,
                        120,
                        70,
                        90,
                        70,
                        105),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                16, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Swordier's nose grew so long that it broke off. Now, it wields the sharp blade as a sword. Whenever a Swordier comes across another of its kind, they will bow, and battle each other. It is dangerous to try to intervene."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                new MoveLearnSetEntry(Move.LEER,1),
                new MoveLearnSetEntry(Move.METAL_CLAW,5),
                new MoveLearnSetEntry(Move.WATER_GUN,10),
                new MoveLearnSetEntry(Move.FURY_CUTTER,15),
                new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                new MoveLearnSetEntry(Move.AQUA_JET,25),
                new MoveLearnSetEntry(Move.SWORDS_DANCE,30),
                new MoveLearnSetEntry(Move.IRON_HEAD,35),
                new MoveLearnSetEntry(Move.AQUA_TAIL,40),
                new MoveLearnSetEntry(Move.SACRED_SWORD,45),
                new MoveLearnSetEntry(Move.HYDRO_PUMP,50),
                new MoveLearnSetEntry(Move.IRON_TAIL,55),
                new MoveLearnSetEntry(Move.AQUA_TAIL,60),
                new MoveLearnSetEntry(Move.PAYBACK,65)),
        List.of(Label.OCEANE),
                0, List.of(
        ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
        ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
