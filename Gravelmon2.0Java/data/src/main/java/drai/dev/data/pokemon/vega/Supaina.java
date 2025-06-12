package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Supaina extends Pokemon {
    public Supaina() {
        super( "Supaina",
                Type.WATER, Type.ELECTRIC,
                new Stats(80	,
                        65,
                        125	,
                        100,
                        90,
                        60),
                List.of(Ability.MARVEL_SCALE), Ability.ILLUMINATE,
                13, 323,
                new Stats(0,0,2,0,0,0), 60,
                0.5,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,10),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.SPARK,30),
                        new MoveLearnSetEntry(Move.MEGA_SHOCK,35),
                        new MoveLearnSetEntry(Move.CHARGE,40),
                        new MoveLearnSetEntry(Move.SCALD,45),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,50),
                        new MoveLearnSetEntry(Move.ENERGIZE,55),
                        new MoveLearnSetEntry(Move.DELUGE,60),
                        new MoveLearnSetEntry(Move.THUNDER,65),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FIN_SMACK,"tutor"),
                        new MoveLearnSetEntry(Move.DISABLE,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_VULCAN,"tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SOAK,"tutor"),
                        new MoveLearnSetEntry(Move.BRINE,"tutor"),
                        new MoveLearnSetEntry(Move.MINIMIZE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tutor"),
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
