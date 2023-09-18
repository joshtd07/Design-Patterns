package decorator;

import Java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {
        String Vehicle = decor.get(index:0);
        String[] oldArray = Vehicle.split(regex: ",");
        String Decorations = decor.get(index:1);
        String[] newArray = Decorations.split(regex:",");

        int lineNum = 0;
        lines.clear();

        for(String copyV: oldArray) {
            lines.add(copyV);
        }

        for(String line : newArray) {
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) != ' ') {
                    char item = line.charAt(i);
                    String item = String.valueOf(item);
                    String temp = lines.get(lineNum).substring(beginIndex:0, i) + Item + lines.get(lineNum).substring(i, line.length() - 1) + "\\";
                    lines.set(lineNum, temp);
                }
            }

            lineNum++;

        }
    }
}