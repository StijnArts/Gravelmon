package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Harregg extends drai.dev.data.pokemon.Pokemon {
    public Harregg() {
        super("Harregg",
                Type.FIRE,
                new Stats(47,
                        60,
                        40,
                        70,
                        40,
                        53),
                List.of(Ability.BLAZE,Ability.FLASH_FIRE), null,
                6, 85,
                new Stats(0,0,0,1,0,0), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Este pokémon es un pequeño ave imperial que no ha llegado aún de salir del cascarón,aunque parezca adorable hay que tener mucho cuidado con él,podría calcinarte en cuestión de segundos. Necesita el calor para vivir y su huevo está a más de 300 Cº,no sobreviviría fuera de él en esta fase. Siempre ha sido un símbolo de Roma y estos adoran la línea evolutiva de este pokémon."),
                List.of(new EvolutionEntry("igneagle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.PECK,10),
                        new MoveLearnSetEntry(Move.PLUCK,14),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"egg"),
                        new MoveLearnSetEntry(Move.GUST,"egg"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harregg");

    }


}
