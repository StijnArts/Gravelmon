package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scorchion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scorchion() {
        super("Scorchion",
                Type.FIRE,Type.STEEL,
                new Stats(81,
                        122,
                        80,
                        72,
                        60,
                        77),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its claws and tail heat up as it uses them in combat, getting stronger and eventually being able to cut through anything."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,5),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,30),
                        new MoveLearnSetEntry(Move.BURN_UP,34),
                        new MoveLearnSetEntry(Move.SLASH,39),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,46),
                        new MoveLearnSetEntry(Move.GUILLOTINE,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scorchion");

    }


}
