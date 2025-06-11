package drai.dev.data.pokemon.qamor;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grumpork extends drai.dev.data.pokemon.Pokemon {
    public Grumpork() {
        super("Grumpork",
                Type.FIGHTING,
                new Stats(90,
                        110,
                        105,
                        70,
                        60,
                        90),
                List.of(Ability.ANGER_POINT,Ability.UNAWARE), Ability.UNNERVE,
                19, 958,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                236, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Hammer ThrowSTAB Fighting - Circle ThrowSTAB Fighting - Bulk Up Fighting - Splash Normal - Storm ThrowSTAB Fighting - Rock SmashSTAB Fighting - Odor Sleuth  Normal - Torment  Dark - Wood Hammer Grass - Hammer ThrowSTAB Fighting - Hammer ArmSTAB Fighting - Rock Throw Rock 7 Rock SmashSTAB Fighting 10 Odor Sleuth  Normal 14 Knock BackSTAB Fighting 15 Psych Up Normal 18 Revenge STAB Fighting 21 Magic Coat  Psychic 26 Zen Headbutt Psychic 29 Power Gem Rock 35 Rest Psychic 35 Snore  Normal 42 Body Press STAB Fighting 46 Payback  Dark 52 Close CombatSTAB Fighting 60 Bounce Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.HAMMERTHROW,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.STORM_THROW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.KNOCKBACK,14),
                        new MoveLearnSetEntry(Move.PSYCH_UP,15),
                        new MoveLearnSetEntry(Move.REVENGE,18),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,21),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,26),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.SNORE,35),
                        new MoveLearnSetEntry(Move.REST,35),
                        new MoveLearnSetEntry(Move.BODY_PRESS,42),
                        new MoveLearnSetEntry(Move.PAYBACK,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,52),
                        new MoveLearnSetEntry(Move.BOUNCE,60),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grumpork");

    }


}
