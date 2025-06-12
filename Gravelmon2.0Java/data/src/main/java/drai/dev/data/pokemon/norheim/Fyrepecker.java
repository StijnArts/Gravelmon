package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Fyrepecker extends drai.dev.data.pokemon.Pokemon {
    public Fyrepecker() {
        super("Fyrepecker",
                Type.FLYING, Type.FIRE,
                new Stats(65,
                        115,
                        65,
                        75,
                        65,
                        80),
                List.of(Ability.BIG_PECKS,Ability.SKILL_LINK,Ability.STEELWORKER), Ability.STEELWORKER,
                16, 165,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                163, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.FLURRYPECK,12),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.STEEL_WING,26),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,30),
                        new MoveLearnSetEntry(Move.BLAZEARROW,34),
                        new MoveLearnSetEntry(Move.ROOST,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,44),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,54),
                        new MoveLearnSetEntry(Move.DRILL_RUN,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
