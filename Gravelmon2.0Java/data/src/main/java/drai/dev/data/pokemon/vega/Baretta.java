package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Baretta extends Pokemon {
    public Baretta() {
        super( "Baretta",
                Type.WATER, Type.STEEL,
                new Stats(80	,
                        100,
                        90	,
                        65,
                        60,
                        125),
                List.of(Ability.ROCK_HEAD), Ability.RECKLESS,
                21, 521,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SPLATTER,1),
                        new MoveLearnSetEntry(Move.SPEEDMITE,1),
                        new MoveLearnSetEntry(Move.SPLATTER,5),
                        new MoveLearnSetEntry(Move.SPEEDMITE,10),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.METAL_SOUND,20),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,45),
                        new MoveLearnSetEntry(Move.ROCKET_DRIVE,50),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,55),
                        new MoveLearnSetEntry(Move.AQUA_IMPACT,60),
                        new MoveLearnSetEntry(Move.METAL_BLAST,65),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FIN_SMACK,"tutor"),
                        new MoveLearnSetEntry(Move.DISABLE,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_VULCAN,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SOAK,"tutor"),
                        new MoveLearnSetEntry(Move.BRINE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tutor"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.DELUGE,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.DEWDROP,"egg"),
                        new MoveLearnSetEntry(Move.SPLATTER,"egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 29, 45, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
