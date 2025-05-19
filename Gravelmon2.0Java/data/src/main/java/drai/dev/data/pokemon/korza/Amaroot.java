package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Amaroot extends drai.dev.data.pokemon.Pokemon {
    public Amaroot() {
        super("Amaroot",
                Type.POISON,
                new Stats(60,
                        25,
                        55,
                        35,
                        65,
                        15),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.POISON_TOUCH,
                5, 95,
                new Stats(0,0,0,0,1,0), 220,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Amaroot's colorful cap warns others of its dangerous toxicity. It has the capability to spray millions of hallucinogenic spores into the air as a defense."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.POISON_POWDER,11),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,24),
                        new MoveLearnSetEntry(Move.RECOVER,27),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.STUN_SPORE,35),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,39),
                        new MoveLearnSetEntry(Move.POISONBURST,43),
                        new MoveLearnSetEntry(Move.FILTHYTERRAIN,48),
                        new MoveLearnSetEntry(Move.SPORE,50),
                        new MoveLearnSetEntry(Move.VENOSHOCK,56),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Amaroot");

    }


}
