/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petshop;
public class PetShop {
 public static void main(String[] args) {
 Cachorro dog = new Cachorro("Polaca", 10, "Vira-Latas");
 Cachorro dog2 = new Cachorro("Dostoiévski", 2, "Golden Retriever");
 Gato cat = new Gato("Selina", 6, false);
 Gato cat2 = new Gato("Tommy", 5, true);
 
 // Polimorfismo (reescrita)
 dog.emitirSom(); 
 cat.emitirSom(); 
 cat2.emitirSom(); 
 
 // Sobrecarga
 dog2.alimentar();
 dog.alimentar("carne");

 // Métodos exclusivos
 dog.brincar("bola");
 cat.arranhar("armário");
 dog.exibirRaca();
 dog2.exibirRaca();
 }
}

