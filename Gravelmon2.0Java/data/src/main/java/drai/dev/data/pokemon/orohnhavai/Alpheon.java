package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Alpheon extends drai.dev.data.pokemon.Pokemon {
    public Alpheon() {
        super("Alpheon",
                Type.NORMAL,
                new Stats(65,
                        130,
                        95,
                        60,
                        65,
                        110),
                List.of(Ability.ADAPTABILITY), Ability.LASTSTAND,
                10, 165,
                new Stats(0,2,0,0,0,0), 45,
                1.0,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal - Tail Whip Normal - Helping Hand Normal 5 Sand Attack Ground 9 Fake OutSTAB Normal 13 Quick AttackSTAB Normal 17 HeadbuttSTAB Normal 20 Bite Dark 25 Focus Energy Normal 29 RetaliateSTAB Normal 33 Roar Normal 37 Crunch Dark 41 Last ResortSTAB Normal 45 Double-EdgeSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,17),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,25),
                        new MoveLearnSetEntry(Move.RETALIATE,29),
                        new MoveLearnSetEntry(Move.ROAR,33),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Alpheon");
        addAdditionalEvolution("eevee", new EvolutionEntry("alpheon", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"))));

    }


}
