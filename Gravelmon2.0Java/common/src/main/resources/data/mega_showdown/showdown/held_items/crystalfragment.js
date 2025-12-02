{
    name: "Crystalfragment",
    spritenum: 620,
    megaStone: "metagross-deltacrystal_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== deltacrystal)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10259: 760,
    gen: 6,
    isNonstandard: "Past"
}
