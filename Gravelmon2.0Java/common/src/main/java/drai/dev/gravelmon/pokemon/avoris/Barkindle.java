package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Barkindle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Barkindle() {
        super("Barkindle",
                Type.FIRE,
                new Stats(43,
                        51,
                        43,
                        52,
                        55,
                        66),
                List.of(Ability.BLAZE), Ability.VITAL_SPIRIT,
                8, 165,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Barkindle are a popular favorite among the locals in Avoris. However, they are rare and very hard to obtain. In addition to being devoted and playful, they are also beloved by the people for their warm, cuddly bodies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,7),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,9),
                        new MoveLearnSetEntry(Move.HOWL,13),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,19),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,21),
                        new MoveLearnSetEntry(Move.FIRE_FANG,25),
                        new MoveLearnSetEntry(Move.ROAR,27),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,31),
                        new MoveLearnSetEntry(Move.SLASH,34),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.AGILITY,39),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,43)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barkindle");

    }


}
