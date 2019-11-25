package Parser;

public class ParserMain {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-s":
                    while((args[i+1])!= "-s" || (args[i+1])!= "-b") {
                        System.out.println(args[i + 1]);
                        i++;
                    }
                    break;
                case "-b":
                    System.out.println(Boolean.parseBoolean(args[i + 1]));
                    break;
                case "-i":
                    System.out.println(Integer.parseInt(args[i + 1]));
                    break;

            }

        }
    }
}
