package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ankleaf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ankleaf() {
        super("Ankleaf",
                Type.GRASS,
                new Stats(60,
                        70,
                        75,
                        25,
                        45,
                        35),
                List.of(Ability.OVERGROW), Ability.CHLOROPHYLL,
                6, 159,
                new Stats(0,0,1,0,0,0), 45,
                0.75,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("- Tackle Normal 3 Growl Normal 6 Growth Normal 9 Vine WhipSTAB Grass 15 Body Slam Normal 21 Razor LeafSTAB Grass 25 Bonemerang Ground 32 Leech Seed Grass 35 Amnesia Psychic 42 Seed BombSTAB Grass 47 Bone Rush Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.GROWTH,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.BODY_SLAM,15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,21),
                        new MoveLearnSetEntry(Move.BONEMERANG,25),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.AMNESIA,35),
                        new MoveLearnSetEntry(Move.SEED_BOMB,42),
                        new MoveLearnSetEntry(Move.BONE_RUSH,47)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ankleaf");

    }


}
