package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class TapuKokoX extends Pokemon {
    public TapuKokoX(int dexNo) {
        super(dexNo,"TapuKokoX",
                Type.FLYING, Type.DARK,
                new Stats(70, 95, 75, 115, 85, 160),
                List.of(Ability.FULL_METAL_BODY), Ability.SHEER_FORCE,
                18, 705,
                new Stats(0,0,0,0,0,3), 3,
                0.5,
                257, ExperienceGroup.SLOW,
                70,
                39, List.of(EggGroup.UNDISCOVERED),
                List.of("One of the four beast from Xenoverse, Dragalisk's elite soldiers. It is held by the Cardinal Peyote."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,5),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,10),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,20),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,25),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.AIR_SLASH,45),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,50),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,55),
                        new MoveLearnSetEntry(Move.HURRICANE,60),
                        new MoveLearnSetEntry(Move.POWER_SWAP,70),
                        new MoveLearnSetEntry(Move.PUNISHMENT,75),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN7),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",50, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 60, 65, 0.005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.27, 0.3,
                List.of());
        this.setLangFileName("Tapu Koko");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
