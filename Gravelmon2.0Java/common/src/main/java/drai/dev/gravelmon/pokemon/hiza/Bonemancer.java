package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bonemancer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bonemancer() {
        super("Bonemancer",
                Type.GHOST,Type.FIGHTING,
                new Stats(70,
                        100,
                        70,
                        110,
                        90,
                        90),
                List.of(Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,1,0,2,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.HUMAN_LIKE),
                List.of("Being able to control their limbs even when not attached to their body, they are able to split themselves in two to fight multiple opponents at once."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,6),
                        new MoveLearnSetEntry(Move.DISABLE,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,14),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,17),
                        new MoveLearnSetEntry(Move.PURSUIT,22),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,27),
                        new MoveLearnSetEntry(Move.BONE_RUSH,34),
                        new MoveLearnSetEntry(Move.TORMENT,39),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.BONEMERANG,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonemancer");

    }


}
