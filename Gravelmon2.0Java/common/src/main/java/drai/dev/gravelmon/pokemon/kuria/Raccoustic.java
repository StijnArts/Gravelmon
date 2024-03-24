package drai.dev.gravelmon.pokemon.kuria;

public class Raccoustic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raccoustic() {
        super("Raccoustic",
                Type.SOUND,Type.DARK,
                new Stats(75,
                        80,
                        65,
                        65,
                        65,
                        80),
                List.of(Ability.HUSTLE,Ability.GUTS), Ability.REVERB,
                12, 254,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                114, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Raccoustic's sound has evolved to be more grunge than when it was younger. The sounds it creates are unappealing and can cause devastating damage if played too loudly."),
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
           setLangFileName("Raccoustic");

    }


}
