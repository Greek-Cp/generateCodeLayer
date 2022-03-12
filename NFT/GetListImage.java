/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package NFT;


import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

public class GetListImage {
    static ArrayList<String> fetchNameImaggeNFT(String path){
        File[] file = new File(path).listFiles();
        ArrayList<String> liNameNft = new ArrayList<>();
        for(int t = 0; t <= file.length - 1; t++) {
            if (file[t].isFile()) {
                liNameNft.add(file[t].getName());
            }
        }
        if(liNameNft.size() != 0 && file.length != 0){
            utilDebug.showSucces("Process Fetch Name Succes");
        } else{
            utilDebug.showWarning("Process Fetch Name Failed");
        }
        return liNameNft;
    }

    static void getElementAllArray(ArrayList<String> list){
        for(String t : list){
            System.out.printf("%s%n",t);
        }
        utilDebug.showSucces("Display All Element Succes");
    }


    static void generateLayer(ArrayList<String> list){
        String[] nameLayer = {
                "Background",
"Body","clothes","ear","eye",
                "eyebrow",
                "face",
                "feature",
                "glasses",
                "hair",
                "mouth",
                "nose"
        };

        ArrayList<String> listTextUnormalize = new ArrayList<>();
        for(int b = 0; b< nameLayer.length; b++){
            if(b >= 0 && b< nameLayer.length -1 ){
                System.out.printf("{ %n name : \"%s\",%n elements: [%n",nameLayer[b]);
            }
            int index = 0;

            for(int v = 0; v< list.size(); v++){
                if(list.get(v).contains(nameLayer[b].toLowerCase(Locale.ROOT))){
                    System.out.printf("{ %n id: %d , %n " +
                            "name: \"%s\", %n " +
                            "path: `${dir}/1-%s/%s`, %n " +
                            "weight: 100,%n},%n" ,index ,list.get(v).replaceAll(".png",""),nameLayer[b],list.get(v));
                    index++;
                }

            }
            System.out.printf("%n");
                if(b == nameLayer.length -1 ) {
                    System.out.printf("],%n position: { x: %d, y: %d}, %n size: { width: width , height: height},%n }%n",0,0);
                } else if (b >= 0 && b != nameLayer.length - 2){
                    System.out.printf("],%n position: { x: %d, y: %d}, %n size: { width: width , height: height},%n },%n ",0,0);
                }
        }
    }
    public static void main(String[]args){
        ArrayList<String> listImage = new ArrayList<>();
      String path = "D:\\nft\\s";
      listImage = fetchNameImaggeNFT(path);
        generateLayer(listImage);
    }
}
