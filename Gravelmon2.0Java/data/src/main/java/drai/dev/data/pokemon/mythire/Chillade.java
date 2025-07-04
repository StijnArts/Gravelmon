package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chillade extends drai.dev.data.pokemon.Pokemon {
    public Chillade() {
        super("Chillade",
                Type.ICE, Type.STEEL,
                new Stats(40,
                        55,
                        80,
                        40,
                        75,
                        30),
                List.of(Ability.BOMBARDIER,Ability.BATTLE_ARMOR,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("Frosillade", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.BOLT_IN,1),
                        new MoveLearnSetEntry(Move.ICY_CHARGE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.COURT_CHANGE,1),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.SNOWGRENADE,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REBOUNDSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Chillade");

    }


}
