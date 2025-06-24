package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orecadia extends drai.dev.data.pokemon.Pokemon {
    public Orecadia() {
        super("Orecadia",
                Type.ROCK,Type.FAIRY,
                new Stats(90,
                        86,
                        94,
                        113,
                        94,
                        40),
                List.of(Ability.CLEAR_BODY), Ability.MIRROR_ARMOR,
                16, 0,
                new Stats(0,0,0,2,0,0), 130,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Light Screen Psychic - Power GemSTAB Rock - Floral Healing Fairy - Stone EdgeSTAB Rock - Rock TombSTAB Rock - Mirror Shot Steel - Mirror Move Flying - Dazzling GleamSTAB Fairy - Rock Polish Rock - Block Normal - AccelerockSTAB Rock - Fairy WindSTAB Fairy - Iron Defense Steel - Harden Normal - Aromatic Mist Fairy - Crafty Shield Fairy - Stealth Rock Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Orecadia");

    }


}
