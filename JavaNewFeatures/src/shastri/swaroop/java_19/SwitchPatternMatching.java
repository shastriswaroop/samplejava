package shastri.swaroop.java_19;

public class SwitchPatternMatching {
    public static void main(String []args){
        System.out.println(formattedPatternSwitch(23l));
        System.out.println(formattedPatternSwitch(23.0));
        System.out.println(formattedPatternSwitch(23));

    }

    static String formattedPatternSwitch(Object o){
        return switch(o){
            case null -> "null";
            case Integer i-> String.format("int %d",i);
            case Long l-> String.format("long %d", l);
            case Double d-> String.format("Double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

}
