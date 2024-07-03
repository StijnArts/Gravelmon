package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Amenemy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amenemy() {
        super("Amenemy",
                Type.POISON, Type.WATER,
                new Stats(70,
                        55,
                        70,
                        32,
                        70,
                        17),
                List.of(Ability.SUCTION_CUPS,Ability.TIGHTGRIP,Ability.STORM_DRAIN), Ability.STORM_DRAIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("The theory among scientists is that both Amenemy and Tentackle evolved from a common ancestor which transitioned between medusa and polyp forms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,2),
                        new MoveLearnSetEntry(Move.WRAP,4),
                        new MoveLearnSetEntry(Move.ACID,7),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,10),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,13),
                        new MoveLearnSetEntry(Move.SCARY_FACE,17),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,20),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,28),
                        new MoveLearnSetEntry(Move.ENSNARE,34),
                        new MoveLearnSetEntry(Move.TICKLE,39),
                        new MoveLearnSetEntry(Move.WRING_OUT,44),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,47),
                        new MoveLearnSetEntry(Move.POWER_WHIP,51),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amenemy");

    }


}
