//package drai.dev.gravelmon.games.pokemmo.secondbatch;
//
//
//import drai.dev.gravelmon.pokemon.ionos.IonosianMimeJr;
//import drai.dev.gravelmon.pokemon.orbis.Pomdan;
//import drai.dev.gravelmon.pokemon.orbis.regional.*;
//import drai.dev.gravelmon.pokemon.orbis.*;
//
//public class Orbis extends drai.dev.gravelmon.games.registry.Game {
//    public Orbis() {
//        super("Orbis");
//    }
//
//    @Override
//    public void registerPokemon() {
//        pokemon.add(new PokPalv1());
//        pokemon.add(new Rascaloon());
//        pokemon.add(new Raccowl());
//        pokemon.add(new Rattata(19));
//        pokemon.add(new Raticate(20));
//        pokemon.add(new Squabbiz());
//        pokemon.add(new Executove());
//        pokemon.add(new Presigeont());
//        pokemon.add(new Magpick());
//        pokemon.add(new Magpeist());
//        pokemon.add(new Nickit(827));
//        pokemon.add(new Thievul(828));
//        pokemon.add(new Zigzagoon(263));
//        pokemon.add(new Linoone(264));
//        pokemon.add(new Obstagoon(862));
//        pokemon.add(new Nappi());
//        pokemon.add(new Rubbage());
//        pokemon.add(new Buzzero());
//        pokemon.add(new Bulbillar());
//        pokemon.add(new Glowva());
//        pokemon.add(new Sectalamp());
////        pokemon.add(new Grubbrush());   Missing Stats
////        pokemon.add(new Pupallet());   Missing Stats
//        pokemon.add(new Beasel());
//        pokemon.add(new Lillipup(506));
//        pokemon.add(new Herdier(507));
//        pokemon.add(new Stoutland(508));
//        pokemon.add(new Squeebee());
//        pokemon.add(new Baldy());
//        pokemon.add(new Rubbaldy());
//        pokemon.add(new Stickigum());
//        pokemon.add(new Stickisticky());
//        pokemon.add(new Skwovet(819));
//        pokemon.add(new Greedent(820));
////        pokemon.add(new Solseed());   Missing Stats
////        pokemon.add(new Suryala());   Missing Stats
//        pokemon.add(new Pidgey(16));
//        pokemon.add(new Pidgeotto(17));
//        pokemon.add(new Pidgeot(18));
////        pokemon.add(new Bellchsia());   Missing Stats
////        pokemon.add(new Fuchsiella());   Missing Stats
//        pokemon.add(new Fuchsiadame());
//        pokemon.add(new Pichu(172));
//        pokemon.add(new Pikachu(25));
//        pokemon.add(new Raichu(26));
//        pokemon.add(new Ducklett(580));
//        pokemon.add(new Swanna(581));
//        pokemon.add(new Blanfish());
//        pokemon.add(new Dracolore());
//        pokemon.add(new Poliwag(60));
//        pokemon.add(new Poliwhirl(61));
//        pokemon.add(new Poliwrath(62));
//        pokemon.add(new Politoed(186));
//        pokemon.add(new Kingulum());
//        pokemon.add(new Chewtle(833));
//        pokemon.add(new Drednaw(834));
//        pokemon.add(new Surskit(283));
//        pokemon.add(new Masquerain(284));
//        pokemon.add(new Acrown());
//        pokemon.add(new Majestree());
//        pokemon.add(new Timbug());
//        pokemon.add(new Loustache());
//        pokemon.add(new Spoutot());
//        pokemon.add(new Fountier());
//        pokemon.add(new Fonsdame());
//        pokemon.add(new Farfetchd(83));
//        pokemon.add(new Sirfetchd(865));
//        pokemon.add(new Cerforyu());
//        pokemon.add(new Pampurr());
//        pokemon.add(new Freyurr());
//        pokemon.add(new Intimeow());
//        pokemon.add(new Necromata());
//        pokemon.add(new Meowth(52));
//        pokemon.add(new Perrserker(863));
//        pokemon.add(new Caffiend());
//        pokemon.add(new Baristroll());
//        pokemon.add(new Spritzee(682));
//        pokemon.add(new Aromatisse(683));
//        pokemon.add(new Swirlix(684));
//        pokemon.add(new Slurpuff(685));
//        pokemon.add(new Delistork());
//        pokemon.add(new Minccino(572));
//        pokemon.add(new Cinccino(573));
////        pokemon.add(new Trashlug());   Missing Stats
//        pokemon.add(new Trashcargot());
//        pokemon.add(new Trubbish(568));
//        pokemon.add(new Garbodor(569));
//        pokemon.add(new Chumpost());
//        pokemon.add(new Componion());
//        pokemon.add(new Shroodle(944));
//        pokemon.add(new Grafaiai(945));
//        pokemon.add(new Badbud());
//        pokemon.add(new Thorstle());
//        pokemon.add(new Thistance());
//        pokemon.add(new Nettic());
//        pokemon.add(new Stinttle());
//        pokemon.add(new Stimanic());
//        pokemon.add(new Toxel(848));
//        pokemon.add(new Toxtricity(849));
//        pokemon.add(new Traffimite());
//        pokemon.add(new Traffitron());
//        pokemon.add(new Skenteur());
//        pokemon.add(new Parfumou());
//        pokemon.add(new Furfrou(676));
//        pokemon.add(new Oricorio(741));
////        pokemon.add(new Searsage());   Missing Stats
//        pokemon.add(new Frankfurnt());
//        pokemon.add(new Salandit(757));
//        pokemon.add(new Salazzle(758));
//        pokemon.add(new Whismur(293));
//        pokemon.add(new Loudred(294));
//        pokemon.add(new Exploud(295));
//        pokemon.add(new Scraggy(559));
//        pokemon.add(new Scrafty(560));
//        pokemon.add(new IonosianMimeJr(439));
//        pokemon.add(new MrMime(122));
//        pokemon.add(new MrRime(866));
////        pokemon.add(new Vermob());   Missing Stats
////        pokemon.add(new Verminion());   Missing Stats
//        pokemon.add(new Vermicapone());
//        pokemon.add(new Grimer(88));
//        pokemon.add(new Muk(89));
//        pokemon.add(new Monsewer());
//        pokemon.add(new Corphish(341));
//        pokemon.add(new Crawdaunt(342));
//        pokemon.add(new Miremaid());
//        pokemon.add(new Bunnelby(659));
//        pokemon.add(new Diggersby(660));
//        pokemon.add(new Timburr(532));
//        pokemon.add(new Gurdurr(533));
//        pokemon.add(new Conkeldurr(534));
//        pokemon.add(new Rubblock());
////        pokemon.add(new Debruin());   Missing Stats
//        pokemon.add(new Bourubble());
////        pokemon.add(new Uninail());   Missing Stats
////        pokemon.add(new Desertusk());   Missing Stats
////        pokemon.add(new Burrorm());   Missing Stats
////        pokemon.add(new Burryrm());  Member of line Not Finished
//        pokemon.add(new Baybee());
//        pokemon.add(new Drillbee());
//        pokemon.add(new Diggbee());
//        pokemon.add(new Honarchee());
////        pokemon.add(new Tarexite());   Missing Stats
//        pokemon.add(new Gible(443));
//        pokemon.add(new Gabite(444));
//        pokemon.add(new Garchomp(445));
//        pokemon.add(new Wynaut(360));
//        pokemon.add(new Wobbuffet(202));
//        pokemon.add(new Tyrogue(236));
//        pokemon.add(new Hitmonlee(106));
//        pokemon.add(new Hitmonchan(107));
//        pokemon.add(new Hitmontop(237));
//        pokemon.add(new Weyabitt());
//        pokemon.add(new Weyatonne());
//        pokemon.add(new Pomdan()); //Renamed from Pompuff
//        pokemon.add(new Pufflepom());
////        pokemon.add(new Battrol());   Missing Stats
//        pokemon.add(new Battrolor());
//        pokemon.add(new Magnemite(81));
//        pokemon.add(new Magneton(82));
//        pokemon.add(new Magnezone(462));
//        pokemon.add(new Aipom(190));
//        pokemon.add(new Ambipom(424));
//        pokemon.add(new Koffing(109));
//        pokemon.add(new Weezing(110));
////        pokemon.add(new Kankrab());   Missing Stats
//        pokemon.add(new Wrekrab());
//        pokemon.add(new Elekid(239));
//        pokemon.add(new Electabuzz(125));
//        pokemon.add(new Electivire(466));
//        pokemon.add(new Magby(240));
//        pokemon.add(new Magmar(126));
//        pokemon.add(new Magmortar(467));
//        pokemon.add(new Capsakid(951));
//        pokemon.add(new Scovillain(952));
//        pokemon.add(new Ditto(132));
//        pokemon.add(new Orthworm(968));
//        pokemon.add(new Sootot());
//        pokemon.add(new Sweepmu());
//        pokemon.add(new Drifloon(425));
//        pokemon.add(new Drifblim(426));
//        pokemon.add(new Palmbrella());
//        pokemon.add(new Feistsea());
//        pokemon.add(new Letharleo());
//        pokemon.add(new Binacle(688));
//        pokemon.add(new Barbaracle(689));
//        pokemon.add(new Wimpod(767));
//        pokemon.add(new Golisopod(768));
//        pokemon.add(new Chickaring());
//        pokemon.add(new Seadeek());
//        pokemon.add(new Cappatross());
//        pokemon.add(new Sandygast(769));
//        pokemon.add(new Palossand(770));
//        pokemon.add(new Blufable());
//        pokemon.add(new Spheal(363));
//        pokemon.add(new Sealeo(364));
//        pokemon.add(new Walrein(365));
//        pokemon.add(new Vanillite(582));
//        pokemon.add(new Vanillish(583));
//        pokemon.add(new Vanilluxe(584));
//        pokemon.add(new Wishiwashi(746));
//        pokemon.add(new Conchle());
//        pokemon.add(new Turtlantis());
//        pokemon.add(new Staryu(120));
//        pokemon.add(new Starmie(121));
////        pokemon.add(new Ittibitti());   Missing Stats
////        pokemon.add(new Nemish());   Missing Stats
////        pokemon.add(new Imprioni());   Missing Stats
////        pokemon.add(new Slugcus());   Missing Stats
////        pokemon.add(new Clownemone());   Missing Stats
//        pokemon.add(new Finsail());
//        pokemon.add(new Dhelmise(781));
//        pokemon.add(new Corsola(222));
//        pokemon.add(new Cursola(864));
//        pokemon.add(new Jellybag());
//        pokemon.add(new Trasphin());
//        pokemon.add(new Whaste());
//        pokemon.add(new Murkrow(198));
//        pokemon.add(new Honchkrow(430));
//        pokemon.add(new Duskull(355));
//        pokemon.add(new Dusclops(356));
//        pokemon.add(new Dusknoir(477));
//        pokemon.add(new Chingling(433));
//        pokemon.add(new Chimecho(358));
//        pokemon.add(new Greavard(971));
//        pokemon.add(new Houndstone(972));
////        pokemon.add(new Memoroot());   Missing Stats
//        pokemon.add(new Spectralyra());
//        pokemon.add(new Geodude(74));
//        pokemon.add(new Graveler(75));
//        pokemon.add(new Golem(76));
//        pokemon.add(new Budgeaf());
//        pokemon.add(new Gryphoyal());
//        pokemon.add(new Bonsly(438));
//        pokemon.add(new Sudowoodo(185));
//        pokemon.add(new Snorunt(361));
//        pokemon.add(new Glalie(362));
//        pokemon.add(new Froslass(478));
//        pokemon.add(new Fomantis(753));
//        pokemon.add(new Lurantis(754));
//        pokemon.add(new Zodiaking());
//        pokemon.add(new Gothita(574));
//        pokemon.add(new Gothorita(575));
//        pokemon.add(new Gothitelle(576));
//        pokemon.add(new Solosis(577));
//        pokemon.add(new Duosion(578));
//        pokemon.add(new Reuniclus(579));
//        pokemon.add(new Sinistea(854));
//        pokemon.add(new Polteageist(855));
//        pokemon.add(new Aburago());
////        pokemon.add(new Terraor());   Missing Stats
//        pokemon.add(new Litwick(607));
//        pokemon.add(new Lampent(608));
//        pokemon.add(new Chandelure(609));
//        pokemon.add(new Mimikyu(778));
//        pokemon.add(new Klefki(707));
//        pokemon.add(new Zorua(570));
//        pokemon.add(new Zoroark(571));
//        pokemon.add(new Shadovizor());
//        pokemon.add(new Whaloon());
//        pokemon.add(new Orcloud());
//        pokemon.add(new Happiny(440));
//        pokemon.add(new Chansey(113));
//        pokemon.add(new Blissey(242));
//        pokemon.add(new Smeargle(235));
//        pokemon.add(new Deye());
//        pokemon.add(new Pyroulette());
//        pokemon.add(new Eevee(133));
//        pokemon.add(new Vaporeon(134));
//        pokemon.add(new Jolteon(135));
//        pokemon.add(new Flareon(136));
//        pokemon.add(new Leafeon(470));
//        pokemon.add(new Glaceon(471));
//        pokemon.add(new Espeon(196));
//        pokemon.add(new Umbreon(197));
//        pokemon.add(new Sylveon(700));
//        pokemon.add(new Indeedee(876));
//        pokemon.add(new Porygon(137));
//        pokemon.add(new Porygon2(233));
//        pokemon.add(new PorygonZ(474));
//        pokemon.add(new Duraludon(884));
//        pokemon.add(new Dreepy(885));
//        pokemon.add(new Drakloak(886));
//        pokemon.add(new Dragapult(887));
//        pokemon.add(new Aerling());
//        pokemon.add(new Cyclowyrm());
//        pokemon.add(new Xephyron());
//        pokemon.add(new Mewtwo(150));
//        pokemon.add(new Coralegion());
//    }
//
//}
