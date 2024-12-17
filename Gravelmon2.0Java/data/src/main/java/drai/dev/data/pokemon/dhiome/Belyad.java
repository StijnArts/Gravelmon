package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Belyad extends drai.dev.data.pokemon.Pokemon {
    public Belyad(Stats stats) {
        super("Belyad",
                Type.GRASS, Type.FAIRY,
                stats,
                List.of(Ability.SERENE_GRACE), Ability.COMPETITIVE,
                13, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's eerie, beautiful songs can be heard at the heart of old forests. They pose as trees near bodies of water so they can always see their reflection."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.GROWTH,18),
                        new MoveLearnSetEntry(Move.POISON_POWDER,21),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.CHARM,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,36),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,39),
                        new MoveLearnSetEntry(Move.ENDEAVOR,42),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,48)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 43, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Belyad");

    }


}
