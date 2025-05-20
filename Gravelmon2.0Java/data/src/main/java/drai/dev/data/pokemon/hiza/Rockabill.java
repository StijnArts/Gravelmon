package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rockabill extends drai.dev.data.pokemon.Pokemon {
    public Rockabill() {
        super("Rockabill",
                Type.ROCK, Type.FLYING,
                new Stats(68,
                        113,
                        101,
                        40,
                        77,
                        96),
                List.of(Ability.STAMINA), Ability.SHEER_FORCE,
                14, 165,
                new Stats(0,2,0,0,0,0), 72,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("Its powerful large beaks are utilized in intense aerial jousts against eachother. Those fights are mostly endurance contests as nothing can scratch their beaks."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,12),
                        new MoveLearnSetEntry(Move.PLUCK,15),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,18),
                        new MoveLearnSetEntry(Move.UTURN,21),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,27),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.TAILWIND,36),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,41),
                        new MoveLearnSetEntry(Move.THRASH,46),
                        new MoveLearnSetEntry(Move.ENDEAVOR,51)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 65, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
