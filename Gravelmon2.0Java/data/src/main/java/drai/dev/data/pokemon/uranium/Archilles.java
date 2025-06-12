package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Archilles extends Pokemon {
    public Archilles() {
        super("Archilles",
                Type.FIRE, Type.GROUND,
                new Stats(75,90,80,90,80,125),
                List.of(Ability.FLAME_BODY), Ability.BLAZE,
                19, 885,
                new Stats(0,0,0,0,0,3), 45,
                0.875,
                243, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER, EggGroup.DRAGON),
                List.of("With a specialized saddle and reins, ARCHILLES can be ridden. Make sure that you have earned its trust first."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.MAGNITUDE,27),
                        new MoveLearnSetEntry(Move.SLASH,31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,41),
                        new MoveLearnSetEntry(Move.FLAME_IMPACT,46),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,51),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,56),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BLAST_BURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),

                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"egg"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
