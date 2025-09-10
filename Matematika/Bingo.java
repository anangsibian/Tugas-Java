package Matematika;

class BingoSong {
    private String name;
    public BingoSong(String name) {
        this.name = name;
    }
    public void sing() {
        String[] huruf = name.split("");

        for (int i = 0; i <= huruf.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int j = 0; j < 3; j++) { 
                for (int k = 0; k < huruf.length; k++) {
                    if (k < i) {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(huruf[k]);
                    }
                    if (k < huruf.length - 1) System.out.print("-");
                }
                System.out.println();
            }

            System.out.println("And Bingo was his name-o.\n");
        }
    }
}

