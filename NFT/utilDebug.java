/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package NFT;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;

public class utilDebug {
    static void getMessage(String name){
        System.out.printf("%s",name);
    }
    static void showWarning(String name){
        System.out.printf("%s[Warning] %s %s%n",ASCII_Color.RED_BOLD,ASCII_Color.RESET,name);
    }
    static void getLog(String text){
        System.out.printf("[%s%s%s] %s %n",ASCII_Color.YELLOW_BRIGHT, Date.from(Instant.now()).toString(),ASCII_Color.RESET,text);
    }
    static void showSucces(String text){
        System.out.printf("[%sSucces%s] %s %n",ASCII_Color.GREEN_BOLD_BRIGHT,ASCII_Color.RESET,text);
    }
    public static void main(String[]args){
        showWarning("Hello");
        getLog("Text");
        showSucces("Process Complete At ");
    }
}
