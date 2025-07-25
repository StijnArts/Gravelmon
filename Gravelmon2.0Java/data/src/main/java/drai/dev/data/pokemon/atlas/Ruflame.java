package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ruflame extends drai.dev.data.pokemon.Pokemon {
    public Ruflame() {
        super("Ruflame",
                Type.FIRE,
                new Stats(40,
                        61,
                        47,
                        55,
                        47,
                        60),
                List.of(Ability.BLAZE), Ability.REGENERATOR,
                5, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Ruflame's ability to regenerate lost body parts is considered by most to be a phenomenon. It is subject to many investigations, in attempts to discover any applications its abilities may have in human medicine."),
                List.of(new EvolutionEntry("reparch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LEER,2),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.TAUNT,10),
                        new MoveLearnSetEntry(Move.FAKE_OUT,14),
                        new MoveLearnSetEntry(Move.FIRE_FANG,18),
                        new MoveLearnSetEntry(Move.SLAM,21),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.FLAME_BURST,29),
                        new MoveLearnSetEntry(Move.FACADE,32),
                        new MoveLearnSetEntry(Move.RECOVER,36),
                        new MoveLearnSetEntry(Move.FLING,40),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,45),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,51),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLARFLARE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ruflame");

    }


}
