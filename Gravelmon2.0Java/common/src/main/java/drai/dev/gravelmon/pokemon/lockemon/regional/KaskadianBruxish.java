package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class KaskadianBruxish extends Pokemon {
    public KaskadianBruxish(int dexNo) {
        super(dexNo,"KaskadianBruxish",
                Type.WATER,
                new Stats(78, 100, 70, 75, 70, 82),
                List.of(Ability.CHEEK_POUCH, Ability.STRONG_JAW), Ability.MOXIE,
                9, 190,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.BRINE,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.AQUA_JET,17),
                        new MoveLearnSetEntry(Move.DISABLE,20),
                        new MoveLearnSetEntry(Move.LIQUIDATION,25),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,33),
                        new MoveLearnSetEntry(Move.SCREECH,36),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,41),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,44),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"egg"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN7),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 14, 30, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Bruxish");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setAvoidsLand(true);
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
