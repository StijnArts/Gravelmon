package drai.dev.gravelmon.pokemon.spion.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Trubbish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trubbish(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Trubbish",
                Type.POISON,
                new Stats(50,
                        50,
                        62,
                        40,
                        62,
                        65),
                List.of(Ability.STENCH,Ability.STICKY_HOLD), Ability.AFTERMATH,
                6, 310,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Trubbish are a lot harder to find in Spion as they have either fallen prey to Grubbage or they are in hiding. They are finding ways to live and thrive while avoiding their predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.RECYCLE,3),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,6),
                        new MoveLearnSetEntry(Move.AMNESIA,9),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.SLUDGE,18),
                        new MoveLearnSetEntry(Move.SWALLOW,21),
                        new MoveLearnSetEntry(Move.STOCKPILE,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,27),
                        new MoveLearnSetEntry(Move.TOXIC,30),
                        new MoveLearnSetEntry(Move.BELCH,33),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,39),
                        new MoveLearnSetEntry(Move.EXPLOSION,42)                        ),
                List.of(Label.SPION),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trubbish");

    }


}
