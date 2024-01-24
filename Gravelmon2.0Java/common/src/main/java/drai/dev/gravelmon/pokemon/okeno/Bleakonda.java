package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bleakonda extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bleakonda() {
        super("Bleakonda",
                Type.POISON,
                new Stats(90,
                        90,
                        100,
                        74,
                        90,
                        58),
                List.of(Ability.SHED_SKIN,Ability.DRY_SKIN,Ability.MERCILESS), Ability.MERCILESS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("It constricts prey and eats them whole. The extremely corrosive acids in its stomach will destroy the body so that the nutrients can be absorbed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COIL,37),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bleakonda");

    }


}
