package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.mastenia.*;

import java.util.*;

public class Mastenia extends drai.dev.data.games.registry.Game {
    public Mastenia() {
        super("Mastenia");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Kididna());   
        addNewPokemon(new Hididna());   
        addNewPokemon(new Wreckidna());
        addNewPokemon(new Platykid());   
        addNewPokemon(new Platysus());   
        addNewPokemon(new Searopod());
        addNewPokemon(new Bwibble());   
        addNewPokemon(new Sailizard());   
        addNewPokemon(new Dracurrent());
        addPokedexPokemon("bulbasaur, ivysaur");
        addNewPokemon(new Cereusaur());
        addPokedexPokemon("charmander, charmeleon");
        addNewPokemon(new Savazard());
        addPokedexPokemon("squirtle, wartortle");
        addNewPokemon(new Boltoise());
//        addNewPokemon(new Treecko(252));
//        addNewPokemon(new Deceptile());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Henquinn()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Chromerge());   MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Devidare(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Rochpillar());
        addNewPokemon(new Roccoon());
        addNewPokemon(new Papilitite(new Stats(412, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Burblu());
        addNewPokemon(new Crestrike());
        addNewPokemon(new Faewren(new Stats(501, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Psychu(new Stats(432, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Bombat());   
        addNewPokemon(new Bombarbat(new Stats(421, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Worrish());   
        addNewPokemon(new Tuleep());   
        addNewPokemon(new Ceremonia(new Stats(504, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Terrainiac(new Stats(504, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addPokedexPokemon("wooper-mastenian");
        addNewPokemon(new Quagfire(new Stats(430, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("volbeat-mastenian");
        addNewPokemon(new Tasmeanie());
        addNewPokemon(new Tasmighty(new Stats(434, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Sparkatoo(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kiwee(new Stats(341, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
//        addNewPokemon(new Kookabrra());   Missing Art
        addNewPokemon(new Didoge());   
        addNewPokemon(new Dingdog(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Curseed());   
        addNewPokemon(new Tauntrunk(new Stats(434, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Grumfish(new Stats(378, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Crocoshy());   
        addNewPokemon(new Savagnile(new Stats(460, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Macrabi());   
        addNewPokemon(new Crabutan());
        addNewPokemon(new Elefleur());   
        addNewPokemon(new Eleforet(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Bubbit());
        addNewPokemon(new Bunomi());   
        addNewPokemon(new Bunelania(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("luvdisc");
        addNewPokemon(new Delfine(new Stats(430, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("tentacool-mastenian");
        addNewPokemon(new Tentarule(new Stats(515, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Gulligull());   
        addNewPokemon(new Albamate(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK)))); //renamed from Albacross
        addPokedexPokemon("chinchou-mastenian");
        addPokedexPokemon("lanturn-mastenian");
        addNewPokemon(new Abyssmulk());
        addNewPokemon(new Nonono());   
        addNewPokemon(new Serpyre());
        addNewPokemon(new Adaptoad());
        addPokedexPokemon("psyduck-mastenian");
        addPokedexPokemon("golduck-mastenian");
        addNewPokemon(new Trancendo(new Stats(410, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("komala-mastenian");
        addNewPokemon(new Lizphard(new Stats(310, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Plasmuff());   
        addNewPokemon(new Phanpunk());   
        addNewPokemon(new Banshriek(new Stats(490, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Echoplasm(new Stats(490, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Leturte());
        addNewPokemon(new Morturtle(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Chickling());   
        addNewPokemon(new Strickhen(new Stats(440, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
//        addNewPokemon(new Kangaskid());   Missing Art
//        addNewPokemon(new Kingaskhan()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Boltbat(new Stats(370, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("shroomish-mastenian");
        addPokedexPokemon("breloom-mastenian");
        addNewPokemon(new Roladuck(new Stats(340, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        addNewPokemon(new Wandix());   
        addNewPokemon(new Steadix(new Stats(510, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Magneflite());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Magnozone());   MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Larvicous());
        addNewPokemon(new Flyterror());
        addNewPokemon(new Mantism(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Larvresta());   
        addNewPokemon(new Lunamoth(new Stats(550, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Mothumbra(new Stats(550, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Heatant(new Stats(484, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Durmor(new Stats(484, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Beetleer());   
        addNewPokemon(new Cryscrawler(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Esmezra());
        addNewPokemon(new Gonut(new Stats(350, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Frygirr(new Stats(410, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Yipbun());
        addNewPokemon(new Detome());   
        addNewPokemon(new Rogbaahl());
        addNewPokemon(new Reabuto(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Mawvile(new Stats(380, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Parasight());
        addNewPokemon(new Wakkabana(new Stats(410, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Terrawr());
        addNewPokemon(new Scurple());   
        addNewPokemon(new Scorperor());
        addNewPokemon(new Ogrean(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Bebushi());   
        addNewPokemon(new Conferocious(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Hissmoke());
        addNewPokemon(new Wulvlacine());
        addNewPokemon(new Terratusk());
//        addNewPokemon(new Drump()); Member of line Not Finished  
//        addNewPokemon(new Fredoron()); Member of line Not Finished
        addPokedexPokemon("larvitar-mastenian");
        addPokedexPokemon("pupitar-mastenian");
        addNewPokemon(new Tidaltar());
        addNewPokemon(new Palmguana(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        addNewPokemon(new Ferocice(new Stats(580, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Turteller(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        addNewPokemon(new Terrosect(new Stats(580, StatArchetype.MIXED_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Resurexor());
        addNewPokemon(new Obspeedian());
        addNewPokemon(new Tecthanic());
        addNewPokemon(new Paruwha());
//        addNewPokemon(new Stunzeed());   Missing Art
    }

}
