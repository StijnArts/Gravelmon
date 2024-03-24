package drai.dev.gravelmon.pokemon.pastel island;

public class Mowzumi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mowzumi() {
        super("Mowzumi",
                Type.NORMAL,
                new Stats(90,
                        65,
                        90,
                        55,
                        60,
                        45),
                List.of(Ability.THICK_FAT,Ability.TECHNICIAN), Ability.CHEEK_POUCH,
                14, 80,
                new Stats(2,0,0,0,0,0), 127,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Mowzumi have tough hairs on their tails, and hang out in groups to protect their young."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mowzumi");

    }


}
