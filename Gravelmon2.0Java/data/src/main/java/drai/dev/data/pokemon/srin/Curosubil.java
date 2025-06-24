package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Curosubil extends drai.dev.data.pokemon.Pokemon {
    public Curosubil() {
        super("Curosubil",
                Type.COSMIC,Type.FLYING,
                new Stats(68,
                        108,
                        68,
                        88,
                        68,
                        108),
                List.of(Ability.AERILATE), Ability.SPIRITBOUND,
                16, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Cu'rosubil soar above the beaded spires over certain pagodas; whom works as portals to another world. Their crossed beaks can break any unwanted spirit trying to enter the Astral Planes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAW_LOCK,1),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.MIND_READER,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.BEAK_BLAST,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.SKY_DROP,1),
                        new MoveLearnSetEntry(Move.REFLECT,1),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Cu'rosubil");

    }


}
