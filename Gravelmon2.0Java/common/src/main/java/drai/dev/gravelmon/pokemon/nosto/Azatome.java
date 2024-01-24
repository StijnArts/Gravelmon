package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Azatome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Azatome() {
        super("Azatome",
                Type.GHOST,Type.DARK,
                new Stats(75,
                        60,
                        100,
                        60,
                        100,
                        50),
                List.of(Ability.CURSED_BODY), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,1,0,1,0), 90,
                0.0,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Each book possesses various writings in an alien language, they are rumoured to tell the story of the end of the universe."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,13),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,17),
                        new MoveLearnSetEntry(Move.GLARE,24),
                        new MoveLearnSetEntry(Move.ASSURANCE,29),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,33),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,44),
                        new MoveLearnSetEntry(Move.MEMENTO,55)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Azatome");

    }


}
