class GenerateRandom {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;

        int randomInt = (int)Math.floor(Math.random() *(max - min + 1) + min);

        System.out.println(randomInt);
    }
}


