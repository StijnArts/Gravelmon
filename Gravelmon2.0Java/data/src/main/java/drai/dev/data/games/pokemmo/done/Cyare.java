package drai.dev.data.games.pokemmo.done;


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
//done
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
        pokemon.add(new Aegle());
        pokemon.add(new Eaglory(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        pokemon.add(new Cavole());
        pokemon.add(new Cavident(new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Quetzap());
        pokemon.add(new Shockatoo());
        pokemon.add(new Kotukoatl());
        pokemon.add(new Grainum());
        pokemon.add(new Tomabi());
        pokemon.add(new Otamot());
        pokemon.add(new Smulb());
        pokemon.add(new Lillusion());
        pokemon.add(new Putrigeist(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Bommy());
        pokemon.add(new Wubunny());
        pokemon.add(new Froskie());
        pokemon.add(new Alpaline(new Stats(465, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Musiquail());
        pokemon.add(new Orphestra(new Stats(478, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));
        pokemon.add(new Flurrilli());
        pokemon.add(new Daffochil());
        pokemon.add(new Frigivine(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new PekPek());
        pokemon.add(new Vampeka(new Stats(466, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED, StatType.SPEED))));
        pokemon.add(new Zeta());
        pokemon.add(new Gizeta());
        pokemon.add(new Shogizeta(new Stats(523, StatArchetype.BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Panboo());
        pokemon.add(new Bansenbu(new Stats(452, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Vyrat());
        pokemon.add(new Miasflow(new Stats(421, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        pokemon.add(new Gumla());
        pokemon.add(new Eucowala(new Stats(432, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Kooragant());
        pokemon.add(new Mockaburra(new Stats(444, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Pebblet());
        pokemon.add(new Peccarock(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Dasypudge());
        pokemon.add(new Armordillo(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Quafer());
        pokemon.add(new Orycterra(new Stats(435, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Pygnite());
        pokemon.add(new Pocinder());
        pokemon.add(new Quolcano(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Chimpunk(new Stats(348, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));
        pokemon.add(new Snoosect());
        pokemon.add(new Lumibuzz());
        pokemon.add(new Loticus());
        pokemon.add(new Lotiluna(new Stats(487, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Avipip());
        pokemon.add(new Parasquack());
        pokemon.add(new Peasicant(new Stats(503, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Florita());
        pokemon.add(new Floraia(new Stats(467, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.HP))));
        pokemon.add(new Bunoo());
        pokemon.add(new Boobun(new Stats(406, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Wizarda());
        pokemon.add(new Wizadow(new Stats(435, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Ghouster(new Stats(356, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));    //Renamed from Banshriek
        pokemon.add(new Fenetic());
        pokemon.add(new Voltient(new Stats(443, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Tricity(new Stats(345, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Curray(new Stats(345, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Cubet());
        pokemon.add(new Titanice(new Stats(465, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Haildeer(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Littull());
        pokemon.add(new Nobull(new Stats(455, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Irritabull(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Orukul(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Tinguano());
        pokemon.add(new Donguano());
        pokemon.add(new Khepharoh(new Stats(501, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Poisstone(new Stats(358, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Conium());
        pokemon.add(new Conchorn());
        pokemon.add(new Liquion(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        pokemon.add(new Cocopow());
        pokemon.add(new Chemko(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Kiwern(new Stats(387, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Wetaket(new Stats(402, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Tuatria(new Stats(378, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Angemini(new Stats(365, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Urnada(new Stats(389, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Caprikid());
        pokemon.add(new Cascaprine(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Flaries(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        pokemon.add(new Vipetro());
        pokemon.add(new Serpentide(new Stats(465, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Moorling());
        pokemon.add(new Pukana(new Stats(455, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Armorca(new Stats(432, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        pokemon.add(new Shiverish());
        pokemon.add(new Glacuda());
        pokemon.add(new Cryodra());
        pokemon.add(new Slimug());
        pokemon.add(new Segnapod());
        pokemon.add(new Brumbolt());
        pokemon.add(new Incendaur(new Stats(521, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        pokemon.add(new Sukoi());
        pokemon.add(new Plecoast(new Stats(448, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Aquana(new Stats(448, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Sakano());
        pokemon.add(new Sakanodon(new Stats(523, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   //Renamed from Draphin
        pokemon.add(new Crebb());
        pokemon.add(new Crustocean());
        pokemon.add(new Impie());
        pokemon.add(new Impulso());
        pokemon.add(new Impers());
        pokemon.add(new Imploda());
        pokemon.add(new Impac());
        pokemon.add(new Imprism());
        pokemon.add(new Solare(new Stats(398, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Glaciare(new Stats(398, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Pluvare(new Stats(398, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Caecare(new Stats(398, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Caligulare(new Stats(398, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        pokemon.add(new Sollis());
        pokemon.add(new Sollord(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        pokemon.add(new Raptorch());
        pokemon.add(new Velosickle(new Stats(487, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Lophi());
        pokemon.add(new Ocephus(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Mamby());
        pokemon.add(new Mamroth(new Stats(487, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Frospine());
        pokemon.add(new Phasmyst());
        pokemon.add(new Spectrice());
        pokemon.add(new Chibiryu());
        pokemon.add(new Midryu());
        pokemon.add(new Ryurai(new Stats(600, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Seaquine(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Greequine(new Stats(590, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));
        pokemon.add(new Orequine(new Stats(590, StatArchetype.FAST_PHYSICAL_WALL, 
                List.of(StatType.HP))));
        pokemon.add(new Draquados(new Stats(650, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.SPECIAL_ATTACK))));
    }

}
