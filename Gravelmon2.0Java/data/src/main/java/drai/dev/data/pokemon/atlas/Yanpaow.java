package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Yanpaow extends drai.dev.data.pokemon.Pokemon {
    public Yanpaow() {
        super("Yanpaow",
                Type.DRAGON,
                new Stats(60,
                        100,
                        40,
                        150,
                        50,
                        120),
                List.of(Ability.ILLUMINATE,Ability.FLARE_BOOST,Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                19, 165,
                new Stats(0,0,0,3,0,0), 25,
                0.5,
                234, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.AMORPHOUS),
                List.of("Rarely seen, Yanpaow are attracted to celebrations and festivals all over the world. New colour variations are always being discovered."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.SCARY_FACE,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.FLAME_BURST,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,30),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,38),
                        new MoveLearnSetEntry(Move.WORK_UP,42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,48),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,54),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,70),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,75),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SOLARFLARE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO, Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Yanpaow");

    }


}
