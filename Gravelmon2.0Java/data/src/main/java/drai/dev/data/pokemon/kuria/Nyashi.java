package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nyashi extends drai.dev.data.pokemon.Pokemon {
    public Nyashi() {
        super("Nyashi",
                Type.GHOST, Type.FIGHTING,
                new Stats(52,
                        70,
                        47,
                        40,
                        49,
                        90),
                List.of(Ability.TOUGH_CLAWS,Ability.LIFEBLOOD), Ability.SHADOW_TAG,
                6, 55,
                new Stats(0,0,0,0,0,1), 45,
                0.0,
                83, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("There were rumors that Nyashi are actually deceased Pokémon, due to their pale, cold skin, and slow breathing pattern. However, numerous researches debunked that theory."),
                List.of(new EvolutionEntry("felinshii", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,6),
                        new MoveLearnSetEntry(Move.DISABLE,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,14),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,17),
                        new MoveLearnSetEntry(Move.PURSUIT,22),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,27),
                        new MoveLearnSetEntry(Move.BONE_RUSH,34),
                        new MoveLearnSetEntry(Move.TORMENT,39),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.BONEMERANG,53)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nyashi");

    }


}
