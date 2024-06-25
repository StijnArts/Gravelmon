package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianSilicobra extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianSilicobra(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Silicobra",
                Type.FIRE, Type.GROUND,
                new Stats(52,
                        35,
                        75,
                        57,
                        50,
                        46),
                List.of(Ability.WHITE_SMOKE), Ability.UNAWARE,
                4, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                63, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("The volley of flames it spits can cover a impressive distance. Their overconfidence can lead them to take on much stronger Pokemon."),
                List.of(new EvolutionEntry("HizianSandaconda", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.MINIMIZE,9),
                        new MoveLearnSetEntry(Move.MUD_BOMB,13),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,16),
                        new MoveLearnSetEntry(Move.INCINERATE,20),
                        new MoveLearnSetEntry(Move.GLARE,24),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,32),
                        new MoveLearnSetEntry(Move.EARTH_POWER,35),
                        new MoveLearnSetEntry(Move.YAWN,40),
                        new MoveLearnSetEntry(Move.COIL,45),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,51),
                        new MoveLearnSetEntry(Move.ERUPTION,59)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 14, 35, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_THERMAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Silicobra");

    }


}
