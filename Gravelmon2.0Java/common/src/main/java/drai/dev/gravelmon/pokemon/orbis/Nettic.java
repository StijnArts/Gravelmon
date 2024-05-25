package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nettic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nettic() {
        super("Nettic",
                Type.GRASS, Type.ELECTRIC,
                new Stats(40,
                        65,
                        45,
                        45,
                        50,
                        40),
                List.of(Ability.STATIC), Ability.STATIC,
                4, 28,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                68, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("There leaves are covered in tiny hairs that cause an irritant sting when touched. During Spring in Central Orbis, a week is dedicated to them to celebrate the seeds they produce, which are a favorite food for many Bug types."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,20),
                        new MoveLearnSetEntry(Move.SPARK,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.SPIKES,30),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,37),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,41),
                        new MoveLearnSetEntry(Move.FELL_STINGER,45),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,48)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nettic");

    }


}
