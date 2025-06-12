package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochEternatus extends drai.dev.data.pokemon.Pokemon {
    public EpochEternatus(String name, Aspect aspect) {
        super(name, aspect, "EpochEternatus",
                Type.GHOST,Type.DRAGON,
                new Stats(140,
                        85,
                        95,
                        130,
                        145,
                        95),
                List.of(Ability.PRESSURE), null,
                200, 9500,
                new Stats(3,0,0,0,0,0), 255,
                -1.0,
                345, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A Pokemon that passed away a long time ago. It was revived through the collection of its various bones that were scattered across the region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,80),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.ETERNABEAM,88),
                        new MoveLearnSetEntry(Move.VENOSHOCK,16),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.CROSS_POISON,32),
                        new MoveLearnSetEntry(Move.DYNAMAX_CANNON,56),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,64),
                        new MoveLearnSetEntry(Move.TOXIC,8),
                        new MoveLearnSetEntry(Move.POISON_TAIL,1),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,48),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.RECOVER,72),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,24),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Eternatus");

    }


}
