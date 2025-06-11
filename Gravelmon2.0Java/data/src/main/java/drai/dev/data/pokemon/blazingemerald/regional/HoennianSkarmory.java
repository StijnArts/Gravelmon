package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianSkarmory extends Pokemon {
    public HoennianSkarmory(String name, Aspect aspect) {
        super(name, aspect,"HoennianSkarmory",
                Type.STEEL, Type.FIRE,
                new Stats(85, 100,110,35,80,90),
                List.of(Ability.RESOLUTE), Ability.FLASH_FIRE,
                UnitConverter.feetToMeters(5, 11), UnitConverter.lbsToKg(1146),
                new Stats(0,1,1,0,0,1), 25,
                0.5,
                163, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("A Pokemon that has a body and wings of molten steel. In the heat of battle, the blades on its wings glow white-hot and emit clouds of burning steam."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.STEEL_WING,10),
                        new MoveLearnSetEntry(Move.SIZZLE_BEAK,13),
                        new MoveLearnSetEntry(Move.CUT,16),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,26),
                        new MoveLearnSetEntry(Move.WHIRLWIND,29),
                        new MoveLearnSetEntry(Move.ROOST,32),
                        new MoveLearnSetEntry(Move.IRON_HEAD,38),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,45),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                ),
                List.of(Label.GEN2,Label.BLAZING_EMERALD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(20)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_THERMAL, Biome.IS_NETHER_BASALT, Biome.IS_NETHER_SOUL_SAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Skarmory");
        this.setCanFly(true);
    }
}
