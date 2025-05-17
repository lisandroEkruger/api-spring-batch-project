package com.api.project.config;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BatchConfigTestDataProviderUtils {


    public static String supplyValidContent(){
        return """
                id,name,description,price,image,category
                1,Asus Roge,El mejor Pc que puedas tener de Asus,699.99,PL1wThWr-perfil.png,COMPUTER
                2,Iphone 13,Calidad y diseño,499.99,PL1wThWr-perfil.png,PHONE
                3,Iphone 14,Calidad y diseño mejorados,499.99,PL1wThWr-perfil.png,PHONE
                4,Iphone 15,Calidad y diseño más mejorados,499.99,PL1wThWr-perfil.png,PHONE
                5,Iphone 16,Calidad y diseño bastantes más mejorados,499.99,PL1wThWr-perfil.png,PHONE
                6,Iphone 17,Calidad y diseño muchisimo más mejorados,499.99,PL1wThWr-perfil.png,PHONE
                """;
    }

}
