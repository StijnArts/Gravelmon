package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Shimm extends drai.dev.data.pokemon.Pokemon {
    public Shimm() {
        super("Shimm",
                Type.PSYCHIC,
                new Stats(70,
                        73,
                        55,
                        47,
                        41,
                        40),
                List.of(Ability.MAGICIAN), Ability.SUPER_LUCK,
                7, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                88, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Believed to be a magic box that was brought to life by a magician, pulling out the dagger from it will kill it."),
                List.of(new EvolutionEntry("zhimm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.IMPRISON,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,1),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,1),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,1),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,1),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,1),
                        new MoveLearnSetEntry(Move.TWIN_BLADE,1),
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shimm");

    }


}
