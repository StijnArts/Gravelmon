package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Garakasago extends Pokemon {
    public Garakasago() {
        super( "Garakasago",
                Type.WATER, Type.POISON,
                new Stats(80	,
                        90,
                        60	,
                        125,
                        65,
                        100),
                List.of(Ability.POISON_POINT), Ability.MOLD_BREAKER,
                10, 298,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.POISON_STING,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,15),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,20),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,30),
                        new MoveLearnSetEntry(Move.CROSS_POISON,35),
                        new MoveLearnSetEntry(Move.INFECTION,40),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,45),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,50),
                        new MoveLearnSetEntry(Move.TOXIC,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60),
                        new MoveLearnSetEntry(Move.DEADLY_TOXIN,65),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.VILE_VENOM,"tm"),
                        new MoveLearnSetEntry(Move.FIN_SMACK,"tutor"),
                        new MoveLearnSetEntry(Move.DISABLE,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_VULCAN,"tutor"),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.SOAK,"tutor"),
                        new MoveLearnSetEntry(Move.BRINE,"tutor"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tutor"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
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
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
