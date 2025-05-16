package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drifloat extends drai.dev.data.pokemon.Pokemon {
    public Drifloat() {
        super("Drifloat",
                Type.POISON,Type.WATER,
                new Stats(90,
                        44,
                        34,
                        85,
                        75,
                        20),
                List.of(Ability.MERCILESS), Ability.WINDPROPULSION,
                0, 0,
                new Stats(1,0,0,0,0,0), 125,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("- Minimize Normal - Poison StingSTAB Poison 4 Wrap Normal 8 Tickle Normal 12 Payback Dark 16 Hex Ghost 20 BrineSTAB Water 24 Venom Drench Poison 24 VenoshockSTAB Poison 29 SurfSTAB Water 32 Destiny Bond (N) Ghost 36 Haze Ice 40 Toxic Poison 44 Sludge WaveSTAB Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.WRAP,4),
                        new MoveLearnSetEntry(Move.TICKLE,8),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.HEX,16),
                        new MoveLearnSetEntry(Move.BRINE,20),
                        new MoveLearnSetEntry(Move.VENOSHOCK,24),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,24),
                        new MoveLearnSetEntry(Move.SURF,29),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,32),
                        new MoveLearnSetEntry(Move.HAZE,36),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,44),
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
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Drifloat");

    }


}
