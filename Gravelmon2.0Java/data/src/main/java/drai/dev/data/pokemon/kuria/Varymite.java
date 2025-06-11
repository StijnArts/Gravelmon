package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Varymite extends drai.dev.data.pokemon.Pokemon {
    public Varymite() {
        super("Varymite",
                Type.POISON, Type.COSMIC,
                new Stats(50,
                        44,
                        65,
                        80,
                        55,
                        43),
                List.of(Ability.WONDER_SKIN,Ability.ANTICIPATION), Ability.MAGIC_GUARD,
                7, 20,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                91, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Varymite are small but very potent. Some people claim a bite from Varymite temporarily sent them to another point in time and space."),
                List.of(new EvolutionEntry("varantox", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.ACID,11),
                        new MoveLearnSetEntry(Move.PURSUIT,14),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.SLAM,22),
                        new MoveLearnSetEntry(Move.GLARE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,35),
                        new MoveLearnSetEntry(Move.COIL,41),
                        new MoveLearnSetEntry(Move.TOXIC,46),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,55),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,60)                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Varymite");

    }


}
