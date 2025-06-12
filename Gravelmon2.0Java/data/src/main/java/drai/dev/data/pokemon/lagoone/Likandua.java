package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Likandua extends drai.dev.data.pokemon.Pokemon {
    public Likandua() {
        super("Likandua",
                Type.NORMAL,
                new Stats(35,
                        51,
                        43,
                        30,
                        42,
                        44),
                List.of(Ability.QUICK_FEET), Ability.SNIPER,
                4, 190,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("tamanozzle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.BOUNCE,15),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.UPROAR,22),
                        new MoveLearnSetEntry(Move.JUMP_KICK,26),
                        new MoveLearnSetEntry(Move.MEGA_KICK,30),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,46)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Likandua");

    }


}
