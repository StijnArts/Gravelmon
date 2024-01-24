package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rayth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rayth() {
        super("Rayth",
                Type.DARK,Type.FIRE,
                new Stats(70,
                        110,
                        70,
                        80,
                        70,
                        90),
                List.of(Ability.INTIMIDATE), Ability.UNNERVE,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("They often command large groups of normally mischievous Rayscal to do more sinister things like attack ships. Their horns are burning hot to the touch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rayth");

    }


}
