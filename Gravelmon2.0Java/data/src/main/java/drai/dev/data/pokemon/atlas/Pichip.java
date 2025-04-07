package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pichip extends drai.dev.data.pokemon.Pokemon {
    public Pichip() {
        super("Pichip",
                Type.ROCK,
                new Stats(60,
                        70,
                        70,
                        35,
                        60,
                        60),
                List.of(Ability.GUTS), Ability.GUTS,
                4, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                71, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of("Every Pichip claims a boulder as its territory and will defend it to the death. Pichip alerts intruders with a loud bark."),
                List.of(new EvolutionEntry("shifuu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SCREECH,19),
                        new MoveLearnSetEntry(Move.PURSUIT,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,34),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,39),
                        new MoveLearnSetEntry(Move.RETALIATE,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pichip");

    }


}
