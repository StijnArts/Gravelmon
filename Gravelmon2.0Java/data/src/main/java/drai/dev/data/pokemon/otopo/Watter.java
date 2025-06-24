package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Watter extends drai.dev.data.pokemon.Pokemon {
    public Watter() {
        super("Watter",
                Type.WATER, Type.NORMAL,
                new Stats(55,
                        67,
                        43,
                        64,
                        36,
                        90),
                List.of(Ability.SWIFT_SWIM), Ability.WATER_VEIL,
                9, 302,
                new Stats(0,0,0,0,0,1), 180,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Watter are extremely agile and can deflect even the most precise blows. It has the ability to reach the ocean's lowest depths."),
                List.of(new EvolutionEntry("marinott", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(7).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SURFACE)
                        .setBiomes(Biome.IS_COAST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Watter");

    }


}
