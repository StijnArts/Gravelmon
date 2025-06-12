package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanDedenne extends drai.dev.data.pokemon.Pokemon {
    public VesitanDedenne(String name, Aspect aspect) {
        super(name, aspect, "VesitanDedenne",
                Type.ELECTRIC,Type.GHOST,
                new Stats(70,
                        58,
                        62,
                        103,
                        123,
                        70),
                List.of(Ability.LEVITATE,Ability.LEVITATE), null,
                2, 22,
                new Stats(0,0,0,2,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Mit seinem Schwanz zapft es Lebenskraft von seinen Opfern ab, um Energie zu tanken, die es über seine Schnurrhaare wieder entlädt."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,40),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,23),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,7),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,26),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,17),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.SNORE,31),
                        new MoveLearnSetEntry(Move.NUZZLE,20),
                        new MoveLearnSetEntry(Move.REST,30),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,39),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,45),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,34),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,42),
                        new MoveLearnSetEntry(Move.CHARGE,11),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 44, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Dedenne");

    }


}
