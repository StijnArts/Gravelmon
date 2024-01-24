package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cycaroon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cycaroon() {
        super("Cycaroon",
                Type.DARK,
                new Stats(90,
                        138,
                        112,
                        110,
                        75,
                        75),
                List.of(Ability.JACKPOT), Ability.JACKPOT,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Cycaroon have a great obsession for treasures, even founding their own crews if necessary in order to find one. Despite being quite rude, a true bond will emerge within the crew members. Cycaroon live both on land and in ocean depths, in some cases inside wrecked ships. They can swim at 200 km/h."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRUMP_CARD,1),
                        new MoveLearnSetEntry(Move.EMBARGO,10),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,20),
                        new MoveLearnSetEntry(Move.HOOKCLAW,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,39),
                        new MoveLearnSetEntry(Move.TWINBLADE,48),
                        new MoveLearnSetEntry(Move.XSCISSOR,58),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,67),
                        new MoveLearnSetEntry(Move.MEMENTO,75),
                        new MoveLearnSetEntry(Move.GUILLOTINE,80)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cycaroon");

    }


}
