package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Glashulimp extends Pokemon {
    public Glashulimp() {
        super("Glashulimp",
                Type.FIRE, Type.GROUND,
                new Stats(60,
                        70,
                        15,
                        50,
                        75,
                        60),
                List.of(Ability.SAND_FORCE, Ability.FLAME_BODY), Ability.IRON_FIST,
                11, 1255,
                new Stats(0,2,0,0,0,0), 110,
                0.5,
                160, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.BULLDOZE,12),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,15),
                        new MoveLearnSetEntry(Move.AMNESIA,19),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,22),
                        new MoveLearnSetEntry(Move.EARTH_POWER,26),
                        new MoveLearnSetEntry(Move.CURSE,29),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.STOMP,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SANDY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
