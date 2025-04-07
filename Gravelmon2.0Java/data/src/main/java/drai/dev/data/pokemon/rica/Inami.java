package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Inami extends drai.dev.data.pokemon.Pokemon {
    public Inami() {
        super("Inami",
                Type.WATER,
                new Stats(100,
                        117,
                        80,
                        95,
                        80,
                        108),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- BrineSTAB Water - Howl Normal 5 Noble Roar Normal 10 Team Up Normal 15 Aqua JetSTAB Water 20 Helping Hand Normal 25 Squall Flying 30 Roar Normal 35 Slash Normal 40 LiquidationSTAB Water 45 Life Dew Water 50 Dragon Claw Dragon 55 Depth ChargeSTAB Water 60 Hurricane Flying 65 Dragon Dance Dragon 70 Hydro PumpSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,5),
                        new MoveLearnSetEntry(Move.TEAMUP,10),
                        new MoveLearnSetEntry(Move.AQUA_JET,15),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.SQUALL,25),
                        new MoveLearnSetEntry(Move.ROAR,30),
                        new MoveLearnSetEntry(Move.SLASH,35),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.LIFE_DEW,45),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,55),
                        new MoveLearnSetEntry(Move.HURRICANE,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,70)                        ),
                List.of(Label.RICA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Inami");

    }


}
