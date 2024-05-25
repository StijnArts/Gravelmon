package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Daimonize extends drai.dev.gravelmon.pokemon.Pokemon {
    public Daimonize() {
        super("Daimonize",
                Type.ICE, Type.FIRE,
                new Stats(80,
                        102,
                        79,
                        95,
                        90,
                        90),
                List.of(Ability.FLASH_FIRE), Ability.UNNERVE,
                14, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite being smaller than its distant relative, they're equally as strong. Daimonize (Coniferous form) can cause ashy weather conditions that is often believed to be snowfall."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_FANG,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 57, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Daimonize");

    }


}
