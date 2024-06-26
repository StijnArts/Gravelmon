package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianArcanine extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianArcanine(String name, Aspect aspect) {
        super(name, aspect,"AristosianArcanine",
                Type.ICE, Type.PSYCHIC,
                new Stats(115,
                        70,
                        80,
                        95,
                        90,
                        105),
                List.of(Ability.INTIMIDATE,Ability.SNOW_CLOAK,Ability.SLUSH_RUSH), Ability.SLUSH_RUSH,
                21, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.75,
                194, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Legend says it can sense anyone who wanders the mountains it lives in. When Arcanine senses evil intentions it roars frightfully to bring heavy snowstorms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,1),
                        new MoveLearnSetEntry(Move.ICICLE_PUNCH,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,8),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,11),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,15),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,18),
                        new MoveLearnSetEntry(Move.HEART_STAMP,21),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,28),
                        new MoveLearnSetEntry(Move.ICY_KISS,33),
                        new MoveLearnSetEntry(Move.AVALANCHE,39),
                        new MoveLearnSetEntry(Move.BODY_SLAM,44),
                        new MoveLearnSetEntry(Move.FROSTBITE,51),
                        new MoveLearnSetEntry(Move.PERISH_SONG,59),
                        new MoveLearnSetEntry(Move.BLIZZARD,66)             ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 53, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arcanine");

    }


}
