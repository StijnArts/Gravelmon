package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sabrinel extends Pokemon {
    public Sabrinel() {
        super( "Sabrinel",
                Type.FIRE, Type.FLYING,
                new Stats(60	,
                        95	,
                        75	,
                        85	,
                        55	,
                        103),
                List.of(Ability.FLASH_FIRE), Ability.PICKUP,
                5, 108,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                149, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It glides by spreading the membrane between its front and back legs. While gliding, it sprinkles flame below it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.GLIDE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.GLIDE,8),
                        new MoveLearnSetEntry(Move.HYPER_FANG,11),
                        new MoveLearnSetEntry(Move.ENCORE,15),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,18),
                        new MoveLearnSetEntry(Move.SUPER_FANG,22),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,25),
                        new MoveLearnSetEntry(Move.SANDBLAST,28),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.AIR_SLASH,40),
                        new MoveLearnSetEntry(Move.ANGRY_SWARM,44),
                        new MoveLearnSetEntry(Move.SWITCHEROO,49),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,53),
                        new MoveLearnSetEntry(Move.WORK_UP,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,62),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.DIG,"egg"),
                        new MoveLearnSetEntry(Move.DIZZY_WHIRL,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"egg"),
                        new MoveLearnSetEntry(Move.FLATTER,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MINIMIZE,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"egg"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SPIN_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
