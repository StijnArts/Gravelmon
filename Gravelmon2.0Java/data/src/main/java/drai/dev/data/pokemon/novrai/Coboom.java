package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coboom extends drai.dev.data.pokemon.Pokemon {
    public Coboom() {
        super("Coboom",
                Type.GRASS, Type.FIRE,
                new Stats(70,
                        139,
                        68,
                        102,
                        62,
                        84),
                List.of(Ability.AFTERMATH,Ability.NO_GUARD,Ability.RECKLESS), Ability.RECKLESS,
                14, 165,
                new Stats(0,2,0,1,0,0), 45,
                0.5,
                236, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its evolution almost always comes with a violent explosion. Farmers employ it to scare birds away from their crops using its deafening detonations."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.EMBER,12),
                        new MoveLearnSetEntry(Move.WORRY_SEED,16),
                        new MoveLearnSetEntry(Move.BULLET_SEED,18),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,29),
                        new MoveLearnSetEntry(Move.SEED_BOMB,34),
                        new MoveLearnSetEntry(Move.UPROAR,37),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.EXPLOSION,48),
                        new MoveLearnSetEntry(Move.LEAF_STORM,54),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,60),
                        new MoveLearnSetEntry(Move.CHLOROBLAST,65),
                        new MoveLearnSetEntry(Move.MIND_BLOWN,68),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHTUP,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BURN_UP,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FURY,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_COLD, Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Coboom");

    }


}
