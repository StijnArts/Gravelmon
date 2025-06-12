package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianSkiploom extends drai.dev.data.pokemon.Pokemon {
    public AyreianSkiploom(String name, Aspect aspect) {
        super(name, aspect, "Skiploom",
                Type.POISON,Type.PSYCHIC,
                new Stats(90,
                        25,
                        50,
                        70,
                        75,
                        65),
                List.of(Ability.PRANKSTER,Ability.PARASOMNIA), null,
                6, 10,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("The 'planteye' on top of its head releases a somniferous powder. This property is used in narcotics."),
                List.of(new EvolutionEntry("jumpluff ayreian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,12),
                        new MoveLearnSetEntry(Move.MEMENTO,34),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,4),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.TACKLE,8),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,10),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,29),
                        new MoveLearnSetEntry(Move.UTURN,49),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,6),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,39),
                        new MoveLearnSetEntry(Move.HYPNOSIS,24),
                        new MoveLearnSetEntry(Move.PSYCHIC,59),
                        new MoveLearnSetEntry(Move.TOXIC,54),
                        new MoveLearnSetEntry(Move.NIGHTMARE,0),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,69),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,44),
                        new MoveLearnSetEntry(Move.PSYBEAM,14),
                        new MoveLearnSetEntry(Move.MOONLIGHT,64),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Skiploom");

    }


}
