package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dangsemble extends drai.dev.data.pokemon.Pokemon {
    public Dangsemble() {
        super("Dangsemble",
                Type.WATER,Type.NORMAL,
                new Stats(132,
                        52,
                        62,
                        78,
                        92,
                        54),
                List.of(Ability.SAP_SIPPER,Ability.SKILL_LINK), Ability.MULTISCALE,
                15, 0,
                new Stats(2,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Stockpile Normal - Swallow Normal - Spit UpSTAB Normal - Tail SlapSTAB Normal - BarrageSTAB Normal - Double HitSTAB Normal - Double SlapSTAB Normal - Aqua Ring Water - BubbleSTAB Water - Grassy Glide Grass - Water GunSTAB Water - Water PulseSTAB Water - Substitute (N) Normal - Mimic (N) Normal - Body Press Fighting - Body SlamSTAB Normal - BrineSTAB Water - Grassy Terrain Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.MIMIC,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.SPIT_UP,1),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.AQUA_RING,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.SWALLOW,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.BARRAGE,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dangsemble");

    }


}
