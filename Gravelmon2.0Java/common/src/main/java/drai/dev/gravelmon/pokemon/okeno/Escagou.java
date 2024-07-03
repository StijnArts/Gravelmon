package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Escagou extends drai.dev.gravelmon.pokemon.Pokemon {
    public Escagou() {
        super("Escagou",
                Type.POISON, Type.DRAGON,
                new Stats(70,
                        70,
                        116,
                        82,
                        116,
                        59),
                List.of(Ability.SHELL_ARMOR,Ability.STENCH,Ability.GOOEY), Ability.GOOEY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_1),
                List.of("- SludgeSTAB Poison - Poison Gas Poison - Sludge BombSTAB Poison - Mud-Slap Ground - Mud Sport Ground - Muddy Water Water - Mud Shot Ground - Fling Dark - Mud Bomb Ground - Sludge WaveSTAB Poison - Mud Slide Ground - Filthy Terrain Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Escagou");

    }


}
