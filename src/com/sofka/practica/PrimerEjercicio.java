package com.sofka.practica;

import java.util.Scanner;

public class PrimerEjercicio {
public static void main(String[] args){
    Scanner captura = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    String user = captura.nextLine();
    System.out.println("Ingrese su edad: ");
    int edad = Integer.parseInt(captura.nextLine());
    System.out.println("Igrese su numero de celular: ");
    int cel = Integer.parseInt(captura.nextLine());
    System.out.println("Bienvenido señor " + user + ", es un placer para nosotros contar con una persona de " + edad + " años.\n" + "Próximamente nos comunicaremos con usted al numero "+cel+".\n"+
"Feliz dia.");




}
}
