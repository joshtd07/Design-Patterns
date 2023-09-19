package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {

       int lineNum = 0;
       // System.out.println(decor);
       // System.out.println(decor.get(13));
      for( String decLine: decor){
        for(int i = 0; i < decLine.length(); i++) {
            if(decLine.charAt(i) != ' '){
                String vLine = lines.get(lineNum);
                String[] splitLine = new String[2];
                splitLine[0] = vLine.substring(0, i-1);
                char item = decLine.charAt(i);
                String Item = String.valueOf(item);
                splitLine[1] = Item;
                splitLine[2] = vLine.substring(i+1, decLine.length()-1);
                System.out.println(splitLine[0] + splitLine[1] + splitLine[2]);
            }

        }
      }




/* 

        String Vehicle = lines.get(0);
        String[] oldArray = Vehicle.split(",");
        String Decorations = decor.get(1);
        String[] newArray = Decorations.split(",");

        System.out.println(oldArray[1]);

        
 //       lines.clear();
/* 
        for(String copyV: oldArray) {
            lines.add(copyV);
        }
//somewhere in here puts rim and color values in
        for(String line : newArray) {
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) != ' ') {
                    char item = line.charAt(i);
                    String Item = String.valueOf(item);
                    String temp = lines.get(lineNum).substring(0, i) + Item + lines.get(lineNum).substring(i, line.length() - 1) ;
                    System.out.println("temp: "+ temp);
                    lines.set(lineNum, temp);
                }
            }

            lineNum++;

*/

        }
 //   }
}