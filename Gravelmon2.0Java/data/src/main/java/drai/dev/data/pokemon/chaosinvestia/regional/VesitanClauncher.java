package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanClauncher extends drai.dev.data.pokemon.Pokemon {
    public VesitanClauncher(String name, Aspect aspect) {
        super(name, aspect, "VesitanClauncher",
                Type.WATER,Type.STEEL,
                new Stats(50,
                        58,
                        62,
                        76,
                        58,
                        55),
                List.of(Ability.MEGA_LAUNCHER), null,
                5, 83,
                new Stats(0,0,0,0,1,0), 155,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Durch körpereigene metallartige Absonderungen feuert es wie eine Pistole kleine Kügelchen ab, die aus kurzer Distanz selbst Felsen zerschmettern."),
                List.of(new EvolutionEntry("clawitzer vesitan", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,39),
                        new MoveLearnSetEntry(Move.AQUA_JET,43),
                        new MoveLearnSetEntry(Move.VICE_GRIP,9),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,48),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,34),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.CRABHAMMER,30),
                        new MoveLearnSetEntry(Move.WATER_SPORT,7),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,16),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,25),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.CRABHAMMER,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 23, 44, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Clauncher");

    }


}
