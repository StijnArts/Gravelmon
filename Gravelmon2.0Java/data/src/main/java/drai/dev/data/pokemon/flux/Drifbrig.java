package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drifbrig extends drai.dev.data.pokemon.Pokemon {
    public Drifbrig() {
        super("Drifbrig",
                Type.POISON,Type.WATER,
                new Stats(150,
                        54,
                        44,
                        115,
                        105,
                        30),
                List.of(Ability.MERCILESS), Ability.WINDPROPULSION,
                0, 0,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                174, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("Evo DiveSTAB Water - Soak Water - Minimize Normal - Poison StingSTAB Poison - Wrap Normal - Tickle Normal 12 Payback Dark 16 Hex Ghost 20 BrineSTAB Water 24 Venom Drench Poison 24 VenoshockSTAB Poison 31 SurfSTAB Water 36 Destiny Bond (N) Ghost 42 Haze Ice 48 Toxic Poison 54 Sludge WaveSTAB Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.DIVE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.HEX,16),
                        new MoveLearnSetEntry(Move.BRINE,20),
                        new MoveLearnSetEntry(Move.VENOSHOCK,24),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,24),
                        new MoveLearnSetEntry(Move.SURF,31),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,36),
                        new MoveLearnSetEntry(Move.HAZE,42),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,54),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Drifbrig");

    }


}
