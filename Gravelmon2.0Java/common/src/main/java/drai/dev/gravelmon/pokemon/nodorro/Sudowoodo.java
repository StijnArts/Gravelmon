package drai.dev.gravelmon.pokemon.nodorro;

public class Sudowoodo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sudowoodo() {
        super("Sudowoodo",
                Type.GROUND,
                new Stats(60,
                        45,
                        65,
                        100,
                        110,
                        40),
                List.of(Ability.RATTLED,Ability.HUGE_POWER), Ability.DRY_SKIN,
                15, 360,
                new Stats(0,0,0,0,2,0), 65,
                0.5,
                144, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("it buries itself underground leaving only it's head exposed to mimic a bush. It hates water, so if anyone try to water it not knowing it's a fake they will get attacked."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,2),
                        new MoveLearnSetEntry(Move.MIMIC,5),
                        new MoveLearnSetEntry(Move.FLAIL,8),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,18),
                        new MoveLearnSetEntry(Move.TAUNT,23),
                        new MoveLearnSetEntry(Move.MAGNITUDE,26),
                        new MoveLearnSetEntry(Move.NATURE_POWER,30),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,33),
                        new MoveLearnSetEntry(Move.BLOCK,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sudowoodo");

    }


}