package com.globbypotato.rockhounding_chemistry;

import com.globbypotato.rockhounding_chemistry.blocks.AlloyBBlocks;
import com.globbypotato.rockhounding_chemistry.blocks.AlloyBBricks;
import com.globbypotato.rockhounding_chemistry.blocks.AlloyBlocks;
import com.globbypotato.rockhounding_chemistry.blocks.AlloyBricks;
import com.globbypotato.rockhounding_chemistry.blocks.FireBlock;
import com.globbypotato.rockhounding_chemistry.blocks.GanBlocks;
import com.globbypotato.rockhounding_chemistry.blocks.MineralOres;
import com.globbypotato.rockhounding_chemistry.blocks.OwcBlocks;
import com.globbypotato.rockhounding_chemistry.blocks.SmokeBlock;
import com.globbypotato.rockhounding_chemistry.enums.EnumAlloy;
import com.globbypotato.rockhounding_chemistry.enums.EnumAlloyB;
import com.globbypotato.rockhounding_chemistry.enums.EnumBattery;
import com.globbypotato.rockhounding_chemistry.enums.EnumFires;
import com.globbypotato.rockhounding_chemistry.enums.EnumGan;
import com.globbypotato.rockhounding_chemistry.enums.EnumLaser;
import com.globbypotato.rockhounding_chemistry.enums.EnumOres;
import com.globbypotato.rockhounding_chemistry.enums.EnumOwc;
import com.globbypotato.rockhounding_chemistry.machines.CastingBench;
import com.globbypotato.rockhounding_chemistry.machines.ChemicalExtractor;
import com.globbypotato.rockhounding_chemistry.machines.CrawlerAssembler;
import com.globbypotato.rockhounding_chemistry.machines.Dekatron;
import com.globbypotato.rockhounding_chemistry.machines.DepositionChamber;
import com.globbypotato.rockhounding_chemistry.machines.Disposer;
import com.globbypotato.rockhounding_chemistry.machines.EarthBreaker;
import com.globbypotato.rockhounding_chemistry.machines.ElectroLaser;
import com.globbypotato.rockhounding_chemistry.machines.GanController;
import com.globbypotato.rockhounding_chemistry.machines.LabBlender;
import com.globbypotato.rockhounding_chemistry.machines.LabOven;
import com.globbypotato.rockhounding_chemistry.machines.LaserAmplifier;
import com.globbypotato.rockhounding_chemistry.machines.LaserBeam;
import com.globbypotato.rockhounding_chemistry.machines.LaserRX;
import com.globbypotato.rockhounding_chemistry.machines.LaserRay;
import com.globbypotato.rockhounding_chemistry.machines.LaserSplitter;
import com.globbypotato.rockhounding_chemistry.machines.LaserStabilizer;
import com.globbypotato.rockhounding_chemistry.machines.LaserTX;
import com.globbypotato.rockhounding_chemistry.machines.MetalAlloyer;
import com.globbypotato.rockhounding_chemistry.machines.MineCrawler;
import com.globbypotato.rockhounding_chemistry.machines.MineralAnalyzer;
import com.globbypotato.rockhounding_chemistry.machines.MineralSizer;
import com.globbypotato.rockhounding_chemistry.machines.OwcAssembler;
import com.globbypotato.rockhounding_chemistry.machines.OwcController;
import com.globbypotato.rockhounding_chemistry.machines.PetrographerTable;
import com.globbypotato.rockhounding_chemistry.machines.SaltMaker;
import com.globbypotato.rockhounding_chemistry.machines.SaltSeasoner;
import com.globbypotato.rockhounding_chemistry.machines.UltraBattery;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModBlocks {
	public static Block mineralOres;
	public static Block alloyBlocks;
	public static Block alloyBBlocks;
	public static Block alloyBricks;
	public static Block alloyBBricks;
	public static Block smokeBlock;
	public static Block fireBlock;

	public static Block labOven;
	public static Block mineralSizer;
	public static Block mineralAnalyzer;
	public static Block metalAlloyer;
	public static Block chemicalExtractor;
	public static Block depositionChamber;
	public static Block petrographerTable;
	public static Block dekatron;
	public static Block earthBreaker;
	public static Block castingBench;
	public static Block labBlender;

	public static Block saltMaker;
	public static Block saltSeasoner;

	public static Block crawlerAssembler;
	public static Block mineCrawler;

	public static Block laserRedstoneTx;
	public static Block laserRedstoneRx;
	public static Block laserSplitter;
	public static Block laserAmplifier;
	public static Block laserStabilizer;
	public static Block electroLaser;
	public static Block laserBeam;
	public static Block laserRay;

	public static Block owcBlocks;
	public static Block owcAssembler;
	public static Block owcController;

	public static Block ganBlocks;
	public static Block ganController;

	public static Block ultraBattery;

	public static Block disposer;

	//initialize the block
	public static void init() {
		//blocks
		mineralOres = new MineralOres(Material.ROCK, EnumOres.getNames(), 3.0F, 5.0F, "mineralOres", SoundType.STONE);
		alloyBlocks = new AlloyBlocks(Material.IRON, EnumAlloy.getAlloys(), 3.0F, 5.0F, "alloyBlocks", SoundType.METAL);
		alloyBBlocks = new AlloyBBlocks(Material.IRON, EnumAlloyB.getAlloys(), 3.0F, 5.0F, "alloyBBlocks", SoundType.METAL);
		alloyBricks = new AlloyBricks(Material.IRON, EnumAlloy.getAlloys(), 3.0F, 5.0F, "alloyBricks", SoundType.METAL);
		alloyBBricks = new AlloyBBricks(Material.IRON, EnumAlloyB.getAlloys(), 3.0F, 5.0F, "alloyBBricks", SoundType.METAL);
		smokeBlock = new SmokeBlock("smokeBlock");
		fireBlock = new FireBlock(Material.FIRE, EnumFires.getNames(), 0.0F, 0.0F, "fireBlock", SoundType.SAND);

		labOven = new LabOven(3.0F, 5.0F, "labOven");
		mineralSizer = new MineralSizer(3.0F, 5.0F, "mineralSizer");
		mineralAnalyzer = new MineralAnalyzer(3.0F, 5.0F, "mineralAnalyzer");
		chemicalExtractor = new ChemicalExtractor(3.0F, 5.0F, "chemicalExtractor");
		depositionChamber = new DepositionChamber(3.0F, 5.0F, "depositionChamber");
		metalAlloyer = new MetalAlloyer(3.0F, 5.0F, "metalAlloyer");
		petrographerTable = new PetrographerTable(3.0F, 5.0F, "petrographerTable");
		dekatron = new Dekatron(3.0F, 5.0F, "dekatron");
		earthBreaker = new EarthBreaker(3.0F, 5.0F, "earthBreaker");
		castingBench = new CastingBench(3.0F, 5.0F, "castingBench");
		labBlender = new LabBlender(3.0F, 5.0F, "labBlender");

		saltMaker = new SaltMaker(3.0F, 5.0F, "saltMaker");
		saltSeasoner = new SaltSeasoner(3.0F, 5.0F, "saltSeasoner");

		crawlerAssembler = new CrawlerAssembler(3.0F, 5.0F, "crawlerAssembler");
		mineCrawler = new MineCrawler("mineCrawler");

		laserRedstoneTx = new LaserTX(3.0F, 5.0F,"laserRedstoneTx");
		laserRedstoneRx = new LaserRX(3.0F, 5.0F,"laserRedstoneRx", EnumLaser.getNames());
		laserSplitter = new LaserSplitter(3.0F, 5.0F,"laserSplitter");
		laserAmplifier = new LaserAmplifier(3.0F, 5.0F,"laserAmplifier");
		laserStabilizer = new LaserStabilizer(3.0F, 5.0F,"laserStabilizer");
		electroLaser = new ElectroLaser(3.0F, 5.0F,"electroLaser");
		laserBeam = new LaserBeam("laserBeam");
		laserRay = new LaserRay("laserRay");

		owcBlocks = new OwcBlocks(Material.IRON, EnumOwc.getNames(), 4.0F, 7.0F, "owcBlocks", SoundType.METAL);
		owcAssembler = new OwcAssembler(3.0F, 5.0F, "owcAssembler");
		owcController = new OwcController(3.0F, 5.0F, "owcController");
		
		ganBlocks = new GanBlocks(Material.IRON, EnumGan.getNames(), 4.0F, 7.0F, "ganBlocks", SoundType.METAL);
		ganController = new GanController(3.0F, 5.0F, "ganController");

		ultraBattery = new UltraBattery(Material.IRON, EnumBattery.getNames(), 2.0F, 7.0F, "ultraBattery", SoundType.METAL);

		disposer = new Disposer(2.0F, 7.0F, "disposer", SoundType.METAL);

	}

	//recall the renders
	public static void initClient(){
		//blocks
		for(int i = 0; i < EnumOres.size(); i++){		registerMetaBlockRender(mineralOres, i, EnumOres.getName(i));		}
		for(int i = 0; i < EnumAlloy.size(); i++){		registerMetaBlockRender(alloyBlocks, i, EnumAlloy.getAlloy(i));		}
		for(int i = 0; i < EnumAlloyB.size(); i++){		registerMetaBlockRender(alloyBBlocks, i, EnumAlloyB.getAlloy(i));	}
		for(int i = 0; i < EnumAlloy.size(); i++){		registerMetaBlockRender(alloyBricks, i, EnumAlloy.getAlloy(i));		}
		for(int i = 0; i < EnumAlloyB.size(); i++){		registerMetaBlockRender(alloyBBricks, i, EnumAlloyB.getAlloy(i));	}
		for(int i = 0; i < EnumLaser.size(); i++){		registerMetaBlockRender(laserRedstoneRx, i, EnumLaser.getName(i));	}
		for(int i = 0; i < EnumOwc.size(); i++){		registerMetaBlockRender(owcBlocks, i, EnumOwc.getName(i));			}
		for(int i = 0; i < EnumGan.size(); i++){		registerMetaBlockRender(ganBlocks, i, EnumGan.getName(i));			}
		for(int i = 0; i < EnumFires.size(); i++){		registerMetaBlockRender(fireBlock, i, EnumFires.getName(i));		}
		for(int i = 0; i < EnumBattery.size(); i++){	registerMetaBlockRender(ultraBattery, i, EnumBattery.getName(i));	}
		registerSingleBlockRender(saltMaker, 0, "saltMaker");
		registerSingleBlockRender(saltSeasoner, 0, "saltSeasoner");
		registerSingleBlockRender(labOven, 0, "labOven");
		registerSingleBlockRender(mineralSizer, 0, "mineralSizer");
		registerSingleBlockRender(mineralAnalyzer, 0, "mineralAnalyzer");
		registerSingleBlockRender(chemicalExtractor, 0, "chemicalExtractor");
		registerSingleBlockRender(mineCrawler, 0, "mineCrawler");
		registerSingleBlockRender(crawlerAssembler, 0, "crawlerAssembler");
		registerSingleBlockRender(metalAlloyer, 0, "metalAlloyer");
		registerSingleBlockRender(depositionChamber, 0, "depositionChamber");
		registerSingleBlockRender(laserRedstoneTx, 0, "laserRedstoneTx");
		registerSingleBlockRender(laserAmplifier, 0, "laserAmplifier");
		registerSingleBlockRender(laserStabilizer, 0, "laserStabilizer");
		registerSingleBlockRender(electroLaser, 0, "electroLaser");
		registerSingleBlockRender(laserBeam, 0, "laserBeam");
		registerSingleBlockRender(laserRay, 0, "laserRay");
		registerSingleBlockRender(laserSplitter, 0, "laserSplitter");
		registerSingleBlockRender(owcAssembler, 0, "owcAssembler");
		registerSingleBlockRender(owcController, 0, "owcController");
		registerSingleBlockRender(petrographerTable, 0, "petrographerTable");
		registerSingleBlockRender(dekatron, 0, "dekatron");
		registerSingleBlockRender(earthBreaker, 0, "earthBreaker");
		registerSingleBlockRender(smokeBlock, 0, "smokeBlock");
		registerSingleBlockRender(ganController, 0, "ganController");
		registerSingleBlockRender(castingBench, 0, "castingBench");
		registerSingleBlockRender(labBlender, 0, "labBlender");
		registerSingleBlockRender(disposer, 0, "disposer");
	}

	//render meta block
	public static void registerMetaBlockRender(Block block, int meta, String fileName){
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName() + "_" + fileName, "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model );
	}
	//render single block
	public static void registerSingleBlockRender(Block block, int meta, String fileName){
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model );
	}

}