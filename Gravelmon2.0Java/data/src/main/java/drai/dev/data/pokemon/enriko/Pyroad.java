package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pyroad extends drai.dev.data.pokemon.Pokemon {
    public Pyroad() {
        super("Pyroad",
                Type.FIRE, Type.POISON,
                new Stats(120,
                        105,
                        110,
                        75,
                        95,
                        60),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                14, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                224, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Where Pyroad roams, it is revered as king. The thunderous croaks it lets out strikes fear in the hearts of any Pokemon."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.GLARE,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,25),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,31),
                        new MoveLearnSetEntry(Move.CURSE,37),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,40),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,47),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,54)             ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_VOLCANIC)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyroad");

    }


}
