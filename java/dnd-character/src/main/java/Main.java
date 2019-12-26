class Main{
    public static void main(String[] args) {
        DnDCharacter d = new DnDCharacter();
        for(int i=3;i<19;i++)
            System.out.println(d.modifier(i));
    }
}