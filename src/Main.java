public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
//        var textBox2 = textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);
    }
}