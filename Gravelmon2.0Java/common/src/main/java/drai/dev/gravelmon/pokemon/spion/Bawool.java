package drai.dev.gravelmon.pokemon.spion;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bawool extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bawool() {
        super("Bawool",
                Type.NORMAL,
                new Stats(70,
                        65,
                        90,
                        30,
                        50,
                        60),
                List.of(Ability.GLUTTONY,Ability.SAP_SIPPER), Ability.NORMALIZE,
                9, 220,
                new Stats(0,0,2,0,0,0), 127,
                0.5,
                132, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A Bawool's fleece regrows almost as quickly as another can eat it. Leaving a Bawool's fleece to grow too big will hinder its movement."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,7),
                        new MoveLearnSetEntry(Move.HEADBUTT,10),
                        new MoveLearnSetEntry(Move.BULK_UP,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,16),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,19),
                        new MoveLearnSetEntry(Move.HELPING_HAND,23),
                        new MoveLearnSetEntry(Move.BODY_SLAM,27),
                        new MoveLearnSetEntry(Move.STRENGTH,31),
                        new MoveLearnSetEntry(Move.SCREECH,35),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,39),
                        new MoveLearnSetEntry(Move.MILK_DRINK,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,47),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,51),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm")                        ),
                List.of(Label.SPION),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bawool");

    }


}
