package com.example;

public class Main {
    public static void main(String[] args) {
        // Java実行環境の情報
        System.out.println("\n=== Java実行環境情報 ===");
        System.out.println("Javaバージョン: " + System.getProperty("java.version"));
        System.out.println("Javaベンダー: " + System.getProperty("java.vendor"));
        System.out.println("Java VMバージョン: " + System.getProperty("java.vm.version"));
        System.out.println("Java VMベンダー: " + System.getProperty("java.vm.vendor"));
        System.out.println("Java VMname: " + System.getProperty("java.vm.name"));
        System.out.println("Java仕様バージョン: " + System.getProperty("java.specification.version"));
        System.out.println("Java仕様ベンダー: " + System.getProperty("java.specification.vendor"));

        // OS情報
        System.out.println("\n=== OS情報 ===");
        System.out.println("OSの名前: " + System.getProperty("os.name"));
        System.out.println("OSのバージョン: " + System.getProperty("os.version"));
        System.out.println("OSのアーキテクチャ: " + System.getProperty("os.arch"));
        System.out.println("");
    }
}