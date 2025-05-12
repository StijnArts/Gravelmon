package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.atlas.*;
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
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.rica.*;
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
        addNewPokemon(new Scurley());
        addNewPokemon(new Burramble());
        addNewPokemon(new Bramboom());
        addNewPokemon(new Lamber());
        addNewPokemon(new Volpaca());
        addNewPokemon(new Sheruption());
//        addNewPokemon(new Pengle()); Member of line Not Finished
//        addNewPokemon(new Twaddle()); Member of line Not Finished
//        addNewPokemon(new Pengalance());   Missing Art
        addNewPokemon(new Grubble());
        addNewPokemon(new Pupive());
        addNewPokemon(new Waspen(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Glittle());
        addNewPokemon(new Lupupa());
        addNewPokemon(new Fluminux(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Aegle());
        addNewPokemon(new Eaglory(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Cavole());
        addNewPokemon(new Cavident(new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Quetzap());
        addNewPokemon(new Shockatoo());
        addNewPokemon(new Kotukoatl());
        addNewPokemon(new Grainum());
        addNewPokemon(new Tomabi());
        addNewPokemon(new Otamot());
        addNewPokemon(new Smulb());
        addNewPokemon(new Lillusion());
        addNewPokemon(new Putrigeist(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Bommy());
        addNewPokemon(new Wubunny());
        addNewPokemon(new Froskie());
        addNewPokemon(new Alpaline(new Stats(465, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Musiquail());
        addNewPokemon(new Orphestra(new Stats(478, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Flurrilli());
        addNewPokemon(new Daffochil());
        addNewPokemon(new Frigivine(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new PekPek());
        addNewPokemon(new Vampeka(new Stats(466, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.SPEED, StatType.SPEED))));
        addNewPokemon(new Zeta());
        addNewPokemon(new Gizeta());
        addNewPokemon(new Shogizeta(new Stats(523, StatArchetype.BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Panboo());
        addNewPokemon(new Bansenbu(new Stats(452, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Vyrat());
        addNewPokemon(new Miasflow(new Stats(421, StatArchetype.FAST_PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Gumla());
        addNewPokemon(new Eucowala(new Stats(432, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Kooragant());
        addNewPokemon(new Mockaburra(new Stats(444, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Pebblet());
        addNewPokemon(new Peccarock(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Dasypudge());
        addNewPokemon(new Armordillo(new Stats(435, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Quafer());
        addNewPokemon(new Orycterra(new Stats(435, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Pygnite());
        addNewPokemon(new Pocinder());
        addNewPokemon(new Quolcano(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Chimpunk(new Stats(348, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Snoosect());
        addNewPokemon(new Lumibuzz());
        addNewPokemon(new Loticus());
        addNewPokemon(new Lotiluna(new Stats(487, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Avipip());
        addNewPokemon(new Parasquack());
        addNewPokemon(new Peasicant(new Stats(503, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Florita());
        addNewPokemon(new Floraia(new Stats(467, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.HP))));
        addNewPokemon(new Bunoo());
        addNewPokemon(new Boobun(new Stats(406, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Wizarda());
        addNewPokemon(new Wizadow(new Stats(435, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ghouster(new Stats(356, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));    //Renamed from Banshriek
        addNewPokemon(new Fenetic());
        addNewPokemon(new Voltient(new Stats(443, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Tricity(new Stats(345, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Curray(new Stats(345, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Cubet());
        addNewPokemon(new Titanice(new Stats(465, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Haildeer(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Littull());
        addNewPokemon(new Nobull(new Stats(455, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Irritabull(new Stats(455, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Orukul(new Stats(412, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Tinguano());
        addNewPokemon(new Donguano());
        addNewPokemon(new Khepharoh(new Stats(501, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Poisstone(new Stats(358, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Conium());
        addNewPokemon(new Conchorn());
        addNewPokemon(new Liquion(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Cocopow());
        addNewPokemon(new Chemko(new Stats(421, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Kiwern(new Stats(387, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Wetaket(new Stats(402, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tuatria(new Stats(378, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Angemini(new Stats(365, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Urnada(new Stats(389, StatArchetype.BULKY_SUPPORT, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Caprikid());
        addNewPokemon(new Cascaprine(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Flaries(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Vipetro());
        addNewPokemon(new Serpentide(new Stats(465, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Moorling());
        addNewPokemon(new Pukana(new Stats(455, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Armorca(new Stats(432, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Shiverish());
        addNewPokemon(new Glacuda());
        addNewPokemon(new Cryodra());
        addNewPokemon(new Slimug());
        addNewPokemon(new Segnapod());
        addNewPokemon(new Brumbolt());
        addNewPokemon(new Incendaur(new Stats(521, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.SPEED))));
        addNewPokemon(new Sukoi());
        addNewPokemon(new Plecoast(new Stats(448, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Aquana(new Stats(448, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Sakano());
        addNewPokemon(new Sakanodon(new Stats(523, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));   //Renamed from Draphin
        addNewPokemon(new Crebb());
        addNewPokemon(new Crustocean());
        addNewPokemon(new Impie());
        addNewPokemon(new Impulso());
        addNewPokemon(new Impers());
        addNewPokemon(new Imploda());
        addNewPokemon(new Impac());
        addNewPokemon(new Imprism());
        addNewPokemon(new Solare(new Stats(398, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Glaciare(new Stats(398, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Pluvare(new Stats(398, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Caecare(new Stats(398, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Caligulare(new Stats(398, StatArchetype.FAST_SPECIAL_ATTACKER, 
                List.of(StatType.HP))));
        addNewPokemon(new Sollis());
        addNewPokemon(new Sollord(new Stats(487, StatArchetype.PHYSICAL_ATTACKER, 
                List.of(StatType.ATTACK))));
        addNewPokemon(new Raptorch());
        addNewPokemon(new Velosickle(new Stats(487, StatArchetype.PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Lophi());
        addNewPokemon(new Ocephus(new Stats(487, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Mamby());
        addNewPokemon(new Mamroth(new Stats(487, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Frospine());
        addNewPokemon(new Phasmyst());
        addNewPokemon(new Spectrice());
        addNewPokemon(new Chibiryu());
        addNewPokemon(new Midryu());
        addNewPokemon(new Ryurai(new Stats(600, StatArchetype.SPECIAL_ATTACKER, 
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Seaquine(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Greequine(new Stats(590, StatArchetype.FAST_SUPPORT, 
                List.of(StatType.HP))));
        addNewPokemon(new Orequine(new Stats(590, StatArchetype.FAST_PHYSICAL_WALL, 
                List.of(StatType.HP))));
        addNewPokemon(new Draquados(new Stats(650, StatArchetype.SPECIAL_WALL, 
                List.of(StatType.SPECIAL_ATTACK))));
    }

}
