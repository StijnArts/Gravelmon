package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bearver extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bearver() {
        super("Bearver",
                Type.GRASS,Type.WATER,
                new Stats(110,
                        80,
                        75,
                        90,
                        70,
                        70),
                List.of(Ability.SWIFT_SWIM), Ability.CHEEK_POUCH,
                8, 165,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                149, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("They spend the spring building large dams so they can have a private pond for their lodge, a place where they hibernate for long periods."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.BRINE,21),
                        new MoveLearnSetEntry(Move.HYPER_FANG,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,31),
                        new MoveLearnSetEntry(Move.SUPER_FANG,36),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,44),
                        new MoveLearnSetEntry(Move.WATERFALL,47),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,55),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,60)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bearver");

    }


}
