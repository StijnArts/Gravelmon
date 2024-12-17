package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Golmol extends drai.dev.data.pokemon.Pokemon {
    public Golmol() {
        super("Golmol",
                Type.GHOST, Type.GROUND,
                new Stats(60,
                        85,
                        30,
                        30,
                        50,
                        50),
                List.of(Ability.SUPER_LUCK), Ability.TOUGH_CLAWS,
                8, 10,
                new Stats(0,1,0,0,0,0), 75,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FIELD),
                List.of("By phasing through the floor and walls they can reach any place without making noise, however they still have to dig tunnels to not get themselves lost underground."),
                List.of(new EvolutionEntry("phanchasm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(          new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.BONE_CLUB,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,31),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,35),
                        new MoveLearnSetEntry(Move.FLING,39),
                        new MoveLearnSetEntry(Move.BONEMERANG,43),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,51)              ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Golmol");

    }


}
