package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Whoopwing extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whoopwing() {
        super("Whoopwing",
                Type.NORMAL,Type.FLYING,
                new Stats(45,
                        52,
                        39,
                        41,
                        38,
                        57),
                List.of(Ability.BIG_PECKS), Ability.TANGLED_FEET,
                4, 165,
                new Stats(0,1,0,0,0,0), 195,
                0.5,
                52, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Whoopwing are often found clumped together in thick flocks, sometimes blocking roadways and filling towns with a cacophony of squawks. Tourist often catch and bring Whoopwing back to their home region and unwillingly introduce them to its environment, making them common appearances in my unusual corners of the world."),
                List.of(new EvolutionEntry("miamacaw", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.ATTRACT,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,19),
                        new MoveLearnSetEntry(Move.COPYCAT,22),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,25),
                        new MoveLearnSetEntry(Move.SING,29),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,34),
                        new MoveLearnSetEntry(Move.ROOST,37),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,40),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,43),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,46),
                        new MoveLearnSetEntry(Move.BOOMBURST,50),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.FLATTER,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
