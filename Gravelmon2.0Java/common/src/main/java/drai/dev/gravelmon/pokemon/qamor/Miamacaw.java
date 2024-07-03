package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Miamacaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Miamacaw() {
        super("Miamacaw",
                Type.NORMAL, Type.FLYING,
                new Stats(70,
                        90,
                        70,
                        76,
                        70,
                        92),
                List.of(Ability.BIG_PECKS), Ability.TANGLED_FEET,
                9, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                155, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Miamacaw love to spread joy and are famous across the world because they are often featured as the main events in parades and other celebratory events. They can be taught to sing and repeat words and phrases, trainers often find their Miamacaw repeating entire songs that that they've left on near them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PARADISEDISPLAY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.ATTRACT,14),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.COPYCAT,23),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,27),
                        new MoveLearnSetEntry(Move.SING,31),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,38),
                        new MoveLearnSetEntry(Move.ROOST,41),
                        new MoveLearnSetEntry(Move.CAPTIVATE,43),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,46),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,49),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,52),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,56),
                        new MoveLearnSetEntry(Move.BOOMBURST,62),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,"tm"),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 25, 42, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanFly(true);


    }


}
