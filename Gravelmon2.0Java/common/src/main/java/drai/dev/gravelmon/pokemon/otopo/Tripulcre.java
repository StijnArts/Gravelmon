package drai.dev.gravelmon.pokemon.otopo;

public class Tripulcre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tripulcre() {
        super("Tripulcre",
                Type.STEEL,Type.GHOST,
                new Stats(75,
                        80,
                        130,
                        65,
                        100,
                        70),
                List.of(Ability.HEATPROOF,Ability.STEELWORKER), Ability.LIGHTNING_ROD,
                37, 3000,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                182, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("By consuming lost souls, Oralith evolved into Tripulcre. The sheer power it absorbs, lifts Tripulcre off the ground. It has inanimate Oralith spinning around it because its ghostly powers are so strong."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.TORMENT,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,45),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,50),
                        new MoveLearnSetEntry(Move.TOMBSTONER,55),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,57),
                        new MoveLearnSetEntry(Move.PERISH_SONG,60),
                        new MoveLearnSetEntry(Move.MEMENTO,60),
                        new MoveLearnSetEntry(Move.METEOR_MASH,63),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,67),
                        new MoveLearnSetEntry(Move.DRILL_RUN,71),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,74),
                        new MoveLearnSetEntry(Move.FISSURE,80),
                        new MoveLearnSetEntry(Move.TACKLE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tripulcre");

    }


}
