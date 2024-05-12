package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianGligar extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianGligar(int dex) {
        super(dex, "Gligar",
                Type.ICE, Type.FLYING,
                new Stats(65,
                        75,
                        105,
                        35,
                        65,
                        85),
                List.of(Ability.ICE_SCALES), Ability.ICE_SCALES,
                11, 165,
                new Stats(0,0,1,0,0,0), 60,
                0.5,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("As it glides through the air, the floor bellow it is covered with rime. Its long icy claws allow it to pick up slippery frozen objects with ease."),
                List.of(new EvolutionEntry("HizianGliscor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FROST_BREATH,30),
                        new MoveLearnSetEntry(Move.BITE,35),
                        new MoveLearnSetEntry(Move.ICE_FANG,40),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,47),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,54),
                        new MoveLearnSetEntry(Move.CRUNCH,61),
                        new MoveLearnSetEntry(Move.BLIZZARD,68)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 18, 43, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_PEAK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gligar");

    }


}
