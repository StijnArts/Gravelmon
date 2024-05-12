package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Equazar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Equazar() {
        super("Equazar",
                Type.ROCK,
                new Stats(75,
                        84,
                        87,
                        45,
                        34,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Equazar refracts light in its body causing its enemy to become confused. It can also equalize the light to make itself shine brightly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.PECK,1),
                new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                new MoveLearnSetEntry(Move.METAL_CLAW,10),
                new MoveLearnSetEntry(Move.IRON_DEFENSE,16),
                new MoveLearnSetEntry(Move.SLASH,22),
                new MoveLearnSetEntry(Move.AIR_SLASH,26),
                new MoveLearnSetEntry(Move.ROCK_POLISH,30),
                new MoveLearnSetEntry(Move.POWER_GEM,36),
                new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                new MoveLearnSetEntry(Move.FOCUS_ENERGY,46),
                new MoveLearnSetEntry(Move.STONE_EDGE,50),
                new MoveLearnSetEntry(Move.DOUBLEEDGE,56)             ),
        List.of(Label.JUNNIN),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, 1, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_VOLCANIC, Biome.IS_NETHER_WASTELAND))
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Equazar");

    }


}
