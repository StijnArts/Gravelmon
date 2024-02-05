package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kangaloop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kangaloop() {
        super("Kangaloop",
                Type.NORMAL,
                new Stats(47,
                        81,
                        50,
                        95,
                        82,
                        110),
                List.of(Ability.SCRAPPY), Ability.OWN_TEMPO,
                16, 165,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("They usually mistake other small pokemon for one of their offsprings and carry them in their bags. They use their spring like legs to bounce off walls and build up speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.BOUNCE,15),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.JUMP_KICK,28),
                        new MoveLearnSetEntry(Move.MEGA_KICK,34),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,51)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kangaloop");

    }


}
