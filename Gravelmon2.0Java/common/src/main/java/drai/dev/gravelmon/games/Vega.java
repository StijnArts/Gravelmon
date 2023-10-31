package drai.dev.gravelmon.games;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import drai.dev.gravelmon.pokemon.vega.*;

import java.util.*;

public class Vega extends Game{
    public Vega() {
        super("Vega");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new PokemonDummy("Nimbleaf", Type.GRASS, null, List.of(new EvolutionEntry("leafrond",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "16")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Leafrond", Type.GRASS, null, List.of(new EvolutionEntry("syleafid",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "34")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Syleafid", Type.GRASS, Type.FLYING, List.of(), List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Peyero", Type.FIRE , null , List.of(new EvolutionEntry("Infiris",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "18")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Infiris", Type.FIRE , Type.STEEL , List.of(new EvolutionEntry("Astignite",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "32")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Astignite", Type.FIRE , Type.STEEL , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Liquiput", Type.WATER , null , List.of(new EvolutionEntry("Hydrush",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "14")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Hydrush", Type.WATER , null , List.of(new EvolutionEntry("Correncid",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Correncid", Type.WATER , Type.POISON , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Glachild", Type.ICE , null, List.of(new EvolutionEntry("Frozaiden",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "20")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Frozaiden", Type.ICE , null, List.of(new EvolutionEntry("Aurostice",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Aurostice", Type.ICE , null, List.of(),List.of(Label.VEGA)));
        pokemon.add(new Machu());
//        pokemon.add(new PokemonDummy("Jamberree", Type.GRASS , null, List.of(new EvolutionEntry("Strawna",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Strawna", Type.GRASS , null, List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Psycolt", Type.PSYCHIC , null, List.of(new EvolutionEntry("Kinegasus", EvolutionType.ITEM_INTERACT, false, List.of(),
//                List.of(),List.of(),"cobblemon:moon_stone"),
//                new EvolutionEntry("Yunesis", EvolutionType.ITEM_INTERACT, false, List.of(),
//                List.of(),List.of(),"cobblemon:sun_stone")),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Kinegasus", Type.PSYCHIC , Type.FLYING , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Yunesis", Type.PSYCHIC , Type.STEEL , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Rynos", Type.GROUND , null, List.of(new EvolutionEntry("Feroceros",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Feroceros", Type.STEEL , Type.GROUND , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Dizasol", Type.DARK , null, List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Folifarig", Type.NORMAL , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Willisp", Type.FIRE , null, List.of(new EvolutionEntry("Wisplode",EvolutionType.ITEM_INTERACT, false, List.of(),
//                List.of(),List.of(),"cobblemon:fire_stone")),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Wisplode", Type.FIRE , null, List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Velvelt", Type.NORMAL , null, List.of(new EvolutionEntry("Grissly",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "35")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Grissly", Type.NORMAL , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Hantama", Type.GHOST , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Rollder", Type.ROCK , Type.BUG , List.of(new EvolutionEntry("Rotillo",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25")))),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Rotillo", Type.ROCK , Type.BUG , List.of(),List.of(Label.VEGA)));
//        pokemon.add(new PokemonDummy("Snalo", Type.GRASS , Type.WATER , List.of(new EvolutionEntry("Serplant",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Serplant", Type.GRASS , Type.WATER , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Yucarlia", Type.GHOST , null, List.of(new EvolutionEntry("Necrosia",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "35")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Necrosia", Type.GHOST , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cupricorn", Type.STEEL , null, List.of(new EvolutionEntry("Hornikel",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "18")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Hornikel", Type.STEEL , null, List.of(new EvolutionEntry("Goabalt",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "32")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Goabalt", Type.STEEL , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Mornwing", Type.FIRE , Type.FLYING , List.of(new EvolutionEntry("Guldawn",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Guldawn", Type.FIRE , Type.FLYING , List.of(new EvolutionEntry("Solarisen",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "45")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Solarisen", Type.FIRE , Type.FLYING , List.of(),List.of(Label.VEGA)));
pokemon.add(new Mintch());
pokemon.add(new Blakjak());
//pokemon.add(new PokemonDummy("Maneko", Type.NORMAL , Type.FIRE , List.of(new EvolutionEntry("Bakeko",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "18")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Bakeko", Type.FIRE , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Plasmox", Type.ELECTRIC , null, List.of(new EvolutionEntry("Blitzune",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:thunder_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Blitzune", Type.ELECTRIC , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cuppa", Type.WATER , null, List.of(new EvolutionEntry("Kapwondo",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "28")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Kapwondo", Type.WATER , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Spelven", Type.GHOST , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Clotaku", Type.POISON , null, List.of(new EvolutionEntry("Ajarimus",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "16")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ajarimus", Type.DARK , null, List.of(new EvolutionEntry("Jarmit",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "32")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Jarmit", Type.GHOST , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Baizeast", Type.PSYCHIC , Type.FAIRY , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Grindon", Type.ROCK , Type.ELECTRIC , List.of(new EvolutionEntry("Scimitooth",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Scimitooth", Type.ROCK , Type.ELECTRIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Laquagon", Type.DRAGON , Type.WATER , List.of(new EvolutionEntry("Dragune",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Dragune", Type.DRAGON , Type.WATER , List.of(new EvolutionEntry("Nostratos",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Nostratos", Type.DRAGON , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lylapse", Type.GROUND , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ganimede", Type.FLYING , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Nemea", Type.STEEL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Basille", Type.GRASS , null, List.of(new EvolutionEntry("Basield",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "16")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Basield", Type.GRASS , null, List.of(new EvolutionEntry("Basilux",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Basilux", Type.GRASS , Type.ELECTRIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Patroleo", Type.FIRE , null, List.of(new EvolutionEntry("Gardleon",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "16")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Gardleon", Type.FIRE , null, List.of(new EvolutionEntry("Royalert",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Royalert", Type.FIRE , Type.GROUND , List.of(),List.of(Label.VEGA)));
pokemon.add(new Katuna(1542));
pokemon.add(new Maelstream());
pokemon.add(new Skelachone());
//pokemon.add(new PokemonDummy("Cheshile", Type.DARK , null, List.of(
//        new EvolutionEntry("Cheshess",
//        EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "24"))),
//        new EvolutionEntry("Chessire",
//        EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "24")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cheshess", Type.DARK , Type.NORMAL , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Chessire", Type.DARK , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rivird", Type.WATER , Type.FLYING , List.of(new EvolutionEntry("Mingola",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "23")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Mingola", Type.WATER , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Pachirikku", Type.ELECTRIC , null, List.of(),List.of(Label.VEGA)));
pokemon.add(new Pumpkid());
pokemon.add(new Wikkin());
//pokemon.add(new PokemonDummy("Lunabitt", Type.PSYCHIC , null, List.of(new EvolutionEntry("Lunabain",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:moon_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lunabain", Type.PSYCHIC , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Liepus", Type.DARK , null, List.of(new EvolutionEntry("Liedoro",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:sun_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Liedoro", Type.DARK , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rougella", Type.ICE , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Takuni", Type.NORMAL , null, List.of(new EvolutionEntry("Percussoon",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "20")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Percussoon", Type.NORMAL , null, List.of(new EvolutionEntry("Tanuking",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "34")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Tanuking", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Switza", Type.ICE , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Shivermin", Type.BUG , Type.ICE , List.of(new EvolutionEntry("Nymphrost",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "29")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Nymphrost", Type.BUG , Type.ICE , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Conductot", Type.PSYCHIC , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Violo", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rumpet", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Pianon", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ledybulk", Type.BUG , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Bisos", Type.NORMAL , null, List.of(new EvolutionEntry("Tauros",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP, "160")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Stellith", Type.ROCK , Type.PSYCHIC , List.of(
//        new EvolutionEntry("Planite",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:sun_stone"),
//        new EvolutionEntry("Planite",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:moon_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Planite", Type.ROCK , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Modra", Type.POISON , null, List.of(new EvolutionEntry("Komoragon",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Komoragon", Type.POISON , Type.DRAGON , List.of(),List.of(Label.VEGA)));
pokemon.add(new Tentyrant(1574));
//pokemon.add(new PokemonDummy("Lilynary", Type.FIRE , Type.NORMAL , List.of(new EvolutionEntry("Kaminary",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Kaminary", Type.FIRE , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Grieflame", Type.FIRE , Type.GHOST , List.of(new EvolutionEntry("Scorment",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "38")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Scorment", Type.FIRE , Type.GHOST , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rubball", Type.ROCK , Type.GROUND , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Phantonate", Type.NORMAL , Type.GHOST , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Strawick", Type.GHOST , null, List.of(new EvolutionEntry("Strawicked",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:thunder_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Strawicked", Type.GHOST , Type.ELECTRIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Sphericoil", Type.ELECTRIC , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Puffume", Type.POISON , Type.FLYING , List.of(new EvolutionEntry("Turblimp",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "31")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Turblimp", Type.POISON , Type.FIRE , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Yolkid", Type.NORMAL , null, List.of(new EvolutionEntry("Corenom",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:water_stone"),new EvolutionEntry("Coropper",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:leaf_stone"),new EvolutionEntry("Coruda",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:sun_stone"),new EvolutionEntry("Coraga",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:moon_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Corenom", Type.POISON , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Coropper", Type.BUG , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Coruda", Type.FLYING , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Coraga", Type.GROUND , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lizzle", Type.WATER , null, List.of(new EvolutionEntry("Drizzlob",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "33")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Drizzlob", Type.WATER , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Droudrop", Type.FIRE , null, List.of(new EvolutionEntry("Droudrum",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "33")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Droudrum", Type.FIRE , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Clouff", Type.GHOST , Type.FLYING , List.of(new EvolutionEntry("Cloubus",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "33")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cloubus", Type.GHOST , Type.FLYING , List.of(),List.of(Label.VEGA)));
pokemon.add(new Dvaarak(1597));
pokemon.add(new Doodloo(1598));
//pokemon.add(new PokemonDummy("Billserk", Type.FIGHTING , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Sableater", Type.DARK , Type.GHOST , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Jawile", Type.STEEL , Type.FAIRY , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Pinchor", Type.BUG , Type.GROUND , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Adnokana", Type.POISON , Type.STEEL , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cheauking", Type.POISON , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Guppyre", Type.WATER , Type.FIRE , List.of(new EvolutionEntry("Diaduna",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "28")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Diaduna", Type.WATER , Type.FIRE , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Relicore", Type.WATER , Type.ROCK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Fujinel", Type.FIRE , null, List.of(new EvolutionEntry("Sabrinel",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "24")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Sabrinel", Type.FIRE , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Smalmon", Type.WATER , Type.GROUND , List.of(new EvolutionEntry("Trojalmon",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "34")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Trojalmon", Type.WATER , Type.GROUND , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Punchild", Type.FIGHTING , Type.ROCK , List.of(new EvolutionEntry("Combound",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Combound", Type.FIGHTING , Type.ROCK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Wombaton", Type.GROUND , Type.GHOST , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Sandrill", Type.GROUND , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Yulfoe", Type.ELECTRIC , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Dorfin", Type.WATER , null, List.of(new EvolutionEntry("Narwhail",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25"))),
//        new EvolutionEntry("Darca",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Darca", Type.WATER , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Narwhail", Type.ICE , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Kirgicia", Type.PSYCHIC , Type.FAIRY , List.of(new EvolutionEntry("Glamarde",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:moon_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Glamarde", Type.PSYCHIC , Type.FAIRY , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Sealkie", Type.WATER , Type.ICE , List.of(new EvolutionEntry("Selody",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "35")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Selody", Type.WATER , Type.ICE , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rooten", Type.GRASS , Type.GROUND , List.of(new EvolutionEntry("Rudebarb",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "29")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Rudebarb", Type.GRASS , Type.GROUND , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Dislichen", Type.GRASS , null, List.of(new EvolutionEntry("Lumoss",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "33")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lumoss", Type.GRASS , Type.ELECTRIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Combant", Type.BUG , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Arincess", Type.BUG , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ranconette", Type.GHOST , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Carnivice", Type.GRASS , Type.WATER , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Toxroach", Type.POISON , Type.BUG , List.of(new EvolutionEntry("Cocrogue",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Cocrogue", Type.DARK , Type.BUG , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lephan", Type.GROUND , null, List.of(new EvolutionEntry("Ganerth",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ganerth", Type.GROUND , Type.PSYCHIC , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Valentide", Type.WATER , Type.NORMAL , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Pressie", Type.WATER , Type.ICE , List.of(new EvolutionEntry("Lapras",
//        EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP, "160")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Shretainer", Type.GRASS , null, List.of(new EvolutionEntry("Samushrai",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:fire_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Samushrai", Type.GRASS , Type.FIRE , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ptervus", Type.ROCK , Type.FLYING , List.of(new EvolutionEntry("Pteriarch",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "40")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Pteriarch", Type.ROCK , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Tyranos", Type.ROCK , Type.DARK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Ambilade", Type.STEEL , null, List.of(new EvolutionEntry("Mandiblade",
//  EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "38"))),
//        new EvolutionEntry("Mercenade",
//                EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "38")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Mandiblade", Type.STEEL , Type.ROCK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Mercenade", Type.STEEL , Type.FIGHTING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Terubim", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Blizentork", Type.ICE , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Galavagos", Type.FIRE , Type.ROCK , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Auldsparce", Type.NORMAL , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("R'duckulus", Type.FIGHTING , Type.FLYING , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Roytsar", Type.NORMAL , Type.DRAGON , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Gatanoia", Type.DARK , Type.DRAGON , List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Lukewran", Type.FIRE , Type.STEEL , List.of(new EvolutionEntry("Heatran",
//        EvolutionType.ITEM_INTERACT, false, List.of(),
//        List.of(),List.of(),"cobblemon:fire_stone")),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Aldina", Type.GHOST , null, List.of(new EvolutionEntry("Almaria",
//        EvolutionType.LEVEL_UP, List.of(), List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP, "160")))),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Almaria", Type.GHOST , null, List.of(),List.of(Label.VEGA)));
//pokemon.add(new PokemonDummy("Asphere", null, null, List.of(),List.of(Label.VEGA)));
    }
}
