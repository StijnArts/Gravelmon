package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Basille extends Pokemon {
    public Basille() {
        super( "Basille",
                Type.GRASS,
                new Stats(50,
                        43,
                        43,
                        63,
                        50,
                        59),
                List.of(Ability.OVERGROW), Ability.STATIC,
                4, 63,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("basield", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,4),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,8),
                        new MoveLearnSetEntry(Move.DAZZLE_POWDER,8),
                        new MoveLearnSetEntry(Move.STUN_SPORE,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,18),
                        new MoveLearnSetEntry(Move.GROWTH,22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,32),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,36),
                        new MoveLearnSetEntry(Move.RAPID_GROWTH,39),
                        new MoveLearnSetEntry(Move.LEAF_STORM,43),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,"tutor"),
                        new MoveLearnSetEntry(Move.ABSORB,"tutor"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"tutor"),
                        new MoveLearnSetEntry(Move.SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tutor"),
                        new MoveLearnSetEntry(Move.SLASH,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.POISON_LEAF,"tutor"),
                        new MoveLearnSetEntry(Move.REFRESH,"tutor"),
                        new MoveLearnSetEntry(Move.RAPID_GROWTH,"tutor"),
                        new MoveLearnSetEntry(Move.ACCELVOLT,"egg"),
                new MoveLearnSetEntry(Move.BULLET_SEED,"egg"),
                new MoveLearnSetEntry(Move.CHARGE,"egg"),
                new MoveLearnSetEntry(Move.CHARGE_BEAM,"egg"),
                new MoveLearnSetEntry(Move.ENERGIZE,"egg"),
                new MoveLearnSetEntry(Move.FAIRY_WIND,"egg"),
                new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                new MoveLearnSetEntry(Move.LEAF_HIDE,"egg"),
                new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                new MoveLearnSetEntry(Move.PSYBURN,"egg"),
                new MoveLearnSetEntry(Move.SHOCK_WAVE,"egg"),
                new MoveLearnSetEntry(Move.SPARK,"egg"),
                new MoveLearnSetEntry(Move.TEETER_DANCE,"egg"),
                new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_SNOWY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
