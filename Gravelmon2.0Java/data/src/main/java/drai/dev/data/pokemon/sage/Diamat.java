package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Diamat extends Pokemon {
    public Diamat() {
        super("Diamat",
                Type.DRAGON, Type.ROCK,
                new Stats(95, 100, 125, 120, 100, 60),
                List.of(Ability.CLEAR_BODY, Ability.SHEER_FORCE), Ability.CONDITIONING,
                20, 4825,
                new Stats(0,0,2,1,0,0), 5,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.MINERAL, EggGroup.DRAGON),
                List.of("In battle, Diamat refracts light through its glittering body to blind foes, then finishes them off with its powerful, unbreakable claws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,1),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.HEADBUTT,10),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,25),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,30),
                        new MoveLearnSetEntry(Move.SCARY_FACE,33),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,39),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,46),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,54),
                        new MoveLearnSetEntry(Move.EARTH_POWER,60),
                        new MoveLearnSetEntry(Move.POWER_GEM,60),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,69),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,79),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,87),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,96),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:diamond",90, 1,2)
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .belowY(-30)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
