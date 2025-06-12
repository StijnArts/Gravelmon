package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barbray extends drai.dev.data.pokemon.Pokemon {
    public Barbray() {
        super("Barbray",
                Type.WATER, Type.POISON,
                new Stats(75,
                        115,
                        110,
                        65,
                        70,
                        75),
                List.of(Ability.POISON_POINT,Ability.IRON_BARBS), Ability.INTIMIDATE,
                11, 39,
                new Stats(0,1,1,0,0,0), 45,
                0.5,
                86, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Barbray are an evolution exclusive to the breed of Qwilfish found in Fliga. Their toxins are amplified ten-fold, and they no longer need to inflate to fire the needles that hold it. Barbray are fiercely territorial, using their fierce appearance to ward away would-be predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,9),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.BUBBLE,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,21),
                        new MoveLearnSetEntry(Move.SPIT_UP,25),
                        new MoveLearnSetEntry(Move.STOCKPILE,25),
                        new MoveLearnSetEntry(Move.REVENGE,29),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,37),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,41),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,45),
                        new MoveLearnSetEntry(Move.POISON_JAB,49),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,53),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57),
                        new MoveLearnSetEntry(Move.FELL_STINGER,60),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Barbray");

    }


}
