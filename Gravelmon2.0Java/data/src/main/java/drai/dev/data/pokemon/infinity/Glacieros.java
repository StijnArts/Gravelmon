package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Glacieros extends Pokemon {
    public Glacieros() {
        super("Glacieros",
                Type.ICE, Type.GROUND,
                new Stats(75, 120, 100, 50, 76, 84),
                List.of(Ability.ICE_BODY), Ability.SHEER_FORCE,
                19, 1320,
                new Stats(0,2,0,0,0,0), 80,
                0.875,
                140, ExperienceGroup.ERRATIC,
                70,
                48, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("Glacieros shares a common ancestor with the Rhyhorn family. The horn is encased in ice, which makes up about half of the total body weight of these Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRILL_RUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.ICE_SHARD,8),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,10),
                        new MoveLearnSetEntry(Move.HAIL,13),
                        new MoveLearnSetEntry(Move.SPIKES,17),
                        new MoveLearnSetEntry(Move.MAGNITUDE,21),
                        new MoveLearnSetEntry(Move.AVALANCHE,25),
                        new MoveLearnSetEntry(Move.BULLDOZE,31),
                        new MoveLearnSetEntry(Move.ICE_FANG,36),
                        new MoveLearnSetEntry(Move.SCARY_FACE,40),
                        new MoveLearnSetEntry(Move.FISSURE,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,51),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,60),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,67),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tutor"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.GROOM_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.SLACK_OFF,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
