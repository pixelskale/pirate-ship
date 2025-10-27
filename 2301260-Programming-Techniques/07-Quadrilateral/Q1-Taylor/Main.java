public class Main {
    public static void main(String[] args) {
        System.out.println("==== From Individual Objects ====");
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();
        System.out.println("\n==== From Each Object in Taylor[] ====");
        Taylor[] swift = new Taylor[3];
        swift[0] = new Expo(7, 1);
        swift[1] = new Sine(7, Math.PI/4);
        swift[2] = cs = new Cosine(7, 1);
        for (int i=0; i<swift.length; i++) {
            swift[i].printValue();
        }
    }
}
