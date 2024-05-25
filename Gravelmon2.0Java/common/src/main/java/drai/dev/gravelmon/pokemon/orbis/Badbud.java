package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Badbud extends drai.dev.gravelmon.pokemon.Pokemon {
    public Badbud() {
        super("Badbud",
                Type.GRASS, Type.POISON,
                new Stats(35,
                        65,
                        50,
                        50,
                        55,
                        30),
                List.of(Ability.POISON_POINT), Ability.OWN_TEMPO,
                3, 41,
                new Stats(0,1,0,0,0,0), 255,
                0.0,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Poison StingSTAB Poison - Growth Normal 6 Razor LeafSTAB Grass 14 Poison Powder Poison 31 Toxic Spikes Poison 35 Leaf BladeSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,6),
                        new MoveLearnSetEntry(Move.POISON_POWDER,14),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,35)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Badbud");

    }


}
