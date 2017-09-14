package com.github.raptorxilef.testplugin3;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin3 extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("TestPlugin3 v" + this.getDescription().getVersion() + " enabeld!");
	}

	@Override
	public void onDisable() {
		System.out.println("TestPlugin3 v" + this.getDescription().getVersion() + " disabeld!");
	}
	
}
