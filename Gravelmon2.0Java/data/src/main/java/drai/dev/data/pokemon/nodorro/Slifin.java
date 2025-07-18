package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slifin extends drai.dev.data.pokemon.Pokemon {
    public Slifin() {
        super("Slifin",
                Type.WATER,
                new Stats(50,
                        100,
                        60,
                        65,
                        55,
                        90),
                List.of(Ability.MOXIE,Ability.INTIMIDATE), Ability.RAZORFINS,
                14, 560,
                new Stats(0,2,0,0,0,0), 120,
                0.25,
                120, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("Sharphins live in groups up to 7 individuals. They hunt together on much larger prey such as inquids and even bigger."),
                List.of(new EvolutionEntry("draquafin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
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
                ),new PokemonSpawnDataBuilder(2)
                        .pseudoLegend()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Slifin");

    }


}
