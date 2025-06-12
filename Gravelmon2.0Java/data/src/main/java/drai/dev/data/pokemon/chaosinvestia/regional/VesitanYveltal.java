package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanYveltal extends drai.dev.data.pokemon.Pokemon {
    public VesitanYveltal(String name, Aspect aspect) {
        super(name, aspect, "VesitanYveltal",
                Type.DARK,Type.FIRE,
                new Stats(126,
                        131,
                        95,
                        99,
                        131,
                        98),
                List.of(Ability.DARK_AURA), null,
                58, 2030,
                new Stats(3,0,0,0,0,0), 70,
                -1.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Wenn Schwingen und Schwanzgefieder dieses Legendären Pokémon anfangen zu brennen, entzieht es Lebewesen deren Energie."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,44),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,88),
                        new MoveLearnSetEntry(Move.DISABLE,35),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,80),
                        new MoveLearnSetEntry(Move.AIR_SLASH,10),
                        new MoveLearnSetEntry(Move.OBLIVION_WING,26),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,51),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,93),
                        new MoveLearnSetEntry(Move.PSYCHIC,59),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,1),
                        new MoveLearnSetEntry(Move.SNARL,18),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,55),
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,72),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,63)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_SOUL_FIRE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Yveltal");

    }


}
