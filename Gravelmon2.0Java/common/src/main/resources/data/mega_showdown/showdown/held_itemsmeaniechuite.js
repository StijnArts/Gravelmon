{
    name: "Meaniechuite",
    spritenum: 620,
    megaStone: "meaniechu-mega",
    megaEvolves: "meaniechu",
    itemUser: ["meaniechu"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10087: 760,
    gen: 6,
    isNonstandard: "Past"
}
