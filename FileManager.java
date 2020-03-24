package de.shaky_hd.config;

import de.shaky_hd.main.Main;

public class FileManager {
	
	private static FileWriter filewriter = new FileWriter(Main.getMain().getDataFolder().getPath(), "config.yml");
	
	public static void loadFile() {
		setValue("Config.prefix", "§cChat§6Color ");
		setValue("Config.trennung", "|");
		setValue("Config.noperm", "§cDazu hast du keine Rechte!");
		
		setValue("Message.Black", "&0 = §0Schwarz");
		setValue("Message.Dark_Blue", "&1 = §1Dunkel Blau");
		setValue("Message.Dark_Green", "&2 = §2Dunkel Grün");
		setValue("Message.Dark_Aqua", "&3 = §3Dunkel Aqua");
		setValue("Message.Dark_Red", "&4 = §4Dunkel Rot");
		setValue("Message.Dark_Purple", "&5 = §5Dunkel Lila");
		setValue("Message.Gold", "&6 = §6Gold");
		setValue("Message.Grey", "&7 = §7Grau");
		setValue("Message.Dark_Grey", "&8 = §8Dunkel Grau");
		setValue("Message.Blue", "&9 = §9Blau");
		setValue("Message.Green", "&a = §aGrün");
		setValue("Message.Aqua", "&b = §bAqua");
		setValue("Message.Red", "&c = §cRot");
		setValue("Message.Purple", "&d = §dLila");
		setValue("Message.Yellow", "&e = §eGelb");
		setValue("Message.White", "&f = §fWeiß");
		setValue("Message.J13UJH", "&k = §kHallo");
		setValue("Message.Blod", "&l = §lDick");
		setValue("Message.Strikethrought", "&m = §mDurchgestrichen");
		setValue("Message.Underlined", "&n = Unterstrichen");
		setValue("Message.Italic", "&o = §oKurvig");
		setValue("Message.Reset", "&r = Reset");
		
		
	}
	
	private static void setValue(final String valuePath, final String value) {	
		if(!filewriter.valueExist(valuePath)) {
			filewriter.setValue(valuePath, value);
			filewriter.save();
		}
		
	}
	public static Object getValue(final String valuePath) {
		return filewriter.getObject(valuePath);	
	}
	

}
