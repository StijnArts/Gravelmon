package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanHelioptile extends drai.dev.data.pokemon.Pokemon {
    public VesitanHelioptile(String name, Aspect aspect) {
        super(name, aspect, "VesitanHelioptile",
                Type.NORMAL,Type.DRAGON,
                new Stats(44,
                        60,
                        50,
                        70,
                        61,
                        45),
                List.of(Ability.DRY_SKIN,Ability.SAND_VEIL), null,
                5, 60,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Die Zellen der Hautlappen, die sich beidseitig an seinem Kopf befinden, erzeugen Strom, wenn sie von Sonnenstrahlen beschienen werden."),
                List.of(new EvolutionEntry("heliolisk vesitan", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,17),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,6),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,40),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.ELECTRIFY,45),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,37),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,22),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,49),
                        new MoveLearnSetEntry(Move.BULLDOZE,35),
                        new MoveLearnSetEntry(Move.BULK_UP,11),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,31),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"egg"),
                        new MoveLearnSetEntry(Move.GLARE,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 32, 3.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Helioptile");

    }


}
