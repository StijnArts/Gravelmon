package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Artifire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Artifire() {
        super("Artifire",
                Type.FIRE,Type.BUG,
                new Stats(35,
                        96,
                        35,
                        121,
                        90,
                        113),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of("- Quick Attack Normal - Smokescreen Normal - Switcheroo Dark 3 SingeSTAB Fire 7 EmberSTAB Fire 11 Smog Poison 16 Me First Normal 21 Swift Normal 28 Flame BurstSTAB Fire 35 Agility Psychic 43 Festive Shot Dragon 51 Acrobatics Flying 60 Explosion Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.SINGE,3),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOG,11),
                        new MoveLearnSetEntry(Move.ME_FIRST,16),
                        new MoveLearnSetEntry(Move.SWIFT,21),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,43),
                        new MoveLearnSetEntry(Move.ACROBATICS,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,60),
                        new MoveLearnSetEntry(Move.BARRAGE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Artifire");

    }


}
