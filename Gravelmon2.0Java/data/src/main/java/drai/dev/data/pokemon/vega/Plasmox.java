package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Plasmox extends Pokemon {
    public Plasmox() {
        super( "Plasmox",
                Type.ELECTRIC, Type.FAIRY,
                new Stats(30	,
                        60	,
                        50	,
                        75	,
                        55	,
                        70),
                List.of(Ability.STATIC), Ability.LIGHTNING_ROD,
                4, 50,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                92, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of("It enjoys generating electricity. Many people use one as a power source for their homes."),
                List.of(new EvolutionEntry("blitzune", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,6),
                        new MoveLearnSetEntry(Move.MACH_BOLT,11),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,15),
                        new MoveLearnSetEntry(Move.PURSUIT,20),
                        new MoveLearnSetEntry(Move.SPARK,25),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,29),
                        new MoveLearnSetEntry(Move.ENERGIZE,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,39),
                        new MoveLearnSetEntry(Move.VENGEANCE,43),
                        new MoveLearnSetEntry(Move.AGILITY,48),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,53),
                        new MoveLearnSetEntry(Move.THUNDER,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,62),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"egg"),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.METAL_SOUND,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"egg"),
                        new MoveLearnSetEntry(Move.RAGE,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT,"egg"),
                        new MoveLearnSetEntry(Move.RETURN,"egg"),
                        new MoveLearnSetEntry(Move.ROAR,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
