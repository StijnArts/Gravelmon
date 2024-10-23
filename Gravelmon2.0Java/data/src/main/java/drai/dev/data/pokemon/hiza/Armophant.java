package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Armophant extends drai.dev.data.pokemon.Pokemon {
    public Armophant() {
        super("Armanzer",
                Type.BUG, Type.STEEL,
                new Stats(95,
                        95,
                        195,
                        50,
                        70,
                        20),
                List.of(Ability.BULLETPROOF,Ability.HEAVY_METAL,Ability.SKILL_LINK), Ability.SKILL_LINK,
                19, 165,
                new Stats(0,0,2,0,0,0), 55,
                0.5,
                190, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It can fire rocks out of its cannon horn, those rocks are coated on a grainy substance similar to gunpowder that explodes on heavy impact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,4),
                        new MoveLearnSetEntry(Move.METAL_CLAW,8),
                        new MoveLearnSetEntry(Move.BEAT_UP,12),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.AGILITY,24),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.XSCISSOR,32),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,44),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,48),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,52),
                        new MoveLearnSetEntry(Move.GUILLOTINE,56)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 63, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armanzer");

    }


}
