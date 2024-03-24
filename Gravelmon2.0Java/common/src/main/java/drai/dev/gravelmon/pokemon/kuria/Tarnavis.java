package drai.dev.gravelmon.pokemon.kuria;

public class Tarnavis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tarnavis() {
        super("Tarnavis",
                Type.WATER,Type.POISON,
                new Stats(170,
                        80,
                        61,
                        128,
                        61,
                        45),
                List.of(Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                54, 9463,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                222, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.WATER_1),
                List.of("Tarnavis were used as ocean transportation for all of recorded history. Their large bodies allow for multiple people to be ferried from one place to another easily."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tarnavis");

    }


}
