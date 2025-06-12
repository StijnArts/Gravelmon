package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gemeral extends drai.dev.data.pokemon.Pokemon {
    public Gemeral() {
        super("Gemeral",
                Type.ROCK, Type.LIGHT,
                new Stats(56,
                        40,
                        94,
                        80,
                        74,
                        31),
                List.of(Ability.STURDY), Ability.SAP_SIPPER,
                7, 326,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("The crystal Gemeral grow on their back allows them to take in energy. They store massive amounts of energy within and only release it when they feel threatened."),
                List.of(new EvolutionEntry("lushan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(     new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.BLOCK,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.COUNTER,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55)                   ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 14, 31, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.AMETHYST_GEODE),
                0.28, 0.3,
                List.of());
           setLangFileName("Gemeral");

    }


}
