package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crustitan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crustitan() {
        super("Crustitan",
                Type.STEEL,Type.DARK,
                new Stats(105,
                        110,
                        135,
                        50,
                        75,
                        75),
                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,3,0,0,0), 15,
                0.5,
                245, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("An incredibly strong Pokémon that leaves the waters and wanders the land searching for strong opponents to fight. They are an invasive species that originate from a distant region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,12),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,25),
                        new MoveLearnSetEntry(Move.TAUNT,31),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,36),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.PROTECT,48),
                        new MoveLearnSetEntry(Move.THRASH,54),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,62),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,70),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,75),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,81)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crustitan");

    }


}
