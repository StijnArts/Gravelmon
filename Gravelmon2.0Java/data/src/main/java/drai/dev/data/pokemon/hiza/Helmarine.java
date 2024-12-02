package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Helmarine extends drai.dev.data.pokemon.Pokemon {
    public Helmarine() {
        super("Helmarine",
                Type.GHOST, Type.STEEL,
                new Stats(45,
                        40,
                        70,
                        40,
                        70,
                        40),
                List.of(Ability.BATTLE_ARMOR), Ability.BATTLE_ARMOR,
                4, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Stories tell the tale of a knight whose soul was corrupted by a curse, the knight ended up drowning in one of his travels and his armor turned into a school of Helmarine."),
                List.of(new EvolutionEntry("trouterror", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.SUPERSONIC,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.AQUA_JET,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,27),
                        new MoveLearnSetEntry(Move.METAL_SOUND,32),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,37),
                        new MoveLearnSetEntry(Move.CURSE,42),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,49),
                        new MoveLearnSetEntry(Move.METAL_BURST,54),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,57),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,61)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 12, 35, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Helmarine");

    }


}
