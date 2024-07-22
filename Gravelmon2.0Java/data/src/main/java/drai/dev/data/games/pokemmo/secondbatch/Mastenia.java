package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mastenia.Albamate;
import drai.dev.data.pokemon.mastenia.Banshriek;
import drai.dev.data.attributes.*;

import java.util.*;

public class Mastenia extends drai.dev.data.games.registry.Game {
    public Mastenia() {
        super("Mastenia");
    }

    @Override
    public void registerPokemon() {

        pokemon.add(new Kididna());   
        pokemon.add(new Hididna());   
        pokemon.add(new Wreckidna());
        pokemon.add(new Platykid());   
        pokemon.add(new Platysus());   
        pokemon.add(new Searopod());
        pokemon.add(new Bwibble());   
        pokemon.add(new Sailizard());   
        pokemon.add(new Dracurrent());
        pokemon.add(new Cereusaur());
        pokemon.add(new Savazard());
        pokemon.add(new Boltoise());
//        pokemon.add(new Deceptile());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Henquinn()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Chromerge());   MEMBER OF LINE NOT FINISHED
        pokemon.add(new Devidare(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Rochpillar());   
        pokemon.add(new Roccoon());   
        pokemon.add(new Papilitite(new Stats(412, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Burblu());   
        pokemon.add(new Crestrike());   
        pokemon.add(new Faewren(new Stats(451, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Psychu(new Stats(432, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Bombat());   
        pokemon.add(new Bombarbat(new Stats(421, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Worrish());   
        pokemon.add(new Tuleep());   
        pokemon.add(new Ceremonia(new Stats(504, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Terrainiac(new Stats(504, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Quagfire(new Stats(430, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Tasmeanie());   
        pokemon.add(new Tasmighty(new Stats(434, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Sparkatoo(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Kiwee(new Stats(341, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
//        pokemon.add(new Kookabrra());   Missing Art
        pokemon.add(new Didoge());   
        pokemon.add(new Dingdog(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Curseed());   
        pokemon.add(new Tauntrunk(new Stats(434, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Grumfish(new Stats(378, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Crocoshy());   
        pokemon.add(new Savagnile(new Stats(460, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Macrabi());   
        pokemon.add(new Crabutan());
        pokemon.add(new Elefleur());   
        pokemon.add(new Eleforet(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Bubbit());
        pokemon.add(new Bunomi());   
        pokemon.add(new Bunelania(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Delfine(new Stats(430, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Tentarule(new Stats(515, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Gulligull());   
        pokemon.add(new Albamate(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK)))); //renamed from Albacross
        pokemon.add(new Abyssmulk());
        pokemon.add(new Nonono());   
        pokemon.add(new Serpyre());
        pokemon.add(new Adaptoad());
        pokemon.add(new Trancendo(new Stats(410, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Lizphard(new Stats(310, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Plasmuff());   
        pokemon.add(new Phanpunk());   
        pokemon.add(new Banshriek(new Stats(490, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Echoplasm(new Stats(490, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Leturte());   
        pokemon.add(new Morturtle(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Chickling());   
        pokemon.add(new Strickhen(new Stats(440, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
//        pokemon.add(new Kangaskid());   Missing Art
//        pokemon.add(new Kingaskhan()); MEMBER OF LINE NOT FINISHED
        pokemon.add(new Boltbat(new Stats(370, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Roladuck(new Stats(340, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Wandix());   
        pokemon.add(new Steadix(new Stats(510, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        pokemon.add(new Magneflite());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Magnozone());   MEMBER OF LINE NOT FINISHED
        pokemon.add(new Larvicous());
        pokemon.add(new Flyterror());
        pokemon.add(new Mantism(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Larvresta());   
        pokemon.add(new Lunamoth(new Stats(550, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Mothumbra(new Stats(550, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Heatant(new Stats(484, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Durmor(new Stats(484, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Beetleer());   
        pokemon.add(new Cryscrawler(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Esmezra());
        pokemon.add(new Gonut(new Stats(350, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Frygirr(new Stats(410, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Yipbun());
        pokemon.add(new Detome());   
        pokemon.add(new Rogbaahl());
        pokemon.add(new Reabuto(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Mawvile(new Stats(380, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK, StatType.ATTACK))));
        pokemon.add(new Parasight());
        pokemon.add(new Wakkabana(new Stats(410, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Terrawr());
        pokemon.add(new Scurple());   
        pokemon.add(new Scorperor());
        pokemon.add(new Ogrean(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Bebushi());   
        pokemon.add(new Conferocious(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Hissmoke());
        pokemon.add(new Wulvlacine());
        pokemon.add(new Terratusk());
//        pokemon.add(new Drump()); Member of line Not Finished  
//        pokemon.add(new Fredoron()); Member of line Not Finished
        pokemon.add(new Tidaltar());
        pokemon.add(new Palmguana(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Ferocice(new Stats(580, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Turteller(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Terrosect(new Stats(580, StatArchetype.MIXED_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Resurexor());
        pokemon.add(new Obspeedian());
        pokemon.add(new Tecthanic());
        pokemon.add(new Paruwha());
//        pokemon.add(new Stunzeed());   Missing Art
    }

}
