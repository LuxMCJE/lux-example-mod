package net.luxmcje.example;

import net.luxmcje.loader.LuxLoader;

public class ExampleMod {
    public static void init() {
        System.out.println("---------------------------------------");
        System.out.println("   Hello from the first Lux Mod!       ");
        System.out.println("   Running on LuxLoader v0.1.0         ");
        System.out.println("---------------------------------------");
    }
    project.getDependencies().getExtensions().add("minecraft", new Object() {
        public void minecraft(String version) {
        }
    });
}
