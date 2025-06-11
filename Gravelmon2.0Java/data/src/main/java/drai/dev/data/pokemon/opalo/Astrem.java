package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Astrem extends Pokemon {
    public Astrem() {
        super("Astrem",
                Type.PSYCHIC, Type.FAIRY,
                new Stats(100,100,90,120,160,110),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                22, 1355,
                new Stats(0,2,0,0,2,0), 60,
                -1,
                350, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_FANG, 1),
                        new MoveLearnSetEntry(Move.ICE_FANG, 1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 1),
                        new MoveLearnSetEntry(Move.CONFUSION, 1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 1),
                        new MoveLearnSetEntry(Move.TAILWIND, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 1),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 1),
                        new MoveLearnSetEntry(Move.HOWL, 1),
                        new MoveLearnSetEntry(Move.PSYBEAM, 5),
                        new MoveLearnSetEntry(Move.ROAR, 9),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 13),
                        new MoveLearnSetEntry(Move.DREAM_EATER, 17),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 21),
                        new MoveLearnSetEntry(Move.CRUNCH, 26),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 31),
                        new MoveLearnSetEntry(Move.PSYCHIC, 36),
                        new MoveLearnSetEntry(Move.MOONBLAST, 47),
                        new MoveLearnSetEntry(Move.CALM_MIND, 58),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 66),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 73),
                        new MoveLearnSetEntry(Move.COSMIC_POWER, 80),
                        new MoveLearnSetEntry(Move.RECOVER, 90)
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
