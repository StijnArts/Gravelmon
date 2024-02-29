package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dirthrown extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dirthrown() {
        super("Dirthrown",
                Type.NORMAL,Type.POISON,
                new Stats(102,
                        80,
                        90,
                        83,
                        92,
                        47),
                List.of(Ability.STENCH,Ability.DAMP,Ability.WATER_COMPACTION), Ability.WATER_COMPACTION,
                8, 165,
                new Stats(1,0,0,0,1,0), 90,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is coated by what appears to be some sort of water-proofing powder. These Pokemon are helpful to slouchy home owners, because Dirthrown absorb all the dirt and dust around them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.MUD_SPORT,11),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,16),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.MUD_BOMB,24),
                        new MoveLearnSetEntry(Move.SLACK_OFF,29),
                        new MoveLearnSetEntry(Move.FLAIL,31),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,41),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,46),
                        new MoveLearnSetEntry(Move.WRING_OUT,52),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,59),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,63),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_GAS,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm"),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dirthrown");

    }


}
