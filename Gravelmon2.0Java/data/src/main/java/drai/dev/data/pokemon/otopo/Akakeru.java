package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Akakeru extends drai.dev.data.pokemon.Pokemon {
    public Akakeru() {
        super("Akakeru",
                Type.FIGHTING,
                new Stats(35,
                        35,
                        35,
                        35,
                        35,
                        35),
                List.of(Ability.ANTICIPATION,Ability.VITAL_SPIRIT), Ability.STEADFAST,
                7, 230,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It is frequently seen rigorously exercising; it will not stop until it reaches evolution. It will choose a certain training regimen until evolution happens."),
                List.of(new EvolutionEntry("keruguru", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"ATTACK_HIGHER"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25"))),
                        new EvolutionEntry("kerukeru", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"ATTACK_HIGHER"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,5),
                        new MoveLearnSetEntry(Move.DETECT,10),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,25)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(5).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Akakeru");

    }


}
