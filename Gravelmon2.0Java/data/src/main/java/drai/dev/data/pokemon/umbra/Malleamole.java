package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Malleamole extends Pokemon {
    public Malleamole() {
        super("Malleamole",
                Type.STEEL,
                new Stats(85,
                        85,
                        85,
                        40,
                        40,
                        45),
                List.of(Ability.TOUGH_CLAWS), Ability.RATTLED,
                7, 120,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                76, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.FIELD),
                List.of("The tendrils on its nose can be shortened and lengthened, to an extent. It moves them around to feel its way forward."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.METAL_CLAW,9),
                        new MoveLearnSetEntry(Move.MAGNITUDE,12),
                        new MoveLearnSetEntry(Move.ROLLOUT,16),
                        new MoveLearnSetEntry(Move.DIG,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,28),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,32),
                        new MoveLearnSetEntry(Move.SAND_TOMB,37),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,47),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,52),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,58),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .cantSeeSky()
    .belowY(20)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
