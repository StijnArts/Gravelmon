package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hemina extends drai.dev.data.pokemon.Pokemon {
    public Hemina() {
        super("Hemina",
                Type.POISON,
                new Stats(90,
                        40,
                        80,
                        95,
                        85,
                        60),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.POISON_TOUCH,
                11, 404,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                157, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Hemina's blood-like ooze is highly toxic; many finding just the sight of its oozy cap unsettling. Folklore states that the first Amaroot to evolve was interrupted, causing it to not split completely."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.POISON_POWDER,11),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,24),
                        new MoveLearnSetEntry(Move.RECOVER,29),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,33),
                        new MoveLearnSetEntry(Move.STUN_SPORE,38),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,42),
                        new MoveLearnSetEntry(Move.POISONBURST,46),
                        new MoveLearnSetEntry(Move.FILTHYTERRAIN,51),
                        new MoveLearnSetEntry(Move.SPORE,55),
                        new MoveLearnSetEntry(Move.VENOSHOCK,59),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hemina");

    }


}
