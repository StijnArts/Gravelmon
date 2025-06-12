package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanBronzor extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanBronzor(String name, Aspect aspect) {
        super(name, aspect, "Bronzor",
                Type.STEEL,
                new Stats(57,
                        24,
                        86,
                        23,
                        24,
                        86),
                List.of(Ability.LEVITATE,Ability.HEATPROOF), null,
                5, 605,
                new Stats(0,0,1,0,0,0), 255,
                -1.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Se descubrieron herramientas con su forma en tumbas antiguas, pero se desconoce si tiene relación."),
                List.of(new EvolutionEntry("bronzong africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,19),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,29),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,35),
                        new MoveLearnSetEntry(Move.INCINERATE,5),
                        new MoveLearnSetEntry(Move.METAL_SOUND,31),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,9),
                        new MoveLearnSetEntry(Move.INFERNO,55),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,49),
                        new MoveLearnSetEntry(Move.FIRE_LASH,39),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.FIRE_FANG,11),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,45)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bronzor");

    }


}
