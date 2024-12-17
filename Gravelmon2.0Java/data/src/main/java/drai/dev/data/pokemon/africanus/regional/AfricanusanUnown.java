package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanUnown extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanUnown(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanUnown",
                Type.PSYCHIC,Type.ROCK,
                new Stats(100,
                        90,
                        100,
                        90,
                        125,
                        100),
                List.of(Ability.OWN_TEMPO,Ability.CLEAR_BODY), null,
                19, 520,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Creado por Amat, es sin duda el más fuerte de los Unown. Controla a todos los demás, incluido  el íbero."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,59),
                        new MoveLearnSetEntry(Move.THOUSAND_ARROWS,1),
                        new MoveLearnSetEntry(Move.FLEUR_CANNON,66),
                        new MoveLearnSetEntry(Move.THOUSAND_WAVES,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,32),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,16),
                        new MoveLearnSetEntry(Move.MOONBLAST,13),
                        new MoveLearnSetEntry(Move.HYPERSPACE_FURY,1),
                        new MoveLearnSetEntry(Move.DIAMOND_STORM,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.BULK_UP,28),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,36),
                        new MoveLearnSetEntry(Move.PRECIPICE_BLADES,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,1),
                        new MoveLearnSetEntry(Move.CHARM,49),
                        new MoveLearnSetEntry(Move.SLASH,42),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,21),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.ORIGIN_PULSE,1),
                        new MoveLearnSetEntry(Move.LIGHT_OF_RUIN,1),
                        new MoveLearnSetEntry(Move.HYPERSPACE_HOLE,1),
                        new MoveLearnSetEntry(Move.DRAGON_ASCENT,1)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Unown");

    }


}
