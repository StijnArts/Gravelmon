package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class ShulongX extends Pokemon {
    public ShulongX(int dexNo) {
        super(dexNo,"ShulongX",
                Type.WATER, Type.DRAGON,
                new Stats(68, 40, 113, 80, 113, 66),
                List.of(Ability.HYDRATION), Ability.HYDRATION,
                5, 70,
                new Stats(0,0,1,0,0,0), 45,
                -1,
                90, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Made of pure X Energy, this Pokemon stuns its enemies from behind, then takes advantage of them and hits them relentlessly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TWISTER,6),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,23),
                        new MoveLearnSetEntry(Move.PROTECT,28),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,32),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,36),
                        new MoveLearnSetEntry(Move.RECOVER,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,51),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61)
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.9, 1,
                List.of());
        this.setLangFileName("Shulong");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
    }
}
