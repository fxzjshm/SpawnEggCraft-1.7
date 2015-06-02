/*      */ package aginsun.mods.TaleOfKingdoms;
/*      */ 
/*      */ import java.util.Random;
/*      */ 
/*      */ public class goldKeeper
/*      */ {
/*    7 */   public static int goldTotal = 0;
/*    8 */   public static int hunter = 0;
/*      */   public static float flint;
/*      */   public static float clay;
/*      */   public static float iron;
/*      */   public static float diamond;
/*      */   public static float fish;
/*      */   public static float apple;
/*      */   public static float string;
/*      */   public static float feather;
/*      */   
/*      */   public goldKeeper(TaleOfKingdoms taleofkingdoms)
/*      */   {
/*   20 */     hunter = 0;
/*      */   }
/*      */   
/*      */   public static void addGold(int i)
/*      */   {
/*   25 */     goldTotal += i;
/*      */   }
/*      */   
/*      */   public static void addGold()
/*      */   {
/*   30 */     goldTotal += 1;
/*      */   }
/*      */   
/*      */   public static void setGoldTotal(int i)
/*      */   {
/*   35 */     goldTotal = i;
/*      */   }
/*      */   
/*      */   public static void decreaseGold(int i)
/*      */   {
/*   40 */     goldTotal -= i;
/*      */   }
/*      */   
/*      */   public static int getHunterStatus()
/*      */   {
/*   45 */     return hunter;
/*      */   }
/*      */   
/*      */   public static void setHunterStatus(int i)
/*      */   {
/*   50 */     hunter = i;
/*      */   }
/*      */   
/*      */   public static int priceItem(String s)
/*      */   {
/*   55 */     if (s.equals("tile.stone"))
/*      */     {
/*   57 */       return 4;
/*      */     }
/*   59 */     if (s.equals("tile.grass"))
/*      */     {
/*   61 */       return 0;
/*      */     }
/*   63 */     if (s.equals("tile.dirt"))
/*      */     {
/*   65 */       return 0;
/*      */     }
/*   67 */     if (s.equals("tile.stonebrick"))
/*      */     {
/*   69 */       return 0;
/*      */     }
/*   71 */     if (s.equals("tile.wood"))
/*      */     {
/*   73 */       return 2;
/*      */     }
/*   75 */     if (s.equals("tile.sapling"))
/*      */     {
/*   77 */       return 8;
/*      */     }
/*   79 */     if (s.equals("tile.bedrock"))
/*      */     {
/*   81 */       return 0;
/*      */     }
/*   83 */     if (s.equals("tile.water"))
/*      */     {
/*   85 */       return 0;
/*      */     }
/*   87 */     if (s.equals("tile.water"))
/*      */     {
/*   89 */       return 0;
/*      */     }
/*   91 */     if (s.equals("tile.lava"))
/*      */     {
/*   93 */       return 0;
/*      */     }
/*   95 */     if (s.equals("tile.lava"))
/*      */     {
/*   97 */       return 0;
/*      */     }
/*   99 */     if (s.equals("tile.sand"))
/*      */     {
/*  101 */       return 10;
/*      */     }
/*  103 */     if (s.equals("tile.gravel"))
/*      */     {
/*  105 */       return 5;
/*      */     }
/*  107 */     if (s.equals("tile.oreGold"))
/*      */     {
/*  109 */       return 100;
/*      */     }
/*  111 */     if (s.equals("tile.oreIron"))
/*      */     {
/*  113 */       return 80;
/*      */     }
/*  115 */     if (s.equals("tile.oreCoal"))
/*      */     {
/*  117 */       return 15;
/*      */     }
/*  119 */     if (s.equals("tile.log"))
/*      */     {
/*  121 */       return 5;
/*      */     }
/*  123 */     if (s.equals("tile.leaves"))
/*      */     {
/*  125 */       return 0;
/*      */     }
/*  127 */     if (s.equals("tile.sponge"))
/*      */     {
/*  129 */       return 0;
/*      */     }
/*  131 */     if (s.equals("tile.glass"))
/*      */     {
/*  133 */       return 30;
/*      */     }
/*  135 */     if (s.equals("tile.oreLapis"))
/*      */     {
/*  137 */       return 0;
/*      */     }
/*  139 */     if (s.equals("tile.blockLapis"))
/*      */     {
/*  141 */       return 180;
/*      */     }
/*  143 */     if (s.equals("tile.dispenser"))
/*      */     {
/*  145 */       return 270;
/*      */     }
/*  147 */     if (s.equals("tile.sandStone"))
/*      */     {
/*  149 */       return 40;
/*      */     }
/*  151 */     if (s.equals("tile.musicBlock"))
/*      */     {
/*  153 */       return 20;
/*      */     }
/*  155 */     if (s.equals("tile.bed"))
/*      */     {
/*  157 */       return 40;
/*      */     }
/*  159 */     if (s.equals("tile.goldenRail"))
/*      */     {
/*  161 */       return 152;
/*      */     }
/*  163 */     if (s.equals("tile.detectorRail"))
/*      */     {
/*  165 */       return 85;
/*      */     }
/*  167 */     if (s.equals("tile.pistonStickyBase"))
/*      */     {
/*  169 */       return 185;
/*      */     }
/*  171 */     if (s.equals("tile.web"))
/*      */     {
/*  173 */       return 0;
/*      */     }
/*  175 */     if (s.equals("tile.tallgrass"))
/*      */     {
/*  177 */       return 0;
/*      */     }
/*  179 */     if (s.equals("tile.deadbush"))
/*      */     {
/*  181 */       return 0;
/*      */     }
/*  183 */     if (s.equals("tile.pistonBase"))
/*      */     {
/*  185 */       return 105;
/*      */     }
/*  187 */     if (s.equals("tile.cloth"))
/*      */     {
/*  189 */       return 12;
/*      */     }
/*  191 */     if (s.equals("tile.flower"))
/*      */     {
/*  193 */       return 10;
/*      */     }
/*  195 */     if (s.equals("tile.rose"))
/*      */     {
/*  197 */       return 40;
/*      */     }
/*  199 */     if (s.equals("tile.mushroom"))
/*      */     {
/*  201 */       return 15;
/*      */     }
/*  203 */     if (s.equals("tile.mushroom"))
/*      */     {
/*  205 */       return 15;
/*      */     }
/*  207 */     if (s.equals("tile.blockGold"))
/*      */     {
/*  209 */       return 1350;
/*      */     }
/*  211 */     if (s.equals("tile.blockIron"))
/*      */     {
/*  213 */       return 765;
/*      */     }
/*  215 */     if (s.equals("tile.stoneSlab"))
/*      */     {
/*  217 */       return 6;
/*      */     }
/*  219 */     if (s.equals("tile.stoneSlab"))
/*      */     {
/*  221 */       return 6;
/*      */     }
/*  223 */     if (s.equals("tile.brick"))
/*      */     {
/*  225 */       return 800;
/*      */     }
/*  227 */     if (s.equals("tile.tnt"))
/*      */     {
/*  229 */       return 800;
/*      */     }
/*  231 */     if (s.equals("tile.bookshelf"))
/*      */     {
/*  233 */       return 70;
/*      */     }
/*  235 */     if (s.equals("tile.stoneMoss"))
/*      */     {
/*  237 */       return 50;
/*      */     }
/*  239 */     if (s.equals("tile.obsidian"))
/*      */     {
/*  241 */       return 50;
/*      */     }
/*  243 */     if (s.equals("tile.torch"))
/*      */     {
/*  245 */       return 5;
/*      */     }
/*  247 */     if (s.equals("tile.fire"))
/*      */     {
/*  249 */       return 0;
/*      */     }
/*  251 */     if (s.equals("tile.mobSpawner"))
/*      */     {
/*  253 */       return 0;
/*      */     }
/*  255 */     if (s.equals("tile.stairsWood"))
/*      */     {
/*  257 */       return 0;
/*      */     }
/*  259 */     if (s.equals("tile.chest"))
/*      */     {
/*  261 */       return 10;
/*      */     }
/*  263 */     if (s.equals("tile.redstoneDust"))
/*      */     {
/*  265 */       return 5;
/*      */     }
/*  267 */     if (s.equals("tile.oreDiamond"))
/*      */     {
/*  269 */       return 360;
/*      */     }
/*  271 */     if (s.equals("tile.blockDiamond"))
/*      */     {
/*  273 */       return 3807;
/*      */     }
/*  275 */     if (s.equals("tile.workbench"))
/*      */     {
/*  277 */       return 5;
/*      */     }
/*  279 */     if (s.equals("tile.crops"))
/*      */     {
/*  281 */       return 0;
/*      */     }
/*  283 */     if (s.equals("tile.farmland"))
/*      */     {
/*  285 */       return 0;
/*      */     }
/*  287 */     if (s.equals("tile.furnace"))
/*      */     {
/*  289 */       return 10;
/*      */     }
/*  291 */     if (s.equals("tile.furnace"))
/*      */     {
/*  293 */       return 0;
/*      */     }
/*  295 */     if (s.equals("tile.sign"))
/*      */     {
/*  297 */       return 13;
/*      */     }
/*  299 */     if (s.equals("tile.doorWood"))
/*      */     {
/*  301 */       return 6;
/*      */     }
/*  303 */     if (s.equals("tile.ladder"))
/*      */     {
/*  305 */       return 3;
/*      */     }
/*  307 */     if (s.equals("tile.rail"))
/*      */     {
/*  309 */       return 30;
/*      */     }
/*  311 */     if (s.equals("tile.stairsStone"))
/*      */     {
/*  313 */       return 0;
/*      */     }
/*  315 */     if (s.equals("tile.sign"))
/*      */     {
/*  317 */       return 13;
/*      */     }
/*  319 */     if (s.equals("tile.lever"))
/*      */     {
/*  321 */       return 1;
/*      */     }
/*  323 */     if (s.equals("tile.pressurePlate"))
/*      */     {
/*  325 */       return 2;
/*      */     }
/*  327 */     if (s.equals("tile.doorIron"))
/*      */     {
/*  329 */       return 500;
/*      */     }
/*  331 */     if (s.equals("tile.pressurePlate"))
/*      */     {
/*  333 */       return 2;
/*      */     }
/*  335 */     if (s.equals("tile.oreRedstone"))
/*      */     {
/*  337 */       return 10;
/*      */     }
/*  339 */     if (s.equals("tile.oreRedstone"))
/*      */     {
/*  341 */       return 10;
/*      */     }
/*  343 */     if (s.equals("tile.notGate"))
/*      */     {
/*  345 */       return 10;
/*      */     }
/*  347 */     if (s.equals("tile.notGate"))
/*      */     {
/*  349 */       return 10;
/*      */     }
/*  351 */     if (s.equals("tile.button"))
/*      */     {
/*  353 */       return 5;
/*      */     }
/*  355 */     if (s.equals("tile.snow"))
/*      */     {
/*  357 */       return 15;
/*      */     }
/*  359 */     if (s.equals("tile.ice"))
/*      */     {
/*  361 */       return 0;
/*      */     }
/*  363 */     if (s.equals("tile.snow"))
/*      */     {
/*  365 */       return 0;
/*      */     }
/*  367 */     if (s.equals("tile.cactus"))
/*      */     {
/*  369 */       return 3;
/*      */     }
/*  371 */     if (s.equals("tile.clay"))
/*      */     {
/*  373 */       return 20;
/*      */     }
/*  375 */     if (s.equals("tile.reeds"))
/*      */     {
/*  377 */       return 0;
/*      */     }
/*  379 */     if (s.equals("tile.jukebox"))
/*      */     {
/*  381 */       return 245;
/*      */     }
/*  383 */     if (s.equals("tile.fence"))
/*      */     {
/*  385 */       return 5;
/*      */     }
/*  387 */     if (s.equals("tile.pumpkin"))
/*      */     {
/*  389 */       return 120;
/*      */     }
/*  391 */     if (s.equals("tile.hellrock"))
/*      */     {
/*  393 */       return 0;
/*      */     }
/*  395 */     if (s.equals("tile.hellsand"))
/*      */     {
/*  397 */       return 15;
/*      */     }
/*  399 */     if (s.equals("tile.lightgem"))
/*      */     {
/*  401 */       return 60;
/*      */     }
/*  403 */     if (s.equals("tile.portal"))
/*      */     {
/*  405 */       return 0;
/*      */     }
/*  407 */     if (s.equals("tile.litpumpkin"))
/*      */     {
/*  409 */       return 125;
/*      */     }
/*  411 */     if (s.equals("tile.cake"))
/*      */     {
/*  413 */       return 300;
/*      */     }
/*  415 */     if (s.equals("tile.diode"))
/*      */     {
/*  417 */       return 25;
/*      */     }
/*  419 */     if (s.equals("tile.diode"))
/*      */     {
/*  421 */       return 25;
/*      */     }
/*  423 */     if (s.equals("tile.lockedchest"))
/*      */     {
/*  425 */       return 0;
/*      */     }
/*  427 */     if (s.equals("tile.trapdoor"))
/*      */     {
/*  429 */       return 3;
/*      */     }
/*  431 */     if (s.equals("tile.stonebricksmooth"))
/*      */     {
/*  433 */       return 20;
/*      */     }
/*  435 */     if (s.equals("tile.mushroom"))
/*      */     {
/*  437 */       return 0;
/*      */     }
/*  439 */     if (s.equals("tile.mushroom"))
/*      */     {
/*  441 */       return 0;
/*      */     }
/*  443 */     if (s.equals("tile.fenceIron"))
/*      */     {
/*  445 */       return 32;
/*      */     }
/*  447 */     if (s.equals("tile.thinGlass"))
/*      */     {
/*  449 */       return 12;
/*      */     }
/*  451 */     if (s.equals("tile.melon"))
/*      */     {
/*  453 */       return 0;
/*      */     }
/*  455 */     if (s.equals("tile.pumpkinStem"))
/*      */     {
/*  457 */       return 0;
/*      */     }
/*  459 */     if (s.equals("tile.pumpkinStem"))
/*      */     {
/*  461 */       return 0;
/*      */     }
/*  463 */     if (s.equals("tile.vine"))
/*      */     {
/*  465 */       return 30;
/*      */     }
/*  467 */     if (s.equals("tile.fenceGate"))
/*      */     {
/*  469 */       return 10;
/*      */     }
/*  471 */     if (s.equals("tile.stairsBrick"))
/*      */     {
/*  473 */       return 0;
/*      */     }
/*  475 */     if (s.equals("tile.stairsStoneBrickSmooth"))
/*      */     {
/*  477 */       return 0;
/*      */     }
/*  479 */     if (s.equals("item.shovelIron"))
/*      */     {
/*  481 */       return 87;
/*      */     }
/*  483 */     if (s.equals("item.pickaxeIron"))
/*      */     {
/*  485 */       return 257;
/*      */     }
/*  487 */     if (s.equals("item.hatchetIron"))
/*      */     {
/*  489 */       return 257;
/*      */     }
/*  491 */     if (s.equals("item.flintAndSteel"))
/*      */     {
/*  493 */       return 89;
/*      */     }
/*  495 */     if (s.equals("item.apple"))
/*      */     {
/*  497 */       return 20;
/*      */     }
/*  499 */     if (s.equals("item.bow"))
/*      */     {
/*  501 */       return 250;
/*      */     }
/*  503 */     if (s.equals("item.arrow"))
/*      */     {
/*  505 */       return 4;
/*      */     }
/*  507 */     if (s.equals("item.coal"))
/*      */     {
/*  509 */       return 15;
/*      */     }
/*  511 */     if (s.equals("item.emerald"))
/*      */     {
/*  513 */       return 405;
/*      */     }
/*  515 */     if (s.equals("item.ingotIron"))
/*      */     {
/*  517 */       return 85;
/*      */     }
/*  519 */     if (s.equals("item.ingotGold"))
/*      */     {
/*  521 */       return 0;
/*      */     }
/*  523 */     if (s.equals("item.swordIron"))
/*      */     {
/*  525 */       return 160;
/*      */     }
/*  527 */     if (s.equals("item.swordWood"))
/*      */     {
/*  529 */       return 5;
/*      */     }
/*  531 */     if (s.equals("item.shovelWood"))
/*      */     {
/*  533 */       return 6;
/*      */     }
/*  535 */     if (s.equals("item.pickaxeWood"))
/*      */     {
/*  537 */       return 8;
/*      */     }
/*  539 */     if (s.equals("item.hatchetWood"))
/*      */     {
/*  541 */       return 8;
/*      */     }
/*  543 */     if (s.equals("item.swordStone"))
/*      */     {
/*  545 */       return 10;
/*      */     }
/*  547 */     if (s.equals("item.shovelStone"))
/*      */     {
/*  549 */       return 6;
/*      */     }
/*  551 */     if (s.equals("item.pickaxeStone"))
/*      */     {
/*  553 */       return 14;
/*      */     }
/*  555 */     if (s.equals("item.hatchetStone"))
/*      */     {
/*  557 */       return 14;
/*      */     }
/*  559 */     if (s.equals("item.swordDiamond"))
/*      */     {
/*  561 */       return 855;
/*      */     }
/*  563 */     if (s.equals("item.shovelDiamond"))
/*      */     {
/*  565 */       return 462;
/*      */     }
/*  567 */     if (s.equals("item.pickaxeDiamond"))
/*      */     {
/*  569 */       return 1380;
/*      */     }
/*  571 */     if (s.equals("item.hatchetDiamond"))
/*      */     {
/*  573 */       return 1380;
/*      */     }
/*  575 */     if (s.equals("item.stick"))
/*      */     {
/*  577 */       return 1;
/*      */     }
/*  579 */     if (s.equals("item.bowl"))
/*      */     {
/*  581 */       return 0;
/*      */     }
/*  583 */     if (s.equals("item.mushroomStew"))
/*      */     {
/*  585 */       return 0;
/*      */     }
/*  587 */     if (s.equals("item.swordGold"))
/*      */     {
/*  589 */       return 0;
/*      */     }
/*  591 */     if (s.equals("item.shovelGold"))
/*      */     {
/*  593 */       return 0;
/*      */     }
/*  595 */     if (s.equals("item.pickaxeGold"))
/*      */     {
/*  597 */       return 0;
/*      */     }
/*  599 */     if (s.equals("item.hatchetGold"))
/*      */     {
/*  601 */       return 0;
/*      */     }
/*  603 */     if (s.equals("item.string"))
/*      */     {
/*  605 */       return 75;
/*      */     }
/*  607 */     if (s.equals("item.feather"))
/*      */     {
/*  609 */       return 2;
/*      */     }
/*  611 */     if (s.equals("item.sulphur"))
/*      */     {
/*  613 */       return 150;
/*      */     }
/*  615 */     if (s.equals("item.hoeWood"))
/*      */     {
/*  617 */       return 6;
/*      */     }
/*  619 */     if (s.equals("item.hoeStone"))
/*      */     {
/*  621 */       return 10;
/*      */     }
/*  623 */     if (s.equals("item.hoeIron"))
/*      */     {
/*  625 */       return 172;
/*      */     }
/*  627 */     if (s.equals("item.hoeDiamond"))
/*      */     {
/*  629 */       return 921;
/*      */     }
/*  631 */     if (s.equals("item.hoeGold"))
/*      */     {
/*  633 */       return 0;
/*      */     }
/*  635 */     if (s.equals("item.seeds"))
/*      */     {
/*  637 */       return 0;
/*      */     }
/*  639 */     if (s.equals("item.wheat"))
/*      */     {
/*  641 */       return 5;
/*      */     }
/*  643 */     if (s.equals("item.bread"))
/*      */     {
/*  645 */       return 15;
/*      */     }
/*  647 */     if (s.equals("item.helmetCloth"))
/*      */     {
/*  649 */       return 75;
/*      */     }
/*  651 */     if (s.equals("item.chestplateCloth"))
/*      */     {
/*  653 */       return 120;
/*      */     }
/*  655 */     if (s.equals("item.leggingsCloth"))
/*      */     {
/*  657 */       return 90;
/*      */     }
/*  659 */     if (s.equals("item.bootsCloth"))
/*      */     {
/*  661 */       return 60;
/*      */     }
/*  663 */     if (s.equals("item.helmetChain"))
/*      */     {
/*  665 */       return 0;
/*      */     }
/*  667 */     if (s.equals("item.chestplateChain"))
/*      */     {
/*  669 */       return 0;
/*      */     }
/*  671 */     if (s.equals("item.leggingsChain"))
/*      */     {
/*  673 */       return 0;
/*      */     }
/*  675 */     if (s.equals("item.bootsChain"))
/*      */     {
/*  677 */       return 0;
/*      */     }
/*  679 */     if (s.equals("item.helmetIron"))
/*      */     {
/*  681 */       return 425;
/*      */     }
/*  683 */     if (s.equals("item.chestplateIron"))
/*      */     {
/*  685 */       return 595;
/*      */     }
/*  687 */     if (s.equals("item.leggingsIron"))
/*      */     {
/*  689 */       return 560;
/*      */     }
/*  691 */     if (s.equals("item.bootsIron"))
/*      */     {
/*  693 */       return 320;
/*      */     }
/*  695 */     if (s.equals("item.helmetDiamond"))
/*      */     {
/*  697 */       return 2115;
/*      */     }
/*  699 */     if (s.equals("item.chestplateDiamond"))
/*      */     {
/*  701 */       return 3384;
/*      */     }
/*  703 */     if (s.equals("item.leggingsDiamond"))
/*      */     {
/*  705 */       return 2961;
/*      */     }
/*  707 */     if (s.equals("item.bootsDiamond"))
/*      */     {
/*  709 */       return 1410;
/*      */     }
/*  711 */     if (s.equals("item.helmetGold"))
/*      */     {
/*  713 */       return 0;
/*      */     }
/*  715 */     if (s.equals("item.chestplateGold"))
/*      */     {
/*  717 */       return 0;
/*      */     }
/*  719 */     if (s.equals("item.leggingsGold"))
/*      */     {
/*  721 */       return 0;
/*      */     }
/*  723 */     if (s.equals("item.bootsGold"))
/*      */     {
/*  725 */       return 0;
/*      */     }
/*  727 */     if (s.equals("item.flint"))
/*      */     {
/*  729 */       return 4;
/*      */     }
/*  731 */     if (s.equals("item.porkchopRaw"))
/*      */     {
/*  733 */       return 10;
/*      */     }
/*  735 */     if (s.equals("item.porkchopCooked"))
/*      */     {
/*  737 */       return 15;
/*      */     }
/*  739 */     if (s.equals("item.painting"))
/*      */     {
/*  741 */       return 25;
/*      */     }
/*  743 */     if (s.equals("item.appleGold"))
/*      */     {
/*  745 */       return 1950;
/*      */     }
/*  747 */     if (s.equals("item.sign"))
/*      */     {
/*  749 */       return 13;
/*      */     }
/*  751 */     if (s.equals("item.doorWood"))
/*      */     {
/*  753 */       return 6;
/*      */     }
/*  755 */     if (s.equals("item.bucket"))
/*      */     {
/*  757 */       return 255;
/*      */     }
/*  759 */     if (s.equals("item.bucketWater"))
/*      */     {
/*  761 */       return 325;
/*      */     }
/*  763 */     if (s.equals("item.bucketLava"))
/*      */     {
/*  765 */       return 345;
/*      */     }
/*  767 */     if (s.equals("item.minecart"))
/*      */     {
/*  769 */       return 400;
/*      */     }
/*  771 */     if (s.equals("item.saddle"))
/*      */     {
/*  773 */       return 1900;
/*      */     }
/*  775 */     if (s.equals("item.doorIron"))
/*      */     {
/*  777 */       return 500;
/*      */     }
/*  779 */     if (s.equals("item.redstone"))
/*      */     {
/*  781 */       return 4;
/*      */     }
/*  783 */     if (s.equals("item.snowball"))
/*      */     {
/*  785 */       return 0;
/*      */     }
/*  787 */     if (s.equals("item.boat"))
/*      */     {
/*  789 */       return 10;
/*      */     }
/*  791 */     if (s.equals("item.leather"))
/*      */     {
/*  793 */       return 15;
/*      */     }
/*  795 */     if (s.equals("item.milk"))
/*      */     {
/*  797 */       return 270;
/*      */     }
/*  799 */     if (s.equals("item.brick"))
/*      */     {
/*  801 */       return 0;
/*      */     }
/*  803 */     if (s.equals("item.clay"))
/*      */     {
/*  805 */       return 5;
/*      */     }
/*  807 */     if (s.equals("item.reeds"))
/*      */     {
/*  809 */       return 7;
/*      */     }
/*  811 */     if (s.equals("item.paper"))
/*      */     {
/*  813 */       return 35;
/*      */     }
/*  815 */     if (s.equals("item.book"))
/*      */     {
/*  817 */       return 23;
/*      */     }
/*  819 */     if (s.equals("item.slimeball"))
/*      */     {
/*  821 */       return 0;
/*      */     }
/*  823 */     if (s.equals("item.minecartChest"))
/*      */     {
/*  825 */       return 0;
/*      */     }
/*  827 */     if (s.equals("item.minecartFurnace"))
/*      */     {
/*  829 */       return 0;
/*      */     }
/*  831 */     if (s.equals("item.egg"))
/*      */     {
/*  833 */       return 20;
/*      */     }
/*  835 */     if (s.equals("item.compass"))
/*      */     {
/*  837 */       return 240;
/*      */     }
/*  839 */     if (s.equals("item.fishingRod"))
/*      */     {
/*  841 */       return 24;
/*      */     }
/*  843 */     if (s.equals("item.clock"))
/*      */     {
/*  845 */       return 615;
/*      */     }
/*  847 */     if (s.equals("item.yellowDust"))
/*      */     {
/*  849 */       return 15;
/*      */     }
/*  851 */     if (s.equals("item.fishRaw"))
/*      */     {
/*  853 */       return 10;
/*      */     }
/*  855 */     if (s.equals("item.fishCooked"))
/*      */     {
/*  857 */       return 15;
/*      */     }
/*  859 */     if (s.equals("item.dyePowder"))
/*      */     {
/*  861 */       return 0;
/*      */     }
/*  863 */     if (s.equals("item.bone"))
/*      */     {
/*  865 */       return 15;
/*      */     }
/*  867 */     if (s.equals("item.sugar"))
/*      */     {
/*  869 */       return 5;
/*      */     }
/*  871 */     if (s.equals("item.cake"))
/*      */     {
/*  873 */       return 300;
/*      */     }
/*  875 */     if (s.equals("item.bed"))
/*      */     {
/*  877 */       return 40;
/*      */     }
/*  879 */     if (s.equals("item.diode"))
/*      */     {
/*  881 */       return 25;
/*      */     }
/*  883 */     if (s.equals("item.cookie"))
/*      */     {
/*  885 */       return 100;
/*      */     }
/*  887 */     if (s.equals("item.map"))
/*      */     {
/*  889 */       return 575;
/*      */     }
/*  891 */     if (s.equals("item.shears"))
/*      */     {
/*  893 */       return 160;
/*      */     }
/*  895 */     if (s.equals("item.melon"))
/*      */     {
/*  897 */       return 40;
/*      */     }
/*  899 */     if (s.equals("item.seeds_pumpkin"))
/*      */     {
/*  901 */       return 80;
/*      */     }
/*  903 */     if (s.equals("item.seeds_melon"))
/*      */     {
/*  905 */       return 60;
/*      */     }
/*  907 */     if (s.equals("item.beefRaw"))
/*      */     {
/*  909 */       return 15;
/*      */     }
/*  911 */     if (s.equals("item.beefCooked"))
/*      */     {
/*  913 */       return 20;
/*      */     }
/*  915 */     if (s.equals("item.chickenRaw"))
/*      */     {
/*  917 */       return 5;
/*      */     }
/*  919 */     if (s.equals("item.chickenCooked"))
/*      */     {
/*  921 */       return 10;
/*      */     }
/*  923 */     if (s.equals("item.rottenFlesh"))
/*      */     {
/*  925 */       return 1;
/*      */     }
/*  927 */     if (s.equals("item.enderPearl"))
/*      */     {
/*  929 */       return 150;
/*      */     }
/*  931 */     if (s.equals("item.record"))
/*      */     {
/*  933 */       return 4000;
/*      */     }
/*  935 */     if (s.equals("item.record"))
/*      */     {
/*  937 */       return 4000;
/*      */     }
/*  939 */     if (s.equals("item.coins"))
/*      */     {
/*  941 */       return 0;
/*      */     }
/*  943 */     if (s.equals("item.philStoneC"))
/*      */     {
/*  945 */       return 300;
/*      */     }
/*  947 */     if (s.equals("item.baseRing"))
/*      */     {
/*  949 */       return 800;
/*      */     }
/*  951 */     if (s.equals("item.alchemicalCoal"))
/*      */     {
/*  953 */       return 130;
/*      */     }
/*  955 */     if (s.equals("item.mobiusFuel"))
/*      */     {
/*  957 */       return 380;
/*      */     }
/*  959 */     if (s.equals("item.darkMatter"))
/*      */     {
/*  961 */       return 17964;
/*      */     }
/*  963 */     if (s.equals("item.repairCharm"))
/*      */     {
/*  965 */       return 758;
/*      */     }
/*  967 */     if (s.equals("tile.novaCatalyst"))
/*      */     {
/*  969 */       return 2360;
/*      */     }
/*  971 */     if (s.equals("tile.glowStoneAggregator"))
/*      */     {
/*  973 */       return 960;
/*      */     }
/*  975 */     if (s.equals("tile.obsAggregatorOff"))
/*      */     {
/*  977 */       return 1110;
/*      */     }
/*  979 */     if (s.equals("tile.interdictionTorch"))
/*      */     {
/*  981 */       return 381;
/*      */     }
/*  983 */     if (s.equals("tile.alChest"))
/*      */     {
/*  985 */       return 800;
/*      */     }
/*  987 */     if (s.equals("item.redstoneCrystal"))
/*      */     {
/*  989 */       return 30;
/*      */     }
/*  991 */     if (s.equals("item.glowstoneCrystal"))
/*      */     {
/*  993 */       return 150;
/*      */     }
/*  995 */     if (s.equals("item.lavaCrystal"))
/*      */     {
/*  997 */       return 300;
/*      */     }
/*  999 */     if (s.equals("item.slimeCrystal"))
/*      */     {
/* 1001 */       return 51;
/*      */     }
/* 1003 */     if (s.equals("item.mossBallGiant"))
/*      */     {
/* 1005 */       return 300;
/*      */     }
/* 1007 */     if (s.equals("item.woodBowlPumpkinPie"))
/*      */     {
/* 1009 */       return 180;
/*      */     }
/* 1011 */     if (s.equals("item.dDiamondPickaxe"))
/*      */     {
/* 1013 */       return 1944;
/*      */     }
/* 1015 */     if (s.equals("item.stStoneHammer"))
/*      */     {
/* 1017 */       return 16;
/*      */     }
/* 1019 */     if (s.equals("item.iceIceIceAxe"))
/*      */     {
/* 1021 */       return 120;
/*      */     }
/* 1023 */     if (s.equals("item.wIronFryingPan"))
/*      */     {
/* 1025 */       return 192;
/*      */     }
/* 1027 */     if (s.equals("item.lLavaAxe"))
/*      */     {
/* 1029 */       return 572;
/*      */     }
/* 1031 */     if (s.equals("item.mMossyHoe"))
/*      */     {
/* 1033 */       return 320;
/*      */     }
/* 1035 */     if (s.equals("item.sSlimeShovel"))
/*      */     {
/* 1037 */       return 400;
/*      */     }
/* 1039 */     if (s.equals("item.spearWood"))
/*      */     {
/* 1041 */       return 4;
/*      */     }
/* 1043 */     if (s.equals("item.spearStone"))
/*      */     {
/* 1045 */       return 6;
/*      */     }
/* 1047 */     if (s.equals("item.spearSteel"))
/*      */     {
/* 1049 */       return 87;
/*      */     }
/* 1051 */     if (s.equals("item.spearDiamond"))
/*      */     {
/* 1053 */       return 407;
/*      */     }
/* 1055 */     if (s.equals("item.halberdWood"))
/*      */     {
/* 1057 */       return 8;
/*      */     }
/* 1059 */     if (s.equals("item.halberdStone"))
/*      */     {
/* 1061 */       return 14;
/*      */     }
/* 1063 */     if (s.equals("item.halberdSteel"))
/*      */     {
/* 1065 */       return 257;
/*      */     }
/* 1067 */     if (s.equals("item.halberdDiamond"))
/*      */     {
/* 1069 */       return 1217;
/*      */     }
/* 1071 */     if (s.equals("item.battleaxeWood"))
/*      */     {
/* 1073 */       return 12;
/*      */     }
/* 1075 */     if (s.equals("item.battleaxeStone"))
/*      */     {
/* 1077 */       return 22;
/*      */     }
/* 1079 */     if (s.equals("item.battleaxeIron"))
/*      */     {
/* 1081 */       return 427;
/*      */     }
/* 1083 */     if (s.equals("item.battleaxeDiamond"))
/*      */     {
/* 1085 */       return 2027;
/*      */     }
/* 1087 */     if (s.equals("item.warhammerWood"))
/*      */     {
/* 1089 */       return 11;
/*      */     }
/* 1091 */     if (s.equals("item.warhammerStone"))
/*      */     {
/* 1093 */       return 15;
/*      */     }
/* 1095 */     if (s.equals("item.warhammerIron"))
/*      */     {
/* 1097 */       return 342;
/*      */     }
/* 1099 */     if (s.equals("item.warhammerDiamond"))
/*      */     {
/* 1101 */       return 1623;
/*      */     }
/* 1103 */     if (s.equals("item.knifeWood"))
/*      */     {
/* 1105 */       return 3;
/*      */     }
/* 1107 */     if (s.equals("item.knifeStone"))
/*      */     {
/* 1109 */       return 5;
/*      */     }
/* 1111 */     if (s.equals("item.knifeSteel"))
/*      */     {
/* 1113 */       return 86;
/*      */     }
/* 1115 */     if (s.equals("item.knifeDiamond"))
/*      */     {
/* 1117 */       return 406;
/*      */     }
/* 1119 */     if (s.equals("item.javelin"))
/*      */     {
/* 1121 */       return 3;
/*      */     }
/* 1123 */     if (s.equals("item.bayonet"))
/*      */     {
/* 1125 */       return 434;
/*      */     }
/* 1127 */     if (s.equals("item.bullet"))
/*      */     {
/* 1129 */       return 30;
/*      */     }
/* 1131 */     if (s.equals("item.musket"))
/*      */     {
/* 1133 */       return 348;
/*      */     }
/* 1135 */     if (s.equals("item.crossbow"))
/*      */     {
/* 1137 */       return 594;
/*      */     }
/* 1139 */     if (s.equals("item.bolt"))
/*      */     {
/* 1141 */       return 22;
/*      */     }
/* 1143 */     if (s.equals("item.blowgun"))
/*      */     {
/* 1145 */       return 21;
/*      */     }
/* 1147 */     if (s.equals("item.dart"))
/*      */     {
/* 1149 */       return 2;
/*      */     }
/* 1151 */     if (s.equals("item.dynamite"))
/*      */     {
/* 1153 */       return 325;
/*      */     }
/* 1155 */     if (s.equals("item.flailWood"))
/*      */     {
/* 1157 */       return 154;
/*      */     }
/* 1159 */     if (s.equals("item.flailStone"))
/*      */     {
/* 1161 */       return 156;
/*      */     }
/* 1163 */     if (s.equals("item.flailSteel"))
/*      */     {
/* 1165 */       return 237;
/*      */     }
/* 1167 */     if (s.equals("item.flailDiamond"))
/*      */     {
/* 1169 */       return 557;
/*      */     }
/* 1171 */     if (s.equals("item.fireRod"))
/*      */     {
/* 1173 */       return 7;
/*      */     }
/* 1175 */     if (s.equals("item.cannon"))
/*      */     {
/* 1177 */       return 519;
/*      */     }
/* 1179 */     if (s.equals("item.cannonBall"))
/*      */     {
/* 1181 */       return 25;
/*      */     }
/* 1183 */     if (s.equals("tile.stone"))
/*      */     {
/* 1185 */       return 4;
/*      */     }
/* 1187 */     if (s.equals("tile.grass"))
/*      */     {
/* 1189 */       return 0;
/*      */     }
/* 1191 */     if (s.equals("tile.dirt"))
/*      */     {
/* 1193 */       return 0;
/*      */     }
/* 1195 */     if (s.equals("tile.stonebrick"))
/*      */     {
/* 1197 */       return 0;
/*      */     }
/* 1199 */     if (s.equals("tile.wood"))
/*      */     {
/* 1201 */       return 2;
/*      */     }
/* 1203 */     if (s.equals("tile.sapling"))
/*      */     {
/* 1205 */       return 8;
/*      */     }
/* 1207 */     if (s.equals("tile.bedrock"))
/*      */     {
/* 1209 */       return 0;
/*      */     }
/* 1211 */     if (s.equals("tile.water"))
/*      */     {
/* 1213 */       return 0;
/*      */     }
/* 1215 */     if (s.equals("tile.water"))
/*      */     {
/* 1217 */       return 0;
/*      */     }
/* 1219 */     if (s.equals("tile.lava"))
/*      */     {
/* 1221 */       return 0;
/*      */     }
/* 1223 */     if (s.equals("tile.lava"))
/*      */     {
/* 1225 */       return 0;
/*      */     }
/* 1227 */     if (s.equals("tile.sand"))
/*      */     {
/* 1229 */       return 10;
/*      */     }
/* 1231 */     if (s.equals("tile.gravel"))
/*      */     {
/* 1233 */       return 5;
/*      */     }
/* 1235 */     if (s.equals("tile.oreGold"))
/*      */     {
/* 1237 */       return 100;
/*      */     }
/* 1239 */     if (s.equals("tile.oreIron"))
/*      */     {
/* 1241 */       return 80;
/*      */     }
/* 1243 */     if (s.equals("tile.oreCoal"))
/*      */     {
/* 1245 */       return 15;
/*      */     }
/* 1247 */     if (s.equals("tile.log"))
/*      */     {
/* 1249 */       return 5;
/*      */     }
/* 1251 */     if (s.equals("tile.leaves"))
/*      */     {
/* 1253 */       return 0;
/*      */     }
/* 1255 */     if (s.equals("tile.sponge"))
/*      */     {
/* 1257 */       return 0;
/*      */     }
/* 1259 */     if (s.equals("tile.glass"))
/*      */     {
/* 1261 */       return 30;
/*      */     }
/* 1263 */     if (s.equals("tile.oreLapis"))
/*      */     {
/* 1265 */       return 0;
/*      */     }
/* 1267 */     if (s.equals("tile.blockLapis"))
/*      */     {
/* 1269 */       return 180;
/*      */     }
/* 1271 */     if (s.equals("tile.dispenser"))
/*      */     {
/* 1273 */       return 270;
/*      */     }
/* 1275 */     if (s.equals("tile.sandStone"))
/*      */     {
/* 1277 */       return 40;
/*      */     }
/* 1279 */     if (s.equals("tile.musicBlock"))
/*      */     {
/* 1281 */       return 20;
/*      */     }
/* 1283 */     if (s.equals("tile.bed"))
/*      */     {
/* 1285 */       return 40;
/*      */     }
/* 1287 */     if (s.equals("tile.goldenRail"))
/*      */     {
/* 1289 */       return 152;
/*      */     }
/* 1291 */     if (s.equals("tile.detectorRail"))
/*      */     {
/* 1293 */       return 85;
/*      */     }
/* 1295 */     if (s.equals("tile.pistonStickyBase"))
/*      */     {
/* 1297 */       return 185;
/*      */     }
/* 1299 */     if (s.equals("tile.web"))
/*      */     {
/* 1301 */       return 0;
/*      */     }
/* 1303 */     if (s.equals("tile.tallgrass"))
/*      */     {
/* 1305 */       return 0;
/*      */     }
/* 1307 */     if (s.equals("tile.deadbush"))
/*      */     {
/* 1309 */       return 0;
/*      */     }
/* 1311 */     if (s.equals("tile.pistonBase"))
/*      */     {
/* 1313 */       return 105;
/*      */     }
/* 1315 */     if (s.equals("tile.cloth"))
/*      */     {
/* 1317 */       return 12;
/*      */     }
/* 1319 */     if (s.equals("tile.flower"))
/*      */     {
/* 1321 */       return 10;
/*      */     }
/* 1323 */     if (s.equals("tile.rose"))
/*      */     {
/* 1325 */       return 40;
/*      */     }
/* 1327 */     if (s.equals("tile.mushroom"))
/*      */     {
/* 1329 */       return 15;
/*      */     }
/* 1331 */     if (s.equals("tile.mushroom"))
/*      */     {
/* 1333 */       return 15;
/*      */     }
/* 1335 */     if (s.equals("tile.blockGold"))
/*      */     {
/* 1337 */       return 1350;
/*      */     }
/* 1339 */     if (s.equals("tile.blockIron"))
/*      */     {
/* 1341 */       return 765;
/*      */     }
/* 1343 */     if (s.equals("tile.stoneSlab"))
/*      */     {
/* 1345 */       return 6;
/*      */     }
/* 1347 */     if (s.equals("tile.stoneSlab"))
/*      */     {
/* 1349 */       return 6;
/*      */     }
/* 1351 */     if (s.equals("tile.brick"))
/*      */     {
/* 1353 */       return 80;
/*      */     }
/* 1355 */     if (s.equals("tile.tnt"))
/*      */     {
/* 1357 */       return 800;
/*      */     }
/* 1359 */     if (s.equals("tile.bookshelf"))
/*      */     {
/* 1361 */       return 70;
/*      */     }
/* 1363 */     if (s.equals("tile.stoneMoss"))
/*      */     {
/* 1365 */       return 50;
/*      */     }
/* 1367 */     if (s.equals("tile.obsidian"))
/*      */     {
/* 1369 */       return 50;
/*      */     }
/* 1371 */     if (s.equals("tile.torch"))
/*      */     {
/* 1373 */       return 5;
/*      */     }
/* 1375 */     if (s.equals("tile.fire"))
/*      */     {
/* 1377 */       return 0;
/*      */     }
/* 1379 */     if (s.equals("tile.mobSpawner"))
/*      */     {
/* 1381 */       return 0;
/*      */     }
/* 1383 */     if (s.equals("tile.stairsWood"))
/*      */     {
/* 1385 */       return 0;
/*      */     }
/* 1387 */     if (s.equals("tile.chest"))
/*      */     {
/* 1389 */       return 10;
/*      */     }
/* 1391 */     if (s.equals("tile.redstoneDust"))
/*      */     {
/* 1393 */       return 5;
/*      */     }
/* 1395 */     if (s.equals("tile.oreDiamond"))
/*      */     {
/* 1397 */       return 360;
/*      */     }
/* 1399 */     if (s.equals("tile.blockDiamond"))
/*      */     {
/* 1401 */       return 3807;
/*      */     }
/* 1403 */     if (s.equals("tile.workbench"))
/*      */     {
/* 1405 */       return 5;
/*      */     }
/* 1407 */     if (s.equals("tile.crops"))
/*      */     {
/* 1409 */       return 0;
/*      */     }
/* 1411 */     if (s.equals("tile.farmland"))
/*      */     {
/* 1413 */       return 0;
/*      */     }
/* 1415 */     if (s.equals("tile.furnace"))
/*      */     {
/* 1417 */       return 10;
/*      */     }
/* 1419 */     if (s.equals("tile.furnace"))
/*      */     {
/* 1421 */       return 10;
/*      */     }
/* 1423 */     if (s.equals("tile.sign"))
/*      */     {
/* 1425 */       return 13;
/*      */     }
/* 1427 */     if (s.equals("tile.doorWood"))
/*      */     {
/* 1429 */       return 6;
/*      */     }
/* 1431 */     if (s.equals("tile.ladder"))
/*      */     {
/* 1433 */       return 3;
/*      */     }
/* 1435 */     if (s.equals("tile.rail"))
/*      */     {
/* 1437 */       return 30;
/*      */     }
/* 1439 */     if (s.equals("tile.stairsStone"))
/*      */     {
/* 1441 */       return 0;
/*      */     }
/* 1443 */     if (s.equals("tile.sign"))
/*      */     {
/* 1445 */       return 13;
/*      */     }
/* 1447 */     if (s.equals("tile.lever"))
/*      */     {
/* 1449 */       return 1;
/*      */     }
/* 1451 */     if (s.equals("tile.pressurePlate"))
/*      */     {
/* 1453 */       return 2;
/*      */     }
/* 1455 */     if (s.equals("tile.doorIron"))
/*      */     {
/* 1457 */       return 500;
/*      */     }
/* 1459 */     if (s.equals("tile.pressurePlate"))
/*      */     {
/* 1461 */       return 2;
/*      */     }
/* 1463 */     if (s.equals("tile.oreRedstone"))
/*      */     {
/* 1465 */       return 10;
/*      */     }
/* 1467 */     if (s.equals("tile.oreRedstone"))
/*      */     {
/* 1469 */       return 10;
/*      */     }
/* 1471 */     if (s.equals("tile.notGate"))
/*      */     {
/* 1473 */       return 10;
/*      */     }
/* 1475 */     if (s.equals("tile.notGate"))
/*      */     {
/* 1477 */       return 10;
/*      */     }
/* 1479 */     if (s.equals("tile.button"))
/*      */     {
/* 1481 */       return 5;
/*      */     }
/* 1483 */     if (s.equals("tile.snow"))
/*      */     {
/* 1485 */       return 15;
/*      */     }
/* 1487 */     if (s.equals("tile.ice"))
/*      */     {
/* 1489 */       return 0;
/*      */     }
/* 1491 */     if (s.equals("tile.snow"))
/*      */     {
/* 1493 */       return 15;
/*      */     }
/* 1495 */     if (s.equals("tile.cactus"))
/*      */     {
/* 1497 */       return 3;
/*      */     }
/* 1499 */     if (s.equals("tile.clay"))
/*      */     {
/* 1501 */       return 20;
/*      */     }
/* 1503 */     if (s.equals("tile.reeds"))
/*      */     {
/* 1505 */       return 0;
/*      */     }
/* 1507 */     if (s.equals("tile.jukebox"))
/*      */     {
/* 1509 */       return 245;
/*      */     }
/* 1511 */     if (s.equals("tile.fence"))
/*      */     {
/* 1513 */       return 5;
/*      */     }
/* 1515 */     if (s.equals("tile.pumpkin"))
/*      */     {
/* 1517 */       return 120;
/*      */     }
/* 1519 */     if (s.equals("tile.hellrock"))
/*      */     {
/* 1521 */       return 0;
/*      */     }
/* 1523 */     if (s.equals("tile.hellsand"))
/*      */     {
/* 1525 */       return 15;
/*      */     }
/* 1527 */     if (s.equals("tile.lightgem"))
/*      */     {
/* 1529 */       return 60;
/*      */     }
/* 1531 */     if (s.equals("tile.portal"))
/*      */     {
/* 1533 */       return 0;
/*      */     }
/* 1535 */     if (s.equals("tile.litpumpkin"))
/*      */     {
/* 1537 */       return 125;
/*      */     }
/* 1539 */     if (s.equals("tile.cake"))
/*      */     {
/* 1541 */       return 300;
/*      */     }
/* 1543 */     if (s.equals("tile.diode"))
/*      */     {
/* 1545 */       return 25;
/*      */     }
/* 1547 */     if (s.equals("tile.diode"))
/*      */     {
/* 1549 */       return 25;
/*      */     }
/* 1551 */     if (s.equals("tile.lockedchest"))
/*      */     {
/* 1553 */       return 0;
/*      */     }
/* 1555 */     if (s.equals("tile.trapdoor"))
/*      */     {
/* 1557 */       return 3;
/*      */     }
/* 1559 */     if (s.equals("tile.stonebricksmooth"))
/*      */     {
/* 1561 */       return 20;
/*      */     }
/* 1563 */     if (s.equals("tile.mushroom"))
/*      */     {
/* 1565 */       return 15;
/*      */     }
/* 1567 */     if (s.equals("tile.mushroom"))
/*      */     {
/* 1569 */       return 15;
/*      */     }
/* 1571 */     if (s.equals("tile.fenceIron"))
/*      */     {
/* 1573 */       return 32;
/*      */     }
/* 1575 */     if (s.equals("tile.thinGlass"))
/*      */     {
/* 1577 */       return 12;
/*      */     }
/* 1579 */     if (s.equals("tile.melon"))
/*      */     {
/* 1581 */       return 0;
/*      */     }
/* 1583 */     if (s.equals("tile.pumpkinStem"))
/*      */     {
/* 1585 */       return 0;
/*      */     }
/* 1587 */     if (s.equals("tile.pumpkinStem"))
/*      */     {
/* 1589 */       return 0;
/*      */     }
/* 1591 */     if (s.equals("tile.vine"))
/*      */     {
/* 1593 */       return 30;
/*      */     }
/* 1595 */     if (s.equals("tile.fenceGate"))
/*      */     {
/* 1597 */       return 10;
/*      */     }
/* 1599 */     if (s.equals("tile.stairsBrick"))
/*      */     {
/* 1601 */       return 0;
/*      */     }
/* 1603 */     if (s.equals("tile.stairsStoneBrickSmooth"))
/*      */     {
/* 1605 */       return 0;
/*      */     }
/* 1607 */     if (s.equals("tile.saltOre"))
/*      */     {
/* 1609 */       return 0;
/*      */     }
/* 1611 */     if (s.equals("tile.pamcropblock"))
/*      */     {
/* 1613 */       return 0;
/*      */     }
/* 1615 */     if (s.equals("tile.pamFruit"))
/*      */     {
/* 1617 */       return 0;
/*      */     }
/* 1619 */     if (s.equals("tile.pamSapling"))
/*      */     {
/* 1621 */       return 15;
/*      */     }
/* 1623 */     if (s.equals("tile.pamBushes"))
/*      */     {
/* 1625 */       return 0;
/*      */     }
/* 1627 */     if (s.equals("tile.pamcottonCrop"))
/*      */     {
/* 1629 */       return 0;
/*      */     }
/* 1631 */     if (s.equals("tile.pamcottonWild"))
/*      */     {
/* 1633 */       return 0;
/*      */     }
/* 1635 */     if (s.equals("tile.pamcandleberryCrop"))
/*      */     {
/* 1637 */       return 0;
/*      */     }
/* 1639 */     if (s.equals("tile.pamcandleberryBush"))
/*      */     {
/* 1641 */       return 0;
/*      */     }
/* 1643 */     if (s.equals("tile.pamCandlenut"))
/*      */     {
/* 1645 */       return 0;
/*      */     }
/* 1647 */     if (s.equals("tile.pamcandlenutSapling"))
/*      */     {
/* 1649 */       return 15;
/*      */     }
/* 1651 */     if (s.equals("tile.pamOre"))
/*      */     {
/* 1653 */       return 0;
/*      */     }
/* 1655 */     if (s.equals("tile.pamGem"))
/*      */     {
/* 1657 */       return 0;
/*      */     }
/* 1659 */     if (s.equals("tile.pamCobble"))
/*      */     {
/* 1661 */       return 1;
/*      */     }
/* 1663 */     if (s.equals("tile.pamPaver"))
/*      */     {
/* 1665 */       return 3;
/*      */     }
/* 1667 */     if (s.equals("tile.pamBrick"))
/*      */     {
/* 1669 */       return 850;
/*      */     }
/* 1671 */     if (s.equals("tile.pamGlass"))
/*      */     {
/* 1673 */       return 15;
/*      */     }
/* 1675 */     if (s.equals("tile.pamSmooth"))
/*      */     {
/* 1677 */       return 5;
/*      */     }
/* 1679 */     if (s.equals("tile.pamPlank"))
/*      */     {
/* 1681 */       return 3;
/*      */     }
/* 1683 */     if (s.equals("item.shovelIron"))
/*      */     {
/* 1685 */       return 87;
/*      */     }
/* 1687 */     if (s.equals("item.pickaxeIron"))
/*      */     {
/* 1689 */       return 257;
/*      */     }
/* 1691 */     if (s.equals("item.hatchetIron"))
/*      */     {
/* 1693 */       return 257;
/*      */     }
/* 1695 */     if (s.equals("item.flintAndSteel"))
/*      */     {
/* 1697 */       return 89;
/*      */     }
/* 1699 */     if (s.equals("item.apple"))
/*      */     {
/* 1701 */       return 20;
/*      */     }
/* 1703 */     if (s.equals("item.bow"))
/*      */     {
/* 1705 */       return 250;
/*      */     }
/* 1707 */     if (s.equals("item.arrow"))
/*      */     {
/* 1709 */       return 4;
/*      */     }
/* 1711 */     if (s.equals("item.coal"))
/*      */     {
/* 1713 */       return 15;
/*      */     }
/* 1715 */     if (s.equals("item.emerald"))
/*      */     {
/* 1717 */       return 405;
/*      */     }
/* 1719 */     if (s.equals("item.ingotIron"))
/*      */     {
/* 1721 */       return 85;
/*      */     }
/* 1723 */     if (s.equals("item.ingotGold"))
/*      */     {
/* 1725 */       return 0;
/*      */     }
/* 1727 */     if (s.equals("item.swordIron"))
/*      */     {
/* 1729 */       return 160;
/*      */     }
/* 1731 */     if (s.equals("item.swordWood"))
/*      */     {
/* 1733 */       return 5;
/*      */     }
/* 1735 */     if (s.equals("item.shovelWood"))
/*      */     {
/* 1737 */       return 6;
/*      */     }
/* 1739 */     if (s.equals("item.pickaxeWood"))
/*      */     {
/* 1741 */       return 8;
/*      */     }
/* 1743 */     if (s.equals("item.hatchetWood"))
/*      */     {
/* 1745 */       return 8;
/*      */     }
/* 1747 */     if (s.equals("item.swordStone"))
/*      */     {
/* 1749 */       return 10;
/*      */     }
/* 1751 */     if (s.equals("item.shovelStone"))
/*      */     {
/* 1753 */       return 6;
/*      */     }
/* 1755 */     if (s.equals("item.pickaxeStone"))
/*      */     {
/* 1757 */       return 14;
/*      */     }
/* 1759 */     if (s.equals("item.hatchetStone"))
/*      */     {
/* 1761 */       return 14;
/*      */     }
/* 1763 */     if (s.equals("item.swordDiamond"))
/*      */     {
/* 1765 */       return 855;
/*      */     }
/* 1767 */     if (s.equals("item.shovelDiamond"))
/*      */     {
/* 1769 */       return 462;
/*      */     }
/* 1771 */     if (s.equals("item.pickaxeDiamond"))
/*      */     {
/* 1773 */       return 1380;
/*      */     }
/* 1775 */     if (s.equals("item.hatchetDiamond"))
/*      */     {
/* 1777 */       return 1380;
/*      */     }
/* 1779 */     if (s.equals("item.stick"))
/*      */     {
/* 1781 */       return 1;
/*      */     }
/* 1783 */     if (s.equals("item.bowl"))
/*      */     {
/* 1785 */       return 0;
/*      */     }
/* 1787 */     if (s.equals("item.mushroomStew"))
/*      */     {
/* 1789 */       return 0;
/*      */     }
/* 1791 */     if (s.equals("item.swordGold"))
/*      */     {
/* 1793 */       return 0;
/*      */     }
/* 1795 */     if (s.equals("item.shovelGold"))
/*      */     {
/* 1797 */       return 0;
/*      */     }
/* 1799 */     if (s.equals("item.pickaxeGold"))
/*      */     {
/* 1801 */       return 0;
/*      */     }
/* 1803 */     if (s.equals("item.hatchetGold"))
/*      */     {
/* 1805 */       return 0;
/*      */     }
/* 1807 */     if (s.equals("item.string"))
/*      */     {
/* 1809 */       return 75;
/*      */     }
/* 1811 */     if (s.equals("item.feather"))
/*      */     {
/* 1813 */       return 2;
/*      */     }
/* 1815 */     if (s.equals("item.sulphur"))
/*      */     {
/* 1817 */       return 150;
/*      */     }
/* 1819 */     if (s.equals("item.hoeWood"))
/*      */     {
/* 1821 */       return 6;
/*      */     }
/* 1823 */     if (s.equals("item.hoeStone"))
/*      */     {
/* 1825 */       return 10;
/*      */     }
/* 1827 */     if (s.equals("item.hoeIron"))
/*      */     {
/* 1829 */       return 172;
/*      */     }
/* 1831 */     if (s.equals("item.hoeDiamond"))
/*      */     {
/* 1833 */       return 921;
/*      */     }
/* 1835 */     if (s.equals("item.hoeGold"))
/*      */     {
/* 1837 */       return 0;
/*      */     }
/* 1839 */     if (s.equals("item.seeds"))
/*      */     {
/* 1841 */       return 0;
/*      */     }
/* 1843 */     if (s.equals("item.wheat"))
/*      */     {
/* 1845 */       return 5;
/*      */     }
/* 1847 */     if (s.equals("item.bread"))
/*      */     {
/* 1849 */       return 15;
/*      */     }
/* 1851 */     if (s.equals("item.helmetCloth"))
/*      */     {
/* 1853 */       return 75;
/*      */     }
/* 1855 */     if (s.equals("item.chestplateCloth"))
/*      */     {
/* 1857 */       return 120;
/*      */     }
/* 1859 */     if (s.equals("item.leggingsCloth"))
/*      */     {
/* 1861 */       return 90;
/*      */     }
/* 1863 */     if (s.equals("item.bootsCloth"))
/*      */     {
/* 1865 */       return 60;
/*      */     }
/* 1867 */     if (s.equals("item.helmetChain"))
/*      */     {
/* 1869 */       return 0;
/*      */     }
/* 1871 */     if (s.equals("item.chestplateChain"))
/*      */     {
/* 1873 */       return 0;
/*      */     }
/* 1875 */     if (s.equals("item.leggingsChain"))
/*      */     {
/* 1877 */       return 0;
/*      */     }
/* 1879 */     if (s.equals("item.bootsChain"))
/*      */     {
/* 1881 */       return 0;
/*      */     }
/* 1883 */     if (s.equals("item.helmetIron"))
/*      */     {
/* 1885 */       return 425;
/*      */     }
/* 1887 */     if (s.equals("item.chestplateIron"))
/*      */     {
/* 1889 */       return 595;
/*      */     }
/* 1891 */     if (s.equals("item.leggingsIron"))
/*      */     {
/* 1893 */       return 560;
/*      */     }
/* 1895 */     if (s.equals("item.bootsIron"))
/*      */     {
/* 1897 */       return 320;
/*      */     }
/* 1899 */     if (s.equals("item.helmetDiamond"))
/*      */     {
/* 1901 */       return 2115;
/*      */     }
/* 1903 */     if (s.equals("item.chestplateDiamond"))
/*      */     {
/* 1905 */       return 3384;
/*      */     }
/* 1907 */     if (s.equals("item.leggingsDiamond"))
/*      */     {
/* 1909 */       return 2961;
/*      */     }
/* 1911 */     if (s.equals("item.bootsDiamond"))
/*      */     {
/* 1913 */       return 1410;
/*      */     }
/* 1915 */     if (s.equals("item.helmetGold"))
/*      */     {
/* 1917 */       return 0;
/*      */     }
/* 1919 */     if (s.equals("item.chestplateGold"))
/*      */     {
/* 1921 */       return 0;
/*      */     }
/* 1923 */     if (s.equals("item.leggingsGold"))
/*      */     {
/* 1925 */       return 0;
/*      */     }
/* 1927 */     if (s.equals("item.bootsGold"))
/*      */     {
/* 1929 */       return 0;
/*      */     }
/* 1931 */     if (s.equals("item.flint"))
/*      */     {
/* 1933 */       return 4;
/*      */     }
/* 1935 */     if (s.equals("item.porkchopRaw"))
/*      */     {
/* 1937 */       return 10;
/*      */     }
/* 1939 */     if (s.equals("item.porkchopCooked"))
/*      */     {
/* 1941 */       return 15;
/*      */     }
/* 1943 */     if (s.equals("item.painting"))
/*      */     {
/* 1945 */       return 25;
/*      */     }
/* 1947 */     if (s.equals("item.appleGold"))
/*      */     {
/* 1949 */       return 9001;
/*      */     }
/* 1951 */     if (s.equals("item.sign"))
/*      */     {
/* 1953 */       return 13;
/*      */     }
/* 1955 */     if (s.equals("item.doorWood"))
/*      */     {
/* 1957 */       return 6;
/*      */     }
/* 1959 */     if (s.equals("item.bucket"))
/*      */     {
/* 1961 */       return 255;
/*      */     }
/* 1963 */     if (s.equals("item.bucketWater"))
/*      */     {
/* 1965 */       return 325;
/*      */     }
/* 1967 */     if (s.equals("item.bucketLava"))
/*      */     {
/* 1969 */       return 345;
/*      */     }
/* 1971 */     if (s.equals("item.minecart"))
/*      */     {
/* 1973 */       return 400;
/*      */     }
/* 1975 */     if (s.equals("item.saddle"))
/*      */     {
/* 1977 */       return 1900;
/*      */     }
/* 1979 */     if (s.equals("item.doorIron"))
/*      */     {
/* 1981 */       return 500;
/*      */     }
/* 1983 */     if (s.equals("item.redstone"))
/*      */     {
/* 1985 */       return 4;
/*      */     }
/* 1987 */     if (s.equals("item.snowball"))
/*      */     {
/* 1989 */       return 0;
/*      */     }
/* 1991 */     if (s.equals("item.boat"))
/*      */     {
/* 1993 */       return 10;
/*      */     }
/* 1995 */     if (s.equals("item.leather"))
/*      */     {
/* 1997 */       return 15;
/*      */     }
/* 1999 */     if (s.equals("item.milk"))
/*      */     {
/* 2001 */       return 270;
/*      */     }
/* 2003 */     if (s.equals("item.brick"))
/*      */     {
/* 2005 */       return 0;
/*      */     }
/* 2007 */     if (s.equals("item.clay"))
/*      */     {
/* 2009 */       return 5;
/*      */     }
/* 2011 */     if (s.equals("item.reeds"))
/*      */     {
/* 2013 */       return 7;
/*      */     }
/* 2015 */     if (s.equals("item.paper"))
/*      */     {
/* 2017 */       return 35;
/*      */     }
/* 2019 */     if (s.equals("item.book"))
/*      */     {
/* 2021 */       return 23;
/*      */     }
/* 2023 */     if (s.equals("item.slimeball"))
/*      */     {
/* 2025 */       return 0;
/*      */     }
/* 2027 */     if (s.equals("item.minecartChest"))
/*      */     {
/* 2029 */       return 0;
/*      */     }
/* 2031 */     if (s.equals("item.minecartFurnace"))
/*      */     {
/* 2033 */       return 0;
/*      */     }
/* 2035 */     if (s.equals("item.egg"))
/*      */     {
/* 2037 */       return 20;
/*      */     }
/* 2039 */     if (s.equals("item.compass"))
/*      */     {
/* 2041 */       return 240;
/*      */     }
/* 2043 */     if (s.equals("item.fishingRod"))
/*      */     {
/* 2045 */       return 24;
/*      */     }
/* 2047 */     if (s.equals("item.clock"))
/*      */     {
/* 2049 */       return 615;
/*      */     }
/* 2051 */     if (s.equals("item.yellowDust"))
/*      */     {
/* 2053 */       return 15;
/*      */     }
/* 2055 */     if (s.equals("item.fishRaw"))
/*      */     {
/* 2057 */       return 10;
/*      */     }
/* 2059 */     if (s.equals("item.fishCooked"))
/*      */     {
/* 2061 */       return 15;
/*      */     }
/* 2063 */     if (s.equals("item.dyePowder"))
/*      */     {
/* 2065 */       return 0;
/*      */     }
/* 2067 */     if (s.equals("item.bone"))
/*      */     {
/* 2069 */       return 15;
/*      */     }
/* 2071 */     if (s.equals("item.sugar"))
/*      */     {
/* 2073 */       return 5;
/*      */     }
/* 2075 */     if (s.equals("item.cake"))
/*      */     {
/* 2077 */       return 300;
/*      */     }
/* 2079 */     if (s.equals("item.bed"))
/*      */     {
/* 2081 */       return 40;
/*      */     }
/* 2083 */     if (s.equals("item.diode"))
/*      */     {
/* 2085 */       return 25;
/*      */     }
/* 2087 */     if (s.equals("item.cookie"))
/*      */     {
/* 2089 */       return 100;
/*      */     }
/* 2091 */     if (s.equals("item.map"))
/*      */     {
/* 2093 */       return 575;
/*      */     }
/* 2095 */     if (s.equals("item.shears"))
/*      */     {
/* 2097 */       return 160;
/*      */     }
/* 2099 */     if (s.equals("item.melon"))
/*      */     {
/* 2101 */       return 40;
/*      */     }
/* 2103 */     if (s.equals("item.seeds_pumpkin"))
/*      */     {
/* 2105 */       return 80;
/*      */     }
/* 2107 */     if (s.equals("item.seeds_melon"))
/*      */     {
/* 2109 */       return 60;
/*      */     }
/* 2111 */     if (s.equals("item.beefRaw"))
/*      */     {
/* 2113 */       return 15;
/*      */     }
/* 2115 */     if (s.equals("item.beefCooked"))
/*      */     {
/* 2117 */       return 20;
/*      */     }
/* 2119 */     if (s.equals("item.chickenRaw"))
/*      */     {
/* 2121 */       return 5;
/*      */     }
/* 2123 */     if (s.equals("item.chickenCooked"))
/*      */     {
/* 2125 */       return 10;
/*      */     }
/* 2127 */     if (s.equals("item.rottenFlesh"))
/*      */     {
/* 2129 */       return 1;
/*      */     }
/* 2131 */     if (s.equals("item.enderPearl"))
/*      */     {
/* 2133 */       return 150;
/*      */     }
/* 2135 */     if (s.equals("item.record"))
/*      */     {
/* 2137 */       return 4000;
/*      */     }
/* 2139 */     if (s.equals("item.record"))
/*      */     {
/* 2141 */       return 4000;
/*      */     }
/* 2143 */     if (s.equals("item.coins"))
/*      */     {
/* 2145 */       return 0;
/*      */     }
/* 2147 */     if (s.equals("item.bonePick"))
/*      */     {
/* 2149 */       return 47;
/*      */     }
/* 2151 */     if (s.equals("item.boneShovel"))
/*      */     {
/* 2153 */       return 18;
/*      */     }
/* 2155 */     if (s.equals("item.boneAxe"))
/*      */     {
/* 2157 */       return 47;
/*      */     }
/* 2159 */     if (s.equals("item.boneHoe"))
/*      */     {
/* 2161 */       return 32;
/*      */     }
/* 2163 */     if (s.equals("item.boneSword"))
/*      */     {
/* 2165 */       return 32;
/*      */     }
/* 2167 */     if (s.equals("item.boneHelm"))
/*      */     {
/* 2169 */       return 75;
/*      */     }
/* 2171 */     if (s.equals("item.boneChest"))
/*      */     {
/* 2173 */       return 120;
/*      */     }
/* 2175 */     if (s.equals("item.boneLegs"))
/*      */     {
/* 2177 */       return 105;
/*      */     }
/* 2179 */     if (s.equals("item.boneBoots"))
/*      */     {
/* 2181 */       return 60;
/*      */     }
/* 2183 */     if (s.equals("item.cottonItem"))
/*      */     {
/* 2185 */       return 5;
/*      */     }
/* 2187 */     if (s.equals("item.cottonseedItem"))
/*      */     {
/* 2189 */       return 0;
/*      */     }
/* 2191 */     if (s.equals("item.wovenclothItem"))
/*      */     {
/* 2193 */       return 15;
/*      */     }
/* 2195 */     if (s.equals("item.cottonfertItem"))
/*      */     {
/* 2197 */       return 25;
/*      */     }
/* 2199 */     if (s.equals("item.cottonHelm"))
/*      */     {
/* 2201 */       return 75;
/*      */     }
/* 2203 */     if (s.equals("item.cottonChest"))
/*      */     {
/* 2205 */       return 120;
/*      */     }
/* 2207 */     if (s.equals("item.cottonLegs"))
/*      */     {
/* 2209 */       return 105;
/*      */     }
/* 2211 */     if (s.equals("item.cottonBoots"))
/*      */     {
/* 2213 */       return 60;
/*      */     }
/* 2215 */     if (s.equals("item.candleberryItem"))
/*      */     {
/* 2217 */       return 5;
/*      */     }
/* 2219 */     if (s.equals("item.candleberryseedItem"))
/*      */     {
/* 2221 */       return 0;
/*      */     }
/* 2223 */     if (s.equals("item.candlewaxItem"))
/*      */     {
/* 2225 */       return 45;
/*      */     }
/* 2227 */     if (s.equals("item.candlenutItem"))
/*      */     {
/* 2229 */       return 20;
/*      */     }
/* 2231 */     if (s.equals("item.hardenedleatherItem"))
/*      */     {
/* 2233 */       return 65;
/*      */     }
/* 2235 */     if (s.equals("item.candlefertItem"))
/*      */     {
/* 2237 */       return 25;
/*      */     }
/* 2239 */     if (s.equals("item.hardenedleatherHelm"))
/*      */     {
/* 2241 */       return 325;
/*      */     }
/* 2243 */     if (s.equals("item.hardenedleatherChest"))
/*      */     {
/* 2245 */       return 455;
/*      */     }
/* 2247 */     if (s.equals("item.hardenedleatherLegs"))
/*      */     {
/* 2249 */       return 390;
/*      */     }
/* 2251 */     if (s.equals("item.hardenedleatherBoots"))
/*      */     {
/* 2253 */       return 260;
/*      */     }
/* 2255 */     if (s.equals("item.cactusPick"))
/*      */     {
/* 2257 */       return 8;
/*      */     }
/* 2259 */     if (s.equals("item.cactusShovel"))
/*      */     {
/* 2261 */       return 4;
/*      */     }
/* 2263 */     if (s.equals("item.cactusAxe"))
/*      */     {
/* 2265 */       return 8;
/*      */     }
/* 2267 */     if (s.equals("item.cactusHoe"))
/*      */     {
/* 2269 */       return 6;
/*      */     }
/* 2271 */     if (s.equals("item.cactusSword"))
/*      */     {
/* 2273 */       return 5;
/*      */     }
/* 2275 */     if (s.equals("item.sandstonePick"))
/*      */     {
/* 2277 */       return 122;
/*      */     }
/* 2279 */     if (s.equals("item.sandstoneShovel"))
/*      */     {
/* 2281 */       return 42;
/*      */     }
/* 2283 */     if (s.equals("item.sandstoneAxe"))
/*      */     {
/* 2285 */       return 122;
/*      */     }
/* 2287 */     if (s.equals("item.sandstoneHoe"))
/*      */     {
/* 2289 */       return 82;
/*      */     }
/* 2291 */     if (s.equals("item.sandstoneSword"))
/*      */     {
/* 2293 */       return 81;
/*      */     }
/* 2295 */     if (s.equals("item.glasssteelPick"))
/*      */     {
/* 2297 */       return 317;
/*      */     }
/* 2299 */     if (s.equals("item.glasssteelShovel"))
/*      */     {
/* 2301 */       return 107;
/*      */     }
/* 2303 */     if (s.equals("item.glasssteelAxe"))
/*      */     {
/* 2305 */       return 317;
/*      */     }
/* 2307 */     if (s.equals("item.glasssteelHoe"))
/*      */     {
/* 2309 */       return 212;
/*      */     }
/* 2311 */     if (s.equals("item.glasssteelSword"))
/*      */     {
/* 2313 */       return 211;
/*      */     }
/* 2315 */     if (s.equals("item.cactusstickItem"))
/*      */     {
/* 2317 */       return 1;
/*      */     }
/* 2319 */     if (s.equals("item.glasssteelItem"))
/*      */     {
/* 2321 */       return 105;
/*      */     }
/* 2323 */     if (s.equals("item.cactusfruitItem"))
/*      */     {
/* 2325 */       return 5;
/*      */     }
/* 2327 */     if (s.equals("item.cactusfruitseedItem"))
/*      */     {
/* 2329 */       return 0;
/*      */     }
/* 2331 */     if (s.equals("item.cactusfruitfertItem"))
/*      */     {
/* 2333 */       return 25;
/*      */     }
/* 2335 */     if (s.equals("item.saltItem"))
/*      */     {
/* 2337 */       return 5;
/*      */     }
/* 2339 */     if (s.equals("item.butterItem"))
/*      */     {
/* 2341 */       return 10;
/*      */     }
/* 2343 */     if (s.equals("item.cheeseItem"))
/*      */     {
/* 2345 */       return 15;
/*      */     }
/* 2347 */     if (s.equals("item.doughItem"))
/*      */     {
/* 2349 */       return 10;
/*      */     }
/* 2351 */     if (s.equals("item.bakedpotatoItem"))
/*      */     {
/* 2353 */       return 20;
/*      */     }
/* 2355 */     if (s.equals("item.butteredpotatoItem"))
/*      */     {
/* 2357 */       return 30;
/*      */     }
/* 2359 */     if (s.equals("item.loadedpotatoItem"))
/*      */     {
/* 2361 */       return 60;
/*      */     }
/* 2363 */     if (s.equals("item.friedeggsItem"))
/*      */     {
/* 2365 */       return 40;
/*      */     }
/* 2367 */     if (s.equals("item.friedpotatoesItem"))
/*      */     {
/* 2369 */       return 30;
/*      */     }
/* 2371 */     if (s.equals("item.saladItem"))
/*      */     {
/* 2373 */       return 30;
/*      */     }
/* 2375 */     if (s.equals("item.saltedcookedfishItem"))
/*      */     {
/* 2377 */       return 40;
/*      */     }
/* 2379 */     if (s.equals("item.pumpkinpieItem"))
/*      */     {
/* 2381 */       return 30;
/*      */     }
/* 2383 */     if (s.equals("item.pizzaItem"))
/*      */     {
/* 2385 */       return 60;
/*      */     }
/* 2387 */     if (s.equals("item.spagettiItem"))
/*      */     {
/* 2389 */       return 50;
/*      */     }
/* 2391 */     if (s.equals("item.pastaItem"))
/*      */     {
/* 2393 */       return 25;
/*      */     }
/* 2395 */     if (s.equals("item.friedonionringsItem"))
/*      */     {
/* 2397 */       return 30;
/*      */     }
/* 2399 */     if (s.equals("item.applepieItem"))
/*      */     {
/* 2401 */       return 40;
/*      */     }
/* 2403 */     if (s.equals("item.applesauceItem"))
/*      */     {
/* 2405 */       return 30;
/*      */     }
/* 2407 */     if (s.equals("item.toastItem"))
/*      */     {
/* 2409 */       return 30;
/*      */     }
/* 2411 */     if (s.equals("item.grilledcheeseItem"))
/*      */     {
/* 2413 */       return 50;
/*      */     }
/* 2415 */     if (s.equals("item.bltsandwichItem"))
/*      */     {
/* 2417 */       return 70;
/*      */     }
/* 2419 */     if (s.equals("item.macncheeseItem"))
/*      */     {
/* 2421 */       return 40;
/*      */     }
/* 2423 */     if (s.equals("item.fishsticksItem"))
/*      */     {
/* 2425 */       return 50;
/*      */     }
/* 2427 */     if (s.equals("item.mashedpotatoesItem"))
/*      */     {
/* 2429 */       return 40;
/*      */     }
/* 2431 */     if (s.equals("item.fishsandwichItem"))
/*      */     {
/* 2433 */       return 50;
/*      */     }
/* 2435 */     if (s.equals("item.cerealItem"))
/*      */     {
/* 2437 */       return 30;
/*      */     }
/* 2439 */     if (s.equals("item.popcornitem"))
/*      */     {
/* 2441 */       return 20;
/*      */     }
/* 2443 */     if (s.equals("item.butteredpopcornItem"))
/*      */     {
/* 2445 */       return 30;
/*      */     }
/* 2447 */     if (s.equals("item.cornonthecobItem"))
/*      */     {
/* 2449 */       return 30;
/*      */     }
/* 2451 */     if (s.equals("item.saltedpeanutsItem"))
/*      */     {
/* 2453 */       return 20;
/*      */     }
/* 2455 */     if (s.equals("item.pbnjsandwichItem"))
/*      */     {
/* 2457 */       return 50;
/*      */     }
/* 2459 */     if (s.equals("item.raisinsItem"))
/*      */     {
/* 2461 */       return 20;
/*      */     }
/* 2463 */     if (s.equals("item.cornbreadmuffinsItem"))
/*      */     {
/* 2465 */       return 30;
/*      */     }
/* 2467 */     if (s.equals("item.tacoItem"))
/*      */     {
/* 2469 */       return 60;
/*      */     }
/* 2471 */     if (s.equals("item.nachosItem"))
/*      */     {
/* 2473 */       return 30;
/*      */     }
/* 2475 */     if (s.equals("item.strawberrypieItem"))
/*      */     {
/* 2477 */       return 40;
/*      */     }
/* 2479 */     if (s.equals("item.peanutbrittleItem"))
/*      */     {
/* 2481 */       return 30;
/*      */     }
/* 2483 */     if (s.equals("item.chocolatebarItem"))
/*      */     {
/* 2485 */       return 20;
/*      */     }
/* 2487 */     if (s.equals("item.driedappleslicesItem"))
/*      */     {
/* 2489 */       return 30;
/*      */     }
/* 2491 */     if (s.equals("item.driedstrawberriesItem"))
/*      */     {
/* 2493 */       return 20;
/*      */     }
/* 2495 */     if (s.equals("item.trailmixItem"))
/*      */     {
/* 2497 */       return 50;
/*      */     }
/* 2499 */     if (s.equals("item.icecreamItem"))
/*      */     {
/* 2501 */       return 20;
/*      */     }
/* 2503 */     if (s.equals("item.chocolateicecreamItem"))
/*      */     {
/* 2505 */       return 30;
/*      */     }
/* 2507 */     if (s.equals("item.strawberryicecreamItem"))
/*      */     {
/* 2509 */       return 30;
/*      */     }
/* 2511 */     if (s.equals("item.picklesItem"))
/*      */     {
/* 2513 */       return 30;
/*      */     }
/* 2515 */     if (s.equals("item.chocolatecoveredfruitItem"))
/*      */     {
/* 2517 */       return 30;
/*      */     }
/* 2519 */     if (s.equals("item.flourItem"))
/*      */     {
/* 2521 */       return 5;
/*      */     }
/* 2523 */     if (s.equals("item.cornmealdoughItem"))
/*      */     {
/* 2525 */       return 20;
/*      */     }
/* 2527 */     if (s.equals("item.cornmuffinmixItem"))
/*      */     {
/* 2529 */       return 20;
/*      */     }
/* 2531 */     if (s.equals("item.tortillaItem"))
/*      */     {
/* 2533 */       return 20;
/*      */     }
/* 2535 */     if (s.equals("item.bottleItem"))
/*      */     {
/* 2537 */       return 15;
/*      */     }
/* 2539 */     if (s.equals("item.mayoItem"))
/*      */     {
/* 2541 */       return 20;
/*      */     }
/* 2543 */     if (s.equals("item.vinegarItem"))
/*      */     {
/* 2545 */       return 25;
/*      */     }
/* 2547 */     if (s.equals("item.peanutbutterItem"))
/*      */     {
/* 2549 */       return 20;
/*      */     }
/* 2551 */     if (s.equals("item.grapejellyItem"))
/*      */     {
/* 2553 */       return 25;
/*      */     }
/* 2555 */     if (s.equals("item.strawberryjamItem"))
/*      */     {
/* 2557 */       return 25;
/*      */     }
/* 2559 */     if (s.equals("item.stockItem"))
/*      */     {
/* 2561 */       return 15;
/*      */     }
/* 2563 */     if (s.equals("item.noodlesoupItem"))
/*      */     {
/* 2565 */       return 20;
/*      */     }
/* 2567 */     if (s.equals("item.hambonesoupItem"))
/*      */     {
/* 2569 */       return 40;
/*      */     }
/* 2571 */     if (s.equals("item.cheesesoupItem"))
/*      */     {
/* 2573 */       return 40;
/*      */     }
/* 2575 */     if (s.equals("item.vegetablesoupItem"))
/*      */     {
/* 2577 */       return 40;
/*      */     }
/* 2579 */     if (s.equals("item.onionsoupItem"))
/*      */     {
/* 2581 */       return 40;
/*      */     }
/* 2583 */     if (s.equals("item.peanutsoupItem"))
/*      */     {
/* 2585 */       return 40;
/*      */     }
/* 2587 */     if (s.equals("item.cucumbersoupItem"))
/*      */     {
/* 2589 */       return 40;
/*      */     }
/* 2591 */     if (s.equals("item.carrotsoupItem"))
/*      */     {
/* 2593 */       return 40;
/*      */     }
/* 2595 */     if (s.equals("item.pumpkinsoupItem"))
/*      */     {
/* 2597 */       return 40;
/*      */     }
/* 2599 */     if (s.equals("item.wheatsoupItem"))
/*      */     {
/* 2601 */       return 40;
/*      */     }
/* 2603 */     if (s.equals("item.potatosoupItem"))
/*      */     {
/* 2605 */       return 40;
/*      */     }
/* 2607 */     if (s.equals("item.oatmealItem"))
/*      */     {
/* 2609 */       return 30;
/*      */     }
/* 2611 */     if (s.equals("item.friedpicklesItem"))
/*      */     {
/* 2613 */       return 40;
/*      */     }
/* 2615 */     if (s.equals("item.shepardpieItem"))
/*      */     {
/* 2617 */       return 70;
/*      */     }
/* 2619 */     if (s.equals("item.strawberryiceItem"))
/*      */     {
/* 2621 */       return 20;
/*      */     }
/* 2623 */     if (s.equals("item.sidesaladItem"))
/*      */     {
/* 2625 */       return 80;
/*      */     }
/* 2627 */     if (s.equals("item.breakfastsandwichItem"))
/*      */     {
/* 2629 */       return 70;
/*      */     }
/* 2631 */     if (s.equals("item.coleslawItem"))
/*      */     {
/* 2633 */       return 40;
/*      */     }
/* 2635 */     if (s.equals("item.fishlettucewrapItem"))
/*      */     {
/* 2637 */       return 40;
/*      */     }
/* 2639 */     if (s.equals("item.fishtacoItem"))
/*      */     {
/* 2641 */       return 50;
/*      */     }
/* 2643 */     if (s.equals("item.porklettucewrapItem"))
/*      */     {
/* 2645 */       return 60;
/*      */     }
/* 2647 */     if (s.equals("item.pastasaladItem"))
/*      */     {
/* 2649 */       return 50;
/*      */     }
/* 2651 */     if (s.equals("item.potatosaladItem"))
/*      */     {
/* 2653 */       return 40;
/*      */     }
/* 2655 */     if (s.equals("item.chocolatepeanutsItem"))
/*      */     {
/* 2657 */       return 10;
/*      */     }
/* 2659 */     if (s.equals("item.pumpkinbreadItem"))
/*      */     {
/* 2661 */       return 30;
/*      */     }
/* 2663 */     if (s.equals("item.scrambledeggsItem"))
/*      */     {
/* 2665 */       return 20;
/*      */     }
/* 2667 */     if (s.equals("item.omeletItem"))
/*      */     {
/* 2669 */       return 40;
/*      */     }
/* 2671 */     if (s.equals("item.sushiItem"))
/*      */     {
/* 2673 */       return 20;
/*      */     }
/* 2675 */     if (s.equals("item.porkfriedriceItem"))
/*      */     {
/* 2677 */       return 50;
/*      */     }
/* 2679 */     if (s.equals("item.fiestariceItem"))
/*      */     {
/* 2681 */       return 30;
/*      */     }
/* 2683 */     if (s.equals("item.stuffedpepperItem"))
/*      */     {
/* 2685 */       return 40;
/*      */     }
/* 2687 */     if (s.equals("item.beansandriceItem"))
/*      */     {
/* 2689 */       return 60;
/*      */     }
/* 2691 */     if (s.equals("item.ricecakeItem"))
/*      */     {
/* 2693 */       return 20;
/*      */     }
/* 2695 */     if (s.equals("item.beanburritoItem"))
/*      */     {
/* 2697 */       return 40;
/*      */     }
/* 2699 */     if (s.equals("item.chiliItem"))
/*      */     {
/* 2701 */       return 60;
/*      */     }
/* 2703 */     if (s.equals("item.bakedbeansItem"))
/*      */     {
/* 2705 */       return 50;
/*      */     }
/* 2707 */     if (s.equals("item.supremepizzaItem"))
/*      */     {
/* 2709 */       return 70;
/*      */     }
/* 2711 */     if (s.equals("item.ricesoupItem"))
/*      */     {
/* 2713 */       return 30;
/*      */     }
/* 2715 */     if (s.equals("item.veggiestirfryItem"))
/*      */     {
/* 2717 */       return 70;
/*      */     }
/* 2719 */     if (s.equals("item.carrotpilafItem"))
/*      */     {
/* 2721 */       return 40;
/*      */     }
/* 2723 */     if (s.equals("item.cornricemedleyItem"))
/*      */     {
/* 2725 */       return 40;
/*      */     }
/* 2727 */     if (s.equals("item.mushroomrisottoItem"))
/*      */     {
/* 2729 */       return 40;
/*      */     }
/* 2731 */     if (s.equals("item.refriedbeansItem"))
/*      */     {
/* 2733 */       return 40;
/*      */     }
/* 2735 */     if (s.equals("item.batterItem"))
/*      */     {
/* 2737 */       return 20;
/*      */     }
/* 2739 */     if (s.equals("item.syrupItem"))
/*      */     {
/* 2741 */       return 20;
/*      */     }
/* 2743 */     if (s.equals("item.berrysyrupItem"))
/*      */     {
/* 2745 */       return 20;
/*      */     }
/* 2747 */     if (s.equals("item.wafflesItem"))
/*      */     {
/* 2749 */       return 30;
/*      */     }
/* 2751 */     if (s.equals("item.fancywafflesItem"))
/*      */     {
/* 2753 */       return 50;
/*      */     }
/* 2755 */     if (s.equals("item.pancakesItem"))
/*      */     {
/* 2757 */       return 30;
/*      */     }
/* 2759 */     if (s.equals("item.fancypancakesItem"))
/*      */     {
/* 2761 */       return 50;
/*      */     }
/* 2763 */     if (s.equals("item.frenchtoastItem"))
/*      */     {
/* 2765 */       return 40;
/*      */     }
/* 2767 */     if (s.equals("item.berrysaladItem"))
/*      */     {
/* 2769 */       return 70;
/*      */     }
/* 2771 */     if (s.equals("item.blueberrymuffinsItem"))
/*      */     {
/* 2773 */       return 40;
/*      */     }
/* 2775 */     if (s.equals("item.raspberrytartItem"))
/*      */     {
/* 2777 */       return 40;
/*      */     }
/* 2779 */     if (s.equals("item.blackberrycobblerItem"))
/*      */     {
/* 2781 */       return 40;
/*      */     }
/* 2783 */     if (s.equals("item.peachcobblerItem"))
/*      */     {
/* 2785 */       return 40;
/*      */     }
/* 2787 */     if (s.equals("item.cherrypieItem"))
/*      */     {
/* 2789 */       return 40;
/*      */     }
/* 2791 */     if (s.equals("item.lemonpieItem"))
/*      */     {
/* 2793 */       return 40;
/*      */     }
/* 2795 */     if (s.equals("item.bananasplitItem"))
/*      */     {
/* 2797 */       return 70;
/*      */     }
/* 2799 */     if (s.equals("item.toastedcoconutItem"))
/*      */     {
/* 2801 */       return 20;
/*      */     }
/* 2803 */     if (s.equals("item.fruitsaladItem"))
/*      */     {
/* 2805 */       return 80;
/*      */     }
/* 2807 */     if (s.equals("item.fruitjuiceItem"))
/*      */     {
/* 2809 */       return 30;
/*      */     }
/* 2811 */     if (s.equals("item.lemonaideItem"))
/*      */     {
/* 2813 */       return 40;
/*      */     }
/* 2815 */     if (s.equals("item.friedeggplantItem"))
/*      */     {
/* 2817 */       return 20;
/*      */     }
/* 2819 */     if (s.equals("item.eggplantparmItem"))
/*      */     {
/* 2821 */       return 40;
/*      */     }
/* 2823 */     if (s.equals("item.stuffedeggplantItem"))
/*      */     {
/* 2825 */       return 60;
/*      */     }
/* 2827 */     if (s.equals("item.teaItem"))
/*      */     {
/* 2829 */       return 20;
/*      */     }
/* 2831 */     if (s.equals("item.raspberryicedteaItem"))
/*      */     {
/* 2833 */       return 40;
/*      */     }
/* 2835 */     if (s.equals("item.chaiteaItem"))
/*      */     {
/* 2837 */       return 30;
/*      */     }
/* 2839 */     if (s.equals("item.coffeeItem"))
/*      */     {
/* 2841 */       return 20;
/*      */     }
/* 2843 */     if (s.equals("item.mochaicecreamItem"))
/*      */     {
/* 2845 */       return 40;
/*      */     }
/* 2847 */     if (s.equals("item.espressoItem"))
/*      */     {
/* 2849 */       return 40;
/*      */     }
/* 2851 */     if (s.equals("item.pickledbeetsItem"))
/*      */     {
/* 2853 */       return 30;
/*      */     }
/* 2855 */     if (s.equals("item.beetsaladItem"))
/*      */     {
/* 2857 */       return 50;
/*      */     }
/* 2859 */     if (s.equals("item.beetsoupItem"))
/*      */     {
/* 2861 */       return 40;
/*      */     }
/* 2863 */     if (s.equals("item.broccolimacItem"))
/*      */     {
/* 2865 */       return 50;
/*      */     }
/* 2867 */     if (s.equals("item.broccolindipItem"))
/*      */     {
/* 2869 */       return 30;
/*      */     }
/* 2871 */     if (s.equals("item.creamedbroccolisoupItem"))
/*      */     {
/* 2873 */       return 40;
/*      */     }
/* 2875 */     if (s.equals("item.grilledsweetpotatoItem"))
/*      */     {
/* 2877 */       return 20;
/*      */     }
/* 2879 */     if (s.equals("item.sweetpotatopieItem"))
/*      */     {
/* 2881 */       return 50;
/*      */     }
/* 2883 */     if (s.equals("item.candiedsweetpotatoesItem"))
/*      */     {
/* 2885 */       return 30;
/*      */     }
/* 2887 */     if (s.equals("item.marshmellowsItem"))
/*      */     {
/* 2889 */       return 20;
/*      */     }
/* 2891 */     if (s.equals("item.splitpeasoupItem"))
/*      */     {
/* 2893 */       return 40;
/*      */     }
/* 2895 */     if (s.equals("item.pineapplehamItem"))
/*      */     {
/* 2897 */       return 50;
/*      */     }
/* 2899 */     if (s.equals("item.turnipsoupItem"))
/*      */     {
/* 2901 */       return 40;
/*      */     }
/* 2903 */     if (s.equals("item.banananutbreadItem"))
/*      */     {
/* 2905 */       return 40;
/*      */     }
/* 2907 */     if (s.equals("item.breadedchickenItem"))
/*      */     {
/* 2909 */       return 30;
/*      */     }
/* 2911 */     if (s.equals("item.chickenparmItem"))
/*      */     {
/* 2913 */       return 50;
/*      */     }
/* 2915 */     if (s.equals("item.chickensandwichItem"))
/*      */     {
/* 2917 */       return 60;
/*      */     }
/* 2919 */     if (s.equals("item.chickennoodlesoupItem"))
/*      */     {
/* 2921 */       return 60;
/*      */     }
/* 2923 */     if (s.equals("item.hamburgerItem"))
/*      */     {
/* 2925 */       return 60;
/*      */     }
/* 2927 */     if (s.equals("item.cheeseburgerItem"))
/*      */     {
/* 2929 */       return 70;
/*      */     }
/* 2931 */     if (s.equals("item.baconcheeseburgerItem"))
/*      */     {
/* 2933 */       return 80;
/*      */     }
/* 2935 */     if (s.equals("item.spagettiandmeatballsItem"))
/*      */     {
/* 2937 */       return 70;
/*      */     }
/* 2939 */     if (s.equals("item.curryriceItem"))
/*      */     {
/* 2941 */       return 30;
/*      */     }
/* 2943 */     if (s.equals("item.donutItem"))
/*      */     {
/* 2945 */       return 20;
/*      */     }
/* 2947 */     if (s.equals("item.chocolatedonutItem"))
/*      */     {
/* 2949 */       return 40;
/*      */     }
/* 2951 */     if (s.equals("item.powdereddonutItem"))
/*      */     {
/* 2953 */       return 30;
/*      */     }
/* 2955 */     if (s.equals("item.jellydonutItem"))
/*      */     {
/* 2957 */       return 40;
/*      */     }
/* 2959 */     if (s.equals("item.frosteddonutItem"))
/*      */     {
/* 2961 */       return 40;
/*      */     }
/* 2963 */     if (s.equals("item.seedsoupItem"))
/*      */     {
/* 2965 */       return 1;
/*      */     }
/* 2967 */     if (s.equals("item.oliveoilItem"))
/*      */     {
/* 2969 */       return 20;
/*      */     }
/* 2971 */     if (s.equals("item.tomatoseedItem"))
/*      */     {
/* 2973 */       return 0;
/*      */     }
/* 2975 */     if (s.equals("item.potatoseedItem"))
/*      */     {
/* 2977 */       return 0;
/*      */     }
/* 2979 */     if (s.equals("item.lettuceseedItem"))
/*      */     {
/* 2981 */       return 0;
/*      */     }
/* 2983 */     if (s.equals("item.onionseedItem"))
/*      */     {
/* 2985 */       return 0;
/*      */     }
/* 2987 */     if (s.equals("item.carrotseedItem"))
/*      */     {
/* 2989 */       return 0;
/*      */     }
/* 2991 */     if (s.equals("item.cornseedItem"))
/*      */     {
/* 2993 */       return 0;
/*      */     }
/* 2995 */     if (s.equals("item.strawberryseedItem"))
/*      */     {
/* 2997 */       return 0;
/*      */     }
/* 2999 */     if (s.equals("item.grapeseedItem"))
/*      */     {
/* 3001 */       return 0;
/*      */     }
/* 3003 */     if (s.equals("item.peanutseedItem"))
/*      */     {
/* 3005 */       return 0;
/*      */     }
/* 3007 */     if (s.equals("item.cucumberseedItem"))
/*      */     {
/* 3009 */       return 0;
/*      */     }
/* 3011 */     if (s.equals("item.spiceseedItem"))
/*      */     {
/* 3013 */       return 0;
/*      */     }
/* 3015 */     if (s.equals("item.riceseedItem"))
/*      */     {
/* 3017 */       return 0;
/*      */     }
/* 3019 */     if (s.equals("item.beansseedItem"))
/*      */     {
/* 3021 */       return 0;
/*      */     }
/* 3023 */     if (s.equals("item.bellpepperseedItem"))
/*      */     {
/* 3025 */       return 0;
/*      */     }
/* 3027 */     if (s.equals("item.eggplantseedItem"))
/*      */     {
/* 3029 */       return 0;
/*      */     }
/* 3031 */     if (s.equals("item.teaseedItem"))
/*      */     {
/* 3033 */       return 0;
/*      */     }
/* 3035 */     if (s.equals("item.coffeeseedItem"))
/*      */     {
/* 3037 */       return 0;
/*      */     }
/* 3039 */     if (s.equals("item.beetseedItem"))
/*      */     {
/* 3041 */       return 0;
/*      */     }
/* 3043 */     if (s.equals("item.broccoliseedItem"))
/*      */     {
/* 3045 */       return 0;
/*      */     }
/* 3047 */     if (s.equals("item.sweetpotatoseedItem"))
/*      */     {
/* 3049 */       return 0;
/*      */     }
/* 3051 */     if (s.equals("item.peasseedItem"))
/*      */     {
/* 3053 */       return 0;
/*      */     }
/* 3055 */     if (s.equals("item.pineappleseedItem"))
/*      */     {
/* 3057 */       return 0;
/*      */     }
/* 3059 */     if (s.equals("item.turnipseedItem"))
/*      */     {
/* 3061 */       return 0;
/*      */     }
/* 3063 */     if (s.equals("item.blueberryseedItem"))
/*      */     {
/* 3065 */       return 0;
/*      */     }
/* 3067 */     if (s.equals("item.blackberryseedItem"))
/*      */     {
/* 3069 */       return 0;
/*      */     }
/* 3071 */     if (s.equals("item.raspberryseedItem"))
/*      */     {
/* 3073 */       return 0;
/*      */     }
/* 3075 */     if (s.equals("item.kiwiseedItem"))
/*      */     {
/* 3077 */       return 0;
/*      */     }
/* 3079 */     if (s.equals("item.tomatoItem"))
/*      */     {
/* 3081 */       return 5;
/*      */     }
/* 3083 */     if (s.equals("item.potatoItem"))
/*      */     {
/* 3085 */       return 5;
/*      */     }
/* 3087 */     if (s.equals("item.lettuceItem"))
/*      */     {
/* 3089 */       return 5;
/*      */     }
/* 3091 */     if (s.equals("item.onionItem"))
/*      */     {
/* 3093 */       return 5;
/*      */     }
/* 3095 */     if (s.equals("item.carrotItem"))
/*      */     {
/* 3097 */       return 5;
/*      */     }
/* 3099 */     if (s.equals("item.cornItem"))
/*      */     {
/* 3101 */       return 5;
/*      */     }
/* 3103 */     if (s.equals("item.strawberryItem"))
/*      */     {
/* 3105 */       return 5;
/*      */     }
/* 3107 */     if (s.equals("item.grapeItem"))
/*      */     {
/* 3109 */       return 5;
/*      */     }
/* 3111 */     if (s.equals("item.peanutItem"))
/*      */     {
/* 3113 */       return 5;
/*      */     }
/* 3115 */     if (s.equals("item.cucumberItem"))
/*      */     {
/* 3117 */       return 5;
/*      */     }
/* 3119 */     if (s.equals("item.peppercornItem"))
/*      */     {
/* 3121 */       return 5;
/*      */     }
/* 3123 */     if (s.equals("item.riceItem"))
/*      */     {
/* 3125 */       return 5;
/*      */     }
/* 3127 */     if (s.equals("item.beansItem"))
/*      */     {
/* 3129 */       return 5;
/*      */     }
/* 3131 */     if (s.equals("item.bellpepperItem"))
/*      */     {
/* 3133 */       return 5;
/*      */     }
/* 3135 */     if (s.equals("item.eggplantItem"))
/*      */     {
/* 3137 */       return 5;
/*      */     }
/* 3139 */     if (s.equals("item.tealeafItem"))
/*      */     {
/* 3141 */       return 5;
/*      */     }
/* 3143 */     if (s.equals("item.coffeebeanItem"))
/*      */     {
/* 3145 */       return 5;
/*      */     }
/* 3147 */     if (s.equals("item.beetItem"))
/*      */     {
/* 3149 */       return 5;
/*      */     }
/* 3151 */     if (s.equals("item.broccoliItem"))
/*      */     {
/* 3153 */       return 5;
/*      */     }
/* 3155 */     if (s.equals("item.sweetpotatoItem"))
/*      */     {
/* 3157 */       return 5;
/*      */     }
/* 3159 */     if (s.equals("item.peasItem"))
/*      */     {
/* 3161 */       return 5;
/*      */     }
/* 3163 */     if (s.equals("item.pineappleItem"))
/*      */     {
/* 3165 */       return 5;
/*      */     }
/* 3167 */     if (s.equals("item.turnipItem"))
/*      */     {
/* 3169 */       return 5;
/*      */     }
/* 3171 */     if (s.equals("item.bananaItem"))
/*      */     {
/* 3173 */       return 20;
/*      */     }
/* 3175 */     if (s.equals("item.cherryItem"))
/*      */     {
/* 3177 */       return 20;
/*      */     }
/* 3179 */     if (s.equals("item.coconutItem"))
/*      */     {
/* 3181 */       return 20;
/*      */     }
/* 3183 */     if (s.equals("item.lemonItem"))
/*      */     {
/* 3185 */       return 20;
/*      */     }
/* 3187 */     if (s.equals("item.orangeItem"))
/*      */     {
/* 3189 */       return 20;
/*      */     }
/* 3191 */     if (s.equals("item.peachItem"))
/*      */     {
/* 3193 */       return 20;
/*      */     }
/* 3195 */     if (s.equals("item.limeItem"))
/*      */     {
/* 3197 */       return 20;
/*      */     }
/* 3199 */     if (s.equals("item.mangoItem"))
/*      */     {
/* 3201 */       return 20;
/*      */     }
/* 3203 */     if (s.equals("item.walnutItem"))
/*      */     {
/* 3205 */       return 20;
/*      */     }
/* 3207 */     if (s.equals("item.pearItem"))
/*      */     {
/* 3209 */       return 20;
/*      */     }
/* 3211 */     if (s.equals("item.plumItem"))
/*      */     {
/* 3213 */       return 20;
/*      */     }
/* 3215 */     if (s.equals("item.oliveItem"))
/*      */     {
/* 3217 */       return 20;
/*      */     }
/* 3219 */     if (s.equals("item.cinnamonItem"))
/*      */     {
/* 3221 */       return 20;
/*      */     }
/* 3223 */     if (s.equals("item.cocoabeanpodItem"))
/*      */     {
/* 3225 */       return 20;
/*      */     }
/* 3227 */     if (s.equals("item.blueberryItem"))
/*      */     {
/* 3229 */       return 5;
/*      */     }
/* 3231 */     if (s.equals("item.blackberryItem"))
/*      */     {
/* 3233 */       return 5;
/*      */     }
/* 3235 */     if (s.equals("item.raspberryItem"))
/*      */     {
/* 3237 */       return 5;
/*      */     }
/* 3239 */     if (s.equals("item.kiwiItem"))
/*      */     {
/* 3241 */       return 5;
/*      */     }
/* 3243 */     if (s.equals("item.tinoreItem"))
/*      */     {
/* 3245 */       return 20;
/*      */     }
/* 3247 */     if (s.equals("item.copperoreItem"))
/*      */     {
/* 3249 */       return 20;
/*      */     }
/* 3251 */     if (s.equals("item.silveroreItem"))
/*      */     {
/* 3253 */       return 80;
/*      */     }
/* 3255 */     if (s.equals("item.cobaltoreItem"))
/*      */     {
/* 3257 */       return 100;
/*      */     }
/* 3259 */     if (s.equals("item.platinumoreItem"))
/*      */     {
/* 3261 */       return 300;
/*      */     }
/* 3263 */     if (s.equals("item.titaniumoreItem"))
/*      */     {
/* 3265 */       return 300;
/*      */     }
/* 3267 */     if (s.equals("item.mithriloreItem"))
/*      */     {
/* 3269 */       return 400;
/*      */     }
/* 3271 */     if (s.equals("item.quartzgemItem"))
/*      */     {
/* 3273 */       return 30;
/*      */     }
/* 3275 */     if (s.equals("item.citrinegemItem"))
/*      */     {
/* 3277 */       return 30;
/*      */     }
/* 3279 */     if (s.equals("item.tanzanitegemItem"))
/*      */     {
/* 3281 */       return 30;
/*      */     }
/* 3283 */     if (s.equals("item.sapphiregemItem"))
/*      */     {
/* 3285 */       return 30;
/*      */     }
/* 3287 */     if (s.equals("item.topazgemItem"))
/*      */     {
/* 3289 */       return 30;
/*      */     }
/* 3291 */     if (s.equals("item.agategemItem"))
/*      */     {
/* 3293 */       return 30;
/*      */     }
/* 3295 */     if (s.equals("item.garnetgemItem"))
/*      */     {
/* 3297 */       return 30;
/*      */     }
/* 3299 */     if (s.equals("item.hematitegemItem"))
/*      */     {
/* 3301 */       return 30;
/*      */     }
/* 3303 */     if (s.equals("item.moonstonegemItem"))
/*      */     {
/* 3305 */       return 30;
/*      */     }
/* 3307 */     if (s.equals("item.aquamarinegemItem"))
/*      */     {
/* 3309 */       return 30;
/*      */     }
/* 3311 */     if (s.equals("item.amethystgemItem"))
/*      */     {
/* 3313 */       return 30;
/*      */     }
/* 3315 */     if (s.equals("item.tigerseyegemItem"))
/*      */     {
/* 3317 */       return 30;
/*      */     }
/* 3319 */     if (s.equals("item.emeraldgemItem"))
/*      */     {
/* 3321 */       return 30;
/*      */     }
/* 3323 */     if (s.equals("item.rubygemItem"))
/*      */     {
/* 3325 */       return 30;
/*      */     }
/* 3327 */     if (s.equals("item.onyxgemItem"))
/*      */     {
/* 3329 */       return 30;
/*      */     }
/* 3331 */     if (s.equals("item.tiningotItem"))
/*      */     {
/* 3333 */       return 25;
/*      */     }
/* 3335 */     if (s.equals("item.copperingotItem"))
/*      */     {
/* 3337 */       return 25;
/*      */     }
/* 3339 */     if (s.equals("item.silveringotItem"))
/*      */     {
/* 3341 */       return 85;
/*      */     }
/* 3343 */     if (s.equals("item.cobaltingotItem"))
/*      */     {
/* 3345 */       return 105;
/*      */     }
/* 3347 */     if (s.equals("item.platinumingotItem"))
/*      */     {
/* 3349 */       return 305;
/*      */     }
/* 3351 */     if (s.equals("item.titaniumingotItem"))
/*      */     {
/* 3353 */       return 305;
/*      */     }
/* 3355 */     if (s.equals("item.mithrilingotItem"))
/*      */     {
/* 3357 */       return 405;
/*      */     }
/* 3359 */     if (s.equals("item.bronzealloyItem"))
/*      */     {
/* 3361 */       return 50;
/*      */     }
/* 3363 */     if (s.equals("item.steelalloyItem"))
/*      */     {
/* 3365 */       return 220;
/*      */     }
/* 3367 */     if (s.equals("item.bronzeingotItem"))
/*      */     {
/* 3369 */       return 55;
/*      */     }
/* 3371 */     if (s.equals("item.steelingotItem"))
/*      */     {
/* 3373 */       return 225;
/*      */     }
/* 3375 */     if (s.equals("item.copperPick"))
/*      */     {
/* 3377 */       return 77;
/*      */     }
/* 3379 */     if (s.equals("item.copperShovel"))
/*      */     {
/* 3381 */       return 27;
/*      */     }
/* 3383 */     if (s.equals("item.copperAxe"))
/*      */     {
/* 3385 */       return 77;
/*      */     }
/* 3387 */     if (s.equals("item.copperHoe"))
/*      */     {
/* 3389 */       return 52;
/*      */     }
/* 3391 */     if (s.equals("item.copperSword"))
/*      */     {
/* 3393 */       return 51;
/*      */     }
/* 3395 */     if (s.equals("item.copperHelm"))
/*      */     {
/* 3397 */       return 125;
/*      */     }
/* 3399 */     if (s.equals("item.copperChest"))
/*      */     {
/* 3401 */       return 200;
/*      */     }
/* 3403 */     if (s.equals("item.copperLegs"))
/*      */     {
/* 3405 */       return 175;
/*      */     }
/* 3407 */     if (s.equals("item.copperBoots"))
/*      */     {
/* 3409 */       return 100;
/*      */     }
/* 3411 */     if (s.equals("item.tinPick"))
/*      */     {
/* 3413 */       return 77;
/*      */     }
/* 3415 */     if (s.equals("item.tinShovel"))
/*      */     {
/* 3417 */       return 27;
/*      */     }
/* 3419 */     if (s.equals("item.tinAxe"))
/*      */     {
/* 3421 */       return 77;
/*      */     }
/* 3423 */     if (s.equals("item.tinHoe"))
/*      */     {
/* 3425 */       return 52;
/*      */     }
/* 3427 */     if (s.equals("item.tinSword"))
/*      */     {
/* 3429 */       return 51;
/*      */     }
/* 3431 */     if (s.equals("item.tinHelm"))
/*      */     {
/* 3433 */       return 125;
/*      */     }
/* 3435 */     if (s.equals("item.tinChest"))
/*      */     {
/* 3437 */       return 200;
/*      */     }
/* 3439 */     if (s.equals("item.tinLegs"))
/*      */     {
/* 3441 */       return 175;
/*      */     }
/* 3443 */     if (s.equals("item.tinBoots"))
/*      */     {
/* 3445 */       return 100;
/*      */     }
/* 3447 */     if (s.equals("item.bronzePick"))
/*      */     {
/* 3449 */       return 167;
/*      */     }
/* 3451 */     if (s.equals("item.bronzeShovel"))
/*      */     {
/* 3453 */       return 57;
/*      */     }
/* 3455 */     if (s.equals("item.bronzeAxe"))
/*      */     {
/* 3457 */       return 167;
/*      */     }
/* 3459 */     if (s.equals("item.bronzeHoe"))
/*      */     {
/* 3461 */       return 112;
/*      */     }
/* 3463 */     if (s.equals("item.bronzeSword"))
/*      */     {
/* 3465 */       return 111;
/*      */     }
/* 3467 */     if (s.equals("item.bronzeHelm"))
/*      */     {
/* 3469 */       return 275;
/*      */     }
/* 3471 */     if (s.equals("item.bronzeChest"))
/*      */     {
/* 3473 */       return 440;
/*      */     }
/* 3475 */     if (s.equals("item.bronzeLegs"))
/*      */     {
/* 3477 */       return 385;
/*      */     }
/* 3479 */     if (s.equals("item.bronzeBoots"))
/*      */     {
/* 3481 */       return 220;
/*      */     }
/* 3483 */     if (s.equals("item.silverPick"))
/*      */     {
/* 3485 */       return 257;
/*      */     }
/* 3487 */     if (s.equals("item.silverShovel"))
/*      */     {
/* 3489 */       return 87;
/*      */     }
/* 3491 */     if (s.equals("item.silverAxe"))
/*      */     {
/* 3493 */       return 257;
/*      */     }
/* 3495 */     if (s.equals("item.silverHoe"))
/*      */     {
/* 3497 */       return 172;
/*      */     }
/* 3499 */     if (s.equals("item.silverSword"))
/*      */     {
/* 3501 */       return 171;
/*      */     }
/* 3503 */     if (s.equals("item.silverHelm"))
/*      */     {
/* 3505 */       return 425;
/*      */     }
/* 3507 */     if (s.equals("item.silverChest"))
/*      */     {
/* 3509 */       return 680;
/*      */     }
/* 3511 */     if (s.equals("item.silverLegs"))
/*      */     {
/* 3513 */       return 595;
/*      */     }
/* 3515 */     if (s.equals("item.silverBoots"))
/*      */     {
/* 3517 */       return 340;
/*      */     }
/* 3519 */     if (s.equals("item.cobaltPick"))
/*      */     {
/* 3521 */       return 317;
/*      */     }
/* 3523 */     if (s.equals("item.cobaltShovel"))
/*      */     {
/* 3525 */       return 107;
/*      */     }
/* 3527 */     if (s.equals("item.cobaltAxe"))
/*      */     {
/* 3529 */       return 317;
/*      */     }
/* 3531 */     if (s.equals("item.cobaltHoe"))
/*      */     {
/* 3533 */       return 212;
/*      */     }
/* 3535 */     if (s.equals("item.cobaltSword"))
/*      */     {
/* 3537 */       return 211;
/*      */     }
/* 3539 */     if (s.equals("item.cobaltHelm"))
/*      */     {
/* 3541 */       return 525;
/*      */     }
/* 3543 */     if (s.equals("item.cobaltChest"))
/*      */     {
/* 3545 */       return 840;
/*      */     }
/* 3547 */     if (s.equals("item.cobaltLegs"))
/*      */     {
/* 3549 */       return 735;
/*      */     }
/* 3551 */     if (s.equals("item.cobaltBoots"))
/*      */     {
/* 3553 */       return 420;
/*      */     }
/* 3555 */     if (s.equals("item.steelPick"))
/*      */     {
/* 3557 */       return 677;
/*      */     }
/* 3559 */     if (s.equals("item.steelShovel"))
/*      */     {
/* 3561 */       return 257;
/*      */     }
/* 3563 */     if (s.equals("item.steelAxe"))
/*      */     {
/* 3565 */       return 677;
/*      */     }
/* 3567 */     if (s.equals("item.steelHoe"))
/*      */     {
/* 3569 */       return 512;
/*      */     }
/* 3571 */     if (s.equals("item.steelSword"))
/*      */     {
/* 3573 */       return 511;
/*      */     }
/* 3575 */     if (s.equals("item.steelHelm"))
/*      */     {
/* 3577 */       return 1275;
/*      */     }
/* 3579 */     if (s.equals("item.steelChest"))
/*      */     {
/* 3581 */       return 1800;
/*      */     }
/* 3583 */     if (s.equals("item.steelLegs"))
/*      */     {
/* 3585 */       return 1575;
/*      */     }
/* 3587 */     if (s.equals("item.steelBoots"))
/*      */     {
/* 3589 */       return 900;
/*      */     }
/* 3591 */     if (s.equals("item.platinumPick"))
/*      */     {
/* 3593 */       return 917;
/*      */     }
/* 3595 */     if (s.equals("item.platinumShovel"))
/*      */     {
/* 3597 */       return 307;
/*      */     }
/* 3599 */     if (s.equals("item.platinumAxe"))
/*      */     {
/* 3601 */       return 917;
/*      */     }
/* 3603 */     if (s.equals("item.platinumHoe"))
/*      */     {
/* 3605 */       return 612;
/*      */     }
/* 3607 */     if (s.equals("item.platinumSword"))
/*      */     {
/* 3609 */       return 611;
/*      */     }
/* 3611 */     if (s.equals("item.platinumHelm"))
/*      */     {
/* 3613 */       return 1525;
/*      */     }
/* 3615 */     if (s.equals("item.platinumChest"))
/*      */     {
/* 3617 */       return 2440;
/*      */     }
/* 3619 */     if (s.equals("item.platinumLegs"))
/*      */     {
/* 3621 */       return 2135;
/*      */     }
/* 3623 */     if (s.equals("item.platinumBoots"))
/*      */     {
/* 3625 */       return 1220;
/*      */     }
/* 3627 */     if (s.equals("item.titaniumPick"))
/*      */     {
/* 3629 */       return 917;
/*      */     }
/* 3631 */     if (s.equals("item.titaniumShovel"))
/*      */     {
/* 3633 */       return 307;
/*      */     }
/* 3635 */     if (s.equals("item.titaniumAxe"))
/*      */     {
/* 3637 */       return 917;
/*      */     }
/* 3639 */     if (s.equals("item.titaniumHoe"))
/*      */     {
/* 3641 */       return 612;
/*      */     }
/* 3643 */     if (s.equals("item.titaniumSword"))
/*      */     {
/* 3645 */       return 611;
/*      */     }
/* 3647 */     if (s.equals("item.titaniumHelm"))
/*      */     {
/* 3649 */       return 1525;
/*      */     }
/* 3651 */     if (s.equals("item.titaniumChest"))
/*      */     {
/* 3653 */       return 2440;
/*      */     }
/* 3655 */     if (s.equals("item.titaniumLegs"))
/*      */     {
/* 3657 */       return 2135;
/*      */     }
/* 3659 */     if (s.equals("item.titaniumBoots"))
/*      */     {
/* 3661 */       return 1220;
/*      */     }
/* 3663 */     if (s.equals("item.mithrilPick"))
/*      */     {
/* 3665 */       return 1217;
/*      */     }
/* 3667 */     if (s.equals("item.mithrilShovel"))
/*      */     {
/* 3669 */       return 407;
/*      */     }
/* 3671 */     if (s.equals("item.mithrilAxe"))
/*      */     {
/* 3673 */       return 1217;
/*      */     }
/* 3675 */     if (s.equals("item.mithrilHoe"))
/*      */     {
/* 3677 */       return 812;
/*      */     }
/* 3679 */     if (s.equals("item.mithrilSword"))
/*      */     {
/* 3681 */       return 811;
/*      */     }
/* 3683 */     if (s.equals("item.mithrilHelm"))
/*      */     {
/* 3685 */       return 2025;
/*      */     }
/* 3687 */     if (s.equals("item.mithrilChest"))
/*      */     {
/* 3689 */       return 3240;
/*      */     }
/* 3691 */     if (s.equals("item.mithrilLegs"))
/*      */     {
/* 3693 */       return 2835;
/*      */     }
/* 3695 */     if (s.equals("item.mithrilBoots"))
/*      */     {
/* 3697 */       return 1620;
/*      */     }
/* 3699 */     if (s.equals("item.blackstonePick"))
/*      */     {
/* 3701 */       return 17;
/*      */     }
/* 3703 */     if (s.equals("item.blackstoneShovel"))
/*      */     {
/* 3705 */       return 8;
/*      */     }
/* 3707 */     if (s.equals("item.blackstoneAxe"))
/*      */     {
/* 3709 */       return 17;
/*      */     }
/* 3711 */     if (s.equals("item.blackstoneHoe"))
/*      */     {
/* 3713 */       return 12;
/*      */     }
/* 3715 */     if (s.equals("item.blackstoneSword"))
/*      */     {
/* 3717 */       return 12;
/*      */     }
/* 3719 */     if (s.equals("item.redstonePick"))
/*      */     {
/* 3721 */       return 17;
/*      */     }
/* 3723 */     if (s.equals("item.redstoneShovel"))
/*      */     {
/* 3725 */       return 8;
/*      */     }
/* 3727 */     if (s.equals("item.redstoneAxe"))
/*      */     {
/* 3729 */       return 17;
/*      */     }
/* 3731 */     if (s.equals("item.redstoneHoe"))
/*      */     {
/* 3733 */       return 12;
/*      */     }
/* 3735 */     if (s.equals("item.redstoneSword"))
/*      */     {
/* 3737 */       return 12;
/*      */     }
/* 3739 */     if (s.equals("item.greenstonePick"))
/*      */     {
/* 3741 */       return 17;
/*      */     }
/* 3743 */     if (s.equals("item.greenstoneShovel"))
/*      */     {
/* 3745 */       return 8;
/*      */     }
/* 3747 */     if (s.equals("item.greenstoneAxe"))
/*      */     {
/* 3749 */       return 17;
/*      */     }
/* 3751 */     if (s.equals("item.greenstoneHoe"))
/*      */     {
/* 3753 */       return 12;
/*      */     }
/* 3755 */     if (s.equals("item.greenstoneSword"))
/*      */     {
/* 3757 */       return 12;
/*      */     }
/* 3759 */     if (s.equals("item.brownstonePick"))
/*      */     {
/* 3761 */       return 17;
/*      */     }
/* 3763 */     if (s.equals("item.brownstoneShovel"))
/*      */     {
/* 3765 */       return 8;
/*      */     }
/* 3767 */     if (s.equals("item.brownstoneAxe"))
/*      */     {
/* 3769 */       return 17;
/*      */     }
/* 3771 */     if (s.equals("item.brownstoneHoe"))
/*      */     {
/* 3773 */       return 12;
/*      */     }
/* 3775 */     if (s.equals("item.brownstoneSword"))
/*      */     {
/* 3777 */       return 12;
/*      */     }
/* 3779 */     if (s.equals("item.bluestonePick"))
/*      */     {
/* 3781 */       return 17;
/*      */     }
/* 3783 */     if (s.equals("item.bluestoneShovel"))
/*      */     {
/* 3785 */       return 8;
/*      */     }
/* 3787 */     if (s.equals("item.bluestoneAxe"))
/*      */     {
/* 3789 */       return 17;
/*      */     }
/* 3791 */     if (s.equals("item.bluestoneHoe"))
/*      */     {
/* 3793 */       return 12;
/*      */     }
/* 3795 */     if (s.equals("item.bluestoneSword"))
/*      */     {
/* 3797 */       return 12;
/*      */     }
/* 3799 */     if (s.equals("item.purplestonePick"))
/*      */     {
/* 3801 */       return 17;
/*      */     }
/* 3803 */     if (s.equals("item.purplestoneShovel"))
/*      */     {
/* 3805 */       return 8;
/*      */     }
/* 3807 */     if (s.equals("item.purplestoneAxe"))
/*      */     {
/* 3809 */       return 17;
/*      */     }
/* 3811 */     if (s.equals("item.purplestoneHoe"))
/*      */     {
/* 3813 */       return 12;
/*      */     }
/* 3815 */     if (s.equals("item.purplestoneSword"))
/*      */     {
/* 3817 */       return 12;
/*      */     }
/* 3819 */     if (s.equals("item.cyanstonePick"))
/*      */     {
/* 3821 */       return 17;
/*      */     }
/* 3823 */     if (s.equals("item.cyanstoneShovel"))
/*      */     {
/* 3825 */       return 8;
/*      */     }
/* 3827 */     if (s.equals("item.cyanstoneAxe"))
/*      */     {
/* 3829 */       return 17;
/*      */     }
/* 3831 */     if (s.equals("item.cyanstoneHoe"))
/*      */     {
/* 3833 */       return 12;
/*      */     }
/* 3835 */     if (s.equals("item.cyanstoneSword"))
/*      */     {
/* 3837 */       return 12;
/*      */     }
/* 3839 */     if (s.equals("item.lightgreystonePick"))
/*      */     {
/* 3841 */       return 17;
/*      */     }
/* 3843 */     if (s.equals("item.lightgreystoneShovel"))
/*      */     {
/* 3845 */       return 8;
/*      */     }
/* 3847 */     if (s.equals("item.lightgreystoneAxe"))
/*      */     {
/* 3849 */       return 17;
/*      */     }
/* 3851 */     if (s.equals("item.lightgreystoneHoe"))
/*      */     {
/* 3853 */       return 12;
/*      */     }
/* 3855 */     if (s.equals("item.lightgreystoneSword"))
/*      */     {
/* 3857 */       return 12;
/*      */     }
/* 3859 */     if (s.equals("item.greystonePick"))
/*      */     {
/* 3861 */       return 17;
/*      */     }
/* 3863 */     if (s.equals("item.greystoneShovel"))
/*      */     {
/* 3865 */       return 8;
/*      */     }
/* 3867 */     if (s.equals("item.greystoneAxe"))
/*      */     {
/* 3869 */       return 17;
/*      */     }
/* 3871 */     if (s.equals("item.greystoneHoe"))
/*      */     {
/* 3873 */       return 12;
/*      */     }
/* 3875 */     if (s.equals("item.greystoneSword"))
/*      */     {
/* 3877 */       return 12;
/*      */     }
/* 3879 */     if (s.equals("item.pinkstonePick"))
/*      */     {
/* 3881 */       return 17;
/*      */     }
/* 3883 */     if (s.equals("item.pinkstoneShovel"))
/*      */     {
/* 3885 */       return 8;
/*      */     }
/* 3887 */     if (s.equals("item.pinkstoneAxe"))
/*      */     {
/* 3889 */       return 17;
/*      */     }
/* 3891 */     if (s.equals("item.pinkstoneHoe"))
/*      */     {
/* 3893 */       return 12;
/*      */     }
/* 3895 */     if (s.equals("item.pinkstoneSword"))
/*      */     {
/* 3897 */       return 12;
/*      */     }
/* 3899 */     if (s.equals("item.limestonePick"))
/*      */     {
/* 3901 */       return 17;
/*      */     }
/* 3903 */     if (s.equals("item.limestoneShovel"))
/*      */     {
/* 3905 */       return 8;
/*      */     }
/* 3907 */     if (s.equals("item.limestoneAxe"))
/*      */     {
/* 3909 */       return 17;
/*      */     }
/* 3911 */     if (s.equals("item.limestoneHoe"))
/*      */     {
/* 3913 */       return 12;
/*      */     }
/* 3915 */     if (s.equals("item.limestoneSword"))
/*      */     {
/* 3917 */       return 12;
/*      */     }
/* 3919 */     if (s.equals("item.yellowstonePick"))
/*      */     {
/* 3921 */       return 17;
/*      */     }
/* 3923 */     if (s.equals("item.yellowstoneShovel"))
/*      */     {
/* 3925 */       return 8;
/*      */     }
/* 3927 */     if (s.equals("item.yellowstoneAxe"))
/*      */     {
/* 3929 */       return 17;
/*      */     }
/* 3931 */     if (s.equals("item.yellowstoneHoe"))
/*      */     {
/* 3933 */       return 12;
/*      */     }
/* 3935 */     if (s.equals("item.yellowstoneSword"))
/*      */     {
/* 3937 */       return 2;
/*      */     }
/* 3939 */     if (s.equals("item.lightbluestonePick"))
/*      */     {
/* 3941 */       return 17;
/*      */     }
/* 3943 */     if (s.equals("item.lightbluestoneShovel"))
/*      */     {
/* 3945 */       return 8;
/*      */     }
/* 3947 */     if (s.equals("item.lightbluestoneAxe"))
/*      */     {
/* 3949 */       return 17;
/*      */     }
/* 3951 */     if (s.equals("item.lightbluestoneHoe"))
/*      */     {
/* 3953 */       return 12;
/*      */     }
/* 3955 */     if (s.equals("item.lightbluestoneSword"))
/*      */     {
/* 3957 */       return 12;
/*      */     }
/* 3959 */     if (s.equals("item.magentastonePick"))
/*      */     {
/* 3961 */       return 17;
/*      */     }
/* 3963 */     if (s.equals("item.magentastoneShovel"))
/*      */     {
/* 3965 */       return 8;
/*      */     }
/* 3967 */     if (s.equals("item.magentastoneAxe"))
/*      */     {
/* 3969 */       return 17;
/*      */     }
/* 3971 */     if (s.equals("item.magentastoneHoe"))
/*      */     {
/* 3973 */       return 12;
/*      */     }
/* 3975 */     if (s.equals("item.magentastoneSword"))
/*      */     {
/* 3977 */       return 12;
/*      */     }
/* 3979 */     if (s.equals("item.orangestonePick"))
/*      */     {
/* 3981 */       return 17;
/*      */     }
/* 3983 */     if (s.equals("item.orangestoneShovel"))
/*      */     {
/* 3985 */       return 8;
/*      */     }
/* 3987 */     if (s.equals("item.orangestoneAxe"))
/*      */     {
/* 3989 */       return 17;
/*      */     }
/* 3991 */     if (s.equals("item.orangestoneHoe"))
/*      */     {
/* 3993 */       return 12;
/*      */     }
/* 3995 */     if (s.equals("item.orangestoneSword"))
/*      */     {
/* 3997 */       return 12;
/*      */     }
/* 3999 */     if (s.equals("item.whitestonePick"))
/*      */     {
/* 4001 */       return 17;
/*      */     }
/* 4003 */     if (s.equals("item.whitestoneShovel"))
/*      */     {
/* 4005 */       return 8;
/*      */     }
/* 4007 */     if (s.equals("item.whitestoneAxe"))
/*      */     {
/* 4009 */       return 17;
/*      */     }
/* 4011 */     if (s.equals("item.whitestoneHoe"))
/*      */     {
/* 4013 */       return 12;
/*      */     }
/* 4015 */     if (s.equals("item.whitestoneSword"))
/*      */     {
/* 4017 */       return 12;
/*      */     }
/* 4019 */     if (s.equals("item.HorseSaddle"))
/*      */     {
/* 4021 */       return 330;
/*      */     }
/* 4023 */     if (s.equals("item.sharkegg"))
/*      */     {
/* 4025 */       return 110;
/*      */     }
/* 4027 */     if (s.equals("item.sharkteeth"))
/*      */     {
/* 4029 */       return 75;
/*      */     }
/* 4031 */     if (s.equals("item.HayStack"))
/*      */     {
/* 4033 */       return 45;
/*      */     }
/* 4035 */     if (s.equals("item.SugarLump"))
/*      */     {
/* 4037 */       return 15;
/*      */     }
/* 4039 */     if (s.equals("item.fishyegg"))
/*      */     {
/* 4041 */       return 50;
/*      */     }
/* 4043 */     if (s.equals("item.bigcatclaw"))
/*      */     {
/* 4045 */       return 140;
/*      */     }
/* 4047 */     if (s.equals("item.whip"))
/*      */     {
/* 4049 */       return 355;
/*      */     }
/* 4051 */     if (s.equals("item.medallion"))
/*      */     {
/* 4053 */       return 180;
/*      */     }
/* 4055 */     if (s.equals("item.kittybed"))
/*      */     {
/* 4057 */       return 95;
/*      */     }
/* 4059 */     if (s.equals("item.litterbox"))
/*      */     {
/* 4061 */       return 30;
/*      */     }
/* 4063 */     if (s.equals("item.woolball"))
/*      */     {
/* 4065 */       return 25;
/*      */     }
/* 4067 */     if (s.equals("item.rope"))
/*      */     {
/* 4069 */       return 375;
/*      */     }
/* 4071 */     if (s.equals("item.petfood"))
/*      */     {
/* 4073 */       return 20;
/*      */     }
/* 4075 */     if (s.equals("item.crochide"))
/*      */     {
/* 4077 */       return 120;
/*      */     }
/* 4079 */     if (s.equals("item.plateCroc"))
/*      */     {
/* 4081 */       return 960;
/*      */     }
/* 4083 */     if (s.equals("item.helmetCroc"))
/*      */     {
/* 4085 */       return 600;
/*      */     }
/* 4087 */     if (s.equals("item.legsCroc"))
/*      */     {
/* 4089 */       return 840;
/*      */     }
/* 4091 */     if (s.equals("item.bootsCroc"))
/*      */     {
/* 4093 */       return 480;
/*      */     }
/* 4095 */     if (s.equals("tile.Bronze Block"))
/*      */     {
/* 4097 */       return 405;
/*      */     }
/* 4099 */     if (s.equals("tile.Bronze Ore"))
/*      */     {
/* 4101 */       return 40;
/*      */     }
/* 4103 */     if (s.equals("tile.Steel Block"))
/*      */     {
/* 4105 */       return 1440;
/*      */     }
/* 4107 */     if (s.equals("tile.Titanium Ore"))
/*      */     {
/* 4109 */       return 100;
/*      */     }
/* 4111 */     if (s.equals("tile.Titanium Wall"))
/*      */     {
/* 4113 */       return 150;
/*      */     }
/* 4115 */     if (s.equals("tile.Ruthenium Ore"))
/*      */     {
/* 4117 */       return 470;
/*      */     }
/* 4119 */     if (s.equals("tile.Ruthenium Block"))
/*      */     {
/* 4121 */       return 4320;
/*      */     }
/* 4123 */     if (s.equals("tile.Platinum Ore"))
/*      */     {
/* 4125 */       return 590;
/*      */     }
/* 4127 */     if (s.equals("tile.Platinum Block"))
/*      */     {
/* 4129 */       return 5400;
/*      */     }
/* 4131 */     if (s.equals("tile.Colored Glass"))
/*      */     {
/* 4133 */       return 5;
/*      */     }
/* 4135 */     if (s.equals("tile.Colored Plank"))
/*      */     {
/* 4137 */       return 5;
/*      */     }
/* 4139 */     if (s.equals("item.Bronze Sword"))
/*      */     {
/* 4141 */       return 80;
/*      */     }
/* 4143 */     if (s.equals("item.Bronze Pickaxe"))
/*      */     {
/* 4145 */       return 125;
/*      */     }
/* 4147 */     if (s.equals("item.Bronze Shovel"))
/*      */     {
/* 4149 */       return 45;
/*      */     }
/* 4151 */     if (s.equals("item.Bronze Axe"))
/*      */     {
/* 4153 */       return 125;
/*      */     }
/* 4155 */     if (s.equals("item.Bronze Hoe"))
/*      */     {
/* 4157 */       return 145;
/*      */     }
/* 4159 */     if (s.equals("item.Bronze Warhammer"))
/*      */     {
/* 4161 */       return 400;
/*      */     }
/* 4163 */     if (s.equals("item.Bronze Battleaxe"))
/*      */     {
/* 4165 */       return 360;
/*      */     }
/* 4167 */     if (s.equals("item.Steel Sword"))
/*      */     {
/* 4169 */       return 320;
/*      */     }
/* 4171 */     if (s.equals("item.Steel Pickaxe"))
/*      */     {
/* 4173 */       return 480;
/*      */     }
/* 4175 */     if (s.equals("item.Steel Shovel"))
/*      */     {
/* 4177 */       return 165;
/*      */     }
/* 4179 */     if (s.equals("item.Steel Axe"))
/*      */     {
/* 4181 */       return 480;
/*      */     }
/* 4183 */     if (s.equals("item.Steel Hoe"))
/*      */     {
/* 4185 */       return 320;
/*      */     }
/* 4187 */     if (s.equals("item.Steel Warhammer"))
/*      */     {
/* 4189 */       return 1280;
/*      */     }
/* 4191 */     if (s.equals("item.Steel Battleaxe"))
/*      */     {
/* 4193 */       return 1440;
/*      */     }
/* 4195 */     if (s.equals("item.Titanium Sword"))
/*      */     {
/* 4197 */       return 760;
/*      */     }
/* 4199 */     if (s.equals("item.Titanium Pickaxe"))
/*      */     {
/* 4201 */       return 1140;
/*      */     }
/* 4203 */     if (s.equals("item.Titanium Shovel"))
/*      */     {
/* 4205 */       return 385;
/*      */     }
/* 4207 */     if (s.equals("item.Titanium Axe"))
/*      */     {
/* 4209 */       return 1140;
/*      */     }
/* 4211 */     if (s.equals("item.Titanium Hoe"))
/*      */     {
/* 4213 */       return 760;
/*      */     }
/* 4215 */     if (s.equals("item.Titanium Warhammer"))
/*      */     {
/* 4217 */       return 3040;
/*      */     }
/* 4219 */     if (s.equals("item.Titanium Battleaxe"))
/*      */     {
/* 4221 */       return 3420;
/*      */     }
/* 4223 */     if (s.equals("item.Ruthenium Sword"))
/*      */     {
/* 4225 */       return 960;
/*      */     }
/* 4227 */     if (s.equals("item.Ruthenium Pickaxe"))
/*      */     {
/* 4229 */       return 1440;
/*      */     }
/* 4231 */     if (s.equals("item.Ruthenium Shovel"))
/*      */     {
/* 4233 */       return 485;
/*      */     }
/* 4235 */     if (s.equals("item.Ruthenium Axe"))
/*      */     {
/* 4237 */       return 1440;
/*      */     }
/* 4239 */     if (s.equals("item.Ruthenium Hoe"))
/*      */     {
/* 4241 */       return 960;
/*      */     }
/* 4243 */     if (s.equals("item.Ruthenium Warhammer"))
/*      */     {
/* 4245 */       return 3840;
/*      */     }
/* 4247 */     if (s.equals("item.Ruthenium Battleaxe"))
/*      */     {
/* 4249 */       return 4320;
/*      */     }
/* 4251 */     if (s.equals("item.Platinum Sword"))
/*      */     {
/* 4253 */       return 1200;
/*      */     }
/* 4255 */     if (s.equals("item.Platinum Pickaxe"))
/*      */     {
/* 4257 */       return 1800;
/*      */     }
/* 4259 */     if (s.equals("item.Platinum Shovel"))
/*      */     {
/* 4261 */       return 610;
/*      */     }
/* 4263 */     if (s.equals("item.Platinum Axe"))
/*      */     {
/* 4265 */       return 1800;
/*      */     }
/* 4267 */     if (s.equals("item.Platinum Hoe"))
/*      */     {
/* 4269 */       return 1200;
/*      */     }
/* 4271 */     if (s.equals("item.Platinum Warhammer"))
/*      */     {
/* 4273 */       return 4800;
/*      */     }
/* 4275 */     if (s.equals("item.Platinum Battleaxe"))
/*      */     {
/* 4277 */       return 5400;
/*      */     }
/* 4279 */     if (s.equals("item.Bronze Ingot"))
/*      */     {
/* 4281 */       return 45;
/*      */     }
/* 4283 */     if (s.equals("item.Bronze Hammer"))
/*      */     {
/* 4285 */       return 225;
/*      */     }
/* 4287 */     if (s.equals("item.Bronze Hammerhead"))
/*      */     {
/* 4289 */       return 270;
/*      */     }
/* 4291 */     if (s.equals("item.Bronze Axehead"))
/*      */     {
/* 4293 */       return 315;
/*      */     }
/* 4295 */     if (s.equals("item.Steel Ingot"))
/*      */     {
/* 4297 */       return 160;
/*      */     }
/* 4299 */     if (s.equals("item.Steel Hammer"))
/*      */     {
/* 4301 */       return 800;
/*      */     }
/* 4303 */     if (s.equals("item.Steel Hammerhead"))
/*      */     {
/* 4305 */       return 960;
/*      */     }
/* 4307 */     if (s.equals("item.Steel Axehead"))
/*      */     {
/* 4309 */       return 1120;
/*      */     }
/* 4311 */     if (s.equals("item.Refined Steel Chunk"))
/*      */     {
/* 4313 */       return 80;
/*      */     }
/* 4315 */     if (s.equals("item.Steel Chunk"))
/*      */     {
/* 4317 */       return 40;
/*      */     }
/* 4319 */     if (s.equals("item.Titanium Ingot"))
/*      */     {
/* 4321 */       return 380;
/*      */     }
/* 4323 */     if (s.equals("item.Titanium Hammer"))
/*      */     {
/* 4325 */       return 1900;
/*      */     }
/* 4327 */     if (s.equals("item.Titanium Hammerhead"))
/*      */     {
/* 4329 */       return 2200;
/*      */     }
/* 4331 */     if (s.equals("item.Titanium Axehead"))
/*      */     {
/* 4333 */       return 2600;
/*      */     }
/* 4335 */     if (s.equals("item.Titanium"))
/*      */     {
/* 4337 */       return 100;
/*      */     }
/* 4339 */     if (s.equals("item.Ruthenium Ingot"))
/*      */     {
/* 4341 */       return 480;
/*      */     }
/* 4343 */     if (s.equals("item.Ruthenium Hammerhead"))
/*      */     {
/* 4345 */       return 2880;
/*      */     }
/* 4347 */     if (s.equals("item.Ruthenium Axehead"))
/*      */     {
/* 4349 */       return 3360;
/*      */     }
/* 4351 */     if (s.equals("item.Platinum Ingot"))
/*      */     {
/* 4353 */       return 600;
/*      */     }
/* 4355 */     if (s.equals("item.Platinum Hammerhead"))
/*      */     {
/* 4357 */       return 3600;
/*      */     }
/* 4359 */     if (s.equals("item.Platinum Axehead"))
/*      */     {
/* 4361 */       return 4200;
/*      */     }
/* 4363 */     if (s.equals("item.Bronze Helmet"))
/*      */     {
/* 4365 */       return 225;
/*      */     }
/* 4367 */     if (s.equals("item.Bronze Chestplate"))
/*      */     {
/* 4369 */       return 360;
/*      */     }
/* 4371 */     if (s.equals("item.Bronze Leggings"))
/*      */     {
/* 4373 */       return 315;
/*      */     }
/* 4375 */     if (s.equals("item.Bronze Boots"))
/*      */     {
/* 4377 */       return 180;
/*      */     }
/* 4379 */     if (s.equals("item.Steel Helmet"))
/*      */     {
/* 4381 */       return 800;
/*      */     }
/* 4383 */     if (s.equals("item.Steel Chestplate"))
/*      */     {
/* 4385 */       return 1280;
/*      */     }
/* 4387 */     if (s.equals("item.Steel Leggings"))
/*      */     {
/* 4389 */       return 1120;
/*      */     }
/* 4391 */     if (s.equals("item.Steel Boots"))
/*      */     {
/* 4393 */       return 640;
/*      */     }
/* 4395 */     if (s.equals("item.Ruthenium Helmet"))
/*      */     {
/* 4397 */       return 2400;
/*      */     }
/* 4399 */     if (s.equals("item.Ruthenium Chestplate"))
/*      */     {
/* 4401 */       return 3840;
/*      */     }
/* 4403 */     if (s.equals("item.Ruthenium Leggings"))
/*      */     {
/* 4405 */       return 3360;
/*      */     }
/* 4407 */     if (s.equals("item.Ruthenium Boots"))
/*      */     {
/* 4409 */       return 1920;
/*      */     }
/* 4411 */     if (s.equals("item.Platinum Helmet"))
/*      */     {
/* 4413 */       return 3000;
/*      */     }
/* 4415 */     if (s.equals("item.Platinum Chestplate"))
/*      */     {
/* 4417 */       return 4800;
/*      */     }
/* 4419 */     if (s.equals("item.Platinum Leggings"))
/*      */     {
/* 4421 */       return 4200;
/*      */     }
/* 4423 */     if (s.equals("item.Platinum Boots"))
/*      */     {
/* 4425 */       return 2400;
/*      */     }
/* 4427 */     if (s.equals("item.eggArrow"))
/*      */     {
/* 4429 */       return 50;
/*      */     }
/* 4431 */     if (s.equals("item.expArrow"))
/*      */     {
/* 4433 */       return 100;
/*      */     }
/* 4435 */     if (s.equals("item.firArrow"))
/*      */     {
/* 4437 */       return 15;
/*      */     }
/* 4439 */     if (s.equals("item.homBow"))
/*      */     {
/* 4441 */       return 3000;
/*      */     }
/* 4443 */     if (s.equals("item.iceArrow"))
/*      */     {
/* 4445 */       return 150;
/*      */     }
/* 4447 */     if (s.equals("item.ligArrow"))
/*      */     {
/* 4449 */       return 75;
/*      */     }
/* 4451 */     if (s.equals("item.BlorpCola"))
/*      */     {
/* 4453 */       return 50;
/*      */     }
/* 4455 */     if (s.equals("item.BandAid"))
/*      */     {
/* 4457 */       return 240;
/*      */     }
/* 4459 */     if (s.equals("item.GooDonut"))
/*      */     {
/* 4461 */       return 140;
/*      */     }
/* 4463 */     if (s.equals("item.Money"))
/*      */     {
/* 4465 */       return 10;
/*      */     }
/* 4467 */     if (s.equals("item.RayGun"))
/*      */     {
/* 4469 */       return 1920;
/*      */     }
/* 4471 */     if (s.equals("item.Frisbee"))
/*      */     {
/* 4473 */       return 400;
/*      */     }
/* 4475 */     if (s.equals("item.RayRay"))
/*      */     {
/* 4477 */       return 0;
/*      */     }
/* 4479 */     if (s.equals("item.GuineaPigRadio"))
/*      */     {
/* 4481 */       return 125;
/*      */     }
/* 4483 */     if (s.equals("item.EvilEgg"))
/*      */     {
/* 4485 */       return 200;
/*      */     }
/* 4487 */     if (s.equals("item.Rocket"))
/*      */     {
/* 4489 */       return 95;
/*      */     }
/* 4491 */     if (s.equals("item.HellAchievement"))
/*      */     {
/* 4493 */       return 0;
/*      */     }
/* 4495 */     if (s.equals("item.GuineaPigAchievement"))
/*      */     {
/* 4497 */       return 0;
/*      */     }
/* 4499 */     if (s.equals("item.PyramidAchievement"))
/*      */     {
/* 4501 */       return 0;
/*      */     }
/* 4503 */     if (s.equals("item.FloobicideAchievement"))
/*      */     {
/* 4505 */       return 0;
/*      */     }
/* 4507 */     if (s.equals("item.FloobicideAchievement"))
/*      */     {
/* 4509 */       return 0;
/*      */     }
/* 4511 */     if (s.equals("item.AtomPacket"))
/*      */     {
/* 4513 */       return 300;
/*      */     }
/* 4515 */     if (s.equals("item.16KRAM"))
/*      */     {
/* 4517 */       return 150;
/*      */     }
/* 4519 */     if (s.equals("item.Battery"))
/*      */     {
/* 4521 */       return 150;
/*      */     }
/* 4523 */     if (s.equals("item.BubbleAchievement"))
/*      */     {
/* 4525 */       return 0;
/*      */     }
/* 4527 */     if (s.equals("item.HotdogAchievement"))
/*      */     {
/* 4529 */       return 0;
/*      */     }
/* 4531 */     if (s.equals("item.CamelAchievement"))
/*      */     {
/* 4533 */       return 0;
/*      */     }
/* 4535 */     if (s.equals("item.HorseHeadGem"))
/*      */     {
/* 4537 */       return 1140;
/*      */     }
/* 4539 */     if (s.equals("item.ArmyGem"))
/*      */     {
/* 4541 */       return 2140;
/*      */     }
/* 4543 */     if (s.equals("item.Gun"))
/*      */     {
/* 4545 */       return 1140;
/*      */     }
/* 4547 */     if (s.equals("item.Bullet"))
/*      */     {
/* 4549 */       return 0;
/*      */     }
/* 4551 */     if (s.equals("item.LifeGem"))
/*      */     {
/* 4553 */       return 364;
/*      */     }
/* 4555 */     if (s.equals("item.Lolly"))
/*      */     {
/* 4557 */       return 50;
/*      */     }
/* 4559 */     if (s.equals("item.ShrinkRay"))
/*      */     {
/* 4561 */       return 1890;
/*      */     }
/* 4563 */     if (s.equals("item.ShrinkShrink"))
/*      */     {
/* 4565 */       return 0;
/*      */     }
/* 4567 */     if (s.equals("item.ArmSword"))
/*      */     {
/* 4569 */       return 450;
/*      */     }
/* 4571 */     if (s.equals("item.Limbs"))
/*      */     {
/* 4573 */       return 50;
/*      */     }
/* 4575 */     if (s.equals("item.BabyJarEmpty"))
/*      */     {
/* 4577 */       return 327;
/*      */     }
/* 4579 */     if (s.equals("item.BabyJarFull"))
/*      */     {
/* 4581 */       return 1150;
/*      */     }
/* 4583 */     if (s.equals("item.Donut"))
/*      */     {
/* 4585 */       return 85;
/*      */     }
/* 4587 */     if (s.equals("item.MobilePhone"))
/*      */     {
/* 4589 */       return 0;
/*      */     }
/* 4591 */     if (s.equals("item.Extinguisher"))
/*      */     {
/* 4593 */       return 1920;
/*      */     }
/* 4595 */     if (s.equals("item.ZebraAchievement"))
/*      */     {
/* 4597 */       return 0;
/*      */     }
/* 4599 */     if (s.equals("item.NonswimmerAchievement"))
/*      */     {
/* 4601 */       return 0;
/*      */     }
/* 4603 */     if (s.equals("item.GrowRay"))
/*      */     {
/* 4605 */       return 2670;
/*      */     }
/* 4607 */     if (s.equals("item.Zebra Helmet"))
/*      */     {
/* 4609 */       return 600;
/*      */     }
/* 4611 */     if (s.equals("item.Zebra Body"))
/*      */     {
/* 4613 */       return 960;
/*      */     }
/* 4615 */     if (s.equals("item.Zebra Legs"))
/*      */     {
/* 4617 */       return 840;
/*      */     }
/* 4619 */     if (s.equals("item.Zebra Boots"))
/*      */     {
/* 4621 */       return 480;
/*      */     }
/* 4623 */     if (s.equals("item.ZebraHide"))
/*      */     {
/* 4625 */       return 120;
/*      */     }
/* 4627 */     if (s.equals("tile.ml_stone_deco"))
/*      */     {
/* 4629 */       return 8000;
/*      */     }
/* 4631 */     if (s.equals("tile.ml_earth_deco"))
/*      */     {
/* 4633 */       return 150;
/*      */     }
/* 4635 */     if (s.equals("tile.ml_wood_deco"))
/*      */     {
/* 4637 */       return 150;
/*      */     }
/* 4639 */     if (s.equals("tile.ml_panel"))
/*      */     {
/* 4641 */       return 96;
/*      */     }
/* 4643 */     if (s.equals("tile.ml_building"))
/*      */     {
/* 4645 */       return 0;
/*      */     }
/* 4647 */     if (s.equals("tile.TFFirefly"))
/*      */     {
/* 4649 */       return 30;
/*      */     }
/* 4651 */     if (s.equals("tile.TFCicada"))
/*      */     {
/* 4653 */       return 30;
/*      */     }
/* 4655 */     if (s.equals("tile.TFPortal"))
/*      */     {
/* 4657 */       return 0;
/*      */     }
/* 4659 */     if (s.equals("tile.TFLog"))
/*      */     {
/* 4661 */       return 3;
/*      */     }
/* 4663 */     if (s.equals("tile.TFLeaves"))
/*      */     {
/* 4665 */       return 2;
/*      */     }
/* 4667 */     if (s.equals("tile.TFMazestone"))
/*      */     {
/* 4669 */       return 2;
/*      */     }
/* 4671 */     if (s.equals("tile.TFHedge"))
/*      */     {
/* 4673 */       return 2;
/*      */     }
/* 4675 */     if (s.equals("item.recipeBook"))
/*      */     {
/* 4677 */       return 30;
/*      */     }
/* 4679 */     if (s.equals("item.Heart Container"))
/*      */     {
/* 4681 */       return 200;
/*      */     }
/* 4683 */     if (s.equals("item.Heart Piece"))
/*      */     {
/* 4685 */       return 50;
/*      */     }
/* 4687 */     if (s.equals("item.ml_denier"))
/*      */     {
/* 4689 */       return 3;
/*      */     }
/* 4691 */     if (s.equals("item.ml_denier_or"))
/*      */     {
/* 4693 */       return 150;
/*      */     }
/* 4695 */     if (s.equals("item.ml_denier_argent"))
/*      */     {
/* 4697 */       return 9000;
/*      */     }
/* 4699 */     if (s.equals("item.ml_ciderapple"))
/*      */     {
/* 4701 */       return 3;
/*      */     }
/* 4703 */     if (s.equals("item.ml_cider"))
/*      */     {
/* 4705 */       return 150;
/*      */     }
/* 4707 */     if (s.equals("item.ml_calva"))
/*      */     {
/* 4709 */       return 600;
/*      */     }
/* 4711 */     if (s.equals("item.ml_tripes"))
/*      */     {
/* 4713 */       return 300;
/*      */     }
/* 4715 */     if (s.equals("item.ml_normanPickaxe"))
/*      */     {
/* 4717 */       return 1500;
/*      */     }
/* 4719 */     if (s.equals("item.ml_normanAxe"))
/*      */     {
/* 4721 */       return 1500;
/*      */     }
/* 4723 */     if (s.equals("item.ml_normanShovel"))
/*      */     {
/* 4725 */       return 1500;
/*      */     }
/* 4727 */     if (s.equals("item.ml_normanHoe"))
/*      */     {
/* 4729 */       return 1500;
/*      */     }
/* 4731 */     if (s.equals("item.ml_villageWand"))
/*      */     {
/* 4733 */       return 16000;
/*      */     }
/* 4735 */     if (s.equals("item.ml_normanBroadsword"))
/*      */     {
/* 4737 */       return 150;
/*      */     }
/* 4739 */     if (s.equals("item.ml_normanHelmet"))
/*      */     {
/* 4741 */       return 1500;
/*      */     }
/* 4743 */     if (s.equals("item.ml_normanPlate"))
/*      */     {
/* 4745 */       return 3000;
/*      */     }
/* 4747 */     if (s.equals("item.ml_normanLegs"))
/*      */     {
/* 4749 */       return 1200;
/*      */     }
/* 4751 */     if (s.equals("item.ml_normanBoots"))
/*      */     {
/* 4753 */       return 750;
/*      */     }
/* 4755 */     if (s.equals("item.ml_parchmentVillagers"))
/*      */     {
/* 4757 */       return 30;
/*      */     }
/* 4759 */     if (s.equals("item.ml_parchmentBuildings"))
/*      */     {
/* 4761 */       return 30;
/*      */     }
/* 4763 */     if (s.equals("item.ml_parchmentItems"))
/*      */     {
/* 4765 */       return 30;
/*      */     }
/* 4767 */     if (s.equals("item.ml_marchmentComplete"))
/*      */     {
/* 4769 */       return 150;
/*      */     }
/* 4771 */     if (s.equals("item.ml_boudin"))
/*      */     {
/* 4773 */       return 150;
/*      */     }
/* 4775 */     if (s.equals("item.ml_tapestry"))
/*      */     {
/* 4777 */       return 750;
/*      */     }
/* 4779 */     if (s.equals("item.ml_raven_amulet"))
/*      */     {
/* 4781 */       return 4800;
/*      */     }
/* 4783 */     if (s.equals("item.ml_dwarves_amulet"))
/*      */     {
/* 4785 */       return 9000;
/*      */     }
/* 4787 */     if (s.equals("item.ml_yddrasil_amulet"))
/*      */     {
/* 4789 */       return 4800;
/*      */     }
/* 4791 */     if (s.equals("item.ml_skoll_hati_amulet"))
/*      */     {
/* 4793 */       return 9000;
/*      */     }
/* 4795 */     if (s.equals("item.ml_parchmentVillageScroll"))
/*      */     {
/* 4797 */       return 30;
/*      */     }
/* 4799 */     if (s.equals("item.ml_rice"))
/*      */     {
/* 4801 */       return 96;
/*      */     }
/* 4803 */     if (s.equals("item.ml_turmeric"))
/*      */     {
/* 4805 */       return 150;
/*      */     }
/* 4807 */     if (s.equals("item.ml_vegcurry"))
/*      */     {
/* 4809 */       return 250;
/*      */     }
/* 4811 */     if (s.equals("item.ml_chickencurry"))
/*      */     {
/* 4813 */       return 300;
/*      */     }
/* 4815 */     if (s.equals("item.ml_brickmould"))
/*      */     {
/* 4817 */       return 150;
/*      */     }
/* 4819 */     if (s.equals("item.ml_rasgullaId"))
/*      */     {
/* 4821 */       return 60;
/*      */     }
/* 4823 */     if (s.equals("item.ml_indianstatue"))
/*      */     {
/* 4825 */       return 750;
/*      */     }
/* 4827 */     if (s.equals("item.ml_parchmentIndianVillagers"))
/*      */     {
/* 4829 */       return 30;
/*      */     }
/* 4831 */     if (s.equals("item.ml_parchmentIndianBuildings"))
/*      */     {
/* 4833 */       return 30;
/*      */     }
/* 4835 */     if (s.equals("item.ml_parchmentIndianItems"))
/*      */     {
/* 4837 */       return 30;
/*      */     }
/* 4839 */     if (s.equals("item.ml_marchmentIndianComplete"))
/*      */     {
/* 4841 */       return 150;
/*      */     }
/* 4843 */     if (s.equals("item.ml_mayanstatue"))
/*      */     {
/* 4845 */       return 300;
/*      */     }
/* 4847 */     if (s.equals("item.ml_maize"))
/*      */     {
/* 4849 */       return 9;
/*      */     }
/* 4851 */     if (s.equals("item.ml_wah"))
/*      */     {
/* 4853 */       return 270;
/*      */     }
/* 4855 */     if (s.equals("item.ml_masa"))
/*      */     {
/* 4857 */       return 300;
/*      */     }
/* 4859 */     if (s.equals("item.ml_parchmentMayanVillagers"))
/*      */     {
/* 4861 */       return 30;
/*      */     }
/* 4863 */     if (s.equals("item.ml_parchmentMayanBuildings"))
/*      */     {
/* 4865 */       return 30;
/*      */     }
/* 4867 */     if (s.equals("item.ml_parchmentMayanItems"))
/*      */     {
/* 4869 */       return 30;
/*      */     }
/* 4871 */     if (s.equals("item.ml_parchmentMayanComplete"))
/*      */     {
/* 4873 */       return 150;
/*      */     }
/* 4875 */     if (s.equals("item.ml_parchmentJapaneseVillagers"))
/*      */     {
/* 4877 */       return 30;
/*      */     }
/* 4879 */     if (s.equals("item.ml_parchmentJapaneseBuildings"))
/*      */     {
/* 4881 */       return 30;
/*      */     }
/* 4883 */     if (s.equals("item.ml_parchmentJapaneseItems"))
/*      */     {
/* 4885 */       return 30;
/*      */     }
/* 4887 */     if (s.equals("item.ml_parchmentJapaneseComplete"))
/*      */     {
/* 4889 */       return 150;
/*      */     }
/* 4891 */     if (s.equals("item.ml_parchmentSadhu"))
/*      */     {
/* 4893 */       return 4000;
/*      */     }
/* 4895 */     if (s.equals("item.Medallion"))
/*      */     {
/* 4897 */       return 150;
/*      */     }
/* 4899 */     if (s.equals("item.crystalWing"))
/*      */     {
/* 4901 */       return 450;
/*      */     }
/* 4903 */     if (s.equals("item.burningWing"))
/*      */     {
/* 4905 */       return 30;
/*      */     }
/* 4907 */     if (s.equals("item.burnedWing"))
/*      */     {
/* 4909 */       return 10;
/*      */     }
/* 4911 */     if (s.equals("item.bullet"))
/*      */     {
/* 4913 */       return 30;
/*      */     }
/* 4915 */     if (s.equals("item.musket"))
/*      */     {
/* 4917 */       return 348;
/*      */     }
/* 4919 */     if (s.equals("item.musket_wood_part"))
/*      */     {
/* 4921 */       return 0;
/*      */     }
/* 4923 */     if (s.equals("item.musket_iron_part"))
/*      */     {
/* 4925 */       return 0;
/*      */     }
/* 4927 */     if (s.equals("item.crossbow"))
/*      */     {
/* 4929 */       return 594;
/*      */     }
/* 4931 */     if (s.equals("item.bolt"))
/*      */     {
/* 4933 */       return 22;
/*      */     }
/* 4935 */     if (s.equals("item.dynamite"))
/*      */     {
/* 4937 */       return 325;
/*      */     }
/* 4939 */     if (s.equals("item.HorseSaddle"))
/*      */     {
/* 4941 */       return 330;
/*      */     }
/* 4943 */     if (s.equals("item.sharkegg"))
/*      */     {
/* 4945 */       return 110;
/*      */     }
/* 4947 */     if (s.equals("item.sharkteeth"))
/*      */     {
/* 4949 */       return 75;
/*      */     }
/* 4951 */     if (s.equals("item.HayStack"))
/*      */     {
/* 4953 */       return 45;
/*      */     }
/* 4955 */     if (s.equals("item.SugarLump"))
/*      */     {
/* 4957 */       return 15;
/*      */     }
/* 4959 */     if (s.equals("item.fishyegg"))
/*      */     {
/* 4961 */       return 50;
/*      */     }
/* 4963 */     if (s.equals("item.bigcatclaw"))
/*      */     {
/* 4965 */       return 140;
/*      */     }
/* 4967 */     if (s.equals("item.whip"))
/*      */     {
/* 4969 */       return 355;
/*      */     }
/* 4971 */     if (s.equals("item.medallion"))
/*      */     {
/* 4973 */       return 180;
/*      */     }
/* 4975 */     if (s.equals("item.kittybed"))
/*      */     {
/* 4977 */       return 95;
/*      */     }
/* 4979 */     if (s.equals("item.litterbox"))
/*      */     {
/* 4981 */       return 30;
/*      */     }
/* 4983 */     if (s.equals("item.woolball"))
/*      */     {
/* 4985 */       return 25;
/*      */     }
/* 4987 */     if (s.equals("item.rope"))
/*      */     {
/* 4989 */       return 375;
/*      */     }
/* 4991 */     if (s.equals("item.petfood"))
/*      */     {
/* 4993 */       return 20;
/*      */     }
/* 4995 */     if (s.equals("item.coins"))
/*      */     {
/* 4997 */       return 0;
/*      */     }
/* 4999 */     if (s.equals("item.Airship"))
/*      */     {
/* 5001 */       return 3000;
/*      */     }
/* 5003 */     if (s.equals("item.Engine"))
/*      */     {
/* 5005 */       return 150;
/*      */     }
/* 5007 */     if (s.equals("item.Balloon"))
/*      */     {
/* 5009 */       return 800;
/*      */     }
/* 5011 */     if (s.equals("item.null"))
/*      */     {
/* 5013 */       return 0;
/*      */     }
/* 5015 */     if (s.equals("item.Flag"))
/*      */     {
/* 5017 */       return 9000;
/*      */     }
/* 5019 */     if (s.equals("item.Hidden Blade"))
/*      */     {
/* 5021 */       return 152;
/*      */     }
/* 5023 */     if (s.equals("item.Journeyman's Blade"))
/*      */     {
/* 5025 */       return 152;
/*      */     }
/* 5027 */     if (s.equals("item.Ornate Blade"))
/*      */     {
/* 5029 */       return 70;
/*      */     }
/* 5031 */     if (s.equals("item.Broken Blade"))
/*      */     {
/* 5033 */       return 30;
/*      */     }
/* 5035 */     if (s.equals("item.Cleaver"))
/*      */     {
/* 5037 */       return 88;
/*      */     }
/* 5039 */     if (s.equals("item.Devouros"))
/*      */     {
/* 5041 */       return 316;
/*      */     }
/* 5043 */     if (s.equals("item.Gladios"))
/*      */     {
/* 5045 */       return 324;
/*      */     }
/* 5047 */     if (s.equals("item.Lich-Bane"))
/*      */     {
/* 5049 */       return 365;
/*      */     }
/* 5051 */     if (s.equals("item.Bastard Sword"))
/*      */     {
/* 5053 */       return 408;
/*      */     }
/* 5055 */     if (s.equals("item.Malaikah"))
/*      */     {
/* 5057 */       return 416;
/*      */     }
/* 5059 */     if (s.equals("item.Aquatos"))
/*      */     {
/* 5061 */       return 562;
/*      */     }
/* 5063 */     if (s.equals("item.Infernos"))
/*      */     {
/* 5065 */       return 564;
/*      */     }
/* 5067 */     if (s.equals("item.Epachos"))
/*      */     {
/* 5069 */       return 583;
/*      */     }
/* 5071 */     if (s.equals("item.Solanis"))
/*      */     {
/* 5073 */       return 600;
/*      */     }
/* 5075 */     if (s.equals("item.Lunos"))
/*      */     {
/* 5077 */       return 634;
/*      */     }
/* 5079 */     if (s.equals("item.Mortis"))
/*      */     {
/* 5081 */       return 677;
/*      */     }
/* 5083 */     if (s.equals("item.Katana"))
/*      */     {
/* 5085 */       return 680;
/*      */     }
/* 5087 */     if (s.equals("item.Shield 1"))
/*      */     {
/* 5089 */       return 300;
/*      */     }
/* 5091 */     if (s.equals("item.Shield 2"))
/*      */     {
/* 5093 */       return 300;
/*      */     }
/* 5095 */     if (s.equals("item.Shield 3"))
/*      */     {
/* 5097 */       return 300;
/*      */     }
/* 5099 */     if (s.equals("item.Shield 4"))
/*      */     {
/* 5101 */       return 300;
/*      */     }
/* 5103 */     if (s.equals("item.Shield 5"))
/*      */     {
/* 5105 */       return 300;
/*      */     }
/* 5107 */     if (s.equals("item.Shield 6"))
/*      */     {
/* 5109 */       return 300;
/*      */     }
/* 5111 */     if (s.equals("item.Shield 7"))
/*      */     {
/* 5113 */       return 300;
/*      */     }
/* 5115 */     if (s.equals("item.Shield 8"))
/*      */     {
/* 5117 */       return 300;
/*      */     }
/* 5119 */     if (s.equals("item.Bratwurst"))
/*      */     {
/* 5121 */       return 16;
/*      */     }
/* 5123 */     if (s.equals("item.Super Cookie"))
/*      */     {
/* 5125 */       return 26;
/*      */     }
/* 5127 */     if (s.equals("item.Weiner"))
/*      */     {
/* 5129 */       return 12;
/*      */     }
/* 5131 */     if (s.equals("item.Alignment Checker"))
/*      */     {
/* 5133 */       return 56;
/*      */     }
/* 5135 */     if (s.equals("item.Fresh Bread"))
/*      */     {
/* 5137 */       return 6;
/*      */     }
/* 5139 */     if (s.equals("item.Potato"))
/*      */     {
/* 5141 */       return 6;
/*      */     }
/* 5143 */     if (s.equals("item.Rope!"))
/*      */     {
/* 5145 */       return 24;
/*      */     }
/* 5147 */     if (s.equals("item.nagaScale"))
/*      */     {
/* 5149 */       return 10000;
/*      */     }
/* 5151 */     if (s.equals("item.bowlSoupBitter"))
/*      */     {
/* 5153 */       return 3;
/*      */     }
/* 5155 */     if (s.equals("item.vinesStrand"))
/*      */     {
/* 5157 */       return 1;
/*      */     }
/* 5159 */     if (s.equals("item.TrainingTreat"))
/*      */     {
/* 5161 */       return 50;
/*      */     }
/* 5163 */     if (s.equals("item.AttackEmblem"))
/*      */     {
/* 5165 */       return 0;
/*      */     }
/* 5167 */     if (s.equals("item.HuntEmblem"))
/*      */     {
/* 5169 */       return 100;
/*      */     }
/* 5171 */     if (s.equals("item.HaltEmblem"))
/*      */     {
/* 5173 */       return 100;
/*      */     }
/* 5175 */     if (s.equals("item.MarchEmblem"))
/*      */     {
/* 5177 */       return 100;
/*      */     }
/* 5179 */     if (s.equals("item.CheckupEmblem"))
/*      */     {
/* 5181 */       return 100;
/*      */     }
/* 5183 */     if (s.equals("item.CollarShears"))
/*      */     {
/* 5185 */       return 100;
/*      */     }
/* 5187 */     if (s.equals("item.DoggyCharm"))
/*      */     {
/* 5189 */       return 10000;
/*      */     }
/* 5191 */     if (s.equals("item.SuperTreat"))
/*      */     {
/* 5193 */       return 100;
/*      */     }
/* 5195 */     if (s.equals("item.MasterTreat"))
/*      */     {
/* 5197 */       return 200;
/*      */     }
/* 5199 */     if (s.equals("item.ThrowBone"))
/*      */     {
/* 5201 */       return 100;
/*      */     }
/* 5203 */     if (s.equals("item.DroolThrowBone"))
/*      */     {
/* 5205 */       return 100;
/*      */     }
/* 5207 */     if (s.equals("item.biofossil"))
/*      */     {
/* 5209 */       return 200;
/*      */     }
/* 5211 */     if (s.equals("item.relic"))
/*      */     {
/* 5213 */       return 1000;
/*      */     }
/* 5215 */     if (s.equals("item.stoneboard"))
/*      */     {
/* 5217 */       return 2000;
/*      */     }
/* 5219 */     if (s.equals("item.DNA"))
/*      */     {
/* 5221 */       return 30000;
/*      */     }
/* 5223 */     if (s.equals("item.TriceratopsEgg"))
/*      */     {
/* 5225 */       return 50000;
/*      */     }
/* 5227 */     if (s.equals("item.ancientsword"))
/*      */     {
/* 5229 */       return 15000;
/*      */     }
/* 5231 */     if (s.equals("item.Brokensword"))
/*      */     {
/* 5233 */       return 15;
/*      */     }
/* 5235 */     if (s.equals("item.FernSeed"))
/*      */     {
/* 5237 */       return 200;
/*      */     }
/* 5239 */     if (s.equals("item.ancientHelmet"))
/*      */     {
/* 5241 */       return 12000;
/*      */     }
/* 5243 */     if (s.equals("item.BrokenHelmet"))
/*      */     {
/* 5245 */       return 5;
/*      */     }
/* 5247 */     if (s.equals("item.SkullStick"))
/*      */     {
/* 5249 */       return 10;
/*      */     }
/* 5251 */     if (s.equals("item.Gen"))
/*      */     {
/* 5253 */       return 1500;
/*      */     }
/* 5255 */     if (s.equals("item.GenAxe"))
/*      */     {
/* 5257 */       return 2000;
/*      */     }
/* 5259 */     if (s.equals("item.GenPickaxe"))
/*      */     {
/* 5261 */       return 5000;
/*      */     }
/* 5263 */     if (s.equals("item.GenSword"))
/*      */     {
/* 5265 */       return 8000;
/*      */     }
/* 5267 */     if (s.equals("item.GenHoe"))
/*      */     {
/* 5269 */       return 7000;
/*      */     }
/* 5271 */     if (s.equals("item.GenShovel"))
/*      */     {
/* 5273 */       return 7000;
/*      */     }
/* 5275 */     if (s.equals("item.dinopedia"))
/*      */     {
/* 5277 */       return 500;
/*      */     }
/* 5279 */     if (s.equals("item.TRexTooth"))
/*      */     {
/* 5281 */       return 1000;
/*      */     }
/* 5283 */     if (s.equals("item.ToothDagger"))
/*      */     {
/* 5285 */       return 2000;
/*      */     }
/* 5287 */     if (s.equals("item.RawChickenSoup"))
/*      */     {
/* 5289 */       return 20;
/*      */     }
/* 5291 */     if (s.equals("item.ChickenEss"))
/*      */     {
/* 5293 */       return 15;
/*      */     }
/* 5295 */     if (s.equals("item.EmptyShell"))
/*      */     {
/* 5297 */       return 22;
/*      */     }
/* 5299 */     if (s.equals("item.SioChiuLe"))
/*      */     {
/* 5301 */       return 100;
/*      */     }
/* 5303 */     if (s.equals("item.MagicConch"))
/*      */     {
/* 5305 */       return 20;
/*      */     }
/* 5307 */     if (s.equals("item.DinoMeat"))
/*      */     {
/* 5309 */       return 100;
/*      */     }
/* 5311 */     if (s.equals("item.CookedDinoMeat"))
/*      */     {
/* 5313 */       return 200;
/*      */     }
/* 5315 */     if (s.equals("item.EmbryoSyringe"))
/*      */     {
/* 5317 */       return 390;
/*      */     }
/* 5319 */     if (s.equals("item.AnimalDNA"))
/*      */     {
/* 5321 */       return 500;
/*      */     }
/* 5323 */     if (s.equals("tile.Feeder"))
/*      */     {
/* 5325 */       return 5000;
/*      */     }
/* 5327 */     if (s.equals("tile.Feeder"))
/*      */     {
/* 5329 */       return 5000;
/*      */     }
/* 5331 */     if (s.equals("tile.Permafrost"))
/*      */     {
/* 5333 */       return 200;
/*      */     }
/* 5335 */     if (s.equals("tile.IcedStone"))
/*      */     {
/* 5337 */       return 100;
/*      */     }
/* 5339 */     if (s.equals("tile.Skull"))
/*      */     {
/* 5341 */       return 50;
/*      */     }
/* 5343 */     if (s.equals("tile.SkullLantern"))
/*      */     {
/* 5345 */       return 500;
/*      */     }
/* 5347 */     if (s.equals("tile.analyzerIdle"))
/*      */     {
/* 5349 */       return 8000;
/*      */     }
/* 5351 */     if (s.equals("tile.analyzerActive"))
/*      */     {
/* 5353 */       return 0;
/*      */     }
/* 5355 */     if (s.equals("tile.cultivateIdle"))
/*      */     {
/* 5357 */       return 8000;
/*      */     }
/* 5359 */     if (s.equals("tile.cultivateActive"))
/*      */     {
/* 5361 */       return 0;
/*      */     }
/* 5363 */     if (s.equals("tile.worktableIdle"))
/*      */     {
/* 5365 */       return 8000;
/*      */     }
/* 5367 */     if (s.equals("tile.fossil"))
/*      */     {
/* 5369 */       return 60;
/*      */     }
/* 5371 */     if (s.equals("item.window"))
/*      */     {
/* 5373 */       return 25;
/*      */     }
/* 5375 */     if (s.equals("item.tableleg"))
/*      */     {
/* 5377 */       return 10;
/*      */     }
/* 5379 */     if (s.equals("item.table"))
/*      */     {
/* 5381 */       return 50;
/*      */     }
/* 5383 */     if (s.equals("tile.wallwood"))
/*      */     {
/* 5385 */       return 200;
/*      */     }
/* 5387 */     if (s.equals("tile.wallstone"))
/*      */     {
/* 5389 */       return 200;
/*      */     }
/* 5391 */     if (s.equals("tile.wallbrick"))
/*      */     {
/* 5393 */       return 200;
/*      */     }
/* 5395 */     if (s.equals("tile.wallcobble"))
/*      */     {
/* 5397 */       return 200;
/*      */     }
/* 5399 */     if (s.equals("tile.lampwood"))
/*      */     {
/* 5401 */       return 100;
/*      */     }
/* 5403 */     if (s.equals("tile.lampstone"))
/*      */     {
/* 5405 */       return 150;
/*      */     }
/* 5407 */     if (s.equals("tile.lampbrick"))
/*      */     {
/* 5409 */       return 250;
/*      */     }
/* 5411 */     if (s.equals("tile.lampcobble"))
/*      */     {
/* 5413 */       return 200;
/*      */     }
/* 5415 */     if (s.equals("tile.lamp"))
/*      */     {
/* 5417 */       return 50;
/*      */     }
/* 5419 */     if (s.equals("tile.lamp"))
/*      */     {
/* 5421 */       return 50;
/*      */     }
/* 5423 */     if (s.equals("tile.tv"))
/*      */     {
/* 5425 */       return 8008;
/*      */     }
/* 5427 */     if (s.equals("tile.tv"))
/*      */     {
/* 5429 */       return 8008;
/*      */     }
/* 5431 */     if (s.equals("tile.lamp"))
/*      */     {
/* 5433 */       return 50;
/*      */     }
/* 5435 */     if (s.equals("tile.lamp"))
/*      */     {
/* 5437 */       return 50;
/*      */     }
/* 5439 */     if (s.equals("tile.window"))
/*      */     {
/* 5441 */       return 0;
/*      */     }
/* 5443 */     if (s.equals("tile.vase"))
/*      */     {
/* 5445 */       return 70;
/*      */     }
/* 5447 */     if (s.equals("tile.table"))
/*      */     {
/* 5449 */       return 750;
/*      */     }
/* 5451 */     if (s.equals("tile.doorGlass"))
/*      */     {
/* 5453 */       return 500;
/*      */     }
/* 5455 */     if (s.equals("tile.glasstrapdoor"))
/*      */     {
/* 5457 */       return 200;
/*      */     }
/* 5459 */     if (s.equals("tile.clock"))
/*      */     {
/* 5461 */       return 615;
/*      */     }
/* 5463 */     if (s.equals("tile.torchglass"))
/*      */     {
/* 5465 */       return 300;
/*      */     }
/* 5467 */     if (s.equals("tile.drawer"))
/*      */     {
/* 5469 */       return 200;
/*      */     }
/* 5471 */     if (s.equals("tile.aquarium"))
/*      */     {
/* 5473 */       return 1000;
/*      */     }
/* 5475 */     if (s.equals("tile.sableBitum"))
/*      */     {
/* 5477 */       return 500;
/*      */     }
/* 5479 */     if (s.equals("item.doorGlass"))
/*      */     {
/* 5481 */       return 500;
/*      */     }
/* 5483 */     if (s.equals("item.clock"))
/*      */     {
/* 5485 */       return 615;
/*      */     }
/* 5487 */     if (s.equals("item.cctv"))
/*      */     {
/* 5489 */       return 2000;
/*      */     }
/* 5491 */     if (s.equals("tile.cctvCamera"))
/*      */     {
/* 5493 */       return 3939;
/*      */     }
/* 5495 */     if (s.equals("item.npcwand"))
/*      */     {
/* 5497 */       return 501337;
/*      */     }
/* 5499 */     if (s.equals("item.diesel"))
/*      */     {
/* 5501 */       return 40;
/*      */     }
/* 5503 */     if (s.equals("item.diesel engine"))
/*      */     {
/* 5505 */       return 200;
/*      */     }
/* 5507 */     if (s.equals("item.piston item"))
/*      */     {
/* 5509 */       return 20;
/*      */     }
/* 5511 */     if (s.equals("item.camshaft item"))
/*      */     {
/* 5513 */       return 10;
/*      */     }
/* 5515 */     if (s.equals("item.cylinder item"))
/*      */     {
/* 5517 */       return 20;
/*      */     }
/* 5519 */     if (s.equals("item.freight car"))
/*      */     {
/* 5521 */       return 2000;
/*      */     }
/* 5523 */     if (s.equals("item.Steamlocomotive"))
/*      */     {
/* 5525 */       return 1000;
/*      */     }
/* 5527 */     if (s.equals("item.Steamlocomotive3"))
/*      */     {
/* 5529 */       return 1500;
/*      */     }
/* 5531 */     if (s.equals("item.GP40"))
/*      */     {
/* 5533 */       return 4040;
/*      */     }
/* 5535 */     if (s.equals("item.tracks builder"))
/*      */     {
/* 5537 */       return 9000;
/*      */     }
/* 5539 */     if (s.equals("item.Passenger car"))
/*      */     {
/* 5541 */       return 1000;
/*      */     }
/* 5543 */     if (s.equals("item.Caboose"))
/*      */     {
/* 5545 */       return 1500;
/*      */     }
/* 5547 */     if (s.equals("item.Grain car"))
/*      */     {
/* 5549 */       return 2000;
/*      */     }
/* 5551 */     if (s.equals("item.Water car"))
/*      */     {
/* 5553 */       return 2000;
/*      */     }
/* 5555 */     if (s.equals("item.Wood transport"))
/*      */     {
/* 5557 */       return 1500;
/*      */     }
/* 5559 */     if (s.equals("item.Passenger2 car"))
/*      */     {
/* 5561 */       return 1000;
/*      */     }
/* 5563 */     if (s.equals("item.locomotive 4"))
/*      */     {
/* 5565 */       return 2000;
/*      */     }
/* 5567 */     if (s.equals("item.GP7"))
/*      */     {
/* 5569 */       return 6000;
/*      */     }
/* 5571 */     if (s.equals("item.Tram"))
/*      */     {
/* 5573 */       return 8000;
/*      */     }
/* 5575 */     if (s.equals("item.Speed"))
/*      */     {
/* 5577 */       return 10000;
/*      */     }
/* 5579 */     if (s.equals("item.EU07"))
/*      */     {
/* 5581 */       return 5500;
/*      */     }
/* 5583 */     if (s.equals("item.Shunter"))
/*      */     {
/* 5585 */       return 5000;
/*      */     }
/* 5587 */     if (s.equals("item.Electric motor"))
/*      */     {
/* 5589 */       return 1500;
/*      */     }
/* 5591 */     if (s.equals("item.Coal dust"))
/*      */     {
/* 5593 */       return 150;
/*      */     }
/* 5595 */     if (s.equals("item.ingotSteel"))
/*      */     {
/* 5597 */       return 300;
/*      */     }
/* 5599 */     if (s.equals("item.Steeldust"))
/*      */     {
/* 5601 */       return 200;
/*      */     }
/* 5603 */     if (s.equals("item.Graphite"))
/*      */     {
/* 5605 */       return 150;
/*      */     }
/* 5607 */     if (s.equals("item.Boiler"))
/*      */     {
/* 5609 */       return 407;
/*      */     }
/* 5611 */     if (s.equals("item.Firebox"))
/*      */     {
/* 5613 */       return 407;
/*      */     }
/* 5615 */     if (s.equals("item.Bogie"))
/*      */     {
/* 5617 */       return 250;
/*      */     }
/* 5619 */     if (s.equals("item.Steelframe"))
/*      */     {
/* 5621 */       return 500;
/*      */     }
/* 5623 */     if (s.equals("item.Steelcab"))
/*      */     {
/* 5625 */       return 500;
/*      */     }
/* 5627 */     if (s.equals("item.Steelchimney"))
/*      */     {
/* 5629 */       return 500;
/*      */     }
/* 5631 */     if (s.equals("item.Yoke"))
/*      */     {
/* 5633 */       return 50;
/*      */     }
/* 5635 */     if (s.equals("item.Balloon"))
/*      */     {
/* 5637 */       return 800;
/*      */     }
/* 5639 */     if (s.equals("item.Zepplin"))
/*      */     {
/* 5641 */       return 2000;
/*      */     }
/* 5643 */     if (s.equals("item.Propeller"))
/*      */     {
/* 5645 */       return 100;
/*      */     }
/* 5647 */     if (s.equals("item.Steam engine"))
/*      */     {
/* 5649 */       return 150;
/*      */     }
/* 5651 */     if (s.equals("item.signal item"))
/*      */     {
/* 5653 */       return 100;
/*      */     }
/* 5655 */     if (s.equals("tile.petrol"))
/*      */     {
/* 5657 */       return 200;
/*      */     }
/* 5659 */     if (s.equals("tile.distil"))
/*      */     {
/* 5661 */       return 2000;
/*      */     }
/* 5663 */     if (s.equals("tile.distil"))
/*      */     {
/* 5665 */       return 2000;
/*      */     }
/* 5667 */     if (s.equals("tile.detectorRailLoco"))
/*      */     {
/* 5669 */       return 500;
/*      */     }
/* 5671 */     if (s.equals("tile.detectorRailPassenger"))
/*      */     {
/* 5673 */       return 500;
/*      */     }
/* 5675 */     if (s.equals("tile.detectorRailFreight"))
/*      */     {
/* 5677 */       return 500;
/*      */     }
/* 5679 */     if (s.equals("tile.signal block"))
/*      */     {
/* 5681 */       return 250;
/*      */     }
/* 5683 */     if (s.equals("tile.signal block active"))
/*      */     {
/* 5685 */       return 250;
/*      */     }
/* 5687 */     if (s.equals("tile.dragonEgg"))
/*      */     {
/* 5689 */       return 50000;
/*      */     }
/* 5691 */     if (s.equals("tile.CopperVein"))
/*      */     {
/* 5693 */       return 10;
/*      */     }
/* 5695 */     if (s.equals("tile.CopperBrick"))
/*      */     {
/* 5697 */       return 90;
/*      */     }
/* 5699 */     if (s.equals("tile.TinVein"))
/*      */     {
/* 5701 */       return 10;
/*      */     }
/* 5703 */     if (s.equals("tile.TinBrick"))
/*      */     {
/* 5705 */       return 99;
/*      */     }
/* 5707 */     if (s.equals("tile.BronzeBrick"))
/*      */     {
/* 5709 */       return 180;
/*      */     }
/* 5711 */     if (s.equals("tile.GoldVein"))
/*      */     {
/* 5713 */       return 100;
/*      */     }
/* 5715 */     if (s.equals("tile.IronVein"))
/*      */     {
/* 5717 */       return 80;
/*      */     }
/* 5719 */     if (s.equals("tile.ManganeseVein"))
/*      */     {
/* 5721 */       return 80;
/*      */     }
/* 5723 */     if (s.equals("tile.ManganeseBrick"))
/*      */     {
/* 5725 */       return 720;
/*      */     }
/* 5727 */     if (s.equals("tile.MithrilVein"))
/*      */     {
/* 5729 */       return 300;
/*      */     }
/* 5731 */     if (s.equals("tile.MithrilBrick"))
/*      */     {
/* 5733 */       return 2700;
/*      */     }
/* 5735 */     if (s.equals("tile.OrichalcumVein"))
/*      */     {
/* 5737 */       return 380;
/*      */     }
/* 5739 */     if (s.equals("tile.OrichalcumBrick"))
/*      */     {
/* 5741 */       return 3420;
/*      */     }
/* 5743 */     if (s.equals("tile.AdamantineVein"))
/*      */     {
/* 5745 */       return 900;
/*      */     }
/* 5747 */     if (s.equals("tile.AdamantineBrick"))
/*      */     {
/* 5749 */       return 8100;
/*      */     }
/* 5751 */     if (s.equals("tile.ZincVein"))
/*      */     {
/* 5753 */       return 10;
/*      */     }
/* 5755 */     if (s.equals("tile.ZincBrick"))
/*      */     {
/* 5757 */       return 90;
/*      */     }
/* 5759 */     if (s.equals("tile.BrassBrick"))
/*      */     {
/* 5761 */       return 180;
/*      */     }
/* 5763 */     if (s.equals("tile.PlatinumVein"))
/*      */     {
/* 5765 */       return 400;
/*      */     }
/* 5767 */     if (s.equals("tile.PlatinumBrick"))
/*      */     {
/* 5769 */       return 3600;
/*      */     }
/* 5771 */     if (s.equals("item.GoldOre"))
/*      */     {
/* 5773 */       return 100;
/*      */     }
/* 5775 */     if (s.equals("item.GoldDust"))
/*      */     {
/* 5777 */       return 101;
/*      */     }
/* 5779 */     if (s.equals("item.GoldCoin"))
/*      */     {
/* 5781 */       return 4;
/*      */     }
/* 5783 */     if (s.equals("item.GoldCoin9"))
/*      */     {
/* 5785 */       return 150;
/*      */     }
/* 5787 */     if (s.equals("item.GoldCoin81"))
/*      */     {
/* 5789 */       return 1400;
/*      */     }
/* 5791 */     if (s.equals("item.IronOre"))
/*      */     {
/* 5793 */       return 80;
/*      */     }
/* 5795 */     if (s.equals("item.IronDust"))
/*      */     {
/* 5797 */       return 85;
/*      */     }
/* 5799 */     if (s.equals("item.PlatinumOre"))
/*      */     {
/* 5801 */       return 400;
/*      */     }
/* 5803 */     if (s.equals("item.PlatinumDust"))
/*      */     {
/* 5805 */       return 405;
/*      */     }
/* 5807 */     if (s.equals("item.PlatinumBar"))
/*      */     {
/* 5809 */       return 450;
/*      */     }
/* 5811 */     if (s.equals("item.PlatinumCoin"))
/*      */     {
/* 5813 */       return 5;
/*      */     }
/* 5815 */     if (s.equals("item.PlatinumCoin9"))
/*      */     {
/* 5817 */       return 500;
/*      */     }
/* 5819 */     if (s.equals("item.PlatinumCoin81"))
/*      */     {
/* 5821 */       return 5000;
/*      */     }
/* 5823 */     if (s.equals("item.SilverOre"))
/*      */     {
/* 5825 */       return 30;
/*      */     }
/* 5827 */     if (s.equals("item.SilverDust"))
/*      */     {
/* 5829 */       return 33;
/*      */     }
/* 5831 */     if (s.equals("item.SilverBar"))
/*      */     {
/* 5833 */       return 35;
/*      */     }
/* 5835 */     if (s.equals("item.SilverCoin"))
/*      */     {
/* 5837 */       return 4;
/*      */     }
/* 5839 */     if (s.equals("item.SilverCoin9"))
/*      */     {
/* 5841 */       return 40;
/*      */     }
/* 5843 */     if (s.equals("item.SilverCoin81"))
/*      */     {
/* 5845 */       return 360;
/*      */     }
/* 5847 */     if (s.equals("item.SteelDust"))
/*      */     {
/* 5849 */       return 160;
/*      */     }
/* 5851 */     if (s.equals("item.SteelBar"))
/*      */     {
/* 5853 */       return 165;
/*      */     }
/* 5855 */     if (s.equals("item.SteelPickaxe"))
/*      */     {
/* 5857 */       return 500;
/*      */     }
/* 5859 */     if (s.equals("item.SteelShovel"))
/*      */     {
/* 5861 */       return 200;
/*      */     }
/* 5863 */     if (s.equals("item.SteelAxe"))
/*      */     {
/* 5865 */       return 500;
/*      */     }
/* 5867 */     if (s.equals("item.SteelHoe"))
/*      */     {
/* 5869 */       return 350;
/*      */     }
/* 5871 */     if (s.equals("item.SteelSword"))
/*      */     {
/* 5873 */       return 360;
/*      */     }
/* 5875 */     if (s.equals("tile.SilverVein"))
/*      */     {
/* 5877 */       return 30;
/*      */     }
/* 5879 */     if (s.equals("tile.SilverBrick"))
/*      */     {
/* 5881 */       return 270;
/*      */     }
/* 5883 */     if (s.equals("item.CopperOre"))
/*      */     {
/* 5885 */       return 10;
/*      */     }
/* 5887 */     if (s.equals("item.CopperDust"))
/*      */     {
/* 5889 */       return 12;
/*      */     }
/* 5891 */     if (s.equals("item.CopperBar"))
/*      */     {
/* 5893 */       return 15;
/*      */     }
/* 5895 */     if (s.equals("item.CopperPickaxe"))
/*      */     {
/* 5897 */       return 50;
/*      */     }
/* 5899 */     if (s.equals("item.CopperShovel"))
/*      */     {
/* 5901 */       return 25;
/*      */     }
/* 5903 */     if (s.equals("item.CopperAxe"))
/*      */     {
/* 5905 */       return 50;
/*      */     }
/* 5907 */     if (s.equals("item.CopperHoe"))
/*      */     {
/* 5909 */       return 40;
/*      */     }
/* 5911 */     if (s.equals("item.CopperSword"))
/*      */     {
/* 5913 */       return 42;
/*      */     }
/* 5915 */     if (s.equals("item.TinOre"))
/*      */     {
/* 5917 */       return 10;
/*      */     }
/* 5919 */     if (s.equals("item.TinDust"))
/*      */     {
/* 5921 */       return 12;
/*      */     }
/* 5923 */     if (s.equals("item.TinBar"))
/*      */     {
/* 5925 */       return 15;
/*      */     }
/* 5927 */     if (s.equals("item.BronzeDust"))
/*      */     {
/* 5929 */       return 20;
/*      */     }
/* 5931 */     if (s.equals("item.BronzeBar"))
/*      */     {
/* 5933 */       return 25;
/*      */     }
/* 5935 */     if (s.equals("item.BronzePickaxe"))
/*      */     {
/* 5937 */       return 85;
/*      */     }
/* 5939 */     if (s.equals("item.BronzeShovel"))
/*      */     {
/* 5941 */       return 35;
/*      */     }
/* 5943 */     if (s.equals("item.BronzeAxe"))
/*      */     {
/* 5945 */       return 85;
/*      */     }
/* 5947 */     if (s.equals("item.BronzeHoe"))
/*      */     {
/* 5949 */       return 53;
/*      */     }
/* 5951 */     if (s.equals("item.BronzeSword"))
/*      */     {
/* 5953 */       return 53;
/*      */     }
/* 5955 */     if (s.equals("item.ManganeseOre"))
/*      */     {
/* 5957 */       return 80;
/*      */     }
/* 5959 */     if (s.equals("item.ManganeseDust"))
/*      */     {
/* 5961 */       return 82;
/*      */     }
/* 5963 */     if (s.equals("item.ManganeseBar"))
/*      */     {
/* 5965 */       return 85;
/*      */     }
/* 5967 */     if (s.equals("item.MithrilOre"))
/*      */     {
/* 5969 */       return 300;
/*      */     }
/* 5971 */     if (s.equals("item.MithrilDust"))
/*      */     {
/* 5973 */       return 310;
/*      */     }
/* 5975 */     if (s.equals("item.MithrilBar"))
/*      */     {
/* 5977 */       return 320;
/*      */     }
/* 5979 */     if (s.equals("item.MithrilPickaxe"))
/*      */     {
/* 5981 */       return 980;
/*      */     }
/* 5983 */     if (s.equals("item.MithrilShovel"))
/*      */     {
/* 5985 */       return 400;
/*      */     }
/* 5987 */     if (s.equals("item.MithrilAxe"))
/*      */     {
/* 5989 */       return 980;
/*      */     }
/* 5991 */     if (s.equals("item.MithrilHoe"))
/*      */     {
/* 5993 */       return 650;
/*      */     }
/* 5995 */     if (s.equals("item.MithrilSword"))
/*      */     {
/* 5997 */       return 650;
/*      */     }
/* 5999 */     if (s.equals("item.OrichalcumOre"))
/*      */     {
/* 6001 */       return 380;
/*      */     }
/* 6003 */     if (s.equals("item.OrichalcumDust"))
/*      */     {
/* 6005 */       return 385;
/*      */     }
/* 6007 */     if (s.equals("item.OrichalcumBar"))
/*      */     {
/* 6009 */       return 390;
/*      */     }
/* 6011 */     if (s.equals("item.OrichalcumPickaxe"))
/*      */     {
/* 6013 */       return 1200;
/*      */     }
/* 6015 */     if (s.equals("item.OrichalcumShovel"))
/*      */     {
/* 6017 */       return 420;
/*      */     }
/* 6019 */     if (s.equals("item.OrichalcumAxe"))
/*      */     {
/* 6021 */       return 1200;
/*      */     }
/* 6023 */     if (s.equals("item.OrichalcumHoe"))
/*      */     {
/* 6025 */       return 840;
/*      */     }
/* 6027 */     if (s.equals("item.OrichalcumSword"))
/*      */     {
/* 6029 */       return 840;
/*      */     }
/* 6031 */     if (s.equals("item.AdamantineOre"))
/*      */     {
/* 6033 */       return 900;
/*      */     }
/* 6035 */     if (s.equals("item.AdamantineDust"))
/*      */     {
/* 6037 */       return 910;
/*      */     }
/* 6039 */     if (s.equals("item.AdamantineBar"))
/*      */     {
/* 6041 */       return 920;
/*      */     }
/* 6043 */     if (s.equals("item.AdamantinePickaxe"))
/*      */     {
/* 6045 */       return 3300;
/*      */     }
/* 6047 */     if (s.equals("item.AdamantineShovel"))
/*      */     {
/* 6049 */       return 1300;
/*      */     }
/* 6051 */     if (s.equals("item.AdamantineAxe"))
/*      */     {
/* 6053 */       return 3300;
/*      */     }
/* 6055 */     if (s.equals("item.AdamantineHoe"))
/*      */     {
/* 6057 */       return 2500;
/*      */     }
/* 6059 */     if (s.equals("item.AdamantineSword"))
/*      */     {
/* 6061 */       return 2500;
/*      */     }
/* 6063 */     if (s.equals("item.ZincOre"))
/*      */     {
/* 6065 */       return 10;
/*      */     }
/* 6067 */     if (s.equals("item.ZincDust"))
/*      */     {
/* 6069 */       return 12;
/*      */     }
/* 6071 */     if (s.equals("item.ZincBar"))
/*      */     {
/* 6073 */       return 15;
/*      */     }
/* 6075 */     if (s.equals("item.BrassDust"))
/*      */     {
/* 6077 */       return 20;
/*      */     }
/* 6079 */     if (s.equals("item.BrassBar"))
/*      */     {
/* 6081 */       return 24;
/*      */     }
/* 6083 */     if (s.equals("item.BrassCoin"))
/*      */     {
/* 6085 */       return 2;
/*      */     }
/* 6087 */     if (s.equals("item.BrassCoin9"))
/*      */     {
/* 6089 */       return 30;
/*      */     }
/* 6091 */     if (s.equals("item.JerrySword"))
/*      */     {
/* 6093 */       return 1000000;
/*      */     }
/*      */     
/*      */ 
/* 6097 */     return s.equals("item.BrassCoin81") ? 270 : 0;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void getRandomStock()
/*      */   {
/* 6103 */     Random random = new Random();
/*      */     
/* 6105 */     for (int i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6106 */     flint = i;
/* 6107 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6108 */     clay = i;
/* 6109 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6110 */     iron = i;
/* 6111 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6112 */     diamond = i;
/* 6113 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6114 */     fish = i;
/* 6115 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6116 */     apple = i;
/* 6117 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6118 */     string = i;
/* 6119 */     for (i = 0; i <= 3; i = random.nextInt(200)) {}
/* 6120 */     feather = i;
/*      */   }
/*      */   
/*      */   public static int getGoldTotal()
/*      */   {
/* 6125 */     return goldTotal;
/*      */   }
/*      */ }

/* Location:           C:\Users\Óî¿­\Desktop\mcmod\SpawnEggCraft\dev\Tale-of-Kingdoms-V1.4.3.1ºº»¯~.zip
 * Qualified Name:     aginsun.mods.TaleOfKingdoms.goldKeeper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */