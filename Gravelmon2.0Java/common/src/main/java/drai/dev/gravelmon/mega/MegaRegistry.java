package drai.dev.gravelmon.mega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MegaRegistry {
    public static void register(){
        Pokemon.addMegaEvolution(getInsurgenceMegas());
        Pokemon.addMegaEvolution(getDaybreakMegas());
    }

    private static List<MegaEvolution> getDaybreakMegas() {
        return List.of(
                new MegaEvolution("sceptile",
                Type.POISON, Type.DARK,
                new Stats(70,145,75,110,85,145),
                Ability.ELECTRIC_SURGE,
                19, "daybreak", List.of(Label.GEN3, Label.DAYBREAK), Aspect.ARMIRAN)
                .addPalette(new MegaStonePalette("#2b2729", "#dd2b43", "#7960b1")),
                new MegaEvolution("milotic",
                Type.WATER, Type.FAIRY,
                new Stats(95,
                        60,
                        109,
                        125,
                        150,
                        101),
                Ability.MAGIC_BOUNCE,
                25, "daybreak", List.of(Label.GEN3, Label.DAYBREAK), null)
                .addPalette(new MegaStonePalette("#f8b0bc", "#fcfa9c", "#89d6fe")),
                new MegaEvolution("tyranitar",
                Type.FIRE, Type.ROCK,
                new Stats(100,
                        95,
                        130,
                        155,
                        140,
                        80),
                Ability.DROUGHT,
                23, "daybreak", List.of(Label.GEN2, Label.DAYBREAK), Aspect.ARMIRAN)
                .addPalette(new MegaStonePalette("#fe0b00", "#fd9f19", "#883c2d")),
                new MegaEvolution("garchomp",
                Type.DRAGON, Type.FAIRY,
                new Stats(108,
                        150,
                        100,
                        150,
                        110,
                        92),
                Ability.GOOEY,
                22, "daybreak", List.of(Label.GEN4, Label.DAYBREAK), Aspect.ARMIRAN)
                .addPalette(new MegaStonePalette("#efbe40", "#ce4f67", "#f99fb2")),
                new MegaEvolution("heliolisk",
                        Type.ELECTRIC, Type.FIRE,
                        new Stats(62,
                                55,
                                52,
                                149,
                                124,
                                139),
                        Ability.CHLOROPHYLL,
                        15, "daybreak", List.of(Label.GEN6, Label.DAYBREAK), null)
                        .addPalette(new MegaStonePalette("#efdb6c", "#e39053", "#60605f"))
                );
    }

    private static List<MegaEvolution> getInsurgenceMegas() {
        var megas = new ArrayList<MegaEvolution>(List.of(
                new MegaEvolution("poliwrath",
                        Type.WATER, Type.FIGHTING,
                        new Stats(90,
                                155,
                                120,
                                70,
                                105,
                                70),
                        Ability.NO_GUARD,
                        14, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), null)
                        .addPalette(new MegaStonePalette("#4f4747", "#ffffff", "#305aa3")),
                new MegaEvolution("marowak",
                        Type.GROUND, Type.GHOST,
                        new Stats(60,
                                135,
                                120,
                                50,
                                100,
                                60),
                        Ability.PARENTAL_BOND,
                        13, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), null)
                        .addPalette(new MegaStonePalette("#ffffff", "#bd94b4", "#c59c4a")),
                new MegaEvolution("eevee",
                        Type.NORMAL,
                        new Stats(83,
                                83,
                                83,
                                83,
                                83,
                                83),
                        Ability.PROTEAN_MAXIMA,
                        6, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), null)
                        .addPalette(new MegaStonePalette("#d59435", "#ffd203", "#ffe6ac")),
                new MegaEvolution("mewtwo",
                        Type.PSYCHIC, Type.FIGHTING,
                        new Stats(106,
                                190,
                                100,
                                154,
                                100,
                                130),
                        Ability.SHADOW_SYNERGY,
                        22, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.SHADOW)
                        .addPalette(new MegaStonePalette("#ffa54d", "#3372b4", "#323f50")),
                new MegaEvolution("meganium",
                        Type.PSYCHIC, Type.FIGHTING,
                        new Stats(106,
                                190,
                                100,
                                154,
                                100,
                                130),
                        Ability.SHADOW_SYNERGY,
                        22, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.SHADOW)
                        .addPalette(new MegaStonePalette("#ffa54d", "#3372b4", "#323f50"))
//                new MegaEvolution("venusaur",
//                        Type.FAIRY, Type.PSYCHIC,
//                        new Stats(80,100,123,122,120,80),
//                        Ability.HUBRIS,
//                        25, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.DELTA)
//                        .addPalette(new MegaStonePalette("#e33090", "#08855d", "#6d32ad")),
//                new MegaEvolution("charizard",
//                        new Stats(78, 104, 78, 159, 115, 100),
//                        Ability.NOCTEM,
//                        17, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.DELTA),
//                new MegaEvolution("pidgeot",
//                        new Stats(83, 80, 80, 135, 80, 121),
//                        Ability.INTIMIDATE,
//                        15, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.DELTA),
//                new MegaEvolution("blastoise",
//                        new Stats(79, 103, 120, 135, 115, 78),
//                        Ability.MEGA_LAUNCHER,
//                        16, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.DELTA)
        ));
        return megas;
    }
}
