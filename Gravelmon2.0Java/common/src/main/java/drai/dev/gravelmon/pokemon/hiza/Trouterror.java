package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Trouterror extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trouterror() {
        super("Trouterror",
                Type.GHOST,Type.STEEL,
                new Stats(60,
                        85,
                        100,
                        80,
                        90,
                        75),
                List.of(Ability.BATTLE_ARMOR), Ability.BATTLE_ARMOR,
                15, 165,
                new Stats(0,0,2,0,0,0), 60,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The sound of its clanking armor terrorizes any sea creature. To this day it was not able to conclude if this Pokémon is sentient."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.SUPERSONIC,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.AQUA_JET,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,27),
                        new MoveLearnSetEntry(Move.METAL_SOUND,34),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,39),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.METAL_BURST,57),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,62),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,66)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 31, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trouterror");

    }


}
