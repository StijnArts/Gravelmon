{
    name: "Epochtwowyrdeerite",
    spritenum: 620,
    megaStone: "wyrdeer-epochtwo_mega",
    megaEvolves: "wyrdeer",
    itemUser: ["wyrdeer"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10185: 760,
    gen: 6,
    isNonstandard: "Past"
}
