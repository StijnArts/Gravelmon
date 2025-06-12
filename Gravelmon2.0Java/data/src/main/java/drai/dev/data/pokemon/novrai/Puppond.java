package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Puppond extends drai.dev.data.pokemon.Pokemon {
    public Puppond() {
        super("Puppond",
                Type.WATER,
                new Stats(37,
                        48,
                        35,
                        45,
                        40,
                        75),
                List.of(Ability.SWIFT_SWIM,Ability.COURAGEOUS,Ability.LIMBER), Ability.LIMBER,
                2, 165,
                new Stats(0,0,0,0,0,1), 160,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Originally, it was trained to herd fish into a net so they could be easily scooped out of the water. It's a loyal pet for those who don't mind the wet dog smell."),
                List.of(new EvolutionEntry("pembrook", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.HOWL,10),
                        new MoveLearnSetEntry(Move.PURSUIT,13),
                        new MoveLearnSetEntry(Move.AQUA_JET,16),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,19),
                        new MoveLearnSetEntry(Move.CUDDLE,22),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.BATTLEROAR,31),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,34),
                        new MoveLearnSetEntry(Move.REVERSAL,37),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,40),
                        new MoveLearnSetEntry(Move.COACHING,43),
                        new MoveLearnSetEntry(Move.ME_FIRST,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,49),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,52),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEROAR,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.AQUASLAP,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Puppond");

    }


}
