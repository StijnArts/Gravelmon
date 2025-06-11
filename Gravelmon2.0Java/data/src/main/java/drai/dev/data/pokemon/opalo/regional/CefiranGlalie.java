package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranGlalie extends Pokemon {
    public CefiranGlalie(String name, Aspect aspect) {
        super(name, aspect,"CefiranGlalie",
                Type.GHOST, Type.FLYING,
                new Stats(80,90,80,80,90,80),
                List.of(Ability.INTIMIDATE), Ability.MOODY,
                15, 2565,
                new Stats(2,0,0,0,0,0), 190,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 4),
                        new MoveLearnSetEntry(Move.BITE, 10),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 13),
                        new MoveLearnSetEntry(Move.HEADBUTT, 19),
                        new MoveLearnSetEntry(Move.PROTECT, 22),
                        new MoveLearnSetEntry(Move.ACROBATICS, 28),
                        new MoveLearnSetEntry(Move.CRUNCH, 31),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 37),
                        new MoveLearnSetEntry(Move.CURSE, 40),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 51),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 59),
                        new MoveLearnSetEntry(Move.AVALANCHE, "egg"),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.HEX, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.SPIKES, "egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(41)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Glalie");
        setCanFly(true);
    }
}
