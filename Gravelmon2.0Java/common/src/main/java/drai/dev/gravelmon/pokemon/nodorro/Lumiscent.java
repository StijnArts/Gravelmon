package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lumiscent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lumiscent() {
        super("Lumiscent",
                Type.GRASS,Type.LIGHT,
                new Stats(75,
                        80,
                        65,
                        110,
                        80,
                        80),
                List.of(Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                9, 6,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Evo Cleansing Light Light - Luminous BlastSTAB Light - Cleansing Light Light - Petal BlizzardSTAB Grass - Moonlight Fairy - Moonblast Fairy 45 Luminous BlastSTAB Light 49 Holy Blessing Light 54 Tail Glow Bug 61 Petal BlizzardSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.CLEANSINGLIGHT,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.LUMINOUSBLAST,45),
                        new MoveLearnSetEntry(Move.HOLYBLESSING,49),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,54),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,61)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lumiscent");

    }


}
