package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chandemise extends drai.dev.data.pokemon.Pokemon {
    public Chandemise() {
        super("Chandemise",
                Type.FIRE, Type.GHOST,
                new Stats(70,
                        70,
                        82,
                        110,
                        83,
                        90),
                List.of(Ability.FLAME_BODY,Ability.ILLUMINATE,Ability.FIERYSPIRIT), Ability.FIERYSPIRIT,
                25, 165,
                new Stats(0,2,0,0,1,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- OverheatSTAB Fire - Phantom ForceSTAB Ghost - Night ShadeSTAB Ghost 5 EmberSTAB Fire 9 Confuse Ray Ghost 11 Ominous WindSTAB Ghost 16 Flame BurstSTAB Fire 20 Grudge Ghost 24 IncinerateSTAB Fire 29 Will-O-Wisp Fire 33 HexSTAB Ghost 39 Dazzling Gleam Fairy 43 Fire BlastSTAB Fire 48 Shadow BallSTAB Ghost 50 Memento Dark 54 PoltergeistSTAB Ghost 60 Recover Normal 65 InfernoSTAB Fire 73 Perish Song Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,9),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,11),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.GRUDGE,20),
                        new MoveLearnSetEntry(Move.INCINERATE,24),
                        new MoveLearnSetEntry(Move.WILLOWISP,29),
                        new MoveLearnSetEntry(Move.HEX,33),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,39),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,43),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,48),
                        new MoveLearnSetEntry(Move.MEMENTO,50),
                        new MoveLearnSetEntry(Move.POLTERGEIST,54),
                        new MoveLearnSetEntry(Move.RECOVER,60),
                        new MoveLearnSetEntry(Move.INFERNO,65),
                        new MoveLearnSetEntry(Move.PERISH_SONG,73)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(48)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Chandemise");

    }


}
