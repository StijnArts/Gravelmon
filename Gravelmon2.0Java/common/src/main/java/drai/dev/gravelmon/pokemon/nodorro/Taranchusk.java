package drai.dev.gravelmon.pokemon.nodorro;

public class Taranchusk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Taranchusk() {
        super("Taranchusk",
                Type.BUG,
                new Stats(56,
                        73,
                        60,
                        65,
                        64,
                        62),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.MOXIE,
                10, 360,
                new Stats(0,1,0,0,0,1), 135,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("- String Shot Bug - Constrict Normal - Astonish Ghost - Spider Web Bug 3 Bug BiteSTAB Bug 5 InfestationSTAB Bug 6 Screech Normal 10 Fury Swipes Normal 13 Bite Dark 18 Shadow Sneak Ghost 20 Sucker Punch Dark 24 Scary Face Normal 28 Night Slash Dark 35 Nasty Plot Dark 38 Shadow Claw Ghost 45 Sticky Web Bug 50 Cross Poison Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIDER_WEB,1),
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,3),
                        new MoveLearnSetEntry(Move.INFESTATION,5),
                        new MoveLearnSetEntry(Move.SCREECH,6),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,18),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,20),
                        new MoveLearnSetEntry(Move.SCARY_FACE,24),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,28),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,38),
                        new MoveLearnSetEntry(Move.STICKY_WEB,45),
                        new MoveLearnSetEntry(Move.CROSS_POISON,50)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taranchusk");

    }


}
