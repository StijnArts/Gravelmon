package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Jellohat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellohat() {
        super("Jellohat",
                Type.POISON,
                new Stats(120,
                        50,
                        90,
                        75,
                        90,
                        35),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.UNAWARE,
                13, 400,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It is oblivious to danger as its poisonous jelly hat protects it from anything, but if it happens to lose its hat it will go scurry and hide inside deep caves till another grows."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,26),
                        new MoveLearnSetEntry(Move.SPORE,29),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,31),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.WRING_OUT,41),
                        new MoveLearnSetEntry(Move.COIL,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 39, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_TAIGA, Biome.IS_OLD_GROWTH_TAIGA, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellohat");

    }


}
