package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class KaskadianSkuntank extends Pokemon {
    public KaskadianSkuntank(int dexNo) {
        super(dexNo,"KaskadianSkuntank",
                Type.POISON, Type.NORMAL,
                new Stats(103, 71,67,93,61,84),
                List.of(Ability.STENCH, Ability.POLLUTION), Ability.FLARE_BOOST,
                10, 385,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Being surrounded by Histameanie swarms, it has adapted to the \'vibes\' or nature. Mellowing out its previous dark ways and just enjoying the world around it. However, it does still smell awful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,12),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,15),
                        new MoveLearnSetEntry(Move.HYPER_FANG,18),
                        new MoveLearnSetEntry(Move.VENOSHOCK,21),
                        new MoveLearnSetEntry(Move.SCREECH,24),
                        new MoveLearnSetEntry(Move.TOXIC,27),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,30),
                        new MoveLearnSetEntry(Move.MEMENTO,33),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,38),
                        new MoveLearnSetEntry(Move.BELCH,43),
                        new MoveLearnSetEntry(Move.EXPLOSION,48),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SMOG,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.GEN4,Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 48, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Skuntank");
        this.setPortraitXYZ(0,1.8,0);
    }
}
