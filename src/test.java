public class test {
    public static void main(String[] args){
        Animas animas1 = new Animas(1);
        Animas animas2 = new Animas(1);

        System.out.println(animas1.equals(animas2));
    }
}
class Animas {
    private int id;
    public Animas(int id){
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animas otherAnimas = (Animas) obj;
        return this.id == otherAnimas.id;
    }
}