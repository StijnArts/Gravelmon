package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.atlas.Bramboom;
import drai.dev.data.pokemon.atlas.Burramble;
import drai.dev.data.pokemon.atlas.Crebb;
import drai.dev.data.pokemon.atlas.Crustocean;
import drai.dev.data.pokemon.atlas.Donguano;
import drai.dev.data.pokemon.atlas.Impac;
import drai.dev.data.pokemon.atlas.Impers;
import drai.dev.data.pokemon.atlas.Impie;
import drai.dev.data.pokemon.atlas.Imploda;
import drai.dev.data.pokemon.atlas.Impulso;
import drai.dev.data.pokemon.atlas.Kotukoatl;
import drai.dev.data.pokemon.atlas.Lamber;
import drai.dev.data.pokemon.atlas.Otamot;
import drai.dev.data.pokemon.atlas.Quetzap;
import drai.dev.data.pokemon.atlas.Scurley;
import drai.dev.data.pokemon.atlas.Sheruption;
import drai.dev.data.pokemon.atlas.Shockatoo;
import drai.dev.data.pokemon.atlas.Tinguano;
import drai.dev.data.pokemon.atlas.Tomabi;
import drai.dev.data.pokemon.atlas.Volpaca;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.cyare.Ghouster;
import drai.dev.data.pokemon.rica.Conchorn;
import drai.dev.data.pokemon.rica.Conium;
import drai.dev.data.pokemon.rica.Lumibuzz;
import drai.dev.data.pokemon.rica.Snoosect;

import java.util.*;

public class Cyare extends drai.dev.data.games.registry.Game {
    public Cyare() {
        super("Cyare");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Scurley());
        pokemon.add(new Burramble());
        pokemon.add(new Bramboom());
        pokemon.add(new Lamber());
        pokemon.add(new Volpaca());
        pokemon.add(new Sheruption());
//        pokemon.add(new Pengle()); Member of line Not Finished
//        pokemon.add(new Twaddle()); Member of line Not Finished
//        pokemon.add(new Pengalance());   Missing Art
        pokemon.add(new Grubble());
        pokemon.add(new Pupive());
        pokemon.add(new Waspen(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Glittle());
        pokemon.add(new Lupupa());
        pokemon.add(new Fluminux(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Aegle());   Missing Stats
        pokemon.add(new Eaglory(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Cavole());   Missing Stats
        pokemon.add(new Cavident(new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Quetzap());
        pokemon.add(new Shockatoo());
        pokemon.add(new Kotukoatl());
        pokemon.add(new Grainum());
        pokemon.add(new Tomabi());
        pokemon.add(new Otamot());
        pokemon.add(new Smulb());   Missing Stats
        pokemon.add(new Lillusion());   Missing Stats
        pokemon.add(new Putrigeist(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Bommy());   Missing Stats
        pokemon.add(new Wubunny()); Member of line Not Finished
        pokemon.add(new Froskie());   Missing Stats
        pokemon.add(new Alpaline(new Stats(465, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Musiquail());   Missing Stats
        pokemon.add(new Orphestra(new Stats(478, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Flurrilli());   Missing Stats
        pokemon.add(new Daffochil());   Missing Stats
        pokemon.add(new Frigivine(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new PekPek());   Missing Stats
        pokemon.add(new Vampeka(new Stats(466, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED, StatType.SPEED))));   Missing Stats
        pokemon.add(new Zeta());   Missing Stats
        pokemon.add(new Gizeta());   Missing Stats
        pokemon.add(new Shogizeta(new Stats(523, StatArchetype.BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Panboo());   Missing Stats
        pokemon.add(new Bansenbu(new Stats(452, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Vyrat());   Missing Stats
        pokemon.add(new Miasflow(new Stats(421, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Gumla());   Missing Stats
        pokemon.add(new Eucowala(new Stats(432, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Kooragant());   Missing Stats
        pokemon.add(new Mockaburra(new Stats(444, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Pebblet());   Missing Stats
        pokemon.add(new Peccarock(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Dasypudge());   Missing Stats
        pokemon.add(new Armordillo(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Quafer());   Missing Stats
        pokemon.add(new Orycterra(new Stats(435, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Pygnite());   Missing Stats
        pokemon.add(new Pocinder());   Missing Stats
        pokemon.add(new Quolcano(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Chimpunk(new Stats(348, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Snoosect());
        pokemon.add(new Lumibuzz());
        pokemon.add(new Loticus());   Missing Stats
        pokemon.add(new Lotiluna(new Stats(487, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Avipip());   Missing Stats
        pokemon.add(new Parasquack());   Missing Stats
        pokemon.add(new Peasicant(new Stats(503, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Florita());   Missing Stats
        pokemon.add(new Floraia(new Stats(467, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Bunoo());   Missing Stats
        pokemon.add(new Boobun(new Stats(406, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Wizarda());   Missing Stats
        pokemon.add(new Wizadow(new Stats(435, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Ghouster(new Stats(356, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));   Missing Stats //Renamed from Banshriek
        pokemon.add(new Fenetic());   Missing Stats
        pokemon.add(new Voltient(new Stats(443, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Tricity(new Stats(345, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Curray(new Stats(345, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cubet());   Missing Stats
        pokemon.add(new Titanice(new Stats(465, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Haildeer(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Littull());   Missing Stats
        pokemon.add(new Nobull(new Stats(455, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Irritabull(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK)))); Member of line Not Finished
        pokemon.add(new Orukul(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Tinguano());
        pokemon.add(new Donguano());
        pokemon.add(new Khepharoh(new Stats(501, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Poisstone(new Stats(358, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Conium());
        pokemon.add(new Conchorn());
        pokemon.add(new Liquion(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Cocopow());
        pokemon.add(new Chemko(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Kiwern());   Missing Stats
        pokemon.add(new Wetaket(new Stats(402, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Tuatria(new Stats(378, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Angemini(new Stats(365, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Urnada(new Stats(389, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Caprikid());   Missing Stats
        pokemon.add(new Cascaprine(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Flaries(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Vipetro());   Missing Stats
        pokemon.add(new Serpentide(new Stats(465, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Moorling());   Missing Stats
        pokemon.add(new Pukana(new Stats(455, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Armorca(new Stats(432, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Shiverish());   Missing Stats
        pokemon.add(new Glacuda());   Missing Stats
        pokemon.add(new Cryodra()); Member of line Not Finished
        pokemon.add(new Slimug());   Missing Stats
        pokemon.add(new Segnapod()); Member of line Not Finished
        pokemon.add(new Brumbolt());   Missing Stats
        pokemon.add(new Incendaur(new Stats(521, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Sukoi());   Missing Stats
        pokemon.add(new Plecoast(new Stats(448, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Aquana(new Stats(448, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sakano());   Missing Stats
        pokemon.add(new Sakanodon(new Stats(523, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Member of line Not Finished //Renamed from Draphin
        pokemon.add(new Crebb());
        pokemon.add(new Crustocean());
        pokemon.add(new Impie());
        pokemon.add(new Impulso());
        pokemon.add(new Impers());
        pokemon.add(new Imploda());
        pokemon.add(new Impac());
        pokemon.add(new Imprism());
        pokemon.add(new Solare(new Stats(398, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Glaciare(new Stats(398, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Pluvare(new Stats(398, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Caecare(new Stats(398, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Caligulare(new Stats(398, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sollis());   Missing Stats
        pokemon.add(new Sollord(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Raptorch());   Missing Stats
        pokemon.add(new Velosickle(new Stats(487, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Lophi());   Missing Stats
        pokemon.add(new Ocephus(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Mamby());   Missing Stats
        pokemon.add(new Mamroth(new Stats(487, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Frospine());   Missing Stats
        pokemon.add(new Phasmyst());   Missing Stats
        pokemon.add(new Spectrice()); Member of line Not Finished
        pokemon.add(new Chibiryu());   Missing Stats
        pokemon.add(new Midryu());   Missing Stats
        pokemon.add(new Ryurai(new Stats(600, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Seaquine(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Greequine(new Stats(590, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Orequine(new Stats(590, StatArchetype.FAST_PHYSICAL_WALL, 
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Draquados(new Stats(650, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
    }

}
