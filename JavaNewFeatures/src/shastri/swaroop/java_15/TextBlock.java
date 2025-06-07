package shastri.swaroop.java_15;

public class TextBlock {
    public static void main(String [] args){
        var html = "<html><title>Hello Swati</title></html>";

        var html_block = """
                <html><title>Hello %s</title></html>
                """.formatted("Swati");

        System.out.println(html_block);

    }
}
