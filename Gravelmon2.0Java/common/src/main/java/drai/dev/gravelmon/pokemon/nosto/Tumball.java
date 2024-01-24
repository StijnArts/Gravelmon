package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tumball extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tumball() {
        super("Tumball",
                Type.GRASS,Type.BUG,
                new Stats(80,
                        92,
                        85,
                        52,
                        63,
                        63),
                List.of(Ability.OVERGROW), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,1,1,0,0,0), 45,
                0.875,
                152, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("- Pound Normal 4 Leer Normal 7 AbsorbSTAB Grass 11 Bug BiteSTAB Bug 13 Mud Sport Ground 16 Razor LeafSTAB Grass 21 Rollout Rock 26 Mud Bomb Ground 32 Bulldoze Ground 35 Grassy GlideSTAB Grass 39 Bug BuzzSTAB Bug 42 Earthquake Ground 47 Rock Slide Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,11),
                        new MoveLearnSetEntry(Move.MUD_SPORT,13),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.ROLLOUT,21),
                        new MoveLearnSetEntry(Move.MUD_BOMB,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,32),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,35),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,42),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,47),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tumball");

    }


}
