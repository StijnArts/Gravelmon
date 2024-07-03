package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Bonzumi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bonzumi() {
        super("Bonzumi",
                Type.FIRE,
                new Stats(45,
                        45,
                        35,
                        60,
                        35,
                        50),
                List.of(Ability.FLASH_FIRE,Ability.GLUTTONY,Ability.RUN_AWAY), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                41, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Bonzumi are almost never tired and can go days without sleep due to their hyperactive energy. Known for their playful and hyper nature, they are the perfect companion for little children."),
                List.of(new EvolutionEntry("bonzire", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,18),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,21),
                        new MoveLearnSetEntry(Move.SWIFT,25),
                        new MoveLearnSetEntry(Move.FLAME_BURST,30),
                        new MoveLearnSetEntry(Move.RECYCLE,33),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,41),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA))),
                List.of(SpawnPreset.NEAR_LAVA),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonzumi");

    }


}
