package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianRhyhorn extends drai.dev.data.pokemon.Pokemon {
    public HizianRhyhorn(String name, Aspect aspect) {
        super(name, aspect, "Rhyhorn",
                Type.ICE,
                new Stats(80,
                        85,
                        95,
                        30,
                        30,
                        25),
                List.of(Ability.MOUNTAINEER), Ability.THICK_FAT,
                10, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                69, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("The thick fur that covers its body protects from extreme cold. The most violent blizzard would not stop it on its track."),
                List.of(new EvolutionEntry("HizianRhydon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.MIST,20),
                        new MoveLearnSetEntry(Move.ENDURE,25),
                        new MoveLearnSetEntry(Move.ICY_WIND,30),
                        new MoveLearnSetEntry(Move.AMNESIA,37),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,44),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,51),
                        new MoveLearnSetEntry(Move.BLIZZARD,58),
                        new MoveLearnSetEntry(Move.THRASH,65)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rhyhorn");

    }


}
