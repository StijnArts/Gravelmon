//package drai.dev.gravelmon.games.pokemmo.secondbatch;
//
//
//import drai.dev.gravelmon.pokemon.theos.*;
//import drai.dev.gravelmon.pokemon.theos.Yolkoo;
//import drai.dev.gravelmon.pokemon.theos.regional.*;
//import drai.dev.gravelmon.pokemon.theos.regional.Flabb;
//
//public class Theos extends drai.dev.gravelmon.games.registry.Game {
//    public Theos() {
//        super("Theos");
//    }
//
//    @Override
//    public void registerPokemon() {
//        pokemon.add(new Meowdow());
//        pokemon.add(new Purrleo());
//        pokemon.add(new Herculeo());
//        pokemon.add(new Bullit());
//        pokemon.add(new Bombull());
//        pokemon.add(new Brassear());
//        pokemon.add(new Hippony());
//        pokemon.add(new Gallocamp());
//        pokemon.add(new Aquastrian());
//        pokemon.add(new Quillit());
//        pokemon.add(new Quillistic());
//        pokemon.add(new Kestling());
//        pokemon.add(new Kestric());
//        pokemon.add(new Falconik());
//        pokemon.add(new Cricky());
//        pokemon.add(new Crickick());
//        pokemon.add(new Pestor());
//        pokemon.add(new Punkosom());
////        pokemon.add(new Cupilla());   Missing Stats
//        pokemon.add(new Silkute());
//        pokemon.add(new Flutterfly());
//        pokemon.add(new Squibble());
//        pokemon.add(new Searell());
//        pokemon.add(new Sunkern(191));
//        pokemon.add(new Sunflora(192));
//        pokemon.add(new Spinarak(167));
//        pokemon.add(new Ariados(168));
//        pokemon.add(new Hopple());
//        pokemon.add(new Hoppuff());
//        pokemon.add(new Bunursery());
//        pokemon.add(new Pichu(172));
//        pokemon.add(new Pikachu(25));
//        pokemon.add(new Raichu(26));
//        pokemon.add(new Yolkoo()); //Renamed from Chickoo
//        pokemon.add(new Cherishen());
//        pokemon.add(new Roostuff());
//        pokemon.add(new Sqworm());
//        pokemon.add(new Tunnoworm()); //Renamed from Burroworm
//        pokemon.add(new Mareep(179));
//        pokemon.add(new Flaaffy(180));
//        pokemon.add(new Ampharos(181));
//        pokemon.add(new Ostoe());
//        pokemon.add(new Ostretch());
//        pokemon.add(new Fawnix());
//        pokemon.add(new Foresteer());
//        pokemon.add(new Hoppip(187));
//        pokemon.add(new Skiploom(188));
//        pokemon.add(new Jumpluff(189));
//        pokemon.add(new Moofy());
//        pokemon.add(new Tauros(128));
//        pokemon.add(new Miltank(241));
//        pokemon.add(new Growlithe(58));
//        pokemon.add(new Arcanine(59));
//        pokemon.add(new Stoatic());
//        pokemon.add(new Seedlee());
//        pokemon.add(new Petalite());
//        pokemon.add(new Mofly()); //Renamed from Humini
//        pokemon.add(new Humoth());
//        pokemon.add(new Carefeely());
//        pokemon.add(new Wooper(194));
//        pokemon.add(new Quagsire(195));
//        pokemon.add(new Quackle());
//        pokemon.add(new Paraduck());
//        pokemon.add(new Psychick());
//        pokemon.add(new Psyfan());
//        pokemon.add(new Magoo());
//        pokemon.add(new Bugritty());
//        pokemon.add(new Wizzip());
//        pokemon.add(new Skeetle());
//        pokemon.add(new Atlasect());
//        pokemon.add(new Beetile());
//        pokemon.add(new Heracross(214));
//        pokemon.add(new Venonat(48));
//        pokemon.add(new Venomoth(49));
//        pokemon.add(new Trunklit());
//        pokemon.add(new Smogophant());
//        pokemon.add(new Shinx(403));
//        pokemon.add(new Luxio(404));
//        pokemon.add(new Luxray(405));
//        pokemon.add(new Grizzle());
//        pokemon.add(new Grumbear());
//        pokemon.add(new Cheekmunk());
//        pokemon.add(new Chippunch());
//        pokemon.add(new Nibblit());
//        pokemon.add(new Lumbash());
//        pokemon.add(new Moleer());
//        pokemon.add(new Tremole());
//        pokemon.add(new Crystone());
//        pokemon.add(new Crysaur());
//        pokemon.add(new Dinomond());
//        pokemon.add(new Hoonoes());
//        pokemon.add(new Younoes());
//        pokemon.add(new Eyenoes());
//        pokemon.add(new Zippit());
//        pokemon.add(new Ampire());
//        pokemon.add(new Oddish(43));
//        pokemon.add(new Gloom(44));
//        pokemon.add(new Vileplume(45));
//        pokemon.add(new Bellossom(182));
//        pokemon.add(new Venotrap()); //Renamed from Snaptrap
//        pokemon.add(new Faupent());
//        pokemon.add(new Croagunk(453));
//        pokemon.add(new Toxicroak(454));
//        pokemon.add(new Shroolie());
//        pokemon.add(new Pixcess());
//        pokemon.add(new Elegantus());
//        pokemon.add(new Slicoth()); //Renamed from Slowth
//        pokemon.add(new Mosstire()); //Renamed from Mossloth
//        pokemon.add(new Mantice());
//        pokemon.add(new Mantislash());
//        pokemon.add(new Bellsprout(69));
//        pokemon.add(new Weepinbell(70));
//        pokemon.add(new Victreebel(71));
//        pokemon.add(new Howligoon());
//        pokemon.add(new Boomian());
//        pokemon.add(new Yanma(193));
//        pokemon.add(new Yanmega(469));
//        pokemon.add(new Flabb(669));
//        pokemon.add(new Floette(670));
//        pokemon.add(new Florges(671));
//        pokemon.add(new Peckit());
//        pokemon.add(new Luvzonica());
//        pokemon.add(new Flossway());
//        pokemon.add(new Dracopuff());
//        pokemon.add(new Scalyx());
//        pokemon.add(new Psyguana());
//        pokemon.add(new Cottonee(546));
//        pokemon.add(new Whimsicott(547));
//        pokemon.add(new Petilil(548));
//        pokemon.add(new Lilligant(549));
//        pokemon.add(new Gulling());
//        pokemon.add(new Parrate());
//        pokemon.add(new Dwebble(557));
//        pokemon.add(new Crustle(558));
//        pokemon.add(new Blobish());
//        pokemon.add(new Shellder(90));
//        pokemon.add(new Cloyster(91));
//        pokemon.add(new Decoyster());
//    }
//
//}
