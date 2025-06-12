package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Canvalith extends drai.dev.data.pokemon.Pokemon {
    public Canvalith() {
        super("Canvalith",
                Type.ROCK, Type.FAIRY,
                new Stats(55,
                        70,
                        150,
                        60,
                        120,
                        45),
                List.of(Ability.BODYGUARD,Ability.FRIEND_GUARD,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                20, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.0,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("This Pokemon allows people to paint on its body because it feeds on the materials in the paint. Eventually, the paint is absorbed and it becomes a blank canvas again."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,5),
                        new MoveLearnSetEntry(Move.BLOCK,9),
                        new MoveLearnSetEntry(Move.CUDDLE,13),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,17),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,23),
                        new MoveLearnSetEntry(Move.COPYCAT,26),
                        new MoveLearnSetEntry(Move.BARRIER,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,32),
                        new MoveLearnSetEntry(Move.REFRESH,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.PSYCH_UP,45),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,60),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Canvalith");

    }


}
