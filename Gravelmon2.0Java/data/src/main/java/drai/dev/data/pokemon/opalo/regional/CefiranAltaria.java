package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranAltaria extends Pokemon {
    public CefiranAltaria(String name, Aspect aspect) {
        super(name, aspect,"CefiranAltaria",
                Type.ELECTRIC, Type.FLYING,
                new Stats(45,60,60,50,60,75),
                List.of(Ability.STATIC), Ability.CLOUD_NINE,
                4, 12,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("cefiranaltaria", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 4),
                        new MoveLearnSetEntry(Move.SING, 8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK, 10),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 13),
                        new MoveLearnSetEntry(Move.MIST, 15),
                        new MoveLearnSetEntry(Move.ROUND, 18),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 21),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 25),
                        new MoveLearnSetEntry(Move.REFRESH, 29),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, 34),
                        new MoveLearnSetEntry(Move.COTTON_GUARD, 39),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 42),
                        new MoveLearnSetEntry(Move.THUNDER, 48),
                        new MoveLearnSetEntry(Move.AGILITY, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, "egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "egg"),
                        new MoveLearnSetEntry(Move.POWER_SWAP, "egg"),
                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.RAGE, "egg"),
                        new MoveLearnSetEntry(Move.ROOST, "egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .isThundering()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Altaria");
        setCanFly(true);
    }
}
