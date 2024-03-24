package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Coyohete extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coyohete() {
        super("Coyohete",
                Type.FAIRY,Type.FIRE,
                new Stats(100,
                        100,
                        98,
                        70,
                        62,
                        90),
                List.of(Ability.DEFIANT), Ability.DEFIANT,
                14, 165,
                new Stats(1,0,1,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The dazzling coat of Coyohete shine bright and fiery in the cold nights of their desert home. When they reach their top speeds, brilliant sparks and embers erupt from its tail which it uses to coordinate it's fellow pack members. Coyohete hunt in packs at night, and are notorious for attacking pets and any weaker pokemon they can find."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.LIGHTUP,13),
                        new MoveLearnSetEntry(Move.SWIFT,15),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,19),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,24),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,28),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,32),
                        new MoveLearnSetEntry(Move.STARSTREAM,35),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,37),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.MORNING_SUN,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,49),
                        new MoveLearnSetEntry(Move.SOLARFLARE,53),
                        new MoveLearnSetEntry(Move.WISH,56),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,61),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,64)           ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 53, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coyohete");

    }


}
