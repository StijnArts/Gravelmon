package drai.dev.gravelmon.pokemon.norheim.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanSigilyph extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanSigilyph(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Sigilyph",
                Type.DARK, Type.FLYING,
                new Stats(72,
                        103,
                        80,
                        58,
                        80,
                        97),
                List.of(Ability.DARKHOLD,Ability.MAGIC_GUARD,Ability.TINTED_LENS), Ability.TINTED_LENS,
                15, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Norheiman Sigilyph works as a compass for lost souls. It may lead them astray into the darkness however. Like its Unovan counterpart, its odd shape makes its appearance from mystical shapes seen from the sky."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,5),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,8),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,20),
                        new MoveLearnSetEntry(Move.PLUCK,28),
                        new MoveLearnSetEntry(Move.ROOST,34),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,45),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,47),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,50),
                        new MoveLearnSetEntry(Move.AIR_SLASH,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,60),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,67)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 53, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Sigilyph");
    }
}
