package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Amoni extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amoni() {
        super("Amoni",
                Type.ICE, Type.FIRE,
                new Stats(35,
                        60,
                        30,
                        82,
                        30,
                        73),
                List.of(Ability.BLAST), Ability.THERMALPOWER,
                2, 168,
                new Stats(0,0,0,1,0,0), 60,
                0.0,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("adizine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")
                                ))),
                List.of(
                        new MoveLearnSetEntry(Move.LIGHTUP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.HAZE,11),
                        new MoveLearnSetEntry(Move.FLASH,16),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,20),
                        new MoveLearnSetEntry(Move.ICYCHARGE,26),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,33),
                        new MoveLearnSetEntry(Move.METEORSHOWER,38),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,42),
                        new MoveLearnSetEntry(Move.WISH,48),
                        new MoveLearnSetEntry(Move.SOLARFLARE,52)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 28, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amoni");

    }


}
