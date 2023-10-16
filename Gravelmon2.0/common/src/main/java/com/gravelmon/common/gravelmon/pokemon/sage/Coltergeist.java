package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Coltergeist extends Pokemon {
    public Coltergeist() {
        super("Coltergeist",
                Type.GHOST,
                new Stats(45, 50, 65, 65, 55, 70),
                List.of(Ability.PERFORATE, Ability.CURSED_BODY), Ability.GRIM_NEIGH,
                11, 117,
                new Stats(0,0,0,0,0,1), 150,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.FIELD, EggGroup.AMORPHOUS),
                List.of("The icy blue gazes of Coltergeist herds can often be seen in thick fog patches. Their eerie cries not only cause chills, but also strange, indescribable dreams."),
                List.of(new EvolutionEntry("fantasmare", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,6),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.STOMP,17),
                        new MoveLearnSetEntry(Move.WILLOWISP,22),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.HAZE,30),
                        new MoveLearnSetEntry(Move.HYPNOSIS,33),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,38),
                        new MoveLearnSetEntry(Move.AGILITY,41),
                        new MoveLearnSetEntry(Move.BOUNCE,46),
                        new MoveLearnSetEntry(Move.NIGHTMARE,49),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,54),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:dead_bush",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 28, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
