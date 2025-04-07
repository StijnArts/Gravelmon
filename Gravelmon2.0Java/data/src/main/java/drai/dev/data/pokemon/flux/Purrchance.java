package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Purrchance extends drai.dev.data.pokemon.Pokemon {
    public Purrchance() {
        super("Purrchance",
                Type.STEEL,Type.DARK,
                new Stats(100,
                        65,
                        85,
                        65,
                        85,
                        40),
                List.of(Ability.SUPER_LUCK,Ability.MOODY), Ability.GOOD_AS_GOLD,
                12, 777,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METRONOME,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.PAY_DAY,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.PAYBACK,24),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,31),
                        new MoveLearnSetEntry(Move.SCREECH,36),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,48),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,54),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Purrchance");

    }


}
