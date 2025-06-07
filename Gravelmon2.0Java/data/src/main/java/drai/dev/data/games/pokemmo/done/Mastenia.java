package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mastenia extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Mastenia();
    private Mastenia() {
        super("Mastenia");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Kididna().addLabels(Label.STARTER));
        addNewPokemon(new Hididna().addLabels(Label.STARTER));
        addNewPokemon(new Wreckidna().addLabels(Label.STARTER));
        addNewPokemon(new Platykid().addLabels(Label.STARTER));
        addNewPokemon(new Platysus().addLabels(Label.STARTER));
        addNewPokemon(new Searopod().addLabels(Label.STARTER));
        addNewPokemon(new Bwibble().addLabels(Label.STARTER));
        addNewPokemon(new Sailizard().addLabels(Label.STARTER));
        addNewPokemon(new Dracurrent().addLabels(Label.STARTER));
        addPokedexPokemon("bulbasaur, ivysaur");
        addNewPokemon(new Cereusaur().addLabels(Label.STARTER));
        addPokedexPokemon("charmander, charmeleon");
        addNewPokemon(new Savazard().addLabels(Label.STARTER));
        addPokedexPokemon("squirtle, wartortle");
        addNewPokemon(new Boltoise().addLabels(Label.STARTER));
//        addNewPokemon(new MastenianTreecko("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianGrovyle("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MISSING ART
//        addNewPokemon(new Deceptile().addLabels(Label.STARTER));MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianTorchic("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianCombusken("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MISSING ART
//        addNewPokemon(new Henquinn().addLabels(Label.STARTER)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianMudkip("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianMarshtomp("", Aspect.MASTENIAN).addLabels(Label.STARTER)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Chromerge().addLabels(Label.STARTER));   MEMBER OF LINE NOT FINISHED
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

        addNewPokemon(new MastenianWooper("", Aspect.MASTENIAN));
        addNewPokemon(new Quagfire(new Stats(430, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new MastenianIllumise("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianVolbeat("", Aspect.MASTENIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
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
        addNewPokemon(new MastenianTentacool("", Aspect.MASTENIAN));
        addNewPokemon(new Tentarule(new Stats(515, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Gulligull());   
        addNewPokemon(new Albamate(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK)))); //renamed from Albacross
        addNewPokemon(new MastenianChinchou("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianLanturn("", Aspect.MASTENIAN));
        addNewPokemon(new Abyssmulk());
        addNewPokemon(new Nonono());   
        addNewPokemon(new Serpyre());
        addNewPokemon(new Adaptoad());
        addNewPokemon(new MastenianPsyduck("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianGolduck("", Aspect.MASTENIAN));
        addNewPokemon(new Trancendo(new Stats(410, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new MastenianKomala("", Aspect.MASTENIAN, new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
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
        addNewPokemon(new MastenianShroomish("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianBreloom("", Aspect.MASTENIAN, new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
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
        addNewPokemon(new MastenianLarvitar("", Aspect.MASTENIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new MastenianPupitar("", Aspect.MASTENIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Tidaltar().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Palmguana(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Ferocice(new Stats(580, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Turteller(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Terrosect(new Stats(580, StatArchetype.MIXED_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Resurexor().addLabels(Label.LEGENDARY));
        addNewPokemon(new Obspeedian());
        addNewPokemon(new Tecthanic());
        addNewPokemon(new Paruwha().addLabels(Label.SUB_LEGENDARY));
//        addNewPokemon(new Stunzeed());   Missing Art
    }

}
