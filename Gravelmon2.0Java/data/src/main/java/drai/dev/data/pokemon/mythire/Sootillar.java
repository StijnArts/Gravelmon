package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sootillar extends drai.dev.data.pokemon.Pokemon {
    public Sootillar() {
        super("Sootillar",
                Type.BUG, Type.POISON,
                new Stats(25,
                        20,
                        30,
                        20,
                        45,
                        40),
                List.of(Ability.SHIELD_DUST,Ability.UNBURDEN,Ability.TINTED_LENS), Ability.TINTED_LENS,
                8, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                36, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("A hardy Bug Pokemon that thrives even in heavily industrialized areas. It's considered a pest as it likes to enter houses through chimneys, attracted by the soot lining the inside."),
                List.of(new EvolutionEntry("cloakhrys", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_POWDER,6),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,9),
                        new MoveLearnSetEntry(Move.SMOG,12),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.SLUDGE,17),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,20),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,24),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.WEBSLAM,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Sootillar");

    }


}
