package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Draquafin extends drai.dev.data.pokemon.Pokemon {
    public Draquafin() {
        super("Draquafin",
                Type.WATER, Type.DRAGON,
                new Stats(75,
                        142,
                        90,
                        115,
                        75,
                        103),
                List.of(Ability.MOXIE,Ability.INTIMIDATE), Ability.RAZORFINS,
                20, 1002,
                new Stats(0,2,2,0,0,0), 45,
                0.5,
                234, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("Draquafin mostly rule over the entire sea they claim as their territory, sometimes even named as the king of the sea. their extremly sharp fins can cut through any material known to man."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,5),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,12),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,17),
                        new MoveLearnSetEntry(Move.SLASH,19),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,21),
                        new MoveLearnSetEntry(Move.WATERFALL,29),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,43),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,51),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,60),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .pseudoLegend()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Draquafin");

    }


}
