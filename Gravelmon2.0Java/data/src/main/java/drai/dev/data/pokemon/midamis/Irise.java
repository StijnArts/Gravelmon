package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Irise extends drai.dev.data.pokemon.Pokemon {
    public Irise() {
        super("Irise",
                Type.ICE, Type.FIRE,
                new Stats(45,
                        50,
                        45,
                        65,
                        55,
                        65),
                List.of(Ability.SOUNDPROOF,Ability.CONTRARY,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                7, 165,
                new Stats(0,0,0,1,0,1), 130,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These Pokemon are deaf but are excellent lip readers. Irise and their Trainers have a true bond because of the level of trust both must have in the heat of battle."),
                List.of(new EvolutionEntry("yeraze", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,1),
                        new MoveLearnSetEntry(Move.HAZE,5),
                        new MoveLearnSetEntry(Move.FIRE_FANG,8),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,14),
                        new MoveLearnSetEntry(Move.FROST_BREATH,17),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,23),
                        new MoveLearnSetEntry(Move.BARRIER,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,51),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(26)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Irise");

    }


}
