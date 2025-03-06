package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanCherrim extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanCherrim(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanCherrim",
                Type.GRASS,Type.POISON,
                new Stats(78,
                        50,
                        78,
                        96,
                        120,
                        78),
                List.of(Ability.FLOWER_GIFT,Ability.UNBURDEN), null,
                5, 93,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Baco bendijo a los Cherrim como agradecimiento al pueblo de Occidentis por su gran devoción a este en todos los actos públicos y privados de sus habitantes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,22),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,37),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,19),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,27),
                        new MoveLearnSetEntry(Move.BORRACHERA,44),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.SLUDGE,31),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,33),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 25, 42, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cherrim");

    }


}
