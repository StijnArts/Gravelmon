package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Neeten extends drai.dev.data.pokemon.Pokemon {
    public Neeten() {
        super("Neeten",
                Type.POISON, Type.FLYING,
                new Stats(50,
                        65,
                        40,
                        40,
                        45,
                        45),
                List.of(Ability.POISON_TOUCH,Ability.SUPER_LUCK,Ability.SNIPER), Ability.SNIPER,
                4, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                48, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A shy Pokemon that lives inside small caves. Their venom is not very potent but they are always under protection of their mother."),
                List.of(new EvolutionEntry("needlion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.POISON_STING,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ROAR,21),
                        new MoveLearnSetEntry(Move.ASSIST,25),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,28),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,33),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.EMBARGO,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,45)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Neeten");

    }


}
