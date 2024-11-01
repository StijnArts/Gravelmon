package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crystalis extends drai.dev.data.pokemon.Pokemon {
    public Crystalis() {
        super("Crystalis",
                Type.BUG, Type.ICE,
                new Stats(65,
                        65,
                        95,
                        95,
                        85,
                        10),
                List.of(Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                8, 165,
                new Stats(0,0,2,0,0,0), 190,
                0.5,
                110, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When it evolves, Grubzero encases itself in its own ice and waits. It need not worry about predators, as no sane Pokemon would break open an ice block just to get such a small morsel."),
                List.of(new EvolutionEntry("himilago", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=male\""))),
                                new EvolutionEntry("bugsled", EvolutionType.LEVEL_UP, List.of(),
                                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=female\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crystalis");

    }


}
