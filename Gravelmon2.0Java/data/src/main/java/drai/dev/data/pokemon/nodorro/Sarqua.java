package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sarqua extends drai.dev.data.pokemon.Pokemon {
    public Sarqua() {
        super("Sarqua",
                Type.WATER,
                new Stats(50,
                        70,
                        40,
                        50,
                        35,
                        55),
                List.of(Ability.MOXIE,Ability.INTIMIDATE), Ability.RAZORFINS,
                4, 340,
                new Stats(0,1,0,0,0,0), 255,
                0.75,
                58, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("These small hunters hunt for small fish in the lagunes of the Nodorro region."),
                List.of(new EvolutionEntry("Slifin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.CUT,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,3),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,7),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,10),
                        new MoveLearnSetEntry(Move.BITE,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,23),
                        new MoveLearnSetEntry(Move.SLASH,25),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,29),
                        new MoveLearnSetEntry(Move.WATERFALL,36),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
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
                ),new PokemonSpawnDataBuilder(1)
                        .pseudoLegend()
                        .setContext(SpawnContext.SUBMERGED)
                    .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Sarqua");

    }


}
