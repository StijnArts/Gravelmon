package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dokangu extends Pokemon {
    public Dokangu() {
        super( "Dokangu",
                Type.NORMAL, Type.FLYING,
                new Stats(82,
                        106,
                        82,
                        54,
                        72,
                        80),
                List.of(Ability.SNIPER), Ability.SHEER_FORCE,
                14, 497,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                205, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STEEL_WING,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.WARBLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.WARBLE,9),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.WING_ATTACK,18),
                        new MoveLearnSetEntry(Move.HAIRPIN_TURN,19),
                        new MoveLearnSetEntry(Move.WHIRLWIND,22),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,27),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.JET_STRIKE,35),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,39),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,46),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,52),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,60),

                        new MoveLearnSetEntry(Move.GLIDE,"tutor"),
                        new MoveLearnSetEntry(Move.LEER,"tutor"),
                        new MoveLearnSetEntry(Move.SNARL,"tutor"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.TORMENT,"tutor"),
                        new MoveLearnSetEntry(Move.CORNER,"tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tutor"),
                        new MoveLearnSetEntry(Move.QUICK_TURN,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor"),

                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.MYSTIC_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.JET_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FACADE,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.TWISTER,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.UTURN,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_COLD, Biome.IS_SUMMER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
