class Main {
    public static void main (String[] args) {
        Kucing kucing = new Meow();
        kucing.meow();

        MeowAdapter meowAdapter = new MeowAdapter(kucing);
        meowAdapter.kwek();
    }
}