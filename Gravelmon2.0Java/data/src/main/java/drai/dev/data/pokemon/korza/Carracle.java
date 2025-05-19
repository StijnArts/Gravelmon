package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carracle extends drai.dev.data.pokemon.Pokemon {
    public Carracle() {
        super("Carracle",
                Type.PSYCHIC,Type.FLYING,
                new Stats(80,
                        70,
                        70,
                        80,
                        115,
                        60),
                List.of(Ability.FOREWARN,Ability.ANTICIPATION), Ability.ANALYTIC,
                12, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Carracle use future sight to find its next meal. Orb protrusions on the wings strengthen its psychic abilities- damage to these will hinder its power."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,11),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,16),
                        new MoveLearnSetEntry(Move.SKY_DROP,20),
                        new MoveLearnSetEntry(Move.PSYBEAM,24),
                        new MoveLearnSetEntry(Move.TAILWIND,29),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,35),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.DEFOG,42),
                        new MoveLearnSetEntry(Move.AIR_SLASH,47),
                        new MoveLearnSetEntry(Move.CALM_MIND,51),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,56),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,60),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,66)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Carracle");

    }


}
