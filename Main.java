package de.shaky_hd.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.chatcolor.ChatColors;
import de.chatcolor.commands.ChatColorHelp;
import de.shaky_hd.config.FileManager;
import de.shaky_hd.listener.JoinMessage;

public class Main extends JavaPlugin{
	
	public static String PREF;
	public static String FIX;
	public static String VERSION;
	public static String NoPerms;
	public static String PREFIX;
	
	//Colors
	public static String BLACK;
	public static String DBLUE;
	public static String DGREEN;
	public static String DAQUA;
	public static String DRED;
	public static String DLILA;
	public static String GOLD;
	public static String GRAU;
	public static String DGRAU;
	public static String BLUE;
	public static String GREEN;
	public static String AQUA;
	public static String RED;
	public static String HLILA;
	public static String YELLOW;
	public static String WHITE;
	public static String K;
	public static String D;
	public static String DU;
	public static String UND;
	public static String KU;
	public static String RE;
	
	private static Main main;
	
	public void onEnable() {
		main = this;
		FileManager.loadFile();
		PREF = (String) FileManager.getValue("Config.prefix");
		FIX = (String) FileManager.getValue("Config.trennung");
		PREFIX = PREF + FIX;
		NoPerms = Main.PREFIX + (String) FileManager.getValue("Config.noperm");
		//ChatColor Command
		
		BLACK = Main.PREFIX + (String) FileManager.getValue("Message.Black");
		DBLUE = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Blue");
		DGREEN = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Green");
		DAQUA = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Aqua");
		DRED = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Red");
		DLILA = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Purple");
		GOLD = Main.PREFIX + (String) FileManager.getValue("Message.Gold");
		GRAU = Main.PREFIX + (String) FileManager.getValue("Message.Grey");
		DGRAU = Main.PREFIX + (String) FileManager.getValue("Message.Dark_Grey");
		BLUE = Main.PREFIX + (String) FileManager.getValue("Message.Blue");
		GREEN = Main.PREFIX + (String) FileManager.getValue("Message.Green");
		AQUA = Main.PREFIX + (String) FileManager.getValue("Message.Aqua");
		RED = Main.PREFIX + (String) FileManager.getValue("Message.Red");
		HLILA = Main.PREFIX + (String) FileManager.getValue("Message.Purple");
		YELLOW = Main.PREFIX + (String) FileManager.getValue("Message.Yellow");
		WHITE = Main.PREFIX + (String) FileManager.getValue("Message.White");
		K = Main.PREFIX + (String) FileManager.getValue("Message.J13UJH");
		D = Main.PREFIX + (String) FileManager.getValue("Message.Blod");
		DU = Main.PREFIX + (String) FileManager.getValue("Message.Strikethrought");
		UND = Main.PREFIX + (String) FileManager.getValue("Message.Underlined");
		KU = Main.PREFIX + (String) FileManager.getValue("Message.Italic");
		RE = Main.PREFIX + (String) FileManager.getValue("Message.Reset");
		
		
		VERSION = "1.1 beta";
		
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Author = Shaky_HD");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Version " + Main.VERSION);
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Name = ChatColor");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Dieses Plugin wurde von");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Shaky_HD gecodet!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Du darfst das Plugin umprogrammieren");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7nur nicht als dein Plugin verkaufen!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§aChatColor wurde erfolgreich geladen");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		register();
		
	}
	
	
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Author = Shaky_HD");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Version " + Main.VERSION);
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Name = ChatColor");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Dieses Plugin wurde von");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Shaky_HD gecodet!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Du darfst das Plugin umprogrammieren");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7nur nicht als dein Plugin verkaufen!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§cChatColor wurde erfolgreich entladen");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		
		
		
		
		
		
	}
	
	public void register() {
		
		Bukkit.getPluginManager().registerEvents(new ChatColors(), this);
		Bukkit.getPluginManager().registerEvents(new JoinMessage(), this);
		
		Bukkit.getPluginCommand("colorcodes").setExecutor(new ChatColorHelp());
	
	}
	
	public static Main getMain() {
		return main;
		
	}
	
	
	
	

}
