package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ruskow.*;

import java.util.*;

public class Ruskow extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ruskow();
    private Ruskow() {
        super("Ruskow");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Eleplant());   
        addNewPokemon(new Herbederm());   
        addNewPokemon(new Mammahonia());
        addNewPokemon(new Bollokin());   
        addNewPokemon(new Flamabull());   
        addNewPokemon(new Audhroch(new Stats(524, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Newtiny());   
        addNewPokemon(new Salamarsh());   
        addNewPokemon(new Caudatidal(new Stats(524, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Coocun());   
        addNewPokemon(new Cocadeux());   
        addNewPokemon(new Cocatrois(new Stats(510, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Pilfur());   
        addNewPokemon(new Pikpossum(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Nimf());   
        addNewPokemon(new Trusshy());   
        addNewPokemon(new Dayfly(new Stats(390, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Duskito(new Stats(390, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Kupal());   
        addNewPokemon(new Cheervona(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Taracub());   
        addNewPokemon(new Dentdeleo());   
        addNewPokemon(new Dandylion(new Stats(490, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Cervidear(new Stats(340, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.HP))));
        addNewPokemon(new Pedenki(new Stats(330, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Rasclove(new Stats(340, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Inkling());   
        addNewPokemon(new Inkap());   
        addNewPokemon(new Inklassy(new Stats(470, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Sorrowmin());   
        addNewPokemon(new Ermourne());   
        addNewPokemon(new Weepsel(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Magixy());   
        addNewPokemon(new Magimancy(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Critatter());   
        addNewPokemon(new Critippet());   
        addNewPokemon(new Critabard(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Spectung());   
        addNewPokemon(new Hauntung());   
        addNewPokemon(new Phantung(new Stats(470, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Maluce());   
        addNewPokemon(new Nitemori(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Llima());   
        addNewPokemon(new Rocpaca());   
        addNewPokemon(new Jewellama(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Crovus());   
        addNewPokemon(new Cawpin(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Flambe());   
        addNewPokemon(new Fricasheep());   
        addNewPokemon(new Searies(new Stats(470, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Lullamb());   
        addNewPokemon(new Shleepy(new Stats(450, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Mismol());   
        addNewPokemon(new Hokumol(new Stats(460, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Boovine(new Stats(390, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tumblwee());   
        addNewPokemon(new Jumblweed());   
        addNewPokemon(new Troublweed(new Stats(460, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Poisoma());   
        addNewPokemon(new Coronatox(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Spuro());   
        addNewPokemon(new Spurtail(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        addNewPokemon(new Walabrume());   
        addNewPokemon(new Kangarain());   
        addNewPokemon(new Stormaroo(new Stats(480, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Cadavish());   
        addNewPokemon(new Carcashark(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Shoales());   
        addNewPokemon(new Palaices(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dolfun());   
        addNewPokemon(new Tropiaqua(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Peruna(new Stats(390, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));   
//        addNewPokemon(new Mantill());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Maneral());   Missing Art
//        addNewPokemon(new Dripem());   Missing Art
//        addNewPokemon(new Blowelt());   Missing Art
//        addNewPokemon(new Perxie());   Missing Art
//        addNewPokemon(new Frownie());   Missing Art
//        addNewPokemon(new Grimlin());   Missing Art
//        addNewPokemon(new Gargamin());   Missing Art
//        addNewPokemon(new Garguardan());   Missing Art
//        addNewPokemon(new Shivery());   Missing Art
//        addNewPokemon(new Glaciowl());   Missing Art
//        addNewPokemon(new Snobun());   Missing Art
//        addNewPokemon(new Lapice());   Missing Art
//        addNewPokemon(new Merrymint());   Missing Art
//        addNewPokemon(new Ringibell());   Missing Art
//        addNewPokemon(new Iciclaw());   Missing Art
//        addNewPokemon(new Chillobo());   Missing Art
//        addNewPokemon(new Twinklyink());   Missing Art
//        addNewPokemon(new Tadbole());   Missing Art
//        addNewPokemon(new Frolog());   Missing Art
//        addNewPokemon(new Grottoad());   Missing Art
//        addNewPokemon(new Firaffa());   Missing Art
//        addNewPokemon(new Paladon());   Missing Art
//        addNewPokemon(new Wreking());   Missing Art
//        addNewPokemon(new Gagild());   Missing Art
//        addNewPokemon(new Paramite());   Missing Art
//        addNewPokemon(new Cordysect());   Missing Art
//        addNewPokemon(new Hissathmum());   Missing Art
//        addNewPokemon(new Unispor());   Missing Art
//        addNewPokemon(new Bispor());   Missing Art
//        addNewPokemon(new Trispor());   Missing Art
//        addNewPokemon(new Aubanda());   Missing Art
//        addNewPokemon(new Burbanda());   Missing Art
//        addNewPokemon(new Babashka());   Missing Art
//        addNewPokemon(new Mamashka());   Missing Art
//        addNewPokemon(new Gulpy());   Missing Art
//        addNewPokemon(new Peroleum());   Missing Art
//        addNewPokemon(new Chafern());   Missing Art
//        addNewPokemon(new Cirgrus());   Missing Art
//        addNewPokemon(new Pavogue());   
//        addNewPokemon(new Sovynik());   Missing Art
//        addNewPokemon(new Ussernaut());   Missing Art
//        addNewPokemon(new Eetie());   Missing Art
//        addNewPokemon(new Youefo());   Missing Art
        addNewPokemon(new Catopact());   
        addNewPokemon(new Spectreflek());   
        addNewPokemon(new Polterglas(new Stats(510, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Sleazer());   Missing Art
//        addNewPokemon(new Plagrusomr());   Missing Art
//        addNewPokemon(new Torspeedo());   Missing Art
//        addNewPokemon(new Subuoyant());   Missing Art
//        addNewPokemon(new Acrylor());   Missing Art
//        addNewPokemon(new Tempoura());   Missing Art
//        addNewPokemon(new Gallopere());   Missing Art
//        addNewPokemon(new Solbud());   Missing Art
//        addNewPokemon(new Grotess());   Missing Art
//        addNewPokemon(new Larvequin());   Missing Art
//        addNewPokemon(new Harlequeen());   Missing Art
//        addNewPokemon(new Teddilite());   Missing Art
//        addNewPokemon(new Bearionette());   Missing Art
        addNewPokemon(new Oozion());   
        addNewPokemon(new Gloopzion(new Stats(480, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
//        addNewPokemon(new Nomix());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Clerix());   Missing Art
//        addNewPokemon(new Sorcerix());   Missing Art
//        addNewPokemon(new Combatix());   Missing Art
//        addNewPokemon(new Bandix());   Missing Art
//        addNewPokemon(new Judodo());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Solotussle());   Missing Art
//        addNewPokemon(new Keewee());   Missing Art
//        addNewPokemon(new Behemoa());   Missing Art
//        addNewPokemon(new Bisdawn());   Missing Art
//        addNewPokemon(new Adeos());   Missing Art
//        addNewPokemon(new Aurevora());   Missing Art
//        addNewPokemon(new Lamotte());   Missing Art
//        addNewPokemon(new Wawalle());   Missing Art
//        addNewPokemon(new Villamya());   Missing Art
//        addNewPokemon(new Simagedon());   Missing Art
//        addNewPokemon(new Kumajr());   Missing Art
    }

}
