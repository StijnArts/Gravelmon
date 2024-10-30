package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.ionos.Mimicorn;
import drai.dev.data.pokemon.ionos.Mushi;
import drai.dev.data.attributes.*;

import java.util.*;
//done
public class Ionos extends drai.dev.data.games.registry.Game {
    public Ionos() {
        super("Ionos");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Shrubbie());
        pokemon.add(new Herbelle());
        pokemon.add(new Miralide());
        pokemon.add(new Radarent());
        pokemon.add(new Sparkadillo());
        pokemon.add(new Armadealo());
        pokemon.add(new Chompper());
        pokemon.add(new Crunchawtle());
        pokemon.add(new Tormightier());
        pokemon.add(new Sengishrew());
        pokemon.add(new Plagarata(new Stats(421, StatArchetype.FAST_SUPPORT, List.of(StatType.ATTACK))));
        pokemon.add(new Pomfly());
        pokemon.add(new Snoutfly(new Stats(387, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Cockatoto());
        pokemon.add(new Cockapoll());
        pokemon.add(new Sheagull());
        pokemon.add(new Pharature());
        pokemon.add(new Gnurogo());
        pokemon.add(new Woomask());
        pokemon.add(new Madogo(new Stats(398, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Sigiping(new Stats(217, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Meaniechu());
        pokemon.add(new Grubdew());
        pokemon.add(new Lohopper());
        pokemon.add(new Wisopotron());
        pokemon.add(new Dizzpin());
        pokemon.add(new Mobono());
        pokemon.add(new Shinpanzee(new Stats(443, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.SPEED))));
        pokemon.add(new Suastalk(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Spikish());
        pokemon.add(new Nommogo(new Stats(432, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Felipom(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
//        pokemon.add(new Hogletwip());   Missing Art
//        pokemon.add(new Warhog()); Member of line Not Finished  Missing Stats
        pokemon.add(new Larveye());
        pokemon.add(new Eyecoon());
        pokemon.add(new Motholus());
        pokemon.add(new Golfish());
        pokemon.add(new Jewereel(new Stats(442, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
//        pokemon.add(new Crabbot());   Missing Art
//        pokemon.add(new Crabmech());   Missing Stats
        pokemon.add(new Bubupole());
        pokemon.add(new Geohertoad());
        pokemon.add(new Phrynotoad(new Stats(521, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Jokaite(new Stats(365, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Lannatee(new Stats(365, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.HP))));
//        pokemon.add(new Ignipala());   Missing Stats
//        pokemon.add(new Blazellous());   Missing Stats
//        pokemon.add(new 141599());   Missing Art
        pokemon.add(new Acheeva());
        pokemon.add(new Phantrella(new Stats(354, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Rockadoo(new Stats(365, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Stiltiwalka(new Stats(342, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Leaplip(new Stats(344, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Loafey());
        pokemon.add(new Leonier(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Leonet(new Stats(476, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Posschest(new Stats(345, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Figurina(new Stats(345, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Cordachin());
//        pokemon.add(new 884872());  Missing Name  Missing Stats Member of line Not Finished
//        pokemon.add(new Tormid());   Missing Art
//        pokemon.add(new Bigboi());  Missing Name Missing Stats Member of line Not Finished
        pokemon.add(new Spothyena());
        pokemon.add(new Khaheena());
        pokemon.add(new Gormhyena());
//        pokemon.add(new Dungie());   Missing Art
//        pokemon.add(new Stageros());   Missing Stats
        pokemon.add(new Clubit());
        pokemon.add(new Swingit());
        pokemon.add(new Bonkeet(new Stats(523, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Kaidalope());
        pokemon.add(new Faigalope(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
//        pokemon.add(new 973305()); Missing Name   Missing Stats Member of line Not Finished
//        pokemon.add(new 568666()); Missing Name   Missing Stats Member of line Not Finished
//        pokemon.add(new 854996());   Missing Art
//        pokemon.add(new Sinimite());   Missing Art
//        pokemon.add(new Tripostite());   Missing Stats
//        pokemon.add(new 111049());   Missing Art
        pokemon.add(new Kubite());
        pokemon.add(new Rokubandy(new Stats(457, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Sunling());
        pokemon.add(new Sunatee(new Stats(458, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Exploroid());
        pokemon.add(new Deoxavir(new Stats(341, StatArchetype.MIXED_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Minore());
        pokemon.add(new Orbiter());
        pokemon.add(new Charger(new Stats(511, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Relido(new Stats(535, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Primecleon(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Aquapo());
        pokemon.add(new Aquadon(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Tinosaur());
        pokemon.add(new Eruptor(new Stats(478, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new 892993());   Missing Art
//        pokemon.add(new 473877());   Missing Art
//        pokemon.add(new 396609());   Missing Art
//        pokemon.add(new 765545());   Missing Art
//        pokemon.add(new 945());   Missing Art Member of line Not Finished
//        pokemon.add(new 387899());  Missing Name  Missing Stats
//        pokemon.add(new Pharaferno());   Missing Stats
        pokemon.add(new Heloisk(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Mumby());
        pokemon.add(new Pharumm());
        pokemon.add(new Caconie());
        pokemon.add(new Tennestrian());
        pokemon.add(new Knightmor());
        pokemon.add(new Eevvee());
        pokemon.add(new Pacemeon());
        pokemon.add(new Pestileon(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Duelleon(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Pupshi());
        pokemon.add(new Typhur());
        pokemon.add(new Typhoonos(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Pottlin());
        pokemon.add(new Pottyrm(new Stats(501, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Xinigen());
        pokemon.add(new Puffjinn());
        pokemon.add(new Minjin());
        pokemon.add(new Cerbenos(new Stats(570, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Drahoggon());
        pokemon.add(new Oldeture());
        pokemon.add(new Faunler());
        pokemon.add(new Satyrnus());
        pokemon.add(new Tauracho());
        pokemon.add(new Kinbat());
        pokemon.add(new Garpyre());
        pokemon.add(new Duabat(new Stats(526, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Fillybrum());
        pokemon.add(new Corashu());
        pokemon.add(new Campullion());
        pokemon.add(new Tarsiboo());
        pokemon.add(new Peerhini());
        pokemon.add(new Velitite());
        pokemon.add(new Onyssilade(new Stats(410, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Mushi());
        pokemon.add(new Mutungus(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new MushShi(new Stats(420, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Mimicorn(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        pokemon.add(new Grumchick());
        pokemon.add(new Horribill(new Stats(425, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Moschievous());
        pokemon.add(new Embush());
        pokemon.add(new Yatatree(new Stats(510, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Humini());
        pokemon.add(new Bellagon());
        pokemon.add(new Palazy());    //renamed from smokebreak
        pokemon.add(new Palegon(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Scubargon());
        pokemon.add(new Sermurgon(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new MrMind());   Missing Stats
//        pokemon.add(new Wiselicious());Member of line Not Finished
        pokemon.add(new Clownemone());
        pokemon.add(new Clownfisk(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Sprawniple(new Stats(360, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Angligh(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Tranoler(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Chatart(new Stats(498, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Minkin());
        pokemon.add(new Rivacal());
        pokemon.add(new Bultin());
        pokemon.add(new Clusturb());
        pokemon.add(new Shortulp(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Antello(new Stats(341, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new PorygonY());
        pokemon.add(new Fefae());
        pokemon.add(new Safauna(new Stats(470, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Nimbat());
        pokemon.add(new Marbel());
        pokemon.add(new Marbelous());
        pokemon.add(new Destructos());
        pokemon.add(new Bubill());
        pokemon.add(new Daimonize());
        pokemon.add(new Gildthera(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Pythion(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Taurion(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Regishard());
        pokemon.add(new Nightrogen());
    }

}
