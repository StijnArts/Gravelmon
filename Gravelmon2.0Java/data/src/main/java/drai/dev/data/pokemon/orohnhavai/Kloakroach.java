package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kloakroach extends drai.dev.data.pokemon.Pokemon {
    public Kloakroach() {
        super("Kloakroach",
                Type.BUG, Type.DARK,
                new Stats(76,
                        70,
                        84,
                        60,
                        102,
                        30),
                List.of(Ability.OVERCOAT,Ability.PICKPOCKET,Ability.BULLETPROOF), Ability.BULLETPROOF,
                9, 165,
                new Stats(0,0,0,0,2,0), 87,
                0.5,
                85, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Kloakroach are some of the most devious Bug-type Pokemon, as they command legions of Kroach with absolute authority. They prefer having Kroach battle for it instead of taking part directly. They're thought to be solitary yet conniving, often blamed for mischief and theft in small towns."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAL_ORDER,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,6),
                        new MoveLearnSetEntry(Move.BUG_BITE,11),
                        new MoveLearnSetEntry(Move.BIDE,15),
                        new MoveLearnSetEntry(Move.TAUNT,19),
                        new MoveLearnSetEntry(Move.RECYCLE,22),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,27),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,32),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,38),
                        new MoveLearnSetEntry(Move.QUASH,40)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Kloakroach");

    }


}
