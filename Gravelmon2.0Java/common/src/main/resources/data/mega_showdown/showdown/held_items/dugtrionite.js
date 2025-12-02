{
    name: "Dugtrionite",
    spritenum: 620,
    megaStone: "dugtrio-mega",
    megaEvolves: "dugtrio",
    itemUser: ["dugtrio"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10056: 760,
    gen: 6,
    isNonstandard: "Past"
}
