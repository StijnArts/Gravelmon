package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Senfetta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Senfetta() {
        super("Senfetta",
                Type.WATER, Type.FAIRY,
                new Stats(92,
                        68,
                        72,
                        116,
                        95,
                        77),
                List.of(Ability.NATURAL_CURE,Ability.HYDRATION), Ability.SERENE_GRACE,
                9, 119,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,14),
                        new MoveLearnSetEntry(Move.COVET,17),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.ENCORE,28),
                        new MoveLearnSetEntry(Move.BRINE,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.SOAK,39),
                        new MoveLearnSetEntry(Move.MOONBLAST,45),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,52),
                        new MoveLearnSetEntry(Move.MOONLIGHT,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,65)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 46, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Senfetta");

    }


}
