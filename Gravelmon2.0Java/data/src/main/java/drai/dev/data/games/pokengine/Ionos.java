package drai.dev.data.games.pokengine;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Ionos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ionos();
    private Ionos() {
        super("Ionos", "https://pokengine.org/collections/10vxw2l3/Ionos");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Shrubbie().addLabels(Label.STARTER));
        addNewPokemon(new Herbelle().addLabels(Label.STARTER));
        addNewPokemon(new Miralide().addLabels(Label.STARTER));
        addNewPokemon(new Radarent().addLabels(Label.STARTER));
        addNewPokemon(new Sparkadillo().addLabels(Label.STARTER));
        addNewPokemon(new Armadealo().addLabels(Label.STARTER));
        addNewPokemon(new Chompper().addLabels(Label.STARTER));
        addNewPokemon(new Crunchawtle().addLabels(Label.STARTER));
        addNewPokemon(new Tormightier().addLabels(Label.STARTER));
        addNewPokemon(new Sengishrew());
        addNewPokemon(new Plagarata(new Stats(421, StatArchetype.FAST_SUPPORT, List.of(StatType.ATTACK))));
        addNewPokemon(new Pomfly());
        addNewPokemon(new Snoutfly(new Stats(387, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cockatoto());
        addNewPokemon(new Cockapoll());
        addNewPokemon(new Sheagull());
        addNewPokemon(new Pharature());
        addNewPokemon(new Gnurogo());
        addNewPokemon(new Woomask());
        addNewPokemon(new Madogo(new Stats(398, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Sigiping(new Stats(217, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addPokedexPokemon("sigilyph");
        addNewPokemon(new Meaniechu());
        addNewPokemon(new Grubdew());
        addNewPokemon(new Lohopper());
        addNewPokemon(new Wisopotron());
        addNewPokemon(new IonosianEkans("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianArbok("", Aspect.IONOSIAN, new Stats(448, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Dizzpin());
        addNewPokemon(new Mobono());
        addNewPokemon(new Shinpanzee(new Stats(443, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.SPEED))));
        addNewPokemon(new Suastalk(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Spikish());
        addNewPokemon(new Nommogo(new Stats(432, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Felipom(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new IonosianMunchlax("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianSnorlax("", Aspect.IONOSIAN, new Stats(540, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
//        addNewPokemon(new Hogletwip());   Missing Art
//        addNewPokemon(new Warhog()); Member of line Not Finished  Missing Stats
        addNewPokemon(new Larveye());
        addNewPokemon(new Eyecoon());
        addNewPokemon(new Motholus());
//        addNewPokemon(new IonosianHypno("", Aspect.IONOSIAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));   Member of line not finished
        addNewPokemon(new IonosianSmoochum("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianJynx("", Aspect.IONOSIAN, new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Golfish());
        addNewPokemon(new Jewereel(new Stats(442, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new Crabbot());   Missing Art
//        addNewPokemon(new Crabmech());   Missing Stats
        addNewPokemon(new Bubupole());
        addNewPokemon(new Geohertoad());
        addNewPokemon(new Phrynotoad(new Stats(521, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Jokaite(new Stats(365, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Lannatee(new Stats(365, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.HP))));
//        addNewPokemon(new Ignipala());   Missing Stats
//        addNewPokemon(new Blazellous());   Missing Stats
//        addNewPokemon(new 141599());   Missing Art
        addNewPokemon(new Acheeva());
        addNewPokemon(new IonosianGirafarig("", Aspect.IONOSIAN, new Stats(455, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Phantrella(new Stats(354, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Rockadoo(new Stats(365, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Stiltiwalka(new Stats(342, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Leaplip(new Stats(344, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new IonosianShuckle("", Aspect.IONOSIAN, new Stats(505, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE, StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE,
                        StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Loafey());
        addNewPokemon(new Leonier(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Leonet(new Stats(476, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Posschest(new Stats(345, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Figurina(new Stats(345, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Cordachin());
//        addNewPokemon(new IonosianShellos(422));   Missing Stats
//        addNewPokemon(new IonosianGastrodon(423));   Missing Art
//        addNewPokemon(new 884872());  Missing Name  Missing Stats Member of line Not Finished
//        addNewPokemon(new Tormid());   Missing Art
//        addNewPokemon(new Bigboi());  Missing Name Missing Stats Member of line Not Finished
        addNewPokemon(new Spothyena());
        addNewPokemon(new Khaheena());
        addNewPokemon(new Gormhyena());
//        addNewPokemon(new Dungie());   Missing Art
//        addNewPokemon(new Stageros());   Missing Stats
        addNewPokemon(new Clubit());
        addNewPokemon(new Swingit());
        addNewPokemon(new Bonkeet(new Stats(523, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Kaidalope());
        addNewPokemon(new Faigalope(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new 973305()); Missing Name   Missing Stats Member of line Not Finished
//        addNewPokemon(new 568666()); Missing Name   Missing Stats Member of line Not Finished
//        addNewPokemon(new 854996());   Missing Art
//        addNewPokemon(new Sinimite());   Missing Art
//        addNewPokemon(new Tripostite());   Missing Stats
//        addNewPokemon(new 111049());   Missing Art
        addNewPokemon(new Kubite());
        addNewPokemon(new Rokubandy(new Stats(457, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Sunling());
        addNewPokemon(new Sunatee(new Stats(458, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));

        addPokedexPokemon("staryu");
        addNewPokemon(new IonosianStarmie("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Exploroid());
        addNewPokemon(new Deoxavir(new Stats(341, StatArchetype.MIXED_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Minore());
        addPokedexPokemon("deoxys");
        addNewPokemon(new Orbiter());
        addNewPokemon(new Charger(new Stats(511, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addPokedexPokemon("relicanth");
        addNewPokemon(new Relido(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addPokedexPokemon("kecleon");
        addNewPokemon(new Primecleon(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Aquapo());
        addNewPokemon(new Aquadon(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Tinosaur());
        addNewPokemon(new Eruptor(new Stats(478, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        addNewPokemon(new 892993());   Missing Art
//        addNewPokemon(new 473877());   Missing Art
//        addNewPokemon(new 396609());   Missing Art
//        addNewPokemon(new 765545());   Missing Art
//        addNewPokemon(new 945());   Missing Art Member of line Not Finished
//        addNewPokemon(new 387899());  Missing Name  Missing Stats
        addNewPokemon(new IonosianTrapinch("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianVibrava("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianFlygon("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new IonosianKarrablast(588));   Missing Art
//        addNewPokemon(new Pharaferno());   Missing Stats
        addNewPokemon(new Heloisk(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Mumby());
        addNewPokemon(new Pharumm());
        addNewPokemon(new Caconie());
        addNewPokemon(new IonosianNatu("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianXatu("", Aspect.IONOSIAN,new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Tennestrian());
        addNewPokemon(new Knightmor());
        addNewPokemon(new Eevvee());
        addNewPokemon(new Pacemeon());
        addNewPokemon(new Pestileon(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Duelleon(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Pupshi());
        addNewPokemon(new Typhur());
        addNewPokemon(new Typhoonos(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Pottlin());
        addNewPokemon(new Pottyrm(new Stats(501, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Xinigen().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Puffjinn().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Minjin().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Cerbenos(new Stats(570, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Drahoggon().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Oldeture().addLabels(Label.LEGENDARY));
        addNewPokemon(new IonosianChikorita("", Aspect.IONOSIAN).addLabels(Label.STARTER)); //Sprite on desktop
        addNewPokemon(new IonosianBayleef("", Aspect.IONOSIAN).addLabels(Label.STARTER));
        addNewPokemon(new IonosianMeganium("", Aspect.IONOSIAN, new Stats(525, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))).addLabels(Label.STARTER));
        addNewPokemon(new IonosianCyndaquil("", Aspect.IONOSIAN).addLabels(Label.STARTER));    //Sprite on desktop
        addNewPokemon(new IonosianQuilava("", Aspect.IONOSIAN).addLabels(Label.STARTER));
        addNewPokemon(new IonosianTyphlosion("", Aspect.IONOSIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new IonosianTotodile("", Aspect.IONOSIAN).addLabels(Label.STARTER));
        addNewPokemon(new IonosianCroconaw("", Aspect.IONOSIAN).addLabels(Label.STARTER));
        addNewPokemon(new IonosianFeraligatr("", Aspect.IONOSIAN, new Stats(530, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Faunler().addLabels(Label.STARTER));
        addNewPokemon(new Satyrnus().addLabels(Label.STARTER));
        addNewPokemon(new Tauracho().addLabels(Label.STARTER));
        addNewPokemon(new Kinbat().addLabels(Label.STARTER));
        addNewPokemon(new Garpyre().addLabels(Label.STARTER));
        addNewPokemon(new Duabat(new Stats(526, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Fillybrum().addLabels(Label.STARTER));
        addNewPokemon(new Corashu().addLabels(Label.STARTER));
        addNewPokemon(new Campullion().addLabels(Label.STARTER));
        addNewPokemon(new Tarsiboo());
        addNewPokemon(new Peerhini());
        addNewPokemon(new Velitite());
        addNewPokemon(new Onyssilade(new Stats(410, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new drai.dev.data.pokemon.ionos.Mushi());
        addNewPokemon(new Mutungus(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new MushShi(new Stats(420, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Mimicorn(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Grumchick());
        addNewPokemon(new Horribill(new Stats(425, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Moschievous());
        addNewPokemon(new Embush());
        addNewPokemon(new Yatatree(new Stats(510, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Humini());
        addNewPokemon(new Bellagon());
        addNewPokemon(new Palazy());    //renamed from smokebreak
        addNewPokemon(new Palegon(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Scubargon());
        addNewPokemon(new Sermurgon(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        addNewPokemon(new IonosianMimeJr(439));   Missing Art
//        addNewPokemon(new MrMind());   Member of line Not Finished
        addPokedexPokemon("snubbull");
        addNewPokemon(new IonosianGranbull("", Aspect.IONOSIAN,new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new IonosianInkay("", Aspect.IONOSIAN));   Missing Art
//        addNewPokemon(new Wiselicious());Member of line Not Finished
        addNewPokemon(new Clownemone());
        addNewPokemon(new Clownfisk(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Sprawniple(new Stats(360, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Angligh(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Tranoler(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("chatot");
        addNewPokemon(new Chatart(new Stats(498, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Minkin());
        addNewPokemon(new Rivacal());
        addNewPokemon(new Bultin());
        addNewPokemon(new Clusturb());
        addNewPokemon(new Shortulp(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Antello(new Stats(341, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        addPokedexPokemon("porygon");
        addPokedexPokemon("porygon2");
        addPokedexPokemon("porygonz");
        addNewPokemon(new PorygonY());
        addNewPokemon(new Fefae());
        addNewPokemon(new Safauna(new Stats(470, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Nimbat());
        addNewPokemon(new Marbel());
        addNewPokemon(new Marbelous());
        addNewPokemon(new Destructos());
        addNewPokemon(new Bubill());
        addNewPokemon(new Daimonize());
        addNewPokemon(new IonosianDruddigon("", Aspect.IONOSIAN,
                new Stats(485, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of())));
        addNewPokemon(new Gildthera(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Pythion(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Taurion(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Regishard().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Nightrogen().addLabels(Label.SUB_LEGENDARY));
    }

}
