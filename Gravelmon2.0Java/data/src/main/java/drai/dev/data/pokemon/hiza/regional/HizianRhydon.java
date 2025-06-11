package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianRhydon extends drai.dev.data.pokemon.Pokemon {
    public HizianRhydon(String name, Aspect aspect) {
        super(name, aspect, "Rhydon",
                Type.ICE, Type.FIGHTING,
                new Stats(105,
                        130,
                        120,
                        45,
                        45,
                        40),
                List.of(Ability.MOUNTAINEER), Ability.THICK_FAT,
                19, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("It goes through rigorous training in the montains to keep its body warm and grow stronger. Whenever it finds other Pokemon lost in its mountains it tries to guide them back to safety."),
                List.of(new EvolutionEntry("rhyferal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rhydon");

    }


}
