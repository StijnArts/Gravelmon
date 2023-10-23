package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class ScovileX extends Pokemon {
    public ScovileX(int dexNo) {
        super(dexNo,"ScovileX",
                Type.GRASS, Type.ELECTRIC,
                new Stats(80, 67, 78, 124, 84, 112),
                List.of(Ability.EFFECT_SPORE, Ability.LIGHTNING_ROD), Ability.INTIMIDATE,
                14, 414,
                new Stats(0,1,0,0,1,0), 70,
                0.5,
                179, ExperienceGroup.FAST,
                40,
                26, List.of(EggGroup.XENO),
                List.of("The Scovile owned by Dimension Colonel Dahlia. When ingested, its seeds will electrocute the body from the inside."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SEED_BOMB,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.ERUPTION,1),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,1),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,1),
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.HOT_CHILI_PEPPER,40),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,46),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,52),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,58),
                        new MoveLearnSetEntry(Move.THUNDER,64),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,70),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",20, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.RARE, 30, 43, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
