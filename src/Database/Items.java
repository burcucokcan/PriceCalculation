package Database;

import Models.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */
    //private static ArrayList<String> cityList = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Ohio", "Pennsylvania", "Washington", "Atlanta"));

    //---------------------------------------------------------------------------------------
    public static double ItemName(String itemName){
        double ucret =0;
        switch(itemName.toLowerCase()) {
            case "mug" :
            case "rose teddy bear" : ucret=30; break;
            case "ıphone max" : ucret=850.23; break;
            case "laptop mouse" : ucret=23.50; break;
            case "monitor" : ucret=90.23; break;
            case "charger" : ucret=43.20; break;
            case "hdmi cable" : ucret=5.90; break;
        }
        return ucret;
    }

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */

    public static double colorPrice(String color){
        double colorF=0;
        switch(color.toLowerCase()) {
            case "red" : colorF=10; break;
            case "blue" : colorF=6; break;
            case "black" : colorF=4; break;
            case "white" : colorF=2; break;

        }
        return colorF;
    }
    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    public static double customText(String tax){

        if(tax.length()<=10)
            return 3;
        else
            return 5;
    }
    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------



}



