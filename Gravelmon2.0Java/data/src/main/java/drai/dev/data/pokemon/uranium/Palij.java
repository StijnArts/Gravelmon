package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Palij extends Pokemon {
    public Palij() {
        super("Palij",
                Type.FIRE, Type.FLYING,
                new Stats(60,45,60,90,80,85),
                List.of(Ability.FLASH_FIRE, Ability.BIG_PECKS), Ability.FLAME_BODY,
                12, 113,
                new Stats(0,0,0,1,0,1), 180,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING),
                List.of("PALIJ's curiously-shaped feathers allow it to create friction in the air as it flaps its wings. Sparks trail off of its feathers when it flies."),
                List.of(new EvolutionEntry("pajay", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.INCINERATE,4),
                        new MoveLearnSetEntry(Move.GROWL,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,15),
                        new MoveLearnSetEntry(Move.FLAME_BURST,18),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,23),
                        new MoveLearnSetEntry(Move.ROOST,27),
                        new MoveLearnSetEntry(Move.AIR_SLASH,32),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,36),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,41),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,45),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,50),
                        new MoveLearnSetEntry(Move.TAILWIND,54),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,59),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),

                        new MoveLearnSetEntry(Move.EMBER,"egg"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"egg"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.SWAGGER,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg")
                ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
