{
    name: "Moreaperitemystis",
    spritenum: 620,
    megaStone: "moreaper-mega_mystis",
    megaEvolves: "moreaper",
    itemUser: ["moreaper"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10157: 760,
    gen: 6,
    isNonstandard: "Past"
}
