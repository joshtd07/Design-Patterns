package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {
        String Vehicle = decor.get(0);
        String[] oldArray = Vehicle.split(",");
        String Decorations = decor.get(1);
        String[] newArray = Decorations.split(",");

        int lineNum = 0;
        lines.clear();

        for(String copyV: oldArray) {
            lines.add(copyV);
        }

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

        }
    }
}