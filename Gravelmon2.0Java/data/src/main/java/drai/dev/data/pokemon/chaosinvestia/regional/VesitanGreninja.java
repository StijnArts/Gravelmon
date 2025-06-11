package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanGreninja extends drai.dev.data.pokemon.Pokemon {
    public VesitanGreninja(String name, Aspect aspect) {
        super(name, aspect, "VesitanGreninja",
                Type.FIRE,Type.POISON,
                new Stats(80,
                        95,
                        90,
                        122,
                        103,
                        84),
                List.of(Ability.BLAZE,Ability.PROTEAN), null,
                15, 400,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Kaum hat man es erspäht, verschwindet es auch schon wieder. Alles was man sieht ist das Lichtbild seiner Flamme, die an Sternschnuppen erinnert."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.MAT_BLOCK,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,20),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,70),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.HAZE,57),
                        new MoveLearnSetEntry(Move.LICK,10),
                        new MoveLearnSetEntry(Move.SPIKES,28),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,50),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,65),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.TOXIC,43),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,54),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.FLAME_BURST,33),
                        new MoveLearnSetEntry(Move.SLUDGE,23)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_FOREST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Greninja");

    }


}
